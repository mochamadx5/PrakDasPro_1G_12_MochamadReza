package pertemuan5;

import java.util.Scanner;

public class lati {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int hargaNasiGoreng, hargaMieRebus, hargaFuyunghai;
        int jumlahNasiGoreng, jumlahMieRebus, jumlahFuyunghai;
        double totalBelanja, totalSetelahDiskon;
        double diskon = 0;
        
        // Input harga dan jumlah makanan
        System.out.println("=== Menu Makanan ===");
        System.out.print("Harga Nasi Goreng: ");
        hargaNasiGoreng = scanner.nextInt();
        System.out.print("Jumlah Nasi Goreng yang dibeli: ");
        jumlahNasiGoreng = scanner.nextInt();

        System.out.print("Harga Fuyunghai: ");
        hargaFuyunghai = scanner.nextInt();
        System.out.print("Jumlah Fuyunghai yang dibeli: ");
        jumlahFuyunghai = scanner.nextInt();

        System.out.print("Harga Mie Rebus: ");
        hargaMieRebus = scanner.nextInt();
        System.out.print("Jumlah Mie Rebus yang dibeli: ");
        jumlahMieRebus = scanner.nextInt();

        // Menghitung total belanja
        totalBelanja = (hargaNasiGoreng * jumlahNasiGoreng) + 
                       (hargaMieRebus * jumlahMieRebus) + 
                       (hargaFuyunghai * jumlahFuyunghai);

        System.out.println("Total belanja sebelum diskon: Rp " + totalBelanja);

        // Menghitung diskon
        if (totalBelanja > 500000) {
            diskon = totalBelanja * 0.10;
        } else if (totalBelanja > 200000) {
            diskon = totalBelanja * 0.05;
        } else if (totalBelanja > 100000) {
            diskon = totalBelanja * 0.02;
        }

        totalSetelahDiskon = totalBelanja - diskon;

        // Menampilkan hasil
        System.out.println("Potongan diskon: Rp " + diskon);
        System.out.println("Total setelah diskon: Rp " + totalSetelahDiskon);
        
        scanner.close();
    }
}