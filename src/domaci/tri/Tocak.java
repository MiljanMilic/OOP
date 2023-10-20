package domaci.tri;

//Napraviti klasu Tocak koja od atributa ima trajanje tocka(u danima, znaci int) i cenu tocka(double).
public class Tocak {

    private int trajanjeTocka;
    private double cenaTocka;

    public Tocak(int trajanjeTocka, double cenaTocka) {
        this.trajanjeTocka = trajanjeTocka;
        this.cenaTocka = cenaTocka;
    }

    public int getTrajanjeTocka() {
        return trajanjeTocka;
    }

    public void setTrajanjeTocka(int trajanjeTocka) {
        this.trajanjeTocka = trajanjeTocka;
    }

    public double getCenaTocka() {
        return cenaTocka;
    }

    public void setCenaTocka(double cenaTocka) {
        this.cenaTocka = cenaTocka;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Trajanje : ").append(trajanjeTocka).append(" ").append("Cena:").append(cenaTocka);
        return sb.toString();
    }
}
