package semester2.pertemuan2;

public class DosenMain12 {
    public static void main(String[] args) {
        
        Dosen12 dosen1 = new Dosen12("Dr. Yanuar Prastowo", "POL7810", true, 2010, "Basis Data");
        
        dosen1.tampilkanInformasi();
        
        dosen1.setStatusAktif(true);
    }
}
