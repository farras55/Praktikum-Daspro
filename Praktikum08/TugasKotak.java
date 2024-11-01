package Praktikum08;

import java.util.Scanner;

public class TugasKotak {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = sc.nextInt();
        sc.close();

        if (N < 3) {
            System.out.println("Nilai N harus minimal 3.");
            return;
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0 || i == N - 1 || j == 0 || j == N - 1) {
                    System.out.print(N + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
