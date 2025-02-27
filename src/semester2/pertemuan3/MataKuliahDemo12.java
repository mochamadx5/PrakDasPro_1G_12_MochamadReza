package semester2.pertemuan3;

import java.util.Scanner;

public class MataKuliahDemo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = Integer.parseInt(sc.nextLine());

        MataKuliah12[] arrayofMataKuliah12 = new MataKuliah12[jumlahMataKuliah];

        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.println("Masukkan data mata kuliah ke-" + (i + 1));
            arrayofMataKuliah12[i] = new MataKuliah12(); 
            arrayofMataKuliah12[i].tambahData();        
        }

        System.out.println("Data Mata Kuliah:");
        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.println("Mata Kuliah ke-" + (i + 1) + ":");
            arrayofMataKuliah12[i].cetakInfo();
        }
    }
}

