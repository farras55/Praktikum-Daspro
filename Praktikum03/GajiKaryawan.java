import java.util.Scanner;

public class GajiKaryawan {

    public static void main(String[] args) {
        // Membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah jam kerja karyawan dalam sebulan: ");
        double jamKerja = scanner.nextDouble();

        System.out.print("Masukkan upah per jam (dalam Rupiah): ");
        double upahPerJam = scanner.nextDouble();

        // Hitung gaji sebelum bonus dan pajak
        double gajiSebelumBonus = jamKerja * upahPerJam;

        // Hitung bonus (10% dari gaji sebelum pajak)
        double bonus = 0.10 * gajiSebelumBonus;

        // Hitung total gaji sebelum pajak (gaji + bonus)
        double totalGajiSebelumPajak = gajiSebelumBonus + bonus;

        // Hitung pajak (5% dari total gaji sebelum pajak)
        double pajak = 0.05 * totalGajiSebelumPajak;

        // Hitung gaji akhir setelah pajak
        double gajiAkhir = totalGajiSebelumPajak - pajak;

        // Tampilkan hasil
        System.out.println("Gaji sebelum pajak: Rp " + gajiSebelumBonus);
        System.out.println("Bonus: Rp " + bonus);
        System.out.println("Pajak: Rp " + pajak);
        System.out.println("Gaji akhir setelah pajak: Rp " + gajiAkhir);

        scanner.close();
    }
}
