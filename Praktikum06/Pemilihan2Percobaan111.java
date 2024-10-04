package Praktikum06;

import java.util.Scanner;

public class Pemilihan2Percobaan111 {

    public static void main(String[] args) {
        
        Scanner sc11 = new Scanner(System.in);

        int tahun;

        System.out.print("Masukkan Tahun: ");
        tahun = sc11.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0)
                System.out.println("Tahun Kabisat");
        } else
            System.out.println("Bukan Tahun Kabisat");

        sc11.close();
    }
    
}
