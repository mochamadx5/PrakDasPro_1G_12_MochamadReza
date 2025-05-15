package semester2.pertemuan12;

import java.util.Scanner;

public class SLLMain12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa12.SingleLinkedList list = new Mahasiswa12(null, null, null, 0).new SingleLinkedList();

        System.out.print("Masukkan jumlah data mahasiswa : ");
        int jumlah = sc.nextInt();
        sc.nextLine();
    
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 

            Mahasiswa12 mhs = new Mahasiswa12(nim, nama, kelas, ipk);
            
            list.addLast(mhs);
        }

        System.out.println("\nDaftar Mahasiswa:");
        list.print();

        sc.close();
    }
}
