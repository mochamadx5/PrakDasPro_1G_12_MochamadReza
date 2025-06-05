package semester2.pertemuan14;

public class BinaryTreeArrayMain12 {
    public static void main(String[] args) {
        BinaryTreeArray12 bta = new BinaryTreeArray12();
        Mahasiswa_12 mhs1 = new Mahasiswa_12 ("244160121", "Ali", "A", 3.57);
        Mahasiswa_12 mhs2 = new Mahasiswa_12 ("244160185", "Candra", "C", 3.41);
        Mahasiswa_12 mhs3 = new Mahasiswa_12 ("244160221", "Badar", "B", 3.75);
        Mahasiswa_12 mhs4 = new Mahasiswa_12 ("244160220", "Dewi", "B", 3.35);
        
        Mahasiswa_12 mhs5 = new Mahasiswa_12 ("2441602131", "Devi", "A", 3.48);
        Mahasiswa_12 mhs6 = new Mahasiswa_12 ("244160205", "Ehsan", "D", 3.61);
        Mahasiswa_12 mhs7 = new Mahasiswa_12 ("2441602170", "Fizi", "B", 3.86);   
    
        Mahasiswa_12[] dataMahasiswas = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null};
        int idxLast = 6;
        bta.populateData(dataMahasiswas, idxLast);
        System.out.println("\nInorder Traversal : ");
        bta.traverseInOrder(0);
    }
}
