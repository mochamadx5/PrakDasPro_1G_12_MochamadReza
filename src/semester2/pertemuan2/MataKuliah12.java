package semester2.pertemuan2;

public class MataKuliah12 {
    String nama;
    int SKS;
    int jumlahJam;
    String KodeMk;
    public MataKuliah12 () {

    }
    public MataKuliah12 (String KodeMk, String nm, int SKS, int jam) {
        nama = nm;
        SKS = SKS;
        jumlahJam = jumlahJam;
        KodeMk = KodeMk;
    }
    void tampilkanInformasi(){
        System.out.println("Kode MK: " + KodeMk);
        System.out.println("nama: " + nama);
        System.out.println("SKS: " + SKS);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }
    void ubahSKS(int SKSBaru){
        if (SKSBaru > 0) {
            SKS = SKSBaru;
        } else {
            System.out.println("SKS tidak valid. SKS tidak boleh 0");
        }
    }
    void tambahJam(int jam){
        if (jumlahJam > 0) {
            jumlahJam += jam;
        } else {
            System.out.println("Tambahkan jam tambahan");
        }
    }
    void kurangiJam (int Jam) {
        if (jumlahJam>0) {
            if (jumlahJam>=Jam) {
                jumlahJam -= Jam;
                System.out.println("pengurangan jam berhasil.");
            } else {
                System.out.println("jumlah jam tidak mencukupi karena jumlah jam awal lebih kecil dari jam pengurang.");
            }
        }
    }    
}