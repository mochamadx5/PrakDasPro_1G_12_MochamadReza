package pertemuan10;

import java.util.Scanner;

public class ArrayRataNilai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs = new int[5];
        double totalLulus = 0; 
        double totalTidakLulus=0;
        int jumlahTidakLulus = 0;
        int jumlahLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-"+(i+1)+":");
            nilaiMhs[i] = sc.nextInt();
            
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jumlahTidakLulus++;
            }
            
        }
        double rataLulus = totalLulus / jumlahLulus ;
        double rataTidakLulus = totalTidakLulus / jumlahTidakLulus ;

        System.out.println("Rata-rata nilai mahasiswa lulus: " + rataLulus);
        System.out.println("Rata-rata nilai mahasiswa tidak lulus: " + rataTidakLulus);
        
            
        
    
    }
    
}
