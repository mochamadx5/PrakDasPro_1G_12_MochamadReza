package pertemuan4;

import java.util.Scanner;

public class kuis1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nama: Mochamad Reza Firdaus");
        System.out.println("NIM: 244107020104");
        System.out.println("Kelas: 1G");
        System.out.print("Masukkan tanggal berangkat: ");
        int tanggalBerangkat = sc.nextInt();
        System.out.print("Masukkan bulan berangkat: ");
        int bulanBerangkat = sc.nextInt();
        System.out.print("Masukkan tahun berangkat: ");
        int tahunBerangkat = sc.nextInt();
        System.out.println("Tanggal keberangkatan: " + tanggalBerangkat + "-" + bulanBerangkat + "-" + tahunBerangkat);

        sc.close();
    }
}