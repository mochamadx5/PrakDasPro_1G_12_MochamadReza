package pertemuan6;

import java.util.Scanner;

public class Pemilihan2Percobaan212 {
    public static void main(String[] args) {
        Scanner duaBelas = new Scanner(System.in);

        int pilihan_menu;
        double diskon = 0;
        double harga = 0;
        double total_Bayar;
        String member;

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

        if (member.equalsIgnoreCase("y")) {
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
            System.out.println("Total bayar setelah diskon = " + total_Bayar);
        }
        
        else if (member.equalsIgnoreCase("n")) {
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
                System.out.println("Total Bayar = " + harga);

            } else {
                System.out.println("Member tidak valid;");
            {
            System.out.println("-------------------------------------");
            }
            
        }

        duaBelas.close();
    }
    
}
