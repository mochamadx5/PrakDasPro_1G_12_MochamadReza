package Pertemuan3;

import java.util.Scanner;

/**
 * p3_tugasgajikaryawan
 */
public class p3_tugasgajikaryawan {

    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        
        // variabel 
        int jumlahJamKerja, upahPerJam;
        double gajiKaryawan, bonusGaji, gajiSetelahPajak, gajiSebelumPajak, gajiBersih;
        
        // input
        System.out.print("Masukkan jumlah jam kerja karyawan: ");
        jumlahJamKerja = input.nextInt();
        System.out.print("Masukkan upah per jam: ");
        upahPerJam = input.nextInt();

        // menghitung gaji karyawan
        gajiKaryawan = jumlahJamKerja * upahPerJam;
        System.out.println("Gaji Karyawan: " + gajiKaryawan);
        
        bonusGaji = gajiKaryawan * 0.1;
        System.out.println("Bonus Gaji: " + bonusGaji);
        
        gajiSebelumPajak = gajiKaryawan + bonusGaji;
        System.out.println("Gaji sebelum pajak: " + gajiSebelumPajak);
        
        gajiSetelahPajak = bonusGaji * 0.05;
        System.out.println("Gaji Setelah Pajak: " + gajiSetelahPajak);
        
        gajiBersih = (int) (gajiKaryawan - gajiSetelahPajak);
        System.out.println("Gaji bersih sebesar " + gajiBersih);
    }
}