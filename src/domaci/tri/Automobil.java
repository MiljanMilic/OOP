package domaci.tri;


import java.util.List;

/*Kreirati klasu Automobil koja od atributa ima listu tockova, godiste automobila i cenu.*/

public abstract class Automobil {
    private List<Tocak> listaTockova;
    private int godiste;
    private double cena;
    private String marka;

    public Automobil(List<Tocak> listaTockova, int godiste, double cena) {
        this.listaTockova = listaTockova;
        this.godiste = godiste;
        this.cena = cena;
        this.marka = "";
    }

    public Automobil() {
    }

    public List<Tocak> getListaTockova() {
        return listaTockova;
    }

    public void setListaTockova(List<Tocak> listaTockova) {
        this.listaTockova = listaTockova;
    }

    public int getGodiste() {
        return godiste;
    }

    public void setGodiste(int godiste) {
        this.godiste = godiste;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    /*   -vratiOstecene(Tocak t) - Proverava da li je dati tocak ostecen, vraca true ako jeste. Tocak od
         Audi-a je ostecen ukoliko je stariji od 60 dana, dok za BMW i Mercedes za stariji od 100 dana.
        -cenaTockova()
        - Vrati cenu svih tockova ako znamo da je cena po tocku za BMW 100, Mercedes
        120 i Audi 110.
        -zameniTocak() - Tocak koji je stariji od granice zameniti novim tockom.*/

    public abstract boolean vratiOstecene(Tocak t);
    public abstract int cenaSvihTockova();
    public abstract void zameniTocak();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Marka: ").append(marka).append(" ").append("Godiste: ").append(godiste).append(" ").append("Cena automobila: ").append(cena);
        return sb.toString();
    }
}
