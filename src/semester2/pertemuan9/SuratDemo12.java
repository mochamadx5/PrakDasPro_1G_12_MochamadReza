package semester2.pertemuan9;

import java.util.Scanner;

public class SuratDemo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat12 stack = new StackSurat12(10);

        while (true) {
            System.out.println("\n===== Menu Surat Izin =====");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");

            int pilihan = sc.nextInt();
            sc.nextLine(); // Buang newline agar input teks tidak error

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan ID Surat: ");
                    String id = sc.nextLine();

                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = sc.nextLine();

                    System.out.print("Masukkan Kelas: ");
                    String kelas = sc.nextLine();

                    System.out.print("Masukkan Jenis Izin (S: Sakit, I: Izin): ");
                    char jenis = sc.nextLine().charAt(0);

                    System.out.print("Masukkan Durasi Izin (dalam hari): ");
                    int durasi = sc.nextInt();
                    sc.nextLine(); // Bersihkan newline

                    Surat12 suratBaru = new Surat12(id, nama, kelas, jenis, durasi);
                    stack.push(suratBaru);
                    System.out.println("Surat izin berhasil ditambahkan.");
                    break;

                case 2:
                    Surat12 suratDiproses = stack.pop();
                    if (suratDiproses != null) {
                        System.out.println("Surat izin diproses:");
                        suratDiproses.tampilkanInfo();
                    }
                    break;

                case 3:
                    Surat12 suratTerakhir = stack.peek();
                    if (suratTerakhir != null) {
                        System.out.println("Surat izin terakhir:");
                        suratTerakhir.tampilkanInfo();
                    } else {
                        System.out.println("Belum ada surat yang diterima.");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa untuk mencari surat: ");
                    String cariNama = sc.nextLine();
                    Surat12 hasil = stack.cariSurat(cariNama);
                    if (hasil != null) {
                        System.out.println("Surat ditemukan:");
                        hasil.tampilkanInfo();
                    } else {
                        System.out.println("Surat izin tidak ditemukan untuk mahasiswa tersebut.");
                    }
                    break;

                case 5:
                    System.out.println("Terima kasih!");
                    return;

                default:
                    System.out.println("Menu tidak valid.");
            }
        }
    }
}
