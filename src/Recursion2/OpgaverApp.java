package Recursion2;

import java.util.ArrayList;

public class OpgaverApp {
    public static void main(String[] args) {

        ArrayList<Integer> tal = new ArrayList<>();
        tal.add(1);
        tal.add(2);
        tal.add(3);
        tal.add(4);
        tal.add(5);
        tal.add(6);
        tal.add(7);
        tal.add(8);
        tal.add(9);
        tal.add(10);
        tal.add(11);
        tal.add(17);
        System.out.println(ligeTal(tal));

        System.out.println(palindrom("anna"));
    }

    public static int ligeTal(ArrayList<Integer> list){
        if (list.size() == 0){
            return 0;
        }
        if (list.get(0) % 2 == 0){
            list.remove(0);
            return 1 + ligeTal(list);
        }else{
            list.remove(0);
            return ligeTal(list);
        }
    }

    public static boolean palindrom(String tekst){
        if (tekst.length() <= 1){
            return true;
        }

        if (tekst.charAt(0) != tekst.charAt(tekst.length()-1)){
            return false;
        }
        return palindrom(cutCharactersOffEachEnd(tekst));

    }

    private static String cutCharactersOffEachEnd(String tekst) {
        StringBuilder s = new StringBuilder();
        //
        for (int i = 1; i < tekst.length() -1 ; i++) {
            s.append(tekst.charAt(i));
        }
        return s.toString();
    }

//    public static int talFølge(int tal){
//        if (tal == 2){
//            return
//        }
//        if (tal > 2 && tal % 2 == 0){
//            return talFølge(2*(tal - (3-3)) - (tal)
//        }
//    }


}
