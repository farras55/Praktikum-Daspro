package Praktikum05;

import java.util.Scanner;

public class Kafe11 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String menu;
        char ukuranCup;
        int jumlah;
        boolean keanggotaan;


    System.out.print("Masukkan menu: ");
    menu = sc.nextLine();
    System.out.print("Masukkan ukuran cup: ");
    ukuranCup = sc.next().charAt(0);
    System.out.print("Masukkan jumlah:" );
    jumlah = sc.nextInt();
    System.out.print("Masukkan keanggotaan (true/false): ");
    keanggotaan = sc.nextBoolean();



    }
}
