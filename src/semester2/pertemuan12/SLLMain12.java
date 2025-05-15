package semester2.pertemuan12;

public class SLLMain12 {
    public static void main(String[] args) {
        Mahasiswa12 dummy = new Mahasiswa12("", "", "", 0);
        Mahasiswa12.SingleLinkedList sll = dummy.new SingleLinkedList();

        Mahasiswa12 mhs1 = new Mahasiswa12("Dirga", "223040001", "TI-1A", 3.5);
        Mahasiswa12 mhs2 = new Mahasiswa12("Cintia", "223040002", "TI-1B", 3.7);
        Mahasiswa12 mhs3 = new Mahasiswa12("Bimon", "223040003", "TI-1A", 3.8);
        Mahasiswa12 mhs4 = new Mahasiswa12("Alvaro", "223040004", "TI-1C", 3.6);

        sll.addLast(mhs1);
        sll.addLast(mhs2);
        sll.addLast(mhs3);
        sll.addLast(mhs4);

        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}