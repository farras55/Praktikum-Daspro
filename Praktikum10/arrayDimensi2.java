package Praktikum10;
import java.util.Scanner;

public class arrayDimensi2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[][] hasilSurvey = new double[10][6];
        
        for (int i = 0; i < hasilSurvey.length; i++) {
            System.out.println("Input Responden ke-" + (i + 1));

            for (int j = 0; j < hasilSurvey[i].length; j++) {
                System.out.print("Jawaban survey " + (j + 1) + ": ");
                hasilSurvey[i][j] = sc.nextDouble();
            }
        }

        System.out.println("\n==============================");
        System.out.println("Rata rata jawaban setiap Responden:");

        for (int i = 0; i < hasilSurvey.length; i++) {
            double totalPerResponden = 0;

            for (int j = 0; j < hasilSurvey[i].length; j++) {
                totalPerResponden += hasilSurvey[i][j];
            }
            System.out.println("Jawaban rata rata Responden " + (i + 1) + " : " + totalPerResponden/6);
        }

        System.out.println("\n==============================");
        System.out.println("Rata rata nilai setiap Pertanyaan:");

        for (int j = 0; j < 6; j++) {
            double totalPerPertanyaan = 0;

            for (int i = 0; i < 10; i++) {
                totalPerPertanyaan += hasilSurvey[i][j];
            }
            System.out.println("Pertanyaan " + (j + 1 ) + " : " + totalPerPertanyaan/10);
        }

        System.out.println("\n==============================");
        System.out.println("Rata-rata keseluruhan:");

        double totalKeseluruhan = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                totalKeseluruhan += hasilSurvey[i][j];
            }
        }
        
        System.out.println("Rata-rata keseluruhan: " + (totalKeseluruhan / 60));



        sc.close();
    }
}
