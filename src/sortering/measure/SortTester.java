package sortering.measure;

import sortering.customer.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortTester {

    public static void main(String[] args) {
        
        int testSize = 25000;
        ArrayList<String> bigList = ListGenerator.generateString(testSize, 15);
        String[] bigArray1 = bigList.toArray(new String[0]);
        String[] bigArray2 = bigList.toArray(new String[0]);
        String[] bigArray3 = bigList.toArray(new String[0]);

//        System.out.println(bigList);
        
        // Bubble Sort Test

        // opgave 1
//        String[] s = {"Erna", "Elly", "Laurits", "Bertha", "Christian", "August", "Marius", "John", "Tove", "Poul", "Torkild"};
//        SortMethods.bubbleSort(s);
//        System.out.println(Arrays.toString(s));
//
//        Measurer.start();
//        SortMethods.bubbleSort(bigArray1);
//        Measurer.stop();
//        System.out.println(String.format("BubbleSort (%d) -- Total time in milliseconds: %d",
//                testSize, Measurer.durationMilliSeconds()));
        
        // Insertion Sort Test
//        Measurer.start();
//        SortMethods.insertionSort(bigArray2);
//        Measurer.stop();
//        System.out.println(String.format("InsertionSort (%d) -- Total time in milliseconds: %d",
//                testSize, Measurer.durationMilliSeconds()));
        
        // Selection Sort Test
//        Measurer.start();
//        SortMethods.selectionSort(bigArray3);
//        Measurer.stop();
//        System.out.println(String.format("SelectionSort (%d) -- Total time in milliseconds: %d",
//                testSize, Measurer.durationMilliSeconds()));


        // Opgave 4.1
        // Collections.sort virker på alle objekter der implementere comparable
//        ArrayList<String> list = new ArrayList<String>();
//        list.add("Jan");
//        list.add("Bent");
//        list.add("Thomas");
//        list.add("Karsten");
//        list.add("Dan");
//        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);

        //opgave 4.2

        // Collections.sort virker på alle objekter der implementere comparable

        ArrayList<Customer> list2 = new ArrayList<Customer>();
        list2.add(new Customer(12, "Lars", "Allan"));
        list2.add(new Customer(8, "Allan", "Lars"));
        list2.add(new Customer(33, "Jeppe", "Breum"));
        list2.add(new Customer(16, "Birgitte", "Børge"));
        list2.add(new Customer(25, "ulla", "Allan"));

        System.out.println(list2);
        Collections.sort(list2);
        System.out.println(list2);

    }

}
