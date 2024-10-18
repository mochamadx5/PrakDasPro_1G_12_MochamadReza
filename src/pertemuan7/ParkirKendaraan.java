package pertemuan7;

import java.util.Scanner;

public class ParkirKendaraan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final int tarifMobilPerJam = 3000;
        final int tarifMotorPerJam = 2000;
        final int tarifTetap = 12500;
        
        int totalPembayaran = 0;

        while (true) {
            System.out.print("\nMasukkan jenis kendaraan (1 untuk Mobil, 2 untuk Motor, atau 0 untuk selesai): ");
            int jenisKendaraan = scanner.nextInt();
            if (jenisKendaraan == 0) {
                break;
            }
            System.out.print("Masukkan durasi parkir dalam jam: ");
            int durasiParkir = scanner.nextInt();
            if (durasiParkir < 0) {
                System.out.println("Durasi parkir tidak valid, coba lagi.");
                continue;
            }
            int biayaParkir = 0;

            if (durasiParkir > 5) {
                biayaParkir = tarifTetap;
            } else {
                if (jenisKendaraan == 1) {
                    biayaParkir = durasiParkir * tarifMobilPerJam;
                } else if (jenisKendaraan == 2) {
                    biayaParkir = durasiParkir * tarifMotorPerJam;
                } else {
                    System.out.println("Jenis kendaraan tidak valid, coba lagi");
                    continue;
                }
            }
            totalPembayaran += biayaParkir;

            System.out.println("Biaya parkir untuk kendaraan ini: Rp " + biayaParkir);
        }
        System.out.println("\nTotal pembayaran parkir: Rp " + totalPembayaran);

        scanner.close();
    }
}
