package latihan;

import java.util.Scanner;

public class latihan1 {

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        double totalGaji, Pajak, THR, gajiPokok;
        
        gajiPokok = 2000000;
        System.out.println("Masukkan gaji pokok karyawan : " + gajiPokok);
        
        THR = (1 * gajiPokok) + 55000;
        System.out.println("Besaran THR : " + THR);
        
        Pajak = 0.05 * gajiPokok;

        totalGaji = (THR + gajiPokok) - Pajak;
        System.out.println("Total Pendapatan Karyawan :" + totalGaji);       
    }
}