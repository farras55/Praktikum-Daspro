package Praktikum06;

import java.util.Scanner;

public class Pemilihan2Percobaan211 {
    
    public static void main(String[] args) {
        
        Scanner sc11 = new Scanner(System.in);

        int pilihan_menu, harga, potonganQris = 0;
        String member, metodePembayaran;
        double diskon, totalAkhir, total_bayar;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice tea)");
        System.out.println("------------------------------------");
        System.out.print("masukkan angka dari menu yang dipilih = ");
        pilihan_menu = sc11.nextInt();
        sc11.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = sc11.nextLine();
        System.out.print("Masukkan metode pembayaran (cash/qris) = ");
        metodePembayaran = sc11.nextLine();
        System.out.println("------------------------------------");

        sc11.close();
        
        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            if (metodePembayaran.equalsIgnoreCase("qris")) {
                potonganQris = 1000;
                System.out.println("Karena anda memakai QRIS anda mendapat potongan sebesar Rp.1000");
            } else if (metodePembayaran.equalsIgnoreCase("cash")) {
                potonganQris = 0;
            } else {
                System.out.println("Metode Pembayaran anda tidak tersedia");
            }
            total_bayar = harga - (harga * diskon);
            totalAkhir = total_bayar - potonganQris;
            System.out.println("Total bayar setelah diskon = " + totalAkhir);
        } 
        else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            if (metodePembayaran.equalsIgnoreCase("qris")) {
                potonganQris = 1000;
                System.out.println("Karena anda memakai QRIS anda mendapat potongan sebesar Rp.1000");
            } else if (metodePembayaran.equalsIgnoreCase("cash")) {
                potonganQris = 0;
            } else {
                System.out.println("Metode Pembayaran anda tidak tersedia");
            }
            totalAkhir = harga - potonganQris;
            System.out.println("Total bayar setelah diskon = " + totalAkhir);    
        }
    }
}
