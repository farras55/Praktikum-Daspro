package Praktikum08;

import java.util.Scanner;

public class NamaAtlet {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String namaKampus, badminton = "", tenisMeja = "", basket = "", bolaVolly = "";
        System.out.print("Masukkan nama kampus : ");
        namaKampus = sc.nextLine();

        for (int j = 1; j < 5; j++) {
            if (j == 1) {
                System.out.println("CABOR BADMINTON");
                for (int a = 1; a <= 5; a++) {
                    System.out.print("Masukkan nama atlet badminton " + namaKampus + " ke-" + a + " = ");
        
                    if (a == 1) {
                        badminton += sc.nextLine();
                    }
                    else{
                        badminton += ", " + sc.nextLine();
                    }
                }
            }
            if (j == 2) {
                System.out.println("CABOR TENIS MEJA");
                for (int b = 1; b <= 5; b++) {
                    System.out.print("Masukkan nama atlet tenis meja ke-" + b + " = ");
                    
                    if (b == 1) {
                        tenisMeja += sc.nextLine();
                    }
                    else{
                        tenisMeja += ", " + sc.nextLine();
                    }
                }
            }
            if (j == 3) {
                System.out.println("CABOR BASKET");
                for (int c = 1; c <= 5; c++) {
                System.out.print("Masukkan nama atlet basket ke-" + c + " = ");

                if (c == 1) {
                    basket += sc.nextLine();
                }
                else{
                    basket += ", " + sc.nextLine();
                }
            }
            }
            if (j == 4) {
                System.out.println("CABOR BOLA VOLLY");
                for (int d = 1; d <=5; d++) {
                    System.out.print("Masukkan nama atlet bolla volly ke-" + d + " = ");

                if (d == 1) {
                    bolaVolly += sc.nextLine();
                }
                else{
                    bolaVolly += ", " + sc.nextLine();
                }
                }
            }
        }
        System.out.println("         DAFTAR NAMA ATLET " + namaKampus);
        System.out.println("Nama atlet cabor badminton : " + badminton);
        System.out.println("Nama atlet cabor tenis meja : " + tenisMeja);
        System.out.println("Nama atlet cabor basket : " + basket);
        System.out.println("Nama atlet cabor bola volly : " + bolaVolly);

        sc.close();
    }
}
