package domaci.tri;

import java.util.List;

public class Audi extends Automobil {

    public Audi(List<Tocak> listaTockova, int godiste, double cena) {
        super(listaTockova, godiste, cena);
        super.setMarka("Audi");
    }

    public Audi() {
    }

    @Override
    public boolean vratiOstecene(Tocak t) {
        return t.getTrajanjeTocka() > 60;
    }


    @Override
    public int cenaSvihTockova() {
        int cenaTocka = 110;
        return 4 * cenaTocka;
    }

    @Override
    public void zameniTocak() {
        int granicaOstecenja = 60;
        for (int i = 0; i < getListaTockova().size(); i++) {
            Tocak t = getListaTockova().get(i);
            if (t.getTrajanjeTocka() > granicaOstecenja) {
                getListaTockova().set(i, new Tocak(0, 110));
            }
        }
    }
}

