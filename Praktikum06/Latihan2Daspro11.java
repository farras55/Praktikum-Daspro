package Praktikum06;
import java.util.Scanner;

public class Latihan2Daspro11 {
    
    public static void main(String[] args) {
        // Membuat scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        System.out.println("...");

        System.out.print("Masukkan hari : ");
        String hari = scanner.nextLine();


        if (hari.equalsIgnoreCase("rabu")) {
            // Meminta input dari pengguna mengenai jenis buku dan jumlah buku
        System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
        String jenisBuku = scanner.nextLine(); 

        // Inisialisasi diskon
        double diskon = 0;

        // Kondisi diskon berdasarkan jenis buku
        if (jenisBuku.equals("kamus")) {
            // Diskon awal 10%
            diskon = 10;
            System.out.print("Masukkan jumlah buku yang dibeli: ");
            int jumlahBuku = scanner.nextInt();


            // Tambahan diskon jika jumlah buku lebih dari 2
            if (jumlahBuku > 2) {
                diskon += 2;
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            // Diskon awal 7%
            diskon = 7;
            System.out.print("Masukkan jumlah buku yang dibeli: ");
            int jumlahBuku = scanner.nextInt();

            if (jumlahBuku > 3) {
                diskon += 2;
            } else {
                // Tambahan diskon jika jumlah buku <= 3
                diskon += 1;
            }
        } else {
            System.out.print("Masukkan jumlah buku yang dibeli: ");
            int jumlahBuku = scanner.nextInt();

            if (jumlahBuku > 3) {
                diskon = 5;
            }
        }

        System.out.println("Total diskon yang diberikan adalah: " + diskon + "%");

        } else
            System.out.println("Maaf anda belum bisa mendapat diskon.");

        scanner.close();
}
}
