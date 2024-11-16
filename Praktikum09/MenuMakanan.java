package Praktikum09;

import java.util.Scanner;

public class MenuMakanan {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String[] daftarMenu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Bakar", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        double[] daftarHarga = {20000, 22000, 15000, 17000, 13000, 18000, 20000};
        String pilihanMenu, perulangan;
        int index = -1, jumlahPesanan;
        int[] daftarPesanan = new int[daftarMenu.length];
        double totalHarga = 0, subTotal;

         System.out.println("DAFTAR MENU");
        for (int i = 0; i < daftarMenu.length; i++) {
            System.out.println(i + ". " + daftarMenu[i] + " = Rp." + daftarHarga[i]);
        } 

        do {
            System.out.print("Masukkan nama menu : ");
            pilihanMenu = sc.nextLine();

            for (int i = 0; i <= daftarMenu.length; i++){
                if (daftarMenu[i].equalsIgnoreCase(pilihanMenu)) {
                    index = i;
                    break;
                }
            }

            if (index != -1) {
                System.out.print("Masukkan jumlah pesanan: ");
                jumlahPesanan = sc.nextInt();
                sc.nextLine();
                daftarPesanan[index] += jumlahPesanan;
            }
            else {
                System.out.println("Menu tdak tersedia!!!");
            }
            System.out.print("Apakah ingin memesan menu lain? (y/n): ");
            perulangan = sc.nextLine();
        } while (perulangan.equalsIgnoreCase("y"));

        System.out.println("Daftar pesanan anda:");
        for (int i = 0; i < daftarPesanan.length; i++) {
            if (daftarPesanan[i] > 0) {
                subTotal = daftarHarga[i] * daftarPesanan[i];
                totalHarga += subTotal;
                System.out.println(daftarMenu[i] + " x " + daftarPesanan[i] + " = Rp" + subTotal);
            }
        }

        System.out.println("Total harga yang perlu dibayar: Rp" + totalHarga);
        sc.close();
    }
}
