package semester2.pertemuan12;

import java.util.Scanner;

public class TugasMain12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TugasLinkedList12 antrian = new TugasLinkedList12();

        while (true) {
            System.out.println("\n=== Menu Antrian Unit Kemahasiswaan ===");
            System.out.println("1. Daftar antrian mahasiswa");
            System.out.println("2. Panggil antrian mahasiswa");
            System.out.println("3. Tampilkan antrian depan");
            System.out.println("4. Tampilkan antrian belakang");
            System.out.println("5. Tampilkan semua antrian");
            System.out.println("6. Tampilkan jumlah antrian");
            System.out.println("7. Kosongkan antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM mahasiswa: ");
                    String nim = input.nextLine();
                    System.out.print("Masukkan nama mahasiswa: ");
                    String nama = input.nextLine();
                    TugasMahasiswa12 m = new TugasMahasiswa12(nim, nama);
                    antrian.enqueue(m);
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.tampilkanDepan();
                    break;
                case 4:
                    antrian.tampilkanBelakang();
                    break;
                case 5:
                    antrian.tampilkanSemua();
                    break;
                case 6:
                    System.out.println("Jumlah mahasiswa yang masih mengantri: " + antrian.jumlahAntrian());
                    break;
                case 7:
                    antrian.clear();
                    System.out.println("Antrian berhasil dikosongkan.");
                    break;
                case 0:
                    System.out.println("Program selesai. Terima kasih.");
                    input.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
        }
    }
}