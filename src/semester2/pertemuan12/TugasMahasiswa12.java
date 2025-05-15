package semester2.pertemuan12;

public class TugasMahasiswa12 {
    String nim;
    String nama;

    public TugasMahasiswa12(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public void tampilkanInfo() {
        System.out.println(nim + " - " + nama);
    }
}

