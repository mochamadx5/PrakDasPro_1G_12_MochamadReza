package pertemuan11;

import java.util.Scanner;

public class tugasDaspro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] dataSurvei = new int[10][6];

        System.out.println("Masukkan data survei (10 responden x 6 pertanyaan):");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("Responden " + (i + 1) + ", Pertanyaan " + (j + 1) + ": ");
                dataSurvei[i][j] = sc.nextInt();
            }
        }

        double[] rataRataResponden = new double[10];
        for (int i = 0; i < 10; i++) {
            double jumlah = 0;
            for (int j = 0; j < 6; j++) {
                jumlah += dataSurvei[i][j];
            }
            rataRataResponden[i] = jumlah / 6;
        }

        double[] rataRataPertanyaan = new double[6];
        for (int j = 0; j < 6; j++) {
            double jumlah = 0;
            for (int i = 0; i < 10; i++) {
                jumlah += dataSurvei[i][j];
            }
            rataRataPertanyaan[j] = jumlah / 10;
        }

        double jumlahTotal = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                jumlahTotal += dataSurvei[i][j];
            }
        }
        double rataRataKeseluruhan = jumlahTotal / (10 * 6);

        System.out.println("\nRata-rata per responden:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Responden " + (i + 1) + ": " + rataRataResponden[i]);
        }

        System.out.println("\nRata-rata per pertanyaan:");
        for (int i = 0; i < 6; i++) {
            System.out.println("Pertanyaan " + (i + 1) + ": " + rataRataPertanyaan[i]);
        }

        System.out.println("\nRata-rata keseluruhan: " + rataRataKeseluruhan);
    }
}