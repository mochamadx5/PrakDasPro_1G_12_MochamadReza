package pertemuan6;

import java.util.Scanner;

public class Bilangan {
    public static void main(String[] args) {
        // Deklarasi variabel
        Scanner scanner = new Scanner(System.in);
        
        // Input tiga bilangan
        System.out.print("Masukkan bilangan 1: ");
        int bil1 = scanner.nextInt();
        
        System.out.print("Masukkan bilangan 2: ");
        int bil2 = scanner.nextInt();
        
        System.out.print("Masukkan bilangan 3: ");
        int bil3 = scanner.nextInt();

        // Menentukan bilangan terbesar
        int terbesar;

        if (bil1 > bil2 && bil1 > bil3) {
            terbesar = bil1;  // bil1 yang terbesar
        } else if (bil2 > bil1 && bil2 > bil3) {
            terbesar = bil2;  // bil2 yang terbesar
        } else {
            terbesar = bil3;  // bil3 yang terbesar
        }

        // Output bilangan terbesar
        System.out.println("Bilangan terbesar: " + terbesar);
        
        // Menutup scanner
        scanner.close();
    }
}
