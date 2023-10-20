package domaci.tri;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Tocak t1 = new Tocak(60, 0);
        Tocak t2 = new Tocak(59, 0);
        Tocak t3 = new Tocak(101, 0);
        Tocak t4 = new Tocak(99, 0);

        List<Tocak> audiT = new ArrayList<>();
        audiT.add(t1);
        audiT.add(t2);
        audiT.add(t3);
        audiT.add(t4);

        Audi audi = new Audi(audiT, 2010, 10000.0);

        System.out.println(audi);

        for (int i = 0; i < audiT.size(); i++) {
            Tocak t = audiT.get(i);
            if (audi.vratiOstecene(t)) {
                System.out.println("Tocak " + (i + 1) + " je ostecen.");
            } else {
                System.out.println("Tocak " + (i + 1) + " nije ostecen.");
            }
        }
        System.out.println("Cena svih tockova: " + audi.cenaSvihTockova());

        audi.zameniTocak();
        for (int i = 0; i < audiT.size(); i++) {
            Tocak t = audiT.get(i);
            if (audi.vratiOstecene(t)) {
                System.out.println("Tocak " + (i + 1) + " je ostecen.");
            } else {
                System.out.println("Tocak " + (i + 1) + " nije ostecen.");
            }
        }
    }
}
