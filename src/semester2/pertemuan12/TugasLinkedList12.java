package semester2.pertemuan12;

public class TugasLinkedList12 {
    public class Node {
        public TugasMahasiswa12 data;
        public Node next;

        public Node(TugasMahasiswa12 data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node front;
    public Node rear;
    public int size;

    public TugasLinkedList12() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return false;
    }

    public void clear() {
        front = null;
        rear = null;
        size = 0;
    }

    public void enqueue(TugasMahasiswa12 m) {
        Node newNode = new Node(m);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println(m.nama + " berhasil mengantri.");
    }

    public TugasMahasiswa12 dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada yang dipanggil.");
            return null;
        }
        TugasMahasiswa12 m = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        System.out.println(m.nama + " dipanggil.");
        return m;
    }

    public void tampilkanDepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Antrian depan: ");
            front.data.tampilkanInfo();
        }
    }

    public void tampilkanBelakang() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Antrian belakang: ");
            rear.data.tampilkanInfo();
        }
    }

    public int jumlahAntrian() {
        return size;
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar antrian mahasiswa:");
        Node temp = front;
        int nomor = 1;
        while (temp != null) {
            System.out.print(nomor + ". ");
            temp.data.tampilkanInfo();
            temp = temp.next;
            nomor++;
        }
    }
}
