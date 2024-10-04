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

        System.out.print("Masukkan jumlah buku yang dibeli: ");
        int jumlahBuku = scanner.nextInt();

        // Inisialisasi diskon
        double diskon = 0;

        // Kondisi diskon berdasarkan jenis buku
        if (jenisBuku.equals("kamus")) {
            // Diskon awal 10%
            diskon = 10;

            // Tambahan diskon jika jumlah buku lebih dari 2
            if (jumlahBuku > 2) {
                diskon += 2;
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            // Diskon awal 7%
            diskon = 7;

            // Tambahan diskon jika jumlah buku lebih dari 3
            if (jumlahBuku > 3) {
                diskon += 2;
            } else {
                // Tambahan diskon jika jumlah buku <= 3
                diskon += 1;
            }
        } else {
            // Diskon 5% jika buku bukan kamus atau novel dan jumlah buku lebih dari 3
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
