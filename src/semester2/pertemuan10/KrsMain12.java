package semester2.pertemuan10;

import java.util.Scanner;

public class KrsMain12 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KrsQueue12 antrian = new KrsQueue12(10);
        int totalMhs = 0;

        int pilih;
        do {
            System.out.println("\n--- Menu Antrian KRS ---");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Proses KRS (2 Mahasiswa)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Terakhir");
            System.out.println("6. Cetak Jumlah Antrian");
            System.out.println("7. Cetak Jumlah Sudah Proses");
            System.out.println("8. Cetak Jumlah Belum Proses");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    sc.nextLine(); // bersihkan buffer
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Krs12 mhs = new Krs12(nim, nama, prodi, kelas);
                    antrian.enqueue(mhs);
                    totalMhs++;
                    break;
                case 2:
                    antrian.prosesKRS();
                    break;
                case 3:
                    antrian.printAll();
                    break;
                case 4:
                    antrian.peekFront();
                    break;
                case 5:
                    antrian.peekRear();
                    break;
                case 6:
                    antrian.cetakJumlah();
                    break;
                case 7:
                    antrian.cetakSudahProses();
                    break;
                case 8:
                    antrian.cetakBelumProses(totalMhs);
                    break;
                case 9:
                    antrian.clear();
                    totalMhs = 0;
                    break;
            }
        } while (pilih != 0);

        System.out.println("Program selesai.");
    }
}

