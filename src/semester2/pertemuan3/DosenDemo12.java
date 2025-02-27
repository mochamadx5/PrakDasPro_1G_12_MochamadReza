package semester2.pertemuan3;

import java.util.Scanner;

public class DosenDemo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = Integer.parseInt(sc.nextLine());

        Dosen12[] daftarDosen = new Dosen12[jumlahDosen];
        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("\nMasukkan data dosen ke-" + (i + 1));
            System.out.print("Kode        : ");
            String kode = sc.nextLine();
            System.out.print("Nama        : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (L/P): ");
            char jk = sc.nextLine().charAt(0);
            boolean jenisKelamin = (jk == 'L' || jk == 'l'); 
            System.out.print("Usia        : ");
            int usia = Integer.parseInt(sc.nextLine());

            daftarDosen[i] = new Dosen12(kode, nama, jenisKelamin, usia);
        }

        System.out.println("\nData Dosen:");
        for (Dosen12 dosen : daftarDosen) {
            System.out.println("------------------------");
            System.out.println("Kode        : " + dosen.kode);
            System.out.println("Nama        : " + dosen.nama);
            System.out.println("Jenis Kelamin : " + (dosen.jenisKelammin ? "Laki-laki" : "Perempuan"));
            System.out.println("Usia        : " + dosen.usia);
        }

    }
}
