package pertemuan13;

import java.util.Scanner;

public class Percobaan6_12 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int p, l, t, L, vol;
        System.out.print("masukkan panjang ");
        p=input.nextInt();
        System.out.print("masukkan lebar ");
        l= input.nextInt();
        System.out.print("masukkan tinggi ");
        t=input.nextInt();

        L=p*l;
        System.out.println("luas persegi panjang adalah "+L + "cm");

        vol=p*l*t;
        System.out.println("Volume balok adalah " + vol + "cm");
    }
    
}
