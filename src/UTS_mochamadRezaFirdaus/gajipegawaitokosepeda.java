package UTS_mochamadRezaFirdaus;

import java.util.Scanner;

public class gajipegawaitokosepeda {
    public static void main(String[] args) {
        Scanner reza = new Scanner(System.in);

        String nama = "", alamat = "", noHp = "";
        int jumlahPenjualanSepeda = 0, masaKerja = 0, jumlahCuti = 0;
        double komisiPenjualan = 0, tunjangan = 0, potonganCuti = 0, gajiYangDiterima = 0;

        boolean isDataKaryawanDiberikan = false;
        double hargaSepeda = 1500000;

        System.out.println("=== UTS PRAKTIKUM DASAR PEMROGRAMAN TI-1G === ");
        System.out.println("Dibuat oleh : Mochamad Reza Firdaus ");
        System.out.println("NIM : 244107020103 ");
        System.out.println("==============================================");

        boolean kembaliKeMenu = true;
        
        while (kembaliKeMenu) {
            pilihMenu();
            int pilihan = reza.nextInt();
            reza.nextLine();

            if (pilihan == 1) {
                System.out.print("Nama pegawai: ");
                nama = reza.nextLine();
                System.out.print("Alamat: ");
                alamat = reza.nextLine();
                System.out.print("No Hp: ");
                noHp = reza.nextLine();
                System.out.print("Jumlah penjualan sepeda: ");
                jumlahPenjualanSepeda = reza.nextInt();
                System.out.print("Masa Kerja (dalam tahun): ");
                masaKerja = reza.nextInt();
                System.out.print("Jumlah cuti (dalam hari): ");
                jumlahCuti = reza.nextInt();
                reza.nextLine();
                isDataKaryawanDiberikan = true;
                System.out.print("Apakah anda ingin mencetak data karyawan? (y/t): ");
                String dataKaryawan = reza.nextLine();
                if (dataKaryawan.equalsIgnoreCase("y")) {
                    System.out.println("\n===== Data Karyawan =====");
                    System.out.println("Nama: " + nama);
                    System.out.println("Alamat: " + alamat);
                    System.out.println("No HP: " + noHp);
                    System.out.println("Jumlah Penjualan Sepeda: " + jumlahPenjualanSepeda);
                    System.out.println("Masa Kerja: " + masaKerja + " tahun");
                    System.out.println("Jumlah Cuti: " + jumlahCuti + " hari");
                    System.out.println("=========================\n");
                }

            } else if (pilihan == 2) {
                if (!isDataKaryawanDiberikan) {
                    System.out.println("Peringatan: Data karyawan harus diisi terlebih dahulu.");
                    continue;
                }

                double totalPenjualan = jumlahPenjualanSepeda * hargaSepeda;

                if (totalPenjualan <= 3000000) {
                    komisiPenjualan = 0.02 * totalPenjualan;
                } else if (totalPenjualan <= 5000000) {
                    komisiPenjualan = 0.05 * totalPenjualan;
                } else if (totalPenjualan <= 10000000) {
                    komisiPenjualan = 0.07 * totalPenjualan;
                } else {
                    komisiPenjualan = 0.15 * totalPenjualan;
                }

                if (masaKerja < 3) {
                    tunjangan = 0;
                } else if (masaKerja <= 5) {
                    tunjangan = 1000000;
                } else if (masaKerja <= 8) {
                    tunjangan = 2000000;
                } else {
                    tunjangan = 3000000;
                }

                potonganCuti = jumlahCuti * 35000;

                gajiYangDiterima = komisiPenjualan + tunjangan - potonganCuti;

                System.out.println("\n===== Gaji Karyawan =====");
                System.out.println("Nama: " + nama);
                System.out.println("Komisi Penjualan: Rp" + komisiPenjualan);
                System.out.println("Tunjangan: Rp" + tunjangan);
                System.out.println("Potongan Cuti: Rp" + potonganCuti);
                System.out.println("Gaji yang Diterima: Rp" + gajiYangDiterima);
                System.out.println("=========================\n");

            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
            System.out.print("Kembali ke menu? (y/t): ");
            String kembali = reza.nextLine();
            if (kembali.equalsIgnoreCase("t")) {
                kembaliKeMenu = false;
                System.out.println("Program selesai.");
            }
        }
    }

    public static void pilihMenu() {
        System.out.println("\nPilih menu:");
        System.out.println("1. Data Karyawan");
        System.out.println("2. Gaji Karyawan");
        System.out.print("Menu: ");
    }
}
