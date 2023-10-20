package domaci.jedan;

import java.util.ArrayList;


public class Zadatak1 {

    //Napraviti funkciju koja kreira i vraca listu od 30 parnih brojeva.

    static ArrayList<Integer> listaParnihBrojeva() {
        ArrayList<Integer> lista = new ArrayList<>();
        int parniBroj = 2;
        for (int i = 0; i < 30; i++) {
            lista.add(parniBroj);
            parniBroj += 2;
        }
        return lista;
    }


    public static void main(String[] args) {
        ArrayList<Integer> al = listaParnihBrojeva();
        System.out.println(al);
        System.out.println(al.size());

    }

}

