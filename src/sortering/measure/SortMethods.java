package sortering.measure;

import sortering.customer.Customer;

import java.util.ArrayList;

public class SortMethods {
    
    public static void bubbleSort(String[] array) {
//        for (int i = 0; i < array.length ; i++) {
//            for (int j = 1; j < array.length ; j++) {
//                if (array[i].compareTo(array[j]) > 0){
//                    String temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//
//            }
//
//        }

        int position, scan;
        // det ydre loop kører igennem hele vores liste.
        // for hver gennemløb køre vores loop igennem ét element mindre, da vi nu har element på sin endelig plads. (position--)
        for (position = array.length-1; position >= 0 ; position--) {
            // sammenligner elementer med elementer på et index højere og skifter plads på elementerne hvis nødvendig.
            for (scan = 0; scan <= position -1; scan++) {
                if (array[scan].compareTo(array[scan+1]) > 0){
                    swap(array, scan, scan+1);
                }

            }

        }
    }

    // opgave 2.1 String array
    public static void selectionSort(String[] array) {  
        int min;
        // Ydre loop holder styr på det mindste index i vores array.
        // Det index hvor vores mindste værdi/element skal placeres
        for (int i = 0; i < array.length -1; i++) {
            min = i;
            // indre loop finder den mindste værdi i vores array, ved at løbe alle positioner igennem der er større eller lig med vores min.
            for (int j = 1; j < array.length; j++) {
                if (array[j].compareTo(array[min]) < 0) {
                    min = j;
                }
            }
            // Når den mindste værdi er fundet, kalder vi vores hjælpe metode swap.
            // Som argument tager metoden vores liste(array), vores mindste værdi(min) og index på hvor vores mindste værdi skal placeres(i).
            swap(array, min, i);
        }
    }

    // Hjælpe metoden tager værdien på vores mindste index(det index vi er kommet til) og bytter det med den mindste værdi.
    private static void swap(String[] array, int index1, int index2){
        String temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    // Opgave 2.2 Customer arrayListe

    public static void selectionSortCustomer(ArrayList<Customer> list){
        int min;

        for (int i = 0; i < list.size() -1 ; i++) {
            min = i;
            for (int j = 1; j < list.size() ; j++) {
                if (list.get(j).compareTo(list.get(min)) < 0){
                    min = j;
                }

            }
            swapCustomer(list, min, i);

        }
    }

    private static void swapCustomer(ArrayList<Customer> list, int index1, int index2){
        Customer temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }


    public static void insertionSort(String[] array) {
        // det ydre loop holder styr på det element, som skal tilføjes til den sorterede del af listen.
        for (int i = 1; i < array.length; i++) {
            String key = array[i];
            int position = i;

            // det indre loop sammenligner vores index i det ydre loop, med index der er lavere, for at finde den rigtige plads til vores element.
            while(position > 0 && array[position-1].compareTo(key) > 0){
                array[position] = array[position-1];
                position--;
            }
            array[position] = key;
        }
    }

    public static void insertionSortCustomer(ArrayList<Customer> list){
        for (int i = 1; i < list.size(); i++) {
            Customer key = list.get(i);
            int position = i;

            while (position > 0 && list.get(position-1).compareTo(key) > 0){
                list.set(position, list.get(position-1));
                position--;
            }
            list.set(position, key);

        }
    }


    
}
