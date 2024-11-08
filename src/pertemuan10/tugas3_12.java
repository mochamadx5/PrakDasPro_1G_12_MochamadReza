package pertemuan10;

import java.util.Scanner;

public class tugas3_12 {
    public static void main(String[] args) {
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama makanan/minuman yang ingin dicari: ");
        String pencarian = scanner.nextLine();
        boolean ditemukan = false;
        for (String item : menu) {
            if (item.equalsIgnoreCase(pencarian)) {
                ditemukan = true;
                break;
            }
        }
        if (ditemukan) {
            System.out.println("Makanan/minuman \"" + pencarian + "\" tersedia di menu.");
        } else {
            System.out.println("Makanan/minuman \"" + pencarian + "\" tidak tersedia di menu.");
        }

    
    }
}
