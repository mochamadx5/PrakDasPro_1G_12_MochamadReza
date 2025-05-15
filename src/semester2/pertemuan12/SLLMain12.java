package semester2.pertemuan12;

public class SLLMain12 {
    public static void main(String[] args) {
        Mahasiswa12 dummy = new Mahasiswa12("","","",0);
        Mahasiswa12.SingleLinkedList sll = dummy.new SingleLinkedList();
    
        Mahasiswa12 mhs1 = new Mahasiswa12("223040001", "Dirga", "TI-1A", 3.5);
        Mahasiswa12 mhs2 = new Mahasiswa12("223040002", "Cintia", "TI-1B", 3.7);
        Mahasiswa12 mhs3 = new Mahasiswa12("223040003", "Bimon", "TI-1A", 3.8);
        Mahasiswa12 mhs4 = new Mahasiswa12("223040004", "Alvaro", "TI-1C", 3.6);
        
        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
    }
}
