package pertemuan10;

import java.util.Scanner;

public class SearchNilai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("masukkan banyaknya nilai yang akan diinput: ");
        int jumlahNilai = sc.nextInt();
        int[] ArrayNilai12 = new int[jumlahNilai];

        for (int i = 0; i < jumlahNilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ":"); 
            ArrayNilai12[i] = sc.nextInt();
        }

        System.out.print("masukkan nilai yang ingin dicari : ");
        int key = sc.nextInt();
        int hasil = -1;

        for (int j = 0; j < ArrayNilai12.length; j++) {
            if (key == ArrayNilai12[j]) {
                hasil = j;
                break;
            }
        }
        System.out.println();
        if (hasil != -1) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1 ));
        } else {
            System.out.println(" nilai yang dicari tidak ditemukan.");
        
        System.out.println();

        }
    }
    
}
