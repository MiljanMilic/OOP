package domaci.cetiri;

public class Test {
    public static void main(String[] args) {
        Planina p1 = new Planina("Stara", 500);
        Planina p2 = new Planina("Nova", 1000);
        Planina p3 = new Planina("Velika", 10000);
        Planina p4 = new Planina("Mala", 800);
        Planina p5 = new Planina("AAA", 1001);

        Planinar a1 = new Amater("Pera");
        Planinar a2 = new Rekreativac("Laza");
        Planinar a3 = new Pro("Zika");


        a1.popniSe(p1);
        a1.popniSe(p2);
        a1.popniSe(p3);
        a1.popniSe(p4);
        a1.popniSe(p5);

        a2.popniSe(p1);
        a2.popniSe(p2);
        a2.popniSe(p3);
        a2.popniSe(p4);
        a2.popniSe(p5);

        a3.popniSe(p1);
        a3.popniSe(p2);
        a3.popniSe(p3);
        a3.popniSe(p4);
        a3.popniSe(p5);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);


    }
}