package domaci.jedan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zadatak2 {

    //Napraviti funkciju koja prima listu celih brojeva i izbacuje iz nje sve elemente koji su deljivi sa 4.

    static void izbacujeBrojDeljivSa4(List<Integer> li) {

        for (int i = 0; i < li.size(); i++) {
            if (li.get(i) % 4 == 0)
                li.remove(i);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Collections.addAll(lista, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        izbacujeBrojDeljivSa4(lista);

        System.out.println(lista);

    }
}
