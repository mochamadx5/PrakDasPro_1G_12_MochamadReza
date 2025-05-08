package semester2.pertemuan5;

import java.util.ArrayList;
import java.util.Scanner;

class Mahasiswa12 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa12(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampilInformasi() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK   : " + ipk);
    }
}

public class MahasiswaModif12 {
    ArrayList<Mahasiswa12> listMhs = new ArrayList<>();

    void tambah(Mahasiswa12 m) {
        listMhs.add(m);
    }

    void tampil() {
        for (Mahasiswa12 m : listMhs) {
            m.tampilInformasi();
            System.out.println("---------------");
        }
    }

    void bubbleSort() {
        int n = listMhs.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n - i; j++) {
                if (listMhs.get(j).ipk > listMhs.get(j - 1).ipk) {
                    Mahasiswa12 temp = listMhs.get(j);
                    listMhs.set(j, listMhs.get(j - 1));
                    listMhs.set(j - 1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MahasiswaModif12 list = new MahasiswaModif12(); // Menggunakan nama kelas yang benar

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = scanner.nextInt();
        scanner.nextLine(); // Mengonsumsi newline

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMasukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = scanner.nextLine();
            System.out.print("Nama  : ");
            String nama = scanner.nextLine();
            System.out.print("Kelas : ");
            String kelas = scanner.nextLine();
            System.out.print("IPK   : ");
            double ipk = scanner.nextDouble();
            scanner.nextLine(); // Mengonsumsi newline setelah nextDouble()

            list.tambah(new Mahasiswa12(nim, nama, kelas, ipk));
        }

        System.out.println("\nData Mahasiswa sebelum sorting:");
        list.tampil();

        System.out.println("\nData Mahasiswa setelah sorting berdasarkan IPK (DESC):");
        list.bubbleSort();
        list.tampil();

        scanner.close();
    }
}