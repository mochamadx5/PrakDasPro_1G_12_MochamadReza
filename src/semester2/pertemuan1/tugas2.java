package semester2.pertemuan1;

import java.util.Scanner;

public class tugas2 {
    
    public static double Volume(double sisi) {
        return sisi * sisi * sisi;
    }
    
    public static double Permukaan(double sisi) {
        return 6 * (sisi * sisi);
    }
    
    public static double Keliling(double sisi) {
        return 12 * sisi;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Program Perhitungan Kubus");
        System.out.println("1. Hitung Volume Kubus");
        System.out.println("2. Hitung Luas Permukaan Kubus");
        System.out.println("3. Hitung Keliling Kubus");
        System.out.print("Pilih menu (1-3): ");
        int pilihan = scanner.nextInt();
        
        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = scanner.nextDouble();
        
        switch (pilihan) {
            case 1:
                System.out.println("Volume kubus: " + Volume(sisi));
                break;
            case 2:
                System.out.println("Luas Permukaan Kubus: " + Permukaan(sisi));
                break;
            case 3:
                System.out.println("Keliling Kubus: " + (sisi));
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
        
    }
}
