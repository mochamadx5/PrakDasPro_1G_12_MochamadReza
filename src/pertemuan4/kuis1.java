package pertemuan4;

import java.util.Scanner;
/*
 * kuis1
 */
public class kuis1 {

 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double tanggalBerangkat;
    double bulanberangkat;
    double tahunberangkat;
    System.out.println("Nama : Mochamad Reza Firdaus");
    System.out.println("NIM : 244107020104");
    System.out.println("Kelas : 1G");
    System.out.print("Masukkan tanggal berangkat: ");
    tanggalBerangkat = sc.nextDouble();
    System.out.print("Masukkkan bulan berangkat: ");
    bulanberangkat = sc.nextDouble();
    System.out.print("Masukkan tahun berangkat: ");
    tahunberangkat = sc.nextDouble();
    tanggalBerangkat = (tanggalBerangkat - bulanberangkat - tahunberangkat);
    System.out.println("tanggal berangkat :" + tanggalBerangkat);

    }
}