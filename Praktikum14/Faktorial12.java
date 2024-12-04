package Praktikum14;

public class Faktorial12 {
    
    public static int faktorial (int n) {
        if (n == 0) {
            return 1;
        }
         else {
            return n * faktorial(n - 1);
         }
    }

    public static int faktorialIteratif (int n) {
        int hasil = 1;

        for (int i = n; i >= 1; i--) {
            hasil = hasil * 1;
        }

        return hasil;
    }

    public static void main(String[] args) {
        System.out.println(faktorial(5));
        System.out.println(faktorialIteratif(5));
    }
}
