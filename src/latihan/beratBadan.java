package latihan;

import java.util.Scanner;

public class beratBadan {
    public static void main(String[] args) {
        Scanner reza = new Scanner(System.in);

        double IMT;

        System.out.print("Masukkan Berat : ");
        double beratBadan = reza.nextInt();
        
        System.out.print("masukkan tinggi badan : ");
        double tinggiBadan = reza.nextInt();
        
        IMT = beratBadan / (tinggiBadan * tinggiBadan); 

        System.out.println("Masukkan Kategori : " + IMT);
        String kategori ;

        if (kategori.equalsIgnoreCase("sangat kurus") && IMT <= 17) {
        } else if (kategori.equalsIgnoreCase("kurus") && IMT >= 17 && IMT <= 18.5) {
                kategori = reza.nextLine();
            } else if (kategori.equalsIgnoreCase("Normal") && IMT >= 18.5 && IMT <= 25) {
                kategori = reza.nextLine();
            } else if (kategori.equalsIgnoreCase("gemuk") && IMT >= 25 && IMT <= 27) {
                kategori = reza.nextLine();
            } else if (kategori.equalsIgnoreCase("obesitas") && IMT <= 27) {
                kategori = reza.nextLine();
            }
            
            System.out.print(" Pasien berada di Kategori : " + kategori);
        
    }
}
