package semester2.pertemuan3;

public class MahasiswaDemo12 {
    public static void main(String[] args) {
        Mahasiswa12 [] arrayofMahasiswa12 = new Mahasiswa12[3];
        arrayofMahasiswa12[0] = new Mahasiswa12();
        arrayofMahasiswa12[0].nim = "24410706033";
        arrayofMahasiswa12[0].nama = "AGNES TITANIA KINANTI";
        arrayofMahasiswa12[0].kelas = "SIB-1E";
        arrayofMahasiswa12[0].ipk = (float) 3.75;

        arrayofMahasiswa12[1] = new Mahasiswa12();
        arrayofMahasiswa12[1].nim = "2341720172";
        arrayofMahasiswa12[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayofMahasiswa12[1].kelas = "TI-2A";
        arrayofMahasiswa12[1].ipk = (float) 3.36;
        
        arrayofMahasiswa12[2] = new Mahasiswa12();
        arrayofMahasiswa12[2].nim = "244107023006";
        arrayofMahasiswa12[2].nama = "DIRHAMAWAN PUTRANTI";
        arrayofMahasiswa12[2].kelas = "TI-2E";
        arrayofMahasiswa12[2].ipk = (float) 3.80;

        System.out.println("NIM : " + arrayofMahasiswa12[0].nim);
        System.out.println("Nama :" + arrayofMahasiswa12[0].nama);
        System.out.println("Kelas :" + arrayofMahasiswa12[0].kelas);
        System.out.println("IPK :" + arrayofMahasiswa12[0].ipk);
        System.out.println("----------------------------------");
        System.out.println("NIM : " + arrayofMahasiswa12[1].nim);
        System.out.println("Nama :" + arrayofMahasiswa12[1].nama);
        System.out.println("Kelas :" + arrayofMahasiswa12[1].kelas);
        System.out.println("IPK :" + arrayofMahasiswa12[1].ipk);
        System.out.println("----------------------------------");
        System.out.println("NIM : " + arrayofMahasiswa12[2].nim);
        System.out.println("Nama :" + arrayofMahasiswa12[2].nama);
        System.out.println("Kelas :" + arrayofMahasiswa12[2].kelas);
        System.out.println("IPK :" + arrayofMahasiswa12[2].ipk);
        System.out.println("----------------------------------");
        
    }
    
}
