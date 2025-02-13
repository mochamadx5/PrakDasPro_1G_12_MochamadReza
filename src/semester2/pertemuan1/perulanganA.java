package semester2.pertemuan1;

import java.util.Scanner;

public class perulanganA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan 2 digit terakhir NIM anda: ");
        long nim = sc.nextLong();

        int n = (int) (nim % 100);

        if (n < 10) {
            n += 10;
        }

        System.out.println("\nDeretan bilangan dari 1 sampai " + n + ":");
        
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue; 
            }
            if (i % 2 == 1) {
                System.out.print("* "); 
            } else {
                System.out.print(i + " "); 
            }
        }
        System.out.println(); 
    }
}
