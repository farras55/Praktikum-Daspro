package Praktikum03;

import java.util.Scanner;

public class Listrik11 {

    // Tarif per kWh
    private static final int TARIF_PER_KWH = 1500;

    // Fungsi untuk menghitung total tagihan listrik
    public static int hitungTagihanListrik(double penggunaanKwh) {
        return (int) (penggunaanKwh * TARIF_PER_KWH);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah penggunaan listrik (dalam kWh): ");
        double penggunaanKwh = scanner.nextDouble();

        // Hitung total tagihan
        int totalTagihan = hitungTagihanListrik(penggunaanKwh);

        // Periksa apakah penggunaan melebihi 500 kWh
        if (penggunaanKwh > 500) {
            System.out.println("Peringatan: Penggunaan listrik melebihi 500 kWh!");
        }

        // Tampilkan total tagihan
        System.out.println("Total tagihan listrik adalah: Rp " + totalTagihan);

        scanner.close();
    }
}