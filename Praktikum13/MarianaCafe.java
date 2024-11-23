package Praktikum13;

import java.util.Arrays;
import java.util.Scanner;

public class MarianaCafe {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int jumlahHariPenjulan, jumlahMenu;
        System.out.print("Masukkan jumlah hari penjualan: ");
        jumlahHariPenjulan = sc.nextInt();
        System.out.print("Masukkan jumlah menu: ");
        jumlahMenu = sc.nextInt();
        sc.nextLine();
        
        int[][] dataPenjualan = new int[jumlahMenu][jumlahHariPenjulan];
        String[] daftarMenu = new String[jumlahMenu];
    

        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Masukkan menu ke-" + (i + 1) + ": ");
            daftarMenu[i] = sc.nextLine();
            for (int j = 0; j < jumlahHariPenjulan; j++) {
                System.out.print("Jumlah penjualan hari ke-" + (j+1) + ": ");
                dataPenjualan[i][j] = sc.nextInt();
                sc.nextLine();
            }
        }
        sc.close();

        System.out.println();
        menampilkanDataPenjualan(daftarMenu, dataPenjualan);
        System.out.println();
        menampilanPenjualanTertinggi(daftarMenu, dataPenjualan);
        System.out.println();
        menampilkanRataRataPadaSetiapPenjualan(daftarMenu, dataPenjualan);
    }


    public static void menampilkanDataPenjualan (String[] daftarMenu, int[][] dataPenjualan) {
        System.out.println("Data penjualan Cafe hari pertama hingga hari ke-" + dataPenjualan.length);
        for (int i = 0; i < daftarMenu.length; i++) {
                String output = daftarMenu[i] + Arrays.toString(dataPenjualan[i]);
            System.out.println(output);
        }
    }

    public static void menampilanPenjualanTertinggi (String[] daftarMenu, int[][] dataPenjualan) {
        int[] jumlahPenjualanPerMenu = new int[daftarMenu.length];

        for (int i = 0; i < dataPenjualan.length; i++) {
            for (int j = 0; j < dataPenjualan[0].length; j++) {
                jumlahPenjualanPerMenu[i] += dataPenjualan[i][j];
            }
        }

        for (int i = 0; i < daftarMenu.length; i++) {
            System.out.println("Total penjualan " + daftarMenu[i] + " : " + jumlahPenjualanPerMenu[i]);
        }

        int penjualanTertinggi = 0;
        int indexMenuTertinggi = 0;

        for (int i = 1; i < jumlahPenjualanPerMenu.length; i++) {
            if (jumlahPenjualanPerMenu[i] > penjualanTertinggi) {
                penjualanTertinggi = jumlahPenjualanPerMenu[i];
                indexMenuTertinggi = i;
            }
        }

        System.out.println("\nJadi menu dengan total penjualan tertinggi adalah " + daftarMenu[indexMenuTertinggi] 
                        + " dengan total penjualan " + penjualanTertinggi);
        }

        public static void menampilkanRataRataPadaSetiapPenjualan (String[] daftarMenu, int[][] dataPenjualan) {
            int[] jumlahPenjualanPerMenu = new int[daftarMenu.length];

            for (int i = 0; i < daftarMenu.length; i++) {
                for (int j = 0; j < dataPenjualan.length; j++) {
                    jumlahPenjualanPerMenu[i] += dataPenjualan[i][j];
                }
            }
            for (int i = 0; i < daftarMenu.length; i++) {
                System.out.println("Rata rata penjualan " + daftarMenu[i] + " adalah " + jumlahPenjualanPerMenu[i]/dataPenjualan.length);
            }
        }
}
