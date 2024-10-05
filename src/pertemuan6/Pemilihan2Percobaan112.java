package pertemuan6;

import java.util.Scanner;

public class Pemilihan2Percobaan112 {

    public static void main(String[] args) {
        
        Scanner duaBelas = new Scanner(System.in);
        
        System.out.print("Masukkan tahun: ");
        int tahun = duaBelas.nextInt(); 

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0) {
                System.out.println(tahun + " adalah tahun kabisat.");
            } else {
                System.out.println(tahun + " bukan tahun kabisat.");
            }
       
        }

        duaBelas.close();
    }
}
