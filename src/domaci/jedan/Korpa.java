package domaci.jedan;

import java.util.ArrayList;
import java.util.List;

public class Korpa {

    //Kreirati klasu Korpa koja ima listu namirnica(String). Kreirati:
    //- metodu koja prima neku namirnicu i dodaje je u listu
    //- metodu koja za unetu namirnicu vraca true/false ukoliko se namirnica tu nalazi.
    //- metodu cenaKorpe koja vraca ukupnu cenu svih namirnica ako racunamo da je prosek jedne namirnice 70 dinara
    //- metodu izlistaj koja prikazuje sve namirnice iz liste
    //Takodje kreirati potreban konstruktor, get i set metode kao i toString.

    List<String>namirnice;

    public Korpa() {
        namirnice = new ArrayList<>();
    }

    public List<String> getNamirnice() {
        return namirnice;
    }

    public void setNamirnice(List<String> namirnice) {
        this.namirnice = namirnice;
    }

    @Override
    public String toString() {
        return "Korpa{" +
                "namirnice=" + namirnice +
                '}';
    }

    public void dodavanjeUKorpu (String proizvod){

        namirnice.add(proizvod);
    }

    public boolean daLiJeNamirnicaVecNaListi (String proizvod){

        return namirnice.contains(proizvod);
    }

    public double cenaKorpe (){
        int cena = namirnice.size() * 70;
        return cena;
    }

    public void izlistaj (){
        for (String proizvod : namirnice){
            System.out.println(proizvod);
        }
    }
}
