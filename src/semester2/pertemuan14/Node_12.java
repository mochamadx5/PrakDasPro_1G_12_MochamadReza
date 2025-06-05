package semester2.pertemuan14;

public class Node_12 {
    Mahasiswa_12 mahasiswa;
    Node_12 left, right;

    public Node_12() {

    }
    public Node_12 (Mahasiswa_12 mahasiswa) {
        this.mahasiswa = mahasiswa;
        left = right = null;
    }
}