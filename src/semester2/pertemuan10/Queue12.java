package semester2.pertemuan10;

public class Queue12 {
    int [] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue12 (int n){
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }
    public void peek (){
        if (!isEmpty()) {
            System.out.println("Elemen terdepan : " + data[front]);
        } else {
            System.out.println("Queue masih kosong");
    }
    public void print (){
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
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
    public void Enqueue( int dt){
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
    public int Dequeue(){
        int dt = 0;
        if (isEmpty()) {
            System.out.println("Queue Masih kosong");
            System.exit(0); 
            return 0;
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
