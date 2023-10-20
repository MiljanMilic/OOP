package domaci.tri;

import java.util.List;

/*Napraviti klasu Salon koja ima samo listu Automobila i metode za:
        -vratiNajstariji() - koja ce vratiti najstariji automobil po godistu.
        -vratiNajskuplji() - vraca najskuplji auto*/
public class Salon {
    private List<Automobil> listaAutomobila;

    public Salon(List<Automobil> listaAutomobila) {
        this.listaAutomobila = listaAutomobila;
    }

    public List<Automobil> getListaAutomobila() {
        return listaAutomobila;
    }

    public void setListaAutomobila(List<Automobil> listaAutomobila) {
        this.listaAutomobila = listaAutomobila;
    }

    public void dodajAutomobil(Automobil a) {
        listaAutomobila.add(a);
    }

    public Automobil vratiNajstariji() {
        Automobil najstariji = listaAutomobila.get(0);
        for (Automobil a : listaAutomobila) {
            if (a.getGodiste() < najstariji.getGodiste())
                najstariji = a;
        }
        return najstariji;
    }

    public Automobil vratiNajskuplji(){
        Automobil najskuplji = listaAutomobila.get(0);
        for (Automobil a : listaAutomobila) {
            if (a.getCena() > najskuplji.getCena())
                najskuplji = a;
        }
        return najskuplji;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Automobil a : listaAutomobila){
            sb.append(a.toString()).append("\n");
        }
        return  sb.toString();
    }
}
