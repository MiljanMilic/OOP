package domaci.jedan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zadatak4 {

    //Kreirati funkciju koja izbacuje sva pojavljivanja elementa n iz liste

    static void izbacujeN (List<Integer> li, int n) {

        for (int i = 0; i < li.size(); i++) {
            if (li.get(i) == n)
                li.remove(i);
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();
        Collections.addAll(lista,1, 6, 2, 6, 3, 6, 4, 6, 5, 6, 7, 8, 9, 10);
        int n = 6;

        izbacujeN(lista, n);

        System.out.println(lista);

    }
}
