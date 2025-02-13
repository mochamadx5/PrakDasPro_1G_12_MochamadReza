package semester2.pertemuan1;

import java.util.Scanner;

public class pemilihan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilaiAkhir, nilaiTugas, nilaiUTS, nilaiUAS, nilaiKuis;

        System.out.println("Program menghitung nilai akhir mahasiswa");
        System.out.println("===============================");
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();

        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = sc.nextDouble();

        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = sc.nextDouble();
        
        if (nilaiKuis > 100 || nilaiTugas > 100 || nilaiUAS > 100 || nilaiUTS > 100 ) {
            System.out.println("nilai tidak valid.");
            return;
        }
        nilaiAkhir = (nilaiTugas * 0.20) + (nilaiKuis * 0.20)  + (nilaiUTS * 0.30) + (nilaiUAS * 0.30 );
        System.out.println("===============================");
        System.out.println("===============================");
        System.out.println("Nilai akhir adalah : " + nilaiAkhir);
        
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            System.out.println("Nilai huruf : A ");
        }
            else if (nilaiAkhir > 73 && nilaiAkhir <= 80 ) {
                System.out.println("Nilai huruf : B+ ");    
        }
            else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                System.out.println("Nilai huruf : B ");
        }
            else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                System.out.println("Nilai huruf : C+ ");
        } 
            else if (nilaiAkhir > 50 && nilaiAkhir <= 65) {    
                System.out.println("Nilai huruf : C ");   
        }
            else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                System.out.println("Nilai huruf : D ");   
        }
            else if (nilaiAkhir <= 39) {
                System.out.println("Nilai huruf : E ");
        }
        
        System.out.println("===============================");
        System.out.println("===============================");

        if (nilaiAkhir > 50) {
            System.out.println("Selamat, Anda lulus!");
        }
            else if (nilaiAkhir <= 50) {
                System.out.println("Anda dinyatakan tidak lulus.");
            }
        }
}