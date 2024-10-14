import java.util.Scanner;

public class TarifParkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenisKendaraan, durasiParkir, totalBiaya = 0;

        while (true) {
            System.out.print("Masukkan jenis kendaraan (1: Mobil, 2: Motor, 0: Keluar): ");
            jenisKendaraan = sc.nextInt();

            if (jenisKendaraan == 0) {
                break;
            }

            if (jenisKendaraan == 1 || jenisKendaraan == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasiParkir = sc.nextInt();

                if (durasiParkir > 5) {
                    totalBiaya += 12500;
                } else if (jenisKendaraan == 1) {
                    totalBiaya += durasiParkir * 3000;
                } else {
                    totalBiaya += durasiParkir * 2000;
                }
            } else {
                System.out.println("Jenis kendaraan tidak valid.");
            }
        }

        System.out.println("Total biaya parkir: Rp " + totalBiaya);
    }
}