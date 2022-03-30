package fletning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainApp {

    public static void main(String[] args) {
        ArrayList<Customer> l1 = new ArrayList<>();

        Customer c1 = new Customer(11, "Lars", "Allan");
        Customer c2 = new Customer(22, "Per", "Andersen");
        Customer c3 = new Customer(33, "Allan", "Larsen");
        Customer c4 = new Customer(22, "Oliver", "Breum");
        Customer c5 = new Customer(20, "Holly", "Mitchell");
        Customer c6 = new Customer(25, "Jeppe", "Breum");

        l1.add(c1);
        l1.add(c2);
        l1.add(c3);
        l1.add(c4);
        l1.add(c5);
        l1.add(c6);

        ArrayList<Customer> l2 = new ArrayList<>();

        Customer c7 = new Customer(34, "Morten", "Breum");
        Customer c8 = new Customer(21, "Jeppe", "Breum");
        Customer c9 = new Customer(56, "Dorte", "Mortensen");
        Customer c10 = new Customer(71, "Gertrud", "Sand");

        l2.add(c7);
        l2.add(c8);
        l2.add(c9);
        l2.add(c10);

        Collections.sort(l2);
        Collections.sort(l1);

        System.out.println(fletAlleKunder(l1,l2));

        //Opgave 2

        int[] tal1 = {2,4,6,8,10,12,14};
        int[] tal2 = {1,2,4,5,6,9,12,17};

        for (int i : fællesTal(tal1, tal2)){
            System.out.println(i);
        }

        // Opgave 3
        ArrayList<Customer> c = new ArrayList<>();

        Customer cc1 = new Customer(1, "A", "A");
        Customer cc2 = new Customer(1, "B", "B");
        Customer cc3 = new Customer(1, "C", "C");
        Customer cc4 = new Customer(1, "D", "D");
        Customer cc5 = new Customer(1, "E", "E");
        Customer cc6 = new Customer(1, "F", "F");
        Customer cc7 = new Customer(1, "G", "G");
        Customer cc8 = new Customer(1, "H", "H");

        c.add(cc1);
        c.add(cc2);
        c.add(cc3);
        c.add(cc4);
        c.add(cc5);
        c.add(cc6);
        c.add(cc7);
        c.add(cc8);

        Customer cc9 = new Customer(1, "B", "B");
        Customer cc10 = new Customer(1, "E", "E");
        Customer cc11 = new Customer(1, "F", "F");
        Customer[] cc = {cc9,cc10,cc11};

        Collections.sort(c);

        System.out.println(goodCustomers(c,cc));







    }

    // Opgave 1
    // Total fletning af to lister.
    /**
     * Returnerer en sorteret ArrayList der indeholder alle
     * kunder fra både l1 og l2
     * Krav: l1 og l2 er sorterede
     */
    public static ArrayList fletAlleKunder(ArrayList<Customer> l1, ArrayList<Customer> l2){
        ArrayList<Customer> result = new ArrayList<>();
        int i1 = 0;
        int i2 = 0;

        // flet så længe der er noget i begge lister
        while (i1 < l1.size() && i2 < l2.size()) {
            if (l1.get(i1).compareTo(l2.get(i2)) <= 0) {
                // l1's første customer er "mindst"
                result.add(l1.get(i1));
                i1++;
            } else{ // l2's første customer er "mindst"
                result.add(l2.get(i2));
                i2++;
            }
        }

        // tøm den liste der ikke er tom
        while (i1 > l1.size()){
            result.add(l1.get(i1));
            i1++;
        }

        while (i2 < l2.size()){
            result.add(l2.get(i2));
            i2++;
        }

        return result;
    }

    // Opgave 2
    // Generel fletning af to lister
    /**
     * Returnerer et sorteret array der indeholder alle
     * elementer l1 og l2 har til fælles
     * Krav: l1 og l2 er sorterede, indeholder ikke dubletter og
     * indeholder ikke tomme pladser
     */
    public static int[] fællesTal(int[] l1, int[] l2){
        int[] result = new int[l1.length + l2.length];
        int i1 = 0;
        int i2 = 0;
        int currentSize = 0;
        while (i1 < l1.length && i2 < l2.length){
            if (l1[i1] < l2[i2]){
                result[currentSize] = l1[i1];
                i1++;
            } else if (l1[i1] > l2[i2]){
                result[currentSize] = l2[i2];
                i2++;
            }else{
                result[currentSize] = l1[i1];
                currentSize++;
                i1++;
                i2++;
            }
        }
        return result;

    }

    // Opgave 3
    /**
     * Returnerer en sorteret ArrayList der indeholder alle
     * customers fra l1 der ikke er i l2
     * Krav: l1 og l2 er sorterede, indeholder ikke dubletter og
     * indeholder ikke tomme pladser
     */

    public static ArrayList goodCustomers(ArrayList<Customer> l1, Customer[] l2){
        ArrayList<Customer> result = new ArrayList<>();
        int i1 = 0;
        int i2 = 0;
        while(i1 < l1.size() && i2 < l2.length) {
            if(l1.get(i1).compareTo(l2[i2]) < 0) {
                result.add(l1.get(i1));
                i1++;
            }else if(l1.get(i1).compareTo(l2[i2]) > 0) {
                i2++;
            }else {
                i1++;
                i2++;
            }
        }
        while(i1 < l1.size()) {
            result.add(l1.get(i1));
            i1++;
        }
        return result;
    }


}
