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
            System.out.print("Kode            : ");
            String kode = sc.nextLine();
            System.out.print("Nama            : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (L/P): ");
            char jk = sc.nextLine().charAt(0);
            boolean jenisKelamin = (jk == 'L' || jk == 'l');
            System.out.print("Usia            : ");
            int usia = Integer.parseInt(sc.nextLine());

            daftarDosen[i] = new Dosen12(kode, nama, jenisKelamin, usia);
        }
        DataDosen12.dataSemuaDosen(daftarDosen);
        DataDosen12.jumlahDosenPerJenisKelamin(daftarDosen);
        DataDosen12.rerataUsiaDosenPerJenisKelamin(daftarDosen);
        DataDosen12.infoDosenPalingTua(daftarDosen);
        DataDosen12.infoDosenPalingMuda(daftarDosen);

        System.out.print("\nMasukkan nama dosen yang ingin dicari (Sequential Search): ");
        String namaCari = sc.nextLine();
        DataDosen12.pencarianDataSequential(daftarDosen, namaCari);

        System.out.print("\nMasukkan usia dosen yang ingin dicari (Binary Search): ");
        int usiaCari = Integer.parseInt(sc.nextLine());
        DataDosen12.pencarianDataBinary(daftarDosen, usiaCari);

        sc.close();
    }
}
