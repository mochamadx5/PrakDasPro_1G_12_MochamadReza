package semester2.pertemuan14;

public class Mahasiswa_12 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa_12(){
    }

    public Mahasiswa_12(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi12() {
        System.out.println("NIM : " + this.nim + " " +
        "Nama : "+this.nama+" " +
        "Kelas : " + this.kelas+ " " +
        "IPK : " + this.ipk);
    }
}
