package semester2.pertemuan10;

public class KrsQueue12 {

    Krs12[] antrian;
    int front, rear, size, max;
    int sudahProses = 0;

    public KrsQueue12(int n) {
        max = n;
        antrian = new Krs12[max];
        front = rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Krs12 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % max;
        }
        antrian[rear] = mhs;
        size++;
    }

    public void prosesKRS() {
        if (size < 2) {
            System.out.println("Antrian tidak cukup untuk diproses!");
            return;
        }

        System.out.println("Memproses 2 Mahasiswa:");
        for (int i = 0; i < 2; i++) {
            Krs12 mhs = antrian[front];
            mhs.tampil();
            front = (front + 1) % max;
            size--;
            sudahProses++;
        }
    }

    public void printAll() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        System.out.println("Isi Antrian:");
        int i = front;
        int count = 0;
        while (count < size) {
            antrian[i].tampil();
            i = (i + 1) % max;
            count++;
        }
    }

    public void peekFront() {
        if (!isEmpty()) {
            System.out.println("2 Antrian Terdepan:");
            antrian[front].tampil();
            if (size > 1)
                antrian[(front + 1) % max].tampil();
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Antrian Terakhir:");
            antrian[rear].tampil();
        }
    }

    public void clear() {
        front = rear = -1;
        size = 0;
        sudahProses = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void cetakJumlah() {
        System.out.println("Jumlah dalam antrian: " + size);
    }

    public void cetakSudahProses() {
        System.out.println("Jumlah sudah proses KRS: " + sudahProses);
    }

    public void cetakBelumProses(int totalMhs) {
        System.out.println("Jumlah belum proses KRS: " + (totalMhs - sudahProses));
    }
}

