package Recursion;

public class OpgaverApp {

    public static void main(String[] args) {
        System.out.println(factorial(4));

        System.out.println(power(4,8));

        System.out.println(power2(4,4));

        System.out.println(product(4,4));

        System.out.println(productRus(4,4));

        System.out.println(reverse("lars"));

        System.out.println(størsteFællesDivisor(10,15));

    }

    // opgave 1
    // Denne metode har tidskompleksiteten O(n)

    public static int factorial(int n){
        // Termineringsregel
        // når termineringsreglen opfyldes, returneres værdien fra vores rekurrensregel nede fra og op.
        if(n == 0){
            return 1;
        }else{
            // rekurrensregel
            // så længe termineringsreglen ikke er udført, bliver resultatet af vores return sat på pause,
            // og vi kalder metoden igen, hvor n er én mindre.
            return n * factorial(n-1);
        }
    }

    // opgave 2.1
    // Denne metode har tidskompleksiteten O(n)

    public static int power(int n, int p){
        if (p == 0){
            return 1;
        }else{
            return power(n, p-1) * n;
        }

    }

    // opgave 2.2
    // Denne metode har tidskompleksiteten O(log n)
    public static int power2(int n, int p){
        if (p == 0){
            return 1;
        } else if (p % 2 == 0){
            int y = power2(n, p/2);
            return y*y;
        }else{
            return n * power2(n, p-1);
        }

    }

    // opgave 3.1
    public static int product(int a, int b){
        if (a == 0){
            return 0;
        }else{
            return product(a-1, b) + b;
        }
    }

    //opgave 3.2

    public static int productRus(int a, int b){
        if (a == 0){
            return 0;
        } else if (a % 2 == 0){
            return productRus(a/2, 2*b);
        }else{
            return productRus(a-1,b) + b;
        }
    }

    // opgave 4
    public static String reverse(String s){
        if (s.length() == 1){
            return s;
        }else{
            return reverse(s.substring(1)) + s.charAt(0);

        }
    }

    // opgave 5
    //Finder det største heltal der går op i begge tal
    public static int størsteFællesDivisor(int a, int b){
        if (b <= a && b % a == 0){
            return a;
        }else if (a < b){
            return størsteFællesDivisor(b, a);
        }else{
            return størsteFællesDivisor(b, a%b);
        }
    }


}
