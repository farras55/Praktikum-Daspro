package Praktikum13;

import java.util.Scanner;

public class Percoobaan612 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p,l,t,L,vol;
        System.out.println("Masukkan panjang");
        p = input.nextInt();
        System.out.println("Masukkan lebar");
        l = input.nextInt();
        System.out.println("Masukkan tinggi");
        t = input.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas persegi panjang adalah " + L);

        vol = hitungVolume(t, p, l);
        System.out.println("Volume balok adalah " + vol);

        input.close();
    }
    public static int hitungLuas (int pjg, int lb) {
        int Luas = pjg*lb;
        return Luas;
    }

    public static int hitungVolume (int tinggi , int a, int b) {
        int volume = hitungLuas(a, b)*tinggi;
        return volume;
    }
}
