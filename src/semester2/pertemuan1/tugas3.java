package semester2.pertemuan1;

import java.util.Scanner;

public class tugas3 {
    static String[] mataKuliah = {"Matematika Dasar", "Pancasila", "Dasar Pemrograman", "Basis Data", "Agama"};
    static int[] sks = {3, 2, 4, 3, 2};
    static int[] semester = {1, 1, 1, 2, 2};
    static String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal berdasarkan hari");
            System.out.println("3. Tampilkan jadwal berdasarkan semester");
            System.out.println("4. Cari mata kuliah berdasarkan nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    tampilkanSemuaJadwal();
                    break;
                case 2:
                    System.out.print("Masukkan hari: ");
                    String hariInput = scanner.nextLine();
                    tampilkanJadwalBerdasarkanHari(hariInput);
                    break;
                case 3:
                    System.out.print("Masukkan semester: ");
                    int semesterInput = scanner.nextInt();
                    tampilkanJadwalBerdasarkanSemester(semesterInput);
                    break;
                case 4:
                    System.out.print("masukkan nama mata kuliah: ");
                    String namaInput = scanner.nextLine();
                    cariMataKuliah(namaInput);
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }

    static void tampilkanSemuaJadwal() {
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println("Nama: " + mataKuliah[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i] + ", Hari: " + hari[i]);
        }
    }

    static void tampilkanJadwalBerdasarkanHari(String hariInput) {
        boolean ditemukan = false;
        for (int i = 0; i < mataKuliah.length; i++) {
            if (hari[i].equalsIgnoreCase(hariInput)) {
                System.out.println("Nama: " + mataKuliah[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i] + ", Hari: " + hari[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) System.out.println("Tidak ada jadwal pada hari " + hariInput);
    }

    static void tampilkanJadwalBerdasarkanSemester(int semesterInput) {
        boolean ditemukan = false;
        for (int i = 0; i < mataKuliah.length; i++) {
            if (semester[i] == semesterInput) {
                System.out.println("Nama: " + mataKuliah[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i] + ", Hari: " + hari[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) System.out.println("Tidak ada jadwal untuk semester " + semesterInput);
    }

    static void cariMataKuliah(String namaInput) {
        boolean ditemukan = false;
        for (int i = 0; i < mataKuliah.length; i++) {
            if (mataKuliah[i].equalsIgnoreCase(namaInput)) {
                System.out.println("Nama: " + mataKuliah[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i] + ", Hari: " + hari[i]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) System.out.println("Mata kuliah " + namaInput + " tidak ditemukan.");
    }
}
