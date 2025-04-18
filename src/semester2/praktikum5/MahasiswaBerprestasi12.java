package semester2.praktikum5;

public class MahasiswaBerprestasi12 {
    Mahasiswa12[] listMhs = new Mahasiswa12[5];
    int idx = 0; 

    void tambah(Mahasiswa12 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) { 
            listMhs[i].tampilInformasi();
            System.out.println("--------------");
        }
    }

    void insertionSort() {
        for (int i = 1; i < idx; i++) { 
            Mahasiswa12 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk < temp.ipk) { 
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
    int sequentialSearching(double cari){
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].ipk==cari) {
                posisi=j;
                break;
            }
        }
        return posisi;
    }
    int findBinarySearch (double cari, int left, int right){
        int mid;
        if (right >= left) {
            mid = (left+right)/2;
            if (cari == listMhs[mid].ipk) {
                return (mid);
            }
            else if (listMhs[mid].ipk>cari) {
                return findBinarySearch(cari, left, mid-1);
            }
            else {
                return findBinarySearch(cari, mid+1, right);
            }
        }
        return-1;
    }
    void tampilPosisi(double x, int pos){
        if (pos!=-1) {
            System.out.println("data mahasiswa dengan IPK :" +x+ " ditemukan pada indeks");
        }
        else{
            System.out.println("data" +x+ "tidak ditemukan");
        }
    }
    void tampilDataSearch (double x, int pos){
        if (pos != -1) {
            System.out.println("nim\t : " +listMhs[pos].nim);
            System.out.println("nama\t : " +listMhs[pos].nama);
            System.out.println("kelas\t : " +listMhs[pos].kelas);
            System.out.println("ipk\t : " +x);
        }
        else {
            System.out.println("Data mahasiswa dengan IPK" +x+ "tidak ditemukan");
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

        System.out.println("Data Mahasiswa sebelum sorting:");
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC):");
        list.insertionSort();
        list.tampil();
    }
}
