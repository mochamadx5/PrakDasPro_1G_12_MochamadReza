package semester2.pertemuan10;

public class AntrianLayanan12 {
    Mahasiswa12[] data;
    int front;
    int rear;
    int size;
    int max;


    public AntrianLayanan12(int max){
        this.max = max;
        this.data = new Mahasiswa12[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }
    public void tambahAntrian(Mahasiswa12 mhs){
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }
    public Mahasiswa12 layaniMahasiswa(){
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        Mahasiswa12 mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }
    public void lihatTerdepan(){
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terdepan : ");
            System.out.print("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }
    public void lihatAkhir(){
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else{
            System.out.println("Mahasiswa terakhir dalam antrian : ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }
    public void tampilkanSemua(){
        if (isEmpty()) {
            System.out.println("antrian kosong.");
            return;
        }
        System.out.println("Data mahasiswa dalam antrian : ");
        System.out.print("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.println((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }
    public int getJumlahAntrian (){
        return size;
    }
    public boolean isFull(){
        if (size == max) {
            return true;
        } else{
            return false;
        }
    }
    public boolean isEmpty(){
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    public void peek (){
        if (!isEmpty()) {
            System.out.println("Elemen terdepan : " + data[front]);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    public void print (){
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i] + "");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("jumlah elemen = " + size);
        }
    }
    public void clear () {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    public void Enqueue( Mahasiswa12 dt){
        if (isFull()){
            System.out.println("Queue sudah penuh");
            System.exit(0);
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max -1) {
                    rear = 0;
                } else {
                    rear ++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }
    public Mahasiswa12 Dequeue(){
        Mahasiswa12 dt = null;
        if (isEmpty()) {
            System.out.println("Queue Masih kosong");
            System.exit(0); 
        } else {
            dt = data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max -1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }
}
