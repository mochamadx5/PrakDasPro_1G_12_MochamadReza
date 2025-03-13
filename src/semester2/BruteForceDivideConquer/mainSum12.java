package semester2.BruteForceDivideConquer;

import java.util.Scanner;

public class mainSum12 {
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);
        System.out.print("masukkan jumlah elemen : ");
        int elemen = input20.nextInt();

        sum12 sm = new sum12(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan keuntungan ke-" +(i+1)+": ");
            sm.keuntungan[i] = input20.nextDouble();
        }
        System.out.println("Total keuntungan menggunakan Bruteforce : " + sm.totalBF());
        System.out.println("Total keuntungan menggunakan Divide and conquer : " + sm.totalDC(sm.keuntungan, 0, elemen - 1));
    }
    
}
