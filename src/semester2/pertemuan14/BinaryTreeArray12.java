package semester2.pertemuan14;

public class BinaryTreeArray12 {
    Mahasiswa_12[] dataMahasiswa_12;
    int idxLast;

    public BinaryTreeArray12 () {
        this.dataMahasiswa_12 = new Mahasiswa_12[10];
        this.idxLast = -1;
    }

    void populateData (Mahasiswa_12 dataMhs[], int idxLast) {
        this.dataMahasiswa_12 = dataMhs;
        this.idxLast = idxLast;
    }

    void add(Mahasiswa_12 data) {
        if (idxLast < dataMahasiswa_12.length - 1) {
            idxLast++;
            dataMahasiswa_12[idxLast] = data;
        } else {
            System.out.println("Tree penuh, tidak bisa menambahkan data.");
        }
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa_12[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa_12[idxStart].tampilInformasi12();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    void traversePreOrder() {
        System.out.println("Traversal Pre-Order:");
        preOrder(0);
    }

    void preOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa_12[idxStart] != null) {
                dataMahasiswa_12[idxStart].tampilInformasi12();
                preOrder(2 * idxStart + 1);
                preOrder(2 * idxStart + 2);
            }
        }
    }
}
