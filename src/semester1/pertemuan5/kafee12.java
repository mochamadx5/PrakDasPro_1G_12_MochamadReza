package pertemuan5;

import java.util.Scanner;

public class kafee12 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
        float diskon = 0.1f;

        System.out.print("Masukkan keanggotaan (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.print("Masukkan jumlah pembelian kopi: ");
        jmlKopi = input.nextInt();
        System.out.print("Masukkan jumlah pembelian teh: ");
        jmlTeh = input.nextInt();
        System.out.print("Masukkan jumlah pembelian roti: ");
        jmlRoti = input.nextInt();
        
        double totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
        
        System.out.println("Keanggotaan pelanggan" + keanggotaan);
        System.out.println("Item Pembelian " + jmlKopi + " kopi " + jmlTeh + " teh " + jmlRoti + " roti ");

        if (keanggotaan == true) {
            double totalBayar = totalHarga - (totalHarga * diskon);
                System.out.println("total bayar : Rp " + totalBayar);        
        }
            else{
                double totalBayar = totalHarga;
                    System.out.println("total bayar : Rp " + totalBayar);
        }
        
        
    }
}