package semester2.pertemuan3;

import java.util.Scanner;

public class MahasiswaDemo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa12[] arrayofMahasiswa12 = new Mahasiswa12[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayofMahasiswa12[i] = new Mahasiswa12();

            System.out.println("Masukkan Data Mahasiswa ke- " + (i + 1));
            System.out.print("NIM : ");
            arrayofMahasiswa12[i].nim = sc.nextLine();
            System.out.print("Nama : ");
            arrayofMahasiswa12[i].nama = sc.nextLine();
            System.out.print("Kelas : ");
            arrayofMahasiswa12[i].kelas = sc.nextLine();
            System.out.print("IPK : ");
            dummy = sc.nextLine();
            arrayofMahasiswa12[i].ipk = Float.parseFloat(dummy);
            System.out.println("-------------------------------");
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Mahasiswa ke- " + (i + 1));
            System.out.println("NIM : " + arrayofMahasiswa12[i].nim);
            System.out.println("Nama : " + arrayofMahasiswa12[i].nama);
            System.out.println("Kelas : " + arrayofMahasiswa12[i].kelas);
            System.out.println("IPK " + arrayofMahasiswa12[i].ipk);
            System.out.println("-------------------------------- ");
        }
    }
}
