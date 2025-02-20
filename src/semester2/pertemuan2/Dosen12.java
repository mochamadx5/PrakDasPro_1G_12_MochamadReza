package semester2.pertemuan2;

public class Dosen12 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen12 () {

    }
    public Dosen12 (String nm, String idDosen, boolean stts, int thn, String keahlian) {
        this.idDosen = idDosen;
        nama = nm;
        statusAktif = stts;
        tahunBergabung = thn;
        bidangKeahlian = keahlian;
    }
    int hitungMasaKerja(int tahunSekarang) {
        int masaKerja = tahunSekarang - tahunBergabung;
        if (masaKerja < 0) {
            System.out.println("Tahun tidak valid");
            return -1;
        }
        return masaKerja;
    }
    void tampilkanInformasi(){
        System.out.println("Nama: " + nama);
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Status: " + statusAktif);
        System.out.println("Tahun Bergabung :" + tahunBergabung);
        System.out.println("Bidang Keahlian :" + bidangKeahlian);
        System.out.println("Masa Kerja: " + hitungMasaKerja(2025) + " tahun");
    }
    void setStatusAktif(boolean statusDosen) {
        statusAktif = statusDosen;
        System.out.println("Status dosen telah diperbarui menjadi: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
    }
    
    void ubahKeahlian(String bidang){
        this.bidangKeahlian = bidang;
        System.out.println("Bidang Keahlian Dosen " + bidang);
    }
        
}