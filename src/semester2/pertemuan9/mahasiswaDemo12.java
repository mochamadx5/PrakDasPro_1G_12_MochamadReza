package semester2.pertemuan9;

import java.util.Scanner;

public class mahasiswaDemo12 {
    public static void main(String[] args) {
        StackTugasMahasiswa12 stack = new StackTugasMahasiswa12(5);
        Scanner sc = new Scanner(System.in);

        int pilih;
        do {
            System.out.println("\nMenu : ");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah");
            System.out.println("6. Lihat Jumlah Tugas yang Dikumpulkan");
            System.out.println("7. Keluar");
            System.out.print("Pilih : ");
            pilih = sc.nextInt();
            sc.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("NIM : ");
                    String NIM = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    mahasiswa12 mhs = new mahasiswa12(nama, NIM, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;

                case 2:
                    mahasiswa12 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = sc.nextInt();
                        sc.nextLine();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai Biner Tugas : " + biner);
                    }
                    break;

                case 3:
                    mahasiswa12 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;

                case 4:
                    System.out.println("Daftar Semua tugas:");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 5:
                    mahasiswa12 tugasTerbawah = stack.lihatTugasTerbawah();
                    if (tugasTerbawah != null) {
                        System.out.println("Tugas pertama yang dikumpulkan oleh " + tugasTerbawah.nama);
                    }
                    break;
                case 6:
                    int jumlah = stack.jumlahTugas();
                    System.out.printf("Jumlah tugas yang sudah dikumpulkan saat ini: %d\n", jumlah);
                    break;
                
                case 7:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilih >= 1 && pilih <= 6);
    }
}
