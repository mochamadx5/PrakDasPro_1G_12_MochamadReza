package semester2.pertemuan1;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] mataKuliah = {"Pancasila", "Konsep Teknologi Informasi", "CTPS", "Matematika Dasar", 
                               "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", 
                               "Keselamatan dan Kesehatan Kerja"};

        double[] nilaiAngka = new double[mataKuliah.length];
        double[] bobotNilai = new double[mataKuliah.length];
        String[] nilaiHuruf = new String[mataKuliah.length];
        
        System.out.println("=========================");
        System.out.println("Program menghitung IP semester");
        System.out.println("=========================");

        double totalBobot = 0;

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai untuk " + mataKuliah[i] + ": ");
            nilaiAngka[i] = sc.nextDouble(); 
            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.0;
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.0;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.0;
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E"; 
                bobotNilai[i] = 0.0;

            }
            totalBobot += bobotNilai[i];
        }

        System.out.printf("%-35s %-15s %-15s %-10s\n", "MATA KULIAH", "NILAI ANGKA", "NILAI HURUF", "BOBOT NILAI");
        
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.printf("%-35s %-15.1f %-15s %-10.1f\n", mataKuliah[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
        }
        double ipk = totalBobot / mataKuliah.length;
        System.out.printf("IPK : " + ipk);
    }
}
