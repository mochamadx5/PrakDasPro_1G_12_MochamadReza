package pertemuan5;

import java.util.Scanner;
/**
 * Siakadd12
 */
public class Siakadd12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;
        System.out.print("Masukkan Nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan Nim: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = sc.nextDouble();

        nilaiAkhir = (nilaiKuis * 0.20) + (nilaiTugas *0.15)  + (nilaiUTS * 0.30) + (nilaiUAS * 0.35 );
        
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Mahasiswa dengan nama " + nama + " (NIM " + nim + ") kelas " + kelas + " nomor absen " + absen);

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            System.out.println("Nilai akhir huruf : A \nKualifikasi : Sangat Baik");
        }
            else if (nilaiAkhir > 73 && nilaiAkhir <= 80 ) {
                System.out.println("Nilai akhir huruf : B+ \nKualifikasi : Lebih dari Baik");    
        }
            else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                System.out.println("Nilai Akhir huruf : B \nKualifikasi : Baik");
        }
            else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                System.out.println("Nilai Akhir huruf : C+ \nKualifikasi : Lebih dari cukup");
        } 
            else if (nilaiAkhir > 50 && nilaiAkhir <= 65) {    
                System.out.println("Nilai Akhir huruf : C \nKualifikasi : Cukup");   
        }
            else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                System.out.println("Nilai Akhir huruf : D \nKualifikasi : Kurang");   
        }
            else if (nilaiAkhir <= 39) {
                System.out.println("Nilai Akhir huruf : E \nKualifikasi : Gagal");

        }
        


    }
}