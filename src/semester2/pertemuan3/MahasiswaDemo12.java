package semester2.pertemuan3;

import java.util.Scanner;

class Mahasiswa12 {
    String nim;
    String nama;
    String kelas;
    float ipk;
}

public class MahasiswaDemo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa12[] arrayofMahasiswa12 = new Mahasiswa12[3];

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
            arrayofMahasiswa12[i].ipk = Float.parseFloat(sc.nextLine());
            System.out.println("-------------------------------");
        }
        System.out.println("Data Mahasiswa sebelum sorting:");
        tampilData(arrayofMahasiswa12);
        
        selectionSort(arrayofMahasiswa12);
        
        System.out.println("\nData Mahasiswa setelah sorting berdasarkan IPK (ASC):");
        tampilData(arrayofMahasiswa12);
    }

    static void tampilData(Mahasiswa12[] listMhs) {
        for (int i = 0; i < listMhs.length; i++) {
            System.out.println("Mahasiswa ke- " + (i + 1));
            System.out.println("NIM : " + listMhs[i].nim);
            System.out.println("Nama : " + listMhs[i].nama);
            System.out.println("Kelas : " + listMhs[i].kelas);
            System.out.println("IPK : " + listMhs[i].ipk);
            System.out.println("-------------------------------- ");
        }
    }
    static void selectionSort(Mahasiswa12[] listMhs) {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                }
            }
            Mahasiswa12 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }
}
