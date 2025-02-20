package semester2.pertemuan2;

public class Mahasiswa12 {
    String nama;
    String nim;
    String kelas;
    double IPK;
    public Mahasiswa12 () {

    }
    public Mahasiswa12 (String nm, String nim, double IPK, String kls) {
        nama = nm;
        this.nim = nim;
        this.IPK = IPK;
        kelas=kls;
    }
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
            IPK = IPKBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }    
    String nilaiKinerja(){
        if (IPK >= 3.5) {
            return "Kinerja sangat baik";
        } else if (IPK >= 3.0) {
            return "Kinerja baik";
        } else if (IPK >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }    
}