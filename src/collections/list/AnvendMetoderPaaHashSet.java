package collections.list;

import java.util.HashSet;

public class AnvendMetoderPaaHashSet {
    public static void main(String[] args) {
        // i Set collection er der ingen rækkefølge på elementerne
        // der kan ikke være dubletter
        HashSet<Integer> tal = new HashSet<>();
        tal.add(34);
        tal.add(12);
        tal.add(23);
        tal.add(45);
        tal.add(67);
        tal.add(34);
        tal.add(98);

        System.out.println(tal);
        // 23 vil ikke blive tilføjet, da det allerede eksistere i vores set.
        tal.add(23);
        System.out.println(tal);
        tal.remove(67);
        System.out.println(tal);
        System.out.println(tal.contains(23));
        System.out.println(tal.size());
    }
}
