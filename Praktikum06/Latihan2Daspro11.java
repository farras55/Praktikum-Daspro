package Praktikum06;
import java.util.Scanner;

public class Latihan2Daspro11 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("...");

        System.out.print("Masukkan hari : ");
        String hari = scanner.nextLine();


        if (hari.equalsIgnoreCase("rabu")) {
           System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
            String jenisBuku = scanner.nextLine(); 

        double diskon = 0;

         if (jenisBuku.equals("kamus")) {
            diskon = 10;
            System.out.print("Masukkan jumlah buku yang dibeli: ");
            int jumlahBuku = scanner.nextInt();

            if (jumlahBuku > 2) {
                diskon += 2;
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskon = 7;
            System.out.print("Masukkan jumlah buku yang dibeli: ");
            int jumlahBuku = scanner.nextInt();

            if (jumlahBuku > 3) {
                diskon += 2;
            } else {
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
