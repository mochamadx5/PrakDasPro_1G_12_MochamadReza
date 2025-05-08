package pertemuan8;

import java.util.Scanner;

public class rataNilai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1, j, nilaiMhs;
        float totalNilai, RataNilai;
        
        while (i <= 5) {
            System.out.println("Input nilai Mahasiswa ke " + i);
            totalNilai = 0;

            for (j = 1; j <= 5; j++) {
                System.out.print("Nilai ke-" + j + " = ");
                nilaiMhs = sc.nextInt();
                totalNilai += nilaiMhs;
            }
            RataNilai = totalNilai / 5;
            System.out.println("Rata-rata Nilai Mahasiswa ke " + i + " adalah " + RataNilai);
            System.out.println();

            i++;
        }
        
        sc.close();
    }
}