package Pertemuan3;

import java.util.Scanner; 

public class p3_tugaskwh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah penggunaan listrik dalam kWh: ");
        int jumlahPenggunaanListrik = input.nextInt();
        boolean melebihi500 = jumlahPenggunaanListrik > 500;
        int totalTagihan = jumlahPenggunaanListrik * 1500;
        System.out.println("Penggunaan Listrik melebihi 500 kWh: " + melebihi500);
        System.out.println("Total tagihan listrik: Rp " + totalTagihan);
        input.close();
    }
}
