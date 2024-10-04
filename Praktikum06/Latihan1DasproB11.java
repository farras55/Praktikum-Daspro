package Praktikum06;
import java.util.Scanner;

public class Latihan1DasproB11 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan1, bilangan2, bilangan3, terbesar;
        System.out.println("...");
        System.out.print("Masukkan bilangan 1: ");
        bilangan1 = sc.nextInt();

        System.out.print("Masukkan bilangan 2: ");
        bilangan2 = sc.nextInt();

        System.out.print("Masukkan bilangan 3: ");
        bilangan3 = sc.nextInt();

        if (bilangan1 > bilangan2) {
            terbesar = bilangan1;
            if (bilangan2 > bilangan1)
                terbesar = bilangan2;
        }
        else 
        terbesar = bilangan3;

        System.out.println("Nilai terbesar adalah : " + terbesar);
        sc.close();
    }
}
