package domaci.tri;

import java.util.List;

public class Mercedes extends Automobil{
    public Mercedes(List<Tocak> listaTockova, int godiste, double cena) {
        super(listaTockova, godiste, cena);
        super.setMarka("Mercedes");
    }

    public Mercedes() {
    }


    @Override
    public boolean vratiOstecene(Tocak t) {
        return t.getTrajanjeTocka() > 100;
    }


    @Override
    public int cenaSvihTockova() {
        int cenaTocka = 120;
        return 4 * cenaTocka;
    }

    @Override
    public void zameniTocak() {
        int granicaOstecenja = 100;
        for (int i = 0; i < getListaTockova().size(); i++) {
            Tocak t = getListaTockova().get(i);
            if (t.getTrajanjeTocka() > granicaOstecenja) {
                getListaTockova().set(i, new Tocak(0, 120));
            }
        }
    }
}
