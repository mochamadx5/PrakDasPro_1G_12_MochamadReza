package semester2.pertemuan2;

public class mahasiswaMain12 {
    public static void main(String[] args) {
        Mahasiswa12 mhs1 = new Mahasiswa12();
        mhs1.nama = "Muhamamd Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.IPK = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIPK(3.60);
        mhs1.tampilkanInformasi();
    }
}
