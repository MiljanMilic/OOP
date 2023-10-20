package domaci.dva;

import java.util.ArrayList;

public class Ucenik {
    private String ime;
    private ArrayList<Predmet> predmeti;
    private int godinaSkolovanja;

    public Ucenik(String ime, int godinaSkolovanja, ArrayList<Predmet> predmeti) {
        this.ime = ime;
        this.godinaSkolovanja = godinaSkolovanja;
        this.predmeti = predmeti;
    }

    public ArrayList<Predmet> getPredmeti() {
        return predmeti;
    }

    public void setPredmeti(ArrayList<Predmet> predmeti) {
        this.predmeti = predmeti;
    }

    public int getGodinaSkolovanja() {
        return godinaSkolovanja;
    }

    public void setGodinaSkolovanja(int godinaSkolovanja) {
        this.godinaSkolovanja = godinaSkolovanja;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public double prosek() {

        double sum = 0.0;

        for (Predmet predmet : predmeti) {
            sum += predmet.getOcena();
        }

        return sum / predmeti.size();
    }
}