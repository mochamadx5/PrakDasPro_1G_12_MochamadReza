package semester2.pertemuan2;

public class MataKuliahMain12 {
    public static void main(String[] args) {
        MataKuliah12 mhs1 = new MataKuliah12();
        mhs1.KodeMk = "B0109";
        mhs1.nama = "Matematika Dasar";
        mhs1.SKS = 2 ;
        mhs1.jumlahJam = 4;
        
        mhs1.tampilkanInformasi();
        mhs1.ubahSKS(3);
        mhs1.tambahJam(0);
        mhs1.kurangiJam(2);
    }
}
