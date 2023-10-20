package domaci.dva;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<Predmet> listaPredmetaPera = new ArrayList<>();

        Ucenik pera = new Ucenik("Pera", 2023, listaPredmetaPera);

        Matematika matematika = new Matematika(5);
        Srpski srpski = new Srpski(5);
        Biologija biologija = new Biologija(5);

        listaPredmetaPera.add(matematika);
        listaPredmetaPera.add(srpski);
        listaPredmetaPera.add(biologija);

        System.out.println("Prosek: " + pera.prosek());


        ArrayList<Predmet> listaPredmetaZika = new ArrayList<>();

        Ucenik zika = new Ucenik("Zika", 2022, listaPredmetaZika);

        matematika = new Matematika(4);
        srpski = new Srpski(4);
        biologija = new Biologija(4);

        listaPredmetaZika.add(matematika);
        listaPredmetaZika.add(srpski);
        listaPredmetaZika.add(biologija);

        System.out.println("Prosek: " + zika.prosek());


        ArrayList<Predmet> listaPredmetaLaza = new ArrayList<>();

        Ucenik laza = new Ucenik("Laza", 2023, listaPredmetaLaza);

        matematika = new Matematika(2);
        srpski = new Srpski(3);
        biologija = new Biologija(3);

        listaPredmetaLaza.add(matematika);
        listaPredmetaLaza.add(srpski);
        listaPredmetaLaza.add(biologija);

        System.out.println("Prosek: " + laza.prosek());
//------------------------------------------------------------------------------

        ArrayList<Ucenik> listaUcenika = new ArrayList<>();

        listaUcenika.add(pera);
        listaUcenika.add(zika);
        listaUcenika.add(laza);

        Skola osnovna = new Skola(listaUcenika);

        System.out.println();

        System.out.println("Prosek 2023 godine: " + osnovna.prosledjenaGodina(2023));

        System.out.println();

        System.out.println("Prosek biologije: " + osnovna.prosledjeniPredmet(biologija));
        System.out.println("Prosek matematike: " + osnovna.prosledjeniPredmet(matematika));
        System.out.println("Prosek srpskog: " + osnovna.prosledjeniPredmet(srpski));

        System.out.println();

        System.out.println("Djak sa najmanjim prosekom je: " + osnovna.vratiUcenikaSaNajmanjimProsekom().getIme());
    }
}
