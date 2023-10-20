package domaci.cetiri;

import java.util.ArrayList;
import java.util.List;

public abstract class Planinar {
    /*Kreirati apstraktnu klasu Planinar koja ima atribute za ime planinara,
    listu planina i maksimalnu visinu na koju planinar moze da se popne. */
    private String ime;
    private List<Planina> listaPlanina;
    private List<Planina> crnaLista;
    private int maxVisina;

    public Planinar(String ime, int maxVisina) {
        this.ime = ime;
        this.maxVisina = maxVisina;
        this.listaPlanina = new ArrayList<>();
        this.crnaLista = new ArrayList<>();
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public List<Planina> getListaPlanina() {
        return listaPlanina;
    }

    public void setListaPlanina(List<Planina> listaPlanina) {
        this.listaPlanina = listaPlanina;
    }

    public int getMaxVisina() {
        return maxVisina;
    }

    public void setMaxVisina(int maxVisina) {
        this.maxVisina = maxVisina;
    }

    public List<Planina> getCrnaLista() {
        return crnaLista;
    }

    public void setCrnaLista(List<Planina> crnaLista) {
        this.crnaLista = crnaLista;
    }
    /*Ova klasa takodje ima metode:
-popniSe(Planina p) - Ukoliko planina nije previse visoka za planinara i nije u njegovoj listi, dodati je.
-crnaLista() - Vraca listu planina iz planinarovog spiska, na koje on ne moze da se popne.
-ukupnoMetara() - Vraca ukupnu visinu svih planina na koje se planinar popeo.*/

    public void popniSe(Planina p) {
        if (!listaPlanina.contains(p) && p.getVisina() <= maxVisina) {
            listaPlanina.add(p);
        }
        else crnaLista.add(p);
    }


    public List<Planina> crnaLista() {
        for (Planina p : crnaLista) {
            if (p.getVisina() > maxVisina) {
                crnaLista.add(p);
            }
        }
        return crnaLista;
    }



    public int ukupnoMetara() {
        int sum = 0;
        for (Planina p : listaPlanina) {
            sum += p.getVisina();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Planinar: ").append(ime).append("\n");
        sb.append("Planine na koje se popeo: ");
        for(Planina p : listaPlanina){
            sb.append(p.getNaziv()).append(" ").append(p.getVisina()).append("m").append(", ");
        }
        sb.append("\n");
        sb.append("Planine na koje ne moze da se popne: ");
        for(Planina p:crnaLista){
            sb.append(p.getNaziv()).append(" ").append(p.getVisina()).append("m").append(", ");
        }
        sb.append("\n");
        sb.append("Ukupna visina svih planina na koju se planinar popeo: ").append(ukupnoMetara()).append("m");
        return sb.toString();
    }
}