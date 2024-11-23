package Praktikum13;

import java.util.Scanner;

public class Kubus12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s,vol,lp;
        System.out.println("Masukkan panjang sisi kubus");
        s = sc.nextInt();

        vol = hitungVolume(s);
        System.out.println("Volume kubus adalah " + vol);

        lp = hitungLuasPermukaan(s);
        System.out.println("Luas permukaan kubus adalah " + lp);

        sc.close();
        
    }

    public static int hitungVolume (int sisi) {
        int volume = sisi*sisi*sisi;
        return volume;
    }
    public static int hitungLuasPermukaan (int sisi) {
        int luasPermukaan = 6* (sisi*sisi);
        return luasPermukaan;
    }
}
