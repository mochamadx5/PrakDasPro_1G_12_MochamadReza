package semester2.pertemuan3;

import java.util.Scanner;

class Mahasiswa12 {
    String nim;
    String nama;
    String kelas;
    float ipk; 
}

public class MahasiswaDemo12 {
    Mahasiswa12[] arrayofMahasiswa12;
    int jumlah;

    public MahasiswaDemo12(int jumlah) {
        this.jumlah = jumlah;
        arrayofMahasiswa12 = new Mahasiswa12[jumlah];
    }

    void inputData() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < jumlah; i++) {
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
    }

    void tampilData() {
        for (int i = 0; i < arrayofMahasiswa12.length; i++) {
            System.out.println("Mahasiswa ke- " + (i + 1));
            System.out.println("NIM : " + arrayofMahasiswa12[i].nim);
            System.out.println("Nama : " + arrayofMahasiswa12[i].nama);
            System.out.println("Kelas : " + arrayofMahasiswa12[i].kelas);
            System.out.println("IPK : " + arrayofMahasiswa12[i].ipk);
            System.out.println("-------------------------------- ");
        }
    }

    void insertionSort() {
        for (int i = 1; i < arrayofMahasiswa12.length; i++) {
            Mahasiswa12 temp = arrayofMahasiswa12[i];
            int j = i;
            while (j > 0 && arrayofMahasiswa12[j - 1].ipk > temp.ipk) {
                arrayofMahasiswa12[j] = arrayofMahasiswa12[j - 1];
                j--;
            }
            arrayofMahasiswa12[j] = temp;
        }
    }

    int sequentialSearching(float cari) {  
        for (int i = 0; i < arrayofMahasiswa12.length; i++) {
            if (arrayofMahasiswa12[i].ipk == cari) {
                return i;
            }
        }
        return -1;
    }

    int findBinarySearch(float cari, int left, int right) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arrayofMahasiswa12[mid].ipk == cari) {
                return mid;
            } else if (arrayofMahasiswa12[mid].ipk < cari) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    void tampilPosisi(float x, int pos) {  
        if (pos != -1) {
            System.out.println("Data: " + x + " ditemukan pada indeks ke-" + pos);
        } else {
            System.out.println("Data: " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch(float x, int pos) { 
        if (pos != -1) {
            System.out.println("NIM : " + arrayofMahasiswa12[pos].nim);
            System.out.println("Nama : " + arrayofMahasiswa12[pos].nama);
            System.out.println("Kelas : " + arrayofMahasiswa12[pos].kelas);
            System.out.println("IPK : " + arrayofMahasiswa12[pos].ipk);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = Integer.parseInt(sc.nextLine());

        MahasiswaDemo12 demo = new MahasiswaDemo12(jumlah);
        demo.inputData();

        System.out.println("Data Mahasiswa sebelum sorting:");
        demo.tampilData();

        System.out.println("\nData Mahasiswa setelah sorting menggunakan INSERTION SORT (ASC):");
        demo.insertionSort();
        demo.tampilData();

        System.out.println("\n--- PENCARIAN MENGGUNAKAN SEQUENTIAL SEARCH ---");
        System.out.print("Masukkan IPK yang ingin dicari: ");
        float cari = Float.parseFloat(sc.nextLine()); 

        System.out.println("Menggunakan sequential searching...");
        int posisi = demo.sequentialSearching(cari);
        demo.tampilPosisi(cari, posisi);
        demo.tampilDataSearch(cari, posisi);

        System.out.println("\n--- PENCARIAN MENGGUNAKAN BINARY SEARCH ---");
        System.out.print("Masukkan IPK yang ingin dicari: ");
        cari = Float.parseFloat(sc.nextLine()); 

        System.out.println("Menggunakan binary searching...");
        int posisi2 = demo.findBinarySearch(cari, 0, demo.arrayofMahasiswa12.length - 1);
        demo.tampilPosisi(cari, posisi2);
        demo.tampilDataSearch(cari, posisi2);
    }
}
