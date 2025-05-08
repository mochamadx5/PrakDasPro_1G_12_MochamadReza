package semester2.pertemuan9;
public class mahasiswa12 {
    public String nama;
    public String nim;
    public double nilai;
    public String kelas;

    mahasiswa12 (String nama, String nim, String kelas){
        this.nama = nama; 
        // reza
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }
    void tugasDinilai(int nilai){
        this.nilai=nilai;
    }
}
