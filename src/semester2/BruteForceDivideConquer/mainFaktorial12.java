// Source code is decompiled from a .class file using FernFlower decompiler.
package semester2.BruteForceDivideConquer;

import java.util.Scanner;

public class mainFaktorial12 {
   public mainFaktorial12() {
   }

   public static void main(String[] args) {
      Scanner input12 = new Scanner(System.in);
      System.out.print("Masukkan nilai : ");
      int nilai = input12.nextInt();
      faktorial12 fk = new faktorial12();
      System.out.println("Nilai faktorial " + nilai + " menggunakan BF :" + fk.faktorialBF(nilai));
      System.out.println("Nilai faktorial " + nilai + " menggunakan DC :" + fk.faktorialDC(nilai));
   }
}
