package collections.list;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class StuderendeComparator implements Comparator<Studerende> {

    public static void main(String[] args) {
        Studerende s1 = new Studerende(1, "Jeppe");
        Studerende s2 = new Studerende(2, "Sand");
        Studerende s3 = new Studerende(3, "Breum");
        Studerende s4 = new Studerende(4, "Lars");
        Studerende s5 = new Studerende(5, "Allan");

        Set<Studerende> s = new TreeSet<>(new StuderendeComparator());

        s.add(s1);
        s.add(s2);
        s.add(s3);
        s.add(s4);
        s.add(s5);
        System.out.println(s);
    }
    @Override
    public int compare(Studerende o1, Studerende o2) {
        return o1.getNavn().toLowerCase().compareTo(o2.getNavn().toLowerCase());
    }


}
