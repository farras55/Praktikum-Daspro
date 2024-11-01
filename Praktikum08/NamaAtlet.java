package Praktikum08;

import java.util.Scanner;

public class NamaAtlet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int a = 1; a <= 5; a++) {
            System.out.print("Masukkan nama atlet badminton ke-" + a + " = ");
            String badminton = sc.nextLine();
        }

        for (int b = 1; b <= 5; b++) {
            System.out.print("Masukkan nama atlet tenis meja ke-" + b + " = ");
            String tenisMeja = sc.nextLine();
        }

        for (int c = 1; c <= 5; c++) {
            System.out.print("Masukkan nama atlet basket ke-" + c + " = ");
            String basket = sc.nextLine();
        }

        for (int d = 1; d <= 5; d++) {
            System.out.print("Masukkan nama atlet bola volly ke-" + d + " = ");
            String bolaVoly = sc.nextLine();
        }
        sc.close();
    }
}
