package semester2.pertemuan13;

public class DoubleLinkedListsMain12 {
    public static void main(String[] args) throws Exception {
        DoubleLinkedLists12 dll = new DoubleLinkedLists12();
        dll.print();
        dll.addLast(50); 
        dll.addLast(40); 
        dll.addLast(10); 
        dll.addLast(20); 
        dll.print(); 
        System.out.println("Size: "+dll.size()); 
        System.out.println("====================");

        dll.removeFirst(); 
        dll.print(); 
        System.out.println("Size: "+dll.size()); 
        System.out.println("====================");

        dll.removeLast(); 
        dll.print(); 
        System.out.println("Size: "+dll.size()); 
        System.out.println("====================");

        dll.remove(1); 
        dll.print(); 
        System.out.println("Size: "+dll.size()); 
    }
}
