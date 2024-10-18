package pertemuan7;

import java.util.Scanner;

public class tiketBioskop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int HARGA_TIKET = 50000;
        int totalTiketTerjual = 0;
        double totalPendapatan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang ingin dibeli (atau 0 untuk selesai): ");
            int jumlahTiket = scanner.nextInt();
            if (jumlahTiket == 0) {
                break;
            }
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid, coba lagi.");
                continue;
            }
            double diskon = 0.0;
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }
            double totalHarga = jumlahTiket * HARGA_TIKET * (1 - diskon);
            totalTiketTerjual += jumlahTiket;
            totalPendapatan += totalHarga;

            System.out.println("Jumlah tiket yang dibeli: " + jumlahTiket);
            System.out.println("Total harga setelah diskon: Rp " + totalHarga);
        }
        System.out.println("Total tiket terjual hari ini: " + totalTiketTerjual);
        System.out.println("Total pendapatan hari ini: Rp " + totalPendapatan);

    }
}
