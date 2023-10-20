package domaci.dva;

/*Domaci Zadatak 1:
        -Napraviti klasu Predmet koji kao atribute sadrzi ocenu i naziv predmeta.
        -Klase Biologija, Matematika i Srpski nasledjuju klasu Predmet.
        -Klasa Ucenik kao atribute ima listu predmeta i godinu skolovanja, unutar te klase napisati metodu za:
        * izracunavanje proseka iz svih predmeta.
        -Klasa Skola ima listu Ucenika, napraviti metode:
        *koja za prosledjenu godinu skolovanja vraca prosek svih ucenika koji su u toj godini.
        * za prosledjeni predmet vraca prosek svih ucenika koji taj predmet pohadjaju
        * vraca Ucenika sa najmanjim prosekom*/
public class Predmet {

    private int ocena;
    private String nazivPredmeta;

    public Predmet(int ocena, String nazivPredmeta) {
        this.ocena = ocena;
        this.nazivPredmeta = nazivPredmeta;
    }

    public Predmet() {
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Predmet: ").append(nazivPredmeta).append("\n");
        sb.append("Ocena: ").append(ocena);

        return sb.toString();
    }
}
