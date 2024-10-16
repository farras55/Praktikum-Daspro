import java.util.Scanner;

public class PenjualanTiketBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalTiketTerjual = 0;
        int totalPendapatan = 0;
        int HARGA_TIKET = 50000;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang terjual (0 untuk mengakhiri): ");
            int jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak boleh negatif. Silakan masukkan ulang.");
                continue;
            }

            double hargaSetelahDiskon = HARGA_TIKET * jumlahTiket;
            if (jumlahTiket > 10) {
                hargaSetelahDiskon *= 0.85; // Diskon 15%
            } else if (jumlahTiket > 4) {
                hargaSetelahDiskon *= 0.9; // Diskon 10%
            }

            totalTiketTerjual += jumlahTiket;
            totalPendapatan += hargaSetelahDiskon;
        }

        sc.close();

        System.out.println("Total tiket yang terjual: " + totalTiketTerjual + " tiket");
        System.out.println("Total pendapatan: Rp." + totalPendapatan);
    }
}