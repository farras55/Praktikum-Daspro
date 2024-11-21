package Praktikum10;

import java.util.Scanner;

public class BioskopWithScanner12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String penonton[][] = new String[4][2];
        int menu, baris, kolom;

        while (true) {
            // Tampilkan Menu
            System.out.println("\nMenu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine(); // Membersihkan buffer

            if (menu == 1) {
                // Input Data Penonton
                while (true) {
                    System.out.print("Masukkan Baris (1-4): ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan Kolom (1-2): ");
                    kolom = sc.nextInt();
                    sc.nextLine(); // Membersihkan buffer

                    // Validasi baris dan kolom
                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Baris atau kolom tidak valid. Coba lagi.");
                    } else if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi sudah ditempati oleh " + penonton[baris - 1][kolom - 1] + ". Pilih kursi lain.");
                    } else {
                        // Input nama jika valid
                        System.out.print("Masukkan Nama: ");
                        penonton[baris - 1][kolom - 1] = sc.nextLine();
                        break;
                    }
                }
            } else if (menu == 2) {
                // Tampilkan Daftar Penonton
                System.out.println("\nDaftar Penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.print("***\t");
                        } else {
                            System.out.print(penonton[i][j] + "\t");
                        }
                    }
                    System.out.println();
                }
            } else if (menu == 3) {
                // Exit
                System.out.println("Terima kasih!");
                break;
            } else {
                // Validasi menu tidak valid
                System.out.println("Pilihan menu tidak valid. Coba lagi.");
            }
        }

        sc.close();
    }
}
