package pertemuan13;

import java.util.Scanner;

public class MarianaKafe {
    static int[][] penjualan = new int[7][5];
    
    public static void inputPenjualan() {
        Scanner input = new Scanner(System.in);
        String[] menu = {"Kopi", "Teh", "Es degan", "roti bakar", "gorengan"};
        
        for (int i = 0; i < 7; i++) {
            System.out.println("Hari ke-" + (i + 1));
            for (int j = 0; j < 5; j++) {
                System.out.print("Masukkan penjualan " + menu[j] + ": ");
                penjualan[i][j] = input.nextInt();
            }
        }
    }
    public static void tampilkanPenjualan() {
        System.out.println("Rekap Penjualan dari Hari 1 hingga Hari 7:");
        String[] menu = {"Kopi", "Teh", "Es degan", "roti bakar", "gorengan"};
        
        for (int i = 0; i < 7; i++) {
            System.out.print("Hari ke-" + (i + 1) + ": ");
            for (int j = 0; j < 5; j++) {
                System.out.print(menu[j] + ": " + penjualan[i][j] + " | ");
            }
            System.out.println();
        }
    }
    public static void menuTertinggi() {
        int[] totalPenjualan = new int[5];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                totalPenjualan[j] += penjualan[i][j];
            }
        }
        int menuIndex = 0;
        for (int i = 1; i < totalPenjualan.length; i++) {
            if (totalPenjualan[i] > totalPenjualan[menuIndex]) {
                menuIndex = i;
            }
        }
        
        System.out.println("Menu dengan penjualan tertinggi adalah: Menu " + (menuIndex + 1));
    }
    public static void rataRataPenjualan() {
        double[] rataRata = new double[5];
        for (int j = 0; j < 5; j++) {
            int total = 0;
            for (int i = 0; i < 7; i++) {
                total += penjualan[i][j];
            }
            rataRata[j] = total / 7.0;
        }

        System.out.println("Rata-rata penjualan setiap menu selama 7 hari:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Menu " + (i + 1) + ": " + rataRata[i]);
        }
    }

    public static void main(String[] args) {
        inputPenjualan();
        tampilkanPenjualan();
        menuTertinggi();
        rataRataPenjualan();
    }
}
