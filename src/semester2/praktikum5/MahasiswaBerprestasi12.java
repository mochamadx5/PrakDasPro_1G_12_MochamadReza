package semester2.praktikum5;

public class MahasiswaBerprestasi12 {
    Mahasiswa12 [] listMhs= new Mahasiswa12[5];
    int idx;
    
    void tambah (Mahasiswa12 m){
        if (idx < listMhs.length) {
            listMhs[idx]=m;
            idx++;
        } else{
            System.out.println("Data sudah penuh");
        }
    }
    void tampil(){
        for (Mahasiswa12 m : listMhs) {
            m.tampilInformasi();
            System.out.println("--------------");
        }
    }
    void bubbleSort(){
        for (int i = 0; i < listMhs.length-1; i++) {
            for (int j = 1; j < listMhs.length-i; j++) {
            if (listMhs[j].ipk>listMhs[j-1].ipk) {
                Mahasiswa12 tmp = listMhs[j];
                listMhs[j]=listMhs[j-1];
                listMhs[j-1]=tmp;
            }
            }
        }
    }
    public static void main(String[] args) {
        MahasiswaBerprestasi12 list = new MahasiswaBerprestasi12();
        Mahasiswa12 m1 = new Mahasiswa12("123", "Zidan", "2A", 3.2);
        Mahasiswa12 m2 = new Mahasiswa12("124", "Ayu", "2A", 3.5);
        Mahasiswa12 m3 = new Mahasiswa12("125", "Sofi", "2A", 3.1);
        Mahasiswa12 m4 = new Mahasiswa12("126", "Sita", "2A", 3.9);
        Mahasiswa12 m5 = new Mahasiswa12("127", "Miki", "2A", 3.8);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Mahaasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC) :");
        list.bubbleSort();
        list.tampil();
    }
}
