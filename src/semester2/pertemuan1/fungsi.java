package semester2.pertemuan1;

import java.util.Scanner;

public class fungsi {
    static int[][] stockBunga = {
        {10, 5, 15, 7},  
        {6, 11, 9, 12},  
        {2, 10, 10, 5},  
        {5, 7, 12, 9}    
    };
    static int[] hargaBunga = {75000, 50000, 60000, 10000}; 
    static String[] jenisBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan pendapatan setiap cabang");
            System.out.println("2. Tampilkan total stock setiap jenis bunga");
            System.out.println("3. Update stock karena bunga mati");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    tampilkanPendapatan();
                    break;
                case 2:
                    tampilkanStock();
                    break;
                case 3:
                    updateStockKarenaBungaMati();
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);

    }
    static void tampilkanPendapatan() {
        for (int i = 0; i < stockBunga.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < stockBunga[i].length; j++) {
                pendapatan += stockBunga[i][j] * hargaBunga[j];
            }
            System.out.println("Pendapatan RoyalGarden " + (i + 1) + ": Rp" + pendapatan);
        }
    }

    static void tampilkanStock() {
        int[] totalStock = new int[jenisBunga.length];

        for (int i = 0; i < stockBunga.length; i++) {
            for (int j = 0; j < stockBunga[i].length; j++) {
                totalStock[j] += stockBunga[i][j];
            }
        }

        System.out.println("\nTotal Stock Bunga:");
        for (int i = 0; i < jenisBunga.length; i++) {
            System.out.println(jenisBunga[i] + ": " + totalStock[i]);
        }
    }

    static void updateStockKarenaBungaMati() {
        int[] pengurangan = {-1, -2, 0, -5}; 

        for (int i = 0; i < stockBunga.length; i++) {
            for (int j = 0; j < stockBunga[i].length; j++) {
                stockBunga[i][j] += pengurangan[j]; 
                if (stockBunga[i][j] < 0) stockBunga[i][j] = 0; 
            }
        }
        System.out.println("\nStock bunga setelah pengurangan bunga mati diperbarui.");
        tampilkanStock();
    }
}
