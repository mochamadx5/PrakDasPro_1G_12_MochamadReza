package semester2.pertemuan2;

// import java.util.Scanner;

public class Mahasiswa11 {
    String nama;
    String nim;
    String kelas;
    double IPK;

    void tampilkanInformasi(){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + IPK);
        System.out.println("Kelas: " + kelas);
    }
    void ubahKelas(String kelasBaru){
        kelas = kelasBaru;
    }    
    void updateIPK(double IPKBaru){
        if (IPKBaru >= 0.0 && IPKBaru <= 4.0) {
            IPKBaru = IPKBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }    
    String nilaiKinerja(){
        if (IPK >= 3.5) {
            return "Kinerja sangat baik";
        } else if (IPK >= 3.0) {
            return "Kinerja Baik";
        } else if (IPK >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }    
}