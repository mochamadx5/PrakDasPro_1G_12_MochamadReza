package pertemuan6;

import java.util.Scanner;

public class Bilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan 1: ");
        int bil1 = scanner.nextInt();
        
        System.out.print("Masukkan bilangan 2: ");
        int bil2 = scanner.nextInt();
        
        System.out.print("Masukkan bilangan 3: ");
        int bil3 = scanner.nextInt();

        int terbesar;

        if (bil1 > bil2 && bil1 > bil3) {
            terbesar = bil1;  
        } else if (bil2 > bil1 && bil2 > bil3) {
            terbesar = bil2;  
        } else {
            terbesar = bil3;  
        }

        System.out.println("Bilangan terbesar: " + terbesar);
        
    }
}
