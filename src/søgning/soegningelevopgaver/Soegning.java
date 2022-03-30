package søgning.soegningelevopgaver;

import java.util.ArrayList;

public class Soegning {

    // Opgave 1 - find ulige tal
    public boolean findUlige(int[] tabel) {
        int i = 0;
        while(i < tabel.length){
            int k = tabel[i];
            if (k % 2 != 0){
                return true;
            }
            i++;
        }
        return false;
    }

    // Opgave 2 - find tal i interval 10-15
    public int findInterval(int[] tabel){
        int i = 0;
        while(i < tabel.length){
            int k = tabel[i];
            if (k >= 10 && k <= 15){
                return k;
            }
            i++;
        }
        return -1;
    }

    // Opgave 3

    public boolean findToEns(int[] tabel){
        int i = 0;
        while(i+1 < tabel.length){
            int k = tabel[i];
            if (k == tabel[i+1]){
                return true;
            }
            i++;
        }
        return false;
    }

    // opgave 5 Lineær søgning

    public int størsteHeltal(int n){
        boolean fundet = false;
        int r = 0;
        while(fundet != true){
            if (r*r <= n && n < (r+1)*(r+1)){
                fundet = true;
            }else{
                r++;
            }

        }
        return r;
    }

    // opgave 5 binær søgning
    public int størsteHeltal2(int n){
        int left = 0;
        int right = n;
        while(left <= right){
            int middle = (left + right) / 2;
            int r = middle;
            if (r*r <= n && n < (r+1)*(r+1)){
                return r;
            }
            if (r*r > n){
                right = middle - 1;
            }else{
                left = middle + 1;
            }
        }
        return -1;
    }

    // opgave 6 find og byt
    public int find(ArrayList<Integer> list, int n){
        int i = 0;
        while(i < list.size()){
            if (list.get(i) == n){
                if (i == 0){
                    return i;
                }else{
                    int temp = list.get(i);
                    list.set(i, list.get(i-1));
                    list.set(i-1, temp);
                    return list.indexOf(n);
                }
            }
            i++;

        }
        return -1;
    }

}
