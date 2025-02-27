package semester2.pertemuan3;

import java.util.Scanner;

public class MataKuliahDemo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MataKuliah12[] arrayofMataKuliah12 = new MataKuliah12[3]; 
        
        String kode, nama;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data mata kuliah ke-" + (i + 1));
            
            System.out.print("Kode       : ");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("SKS        : ");
            sks = Integer.parseInt(sc.nextLine());
            System.out.print("Jumlah Jam : ");
            jumlahJam = Integer.parseInt(sc.nextLine());
            System.out.println("------------------------");
            
            arrayofMataKuliah12[i] = new MataKuliah12(kode, nama, sks, jumlahJam); 
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mata Kuliah ke- : " + (i + 1));
            System.out.println("Kode       : " + arrayofMataKuliah12[i].kode);
            System.out.println("Nama       : " + arrayofMataKuliah12[i].nama);
            System.out.println("SKS        : " + arrayofMataKuliah12[i].sks);
            System.out.println("Jumlah Jam : " + arrayofMataKuliah12[i].jumlahJam);
            System.out.println("------------------------");
        }
    }
}
