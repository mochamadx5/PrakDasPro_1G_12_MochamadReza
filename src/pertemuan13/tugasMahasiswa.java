package pertemuan13;

import java.util.Scanner;

public class tugasMahasiswa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        
        System.out.print("Masukkan jumlah tugas: ");
        int jumlahTugas = input.nextInt();

        int[][] nilaiMahasiswa = new int[jumlahMahasiswa][jumlahTugas];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan nilai untuk Mahasiswa " + (i + 1) + ":");
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print("Tugas " + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = input.nextInt();
            }
        }

        System.out.println("\nRekap Nilai Mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Mahasiswa " + (i + 1) + ": ");
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print("Tugas " + (j + 1) + ": " + nilaiMahasiswa[i][j] + " | ");
            }
            System.out.println();
        }

        for (int i = 0; i < jumlahMahasiswa; i++) {
            int total = 0;
            for (int j = 0; j < jumlahTugas; j++) {
                total += nilaiMahasiswa[i][j];
            }
            double rataRata = total / (double) jumlahTugas;
            System.out.println("Rata-rata nilai Mahasiswa " + (i + 1) + ": " + rataRata);
        }
        for (int j = 0; j < jumlahTugas; j++) {
            int totalTugas = 0;
            for (int i = 0; i < jumlahMahasiswa; i++) {
                totalTugas += nilaiMahasiswa[i][j];
            }
            double rataRataTugas = totalTugas / (double) jumlahMahasiswa;
            System.out.println("Rata-rata nilai Tugas " + (j + 1) + ": " + rataRataTugas);
        }
    }
}
