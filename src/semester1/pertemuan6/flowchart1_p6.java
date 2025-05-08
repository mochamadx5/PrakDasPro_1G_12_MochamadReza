package pertemuan6;

import java.util.Scanner;

public class flowchart1_p6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bil1 = 28;
        int bil2 = 54;
        int bil3 = 15;
        int bilangan_terbesar = bil1;

       
        if (bil2 > bilangan_terbesar) {
            bilangan_terbesar = bil2;
        }

        
        if (bil3 > bilangan_terbesar) {
            bilangan_terbesar = bil3;
        }

        
        System.out.println("Bilangan terbesar: " + bilangan_terbesar);

        scanner.close();
    }
}