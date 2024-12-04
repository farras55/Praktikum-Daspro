package Praktikum13;

import java.util.Scanner;

public class Kafe12 {
    public static void main(String[] args) {
        Menu("Andi", true);
        Scanner sc = new Scanner(System.in);
        System.out.print("\nMasukkan nomor menu yang ingin anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();
        String kodePromo = sc.next();

        double totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);

        System.out.println("Total harga untuk pesanan anda: Rp" + totalHarga);

        if (kodePromo.equalsIgnoreCase("DISKON50") || kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Kode promo diterapkan: " + kodePromo);
        } else if (!kodePromo.equalsIgnoreCase("NONE")) {
            System.out.println("Kode promo invalid. Tidak ada diskon yang diberikan.");
        }

        System.out.println("Total harga untuk pesanan anda: Rp" + totalHarga);

        sc.close();

    }
    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        
        System.out.println("===== MENU RESTO CAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappucino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang anda inginkan.");
    }

    public static double hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        double hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
    
        // Diskon berdasarkan kode promo
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            hargaTotal *= 0.5; // Diskon 50%
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            hargaTotal *= 0.7; // Diskon 30%
        } else if (!kodePromo.equalsIgnoreCase("NONE")) {
            System.out.println("Kode promo invalid. Tidak ada diskon yang diberikan.");
        }
    
        return hargaTotal;
    }
    
}
