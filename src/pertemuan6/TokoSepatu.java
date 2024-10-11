package pertemuan6;

import java.util.Scanner;

public class TokoSepatu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan merk (Converse/Skecher/Nike): ");
        String merk = input.nextLine();
        
        System.out.print("Masukkan kategori (Slip On/High Top/Woman/Man/Kids/Adult): ");
        String kategori = input.nextLine();
        
        System.out.print("Masukkan ukuran: ");
        int ukuran = input.nextInt();
        int harga = 0; 
        
        if (merk.equalsIgnoreCase("Converse")) {
            if (kategori.equalsIgnoreCase("Slip On") && ukuran >= 36 && ukuran <= 40) {
                harga = 800000;
            } else if (kategori.equalsIgnoreCase("High Top") && ukuran >= 40 && ukuran <= 44) {
                harga = 1200000;
            }
        } else if (merk.equalsIgnoreCase("Skecher")) {
            if (kategori.equalsIgnoreCase("Woman") && ukuran >= 36 && ukuran <= 41) {
                harga = 1000000;
            } else if (kategori.equalsIgnoreCase("Man") && ukuran >= 41 && ukuran <= 44) {
                harga = 1800000;
            }
        } else if (merk.equalsIgnoreCase("Nike")) {
            if (kategori.equalsIgnoreCase("Kids") && ukuran >= 36 && ukuran <= 40) {
                harga = 750000;
            } else if (kategori.equalsIgnoreCase("Adult") && ukuran >= 40 && ukuran <= 44) {
                harga = 1500000;
            }
        }
        
        if (harga != 0) {
            System.out.println("Harga sepatu adalah: Rp " + harga);
        } else {
            System.out.println("Input tidak valid atau ukuran tidak tersedia.");
        }
        
        input.close();
    }
}
