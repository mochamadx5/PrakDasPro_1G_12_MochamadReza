package pertemuan11;

import java.util.Scanner;

public class BioskopWithScanner12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris;
        int kolom;
        String nama;
        String next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu : ");
            System.out.println("1. Input Data Penonton : ");
            System.out.println("2. Tampilkan Daftar Penonton : ");
            System.out.println("3. Exit : ");
            System.out.print("Pilih menu (1/2/3) : ");
            int pilihan = sc.nextInt();
            sc.nextLine();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan nama : ");
                nama = sc.nextLine();

                while (true) {
                    System.out.print("Masukkan nomor baris : ");
                    baris = sc.nextInt();
                    if (baris >= 1 && baris <= 4) {
                        break;
                    } else {
                        System.out.println("Nomor Baris tidsk valid. Silakan masukkan antara 1 dan 4.");
                    }
                }
                while (true) {
                    System.out.print("Masukkan nomor kolom : ");
                    kolom = sc.nextInt();
                    if (kolom >= 1 && kolom <= 2) {
                        break;
                    } else {
                        System.out.println("Nomor kolom tidak valid. Silakan masikkan antara 1 dan 2.");
                    }
                }
                if (penonton[baris - 1][kolom -1] != null) {
                    System.out.println("Kursi pada baris " + baris + " kolom " + kolom + " sudah terisi. Silakan pilih kursi lain.");          
                } else {
                    penonton[baris - 1][kolom - 1] = nama;
                    System.out.println("Data penonton berhasil disimpan.");
                    break;
                }
                break;
            case 2:
                System.out.println("Daftar Penonton : ");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] != null) {
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                        } else {
                            System.out.println("Baris " + (i + 1)+ ", Kolom " + (j + 1) + ": ***");
                        }
                    }
                }
                break;

            case 3:
                System.out.println("Terima Kasih, program selesai.");
                return;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
        }    
    }
}