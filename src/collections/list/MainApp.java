package collections.list;

public class MainApp {

    public static void main(String[] args) {
        Skole skole = new Skole("Dania");
        Studerende s1 = new Studerende(1, "Jeppe");
        Studerende s2 = new Studerende(2, "Allan");
        Studerende s3 = new Studerende(3, "Lars");
        Studerende s4 = new Studerende(4, "Bubs");
        Studerende s5 = new Studerende(5, "Breum");

        s1.addKarakter(4);
        s1.addKarakter(7);
        s2.addKarakter(10);
        s3.addKarakter(2);
        s3.addKarakter(12);
        s4.addKarakter(4);
        s4.addKarakter(4);
        s5.addKarakter(7);

        skole.addStuderende(s1);
        skole.addStuderende(s2);
        skole.addStuderende(s3);
        skole.addStuderende(s4);
        skole.addStuderende(s5);

        System.out.println(skole);

        System.out.println(skole.gennemsnit());
    }
}
