package pertemuan13;

import java.util.Scanner;

public class Kubus12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sisi, volume, luasPermukaan;
        
        System.out.print("Masukkan panjang sisi kubus: ");
        sisi = input.nextInt();
        
        volume = sisi * sisi * sisi;
        System.out.println("Volume kubus adalah " + volume);
        
        luasPermukaan = 6 * sisi * sisi;
        System.out.println("Luas permukaan kubus adalah " + luasPermukaan);
    }
}
