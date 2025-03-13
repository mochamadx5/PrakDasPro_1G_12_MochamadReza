package semester2.BruteForceDivideConquer;

import java.util.Scanner;

public class mainPangkat12 {
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen : ");
        int elemen = input20.nextInt();

        pangkat12[] png = new pangkat12[elemen];
        
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai basis elemen ke-" + (i+1) + ": " );
            int basis = input20.nextInt();
            System.out.print("Masukkan nilai pangkat elemen " + (i+1) + ": " );
            int pangkat = input20.nextInt();
            png[i] = new pangkat12(basis, pangkat);
        }    
            
            System.out.println("HASIL PANGKAT BRUTFORCE : "); {
            for (pangkat12 p : png) {
                System.out.println(p.nilai+"^"+p.pangkat+": " + p.pangkatBF(p.nilai, p.pangkat));
            }
            System.out.println("HASIL PANGKAT BRUTFORCE : ");
            for (pangkat12 p : png) {
                System.out.println(p.nilai+"^"+p.pangkat+": " + p.pangkatDC(p.nilai, p.pangkat));
            }
        }
    }
}
