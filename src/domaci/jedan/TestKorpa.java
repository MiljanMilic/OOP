package domaci.jedan;

public class TestKorpa {

    public static void main(String[] args) {

        Korpa korpa = new Korpa();

        korpa.dodavanjeUKorpu("Jabuka");
        korpa.dodavanjeUKorpu("Kruska");
        korpa.dodavanjeUKorpu("Sljiva");


        System.out.println("Da li je na listi jabuka: " + korpa.daLiJeNamirnicaVecNaListi("Jabuka"));
        System.out.println("Ukupna cena: " + korpa.cenaKorpe());
        System.out.println("Namirnice na listi:");
        korpa.izlistaj();
    }


}
