package collections.map;

public class MainApp {

    public static void main(String[] args) {
        Skole skole = new Skole("Dania");
        Studerende s1 = new Studerende(1, "Jeppe");
        Studerende s2 = new Studerende(2, "Allan");
        Studerende s3 = new Studerende(3, "Lars");
        Studerende s4 = new Studerende(4, "Bubs");
        Studerende s5 = new Studerende(5, "Breum");

        s1.addKarakter(1,4);
        s1.addKarakter(1,7);
        s2.addKarakter(2,10);
        s3.addKarakter(3,2);
        s3.addKarakter(3,12);
        s4.addKarakter(4,4);
        s4.addKarakter(4,4);
        s5.addKarakter(5,7);

        skole.addStuderende(s1);
        skole.addStuderende(s2);
        skole.addStuderende(s3);
        skole.addStuderende(s4);
        skole.addStuderende(s5);

        System.out.println(skole);

        System.out.println(skole.gennemsnit());

        System.out.println(skole.findStuderende(2));
    }
}
