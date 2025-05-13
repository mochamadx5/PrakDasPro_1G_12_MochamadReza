package semester2.pertemuan10;

public class Krs12 {
    String nim;
    String nama;
    String prodi;
    String kelas;

    public Krs12(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampil() {
        System.out.println("NIM      : " + nim);
        System.out.println("Nama     : " + nama);
        System.out.println("Prodi    : " + prodi);
        System.out.println("Semester : " + kelas);
        System.out.println("----------------------------");
    }
}
