package pertemuan6;

import java.util.Scanner;

public class DiskonBuku {
    public static void main(String[] args) {
        Scanner duaBelas = new Scanner(System.in);

        System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
        String jenisBuku = duaBelas.nextLine().toLowerCase();

        System.out.print("Masukkan jumlah buku yang dibeli: ");
        int jumlahBuku = duaBelas.nextInt();

        System.out.print("Masukkan harga per buku: ");
        double hargaPerBuku = duaBelas.nextDouble();

        double totalHarga = hargaPerBuku * jumlahBuku;
        double diskon = 0;

        
        if (jenisBuku.equals("kamus")) {
            diskon = 0.10 * totalHarga; 
            if (jumlahBuku > 2) {
                diskon += 0.02 * totalHarga; 
            }
        } else if (jenisBuku.equals("novel")) {
            diskon = 0.07 * totalHarga; 
            if (jumlahBuku > 3) {
                diskon += 0.02 * totalHarga; 
            } else {
                diskon += 0.01 * totalHarga; 
            }
        } else {
            if (jumlahBuku > 3) {
                diskon = 0.05 * totalHarga; 
            }
        }

        double totalBayar = totalHarga - diskon;

        
        System.out.println("Total harga sebelum diskon: " + totalHarga);
        System.out.println("Total diskon: " + diskon);
        System.out.println("Total yang harus dibayar: " + totalBayar);

        duaBelas.close();
    }
}
