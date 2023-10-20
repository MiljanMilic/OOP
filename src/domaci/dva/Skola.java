package domaci.dva;

import java.util.ArrayList;

public class Skola {
    private ArrayList<Ucenik> ucenici;

    public Skola(ArrayList<Ucenik> ucenici) {
        this.ucenici = ucenici;
    }

    public ArrayList<Ucenik> getUcenici() {
        return ucenici;
    }

    public void setUcenici(ArrayList<Ucenik> ucenici) {
        this.ucenici = ucenici;
    }

    public double prosledjenaGodina(int godina) {

        double sum = 0.0;
        int counter = 0;

        for (Ucenik ucenik : ucenici) {

            if (godina == ucenik.getGodinaSkolovanja()) {
                sum = sum + ucenik.prosek();
                counter += 1;
            }
        }

        return sum / counter;
    }

    public double prosledjeniPredmet(Predmet predmet) {

        String naziv = predmet.getNazivPredmeta();

        double sum = 0.0;
        int counter = 0;

        for (Ucenik ucenik : ucenici) {

            for (Predmet p : ucenik.getPredmeti()) {

                if (p.getNazivPredmeta().equals(naziv)) {
                    sum = sum + p.getOcena();
                    counter = counter + 1;
                }
            }
        }

        return sum / counter;
    }

    public Ucenik vratiUcenikaSaNajmanjimProsekom() {


        Ucenik najmanji = ucenici.get(0);
        double min = najmanji.prosek();

        for (int i = 1; i < ucenici.size(); i++) {

            if (min > ucenici.get(i).prosek()) {
                min = ucenici.get(i).prosek();
                najmanji = ucenici.get(i);
            }
        }

        return najmanji;
    }
}