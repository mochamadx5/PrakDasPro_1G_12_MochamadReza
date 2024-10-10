package pertemuan6;

import java.util.Scanner;

public class Pemilihan2Percobaan212 {
    public static void main(String[] args) {
        Scanner duaBelas = new Scanner(System.in);

        int pilihan_menu;
        double diskon = 0;
        double harga = 0;
        double total_Bayar;
        String member, jenisPembayaran; 

        System.out.println("------------------------");
        System.out.println("===== MENU KAFE JTI ====");
        System.out.println("------------------------");
        System.out.println("1. Ricebowl ");
        System.out.println("2. Ice Tea ");
        System.out.println("3. Paket Bundling (Rice Bowl + Ice Tea)" );
        System.out.println("----------------------------------------");
        System.out.print("masukkan angka dari menu yang dipilih ");
        pilihan_menu = duaBelas.nextInt();
        duaBelas.nextLine();
        System.out.print("Apakah punya member (y/n)  / = ");
        member = duaBelas.nextLine();
        System.out.println("Masukkan Jenis Pembayaran (QRIS / Tunai) = ");
        jenisPembayaran = duaBelas.nextLine();

        if (member.equals("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");

            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
    
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }

            total_Bayar = harga - (harga * diskon);
        
            } else if (member.equalsIgnoreCase("n")) {
            System.out.println("tidak mendapatkan diskon ");

                if (pilihan_menu == 1) {
                    harga = 14000;
                    System.out.println("Harga ricebowl = " + harga);

                } else if (pilihan_menu == 2) {
                    harga = 3000;
                    System.out.println("Harga ice tea = " + harga);
                    
                } else if (pilihan_menu == 3) {
                    harga = 15000;
                    System.out.println("Harga bundling = " + harga);

                } else {
                    System.out.println("Masukkan pilihan menu dengan benar");
                    return;
                }
                
                total_Bayar = harga;

            } else {
                System.out.println("input member tidak valid;");
                return;
            }
            

            if (jenisPembayaran.equals("QRIS")) {
                total_Bayar -= 1000;
                System.out.println(" potongan harga Rp. 1000 memakai QRIS");

            } else if (jenisPembayaran.equalsIgnoreCase("Tunai")) {
                System.out.println("menggunakan tunai tidak ada potongan");
                
            } else {
                System.out.println("Pembayaran tidak valid ");
            }
            System.out.println("Total bayar = " + total_Bayar);


            System.out.println("-------------------------------------");
        
            duaBelas.close();        
    }
}