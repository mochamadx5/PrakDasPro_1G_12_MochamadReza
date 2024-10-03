package pertemuan5;

import java.util.Scanner;

/**
 * PemilihanOperator12
 */
public class PemilihanOperator12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama hari: ");
        String hariLibur = sc.nextLine();

        if (hariLibur.equals("Minggu")) {
            System.out.println("Minggu adalah hari libur");
        } else {
            System.out.println(hariLibur + " bukan hari libur");
        }

        sc.close();
    }
}
