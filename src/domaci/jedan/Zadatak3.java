package domaci.jedan;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zadatak3 {
    //Napraviti funkciju koja prima listu Stringova, neki String i proverava da li se taj String nalazi u listi.


    static boolean proveraStringa(List<String> li, String string) {
        //boolean daLiGaIma = false;
        for (int i = 0; i < li.size(); i++) {
            if (li.get(i).contains(string)) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();

        Collections.addAll(lista, "Pera", "Laza", "Zika", "Mika");

        System.out.println(lista);
        String ime = "Jova";
        System.out.println(ime);
        System.out.println(proveraStringa(lista, ime));

    }
}
