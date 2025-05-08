package semester2.pertemuan9;

public class StackSurat12 {
    Surat12[] stack;
    int top;

    public StackSurat12(int kapasitas) {
        stack = new Surat12[kapasitas];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }

    public void push(Surat12 surat) {
        if (!isFull()) {
            stack[++top] = surat;
        } else {
            System.out.println("Stack surat penuh!");
        }
    }

    public Surat12 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat12 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            return null;
        }
    }

    public Surat12 cariSurat(String namaMahasiswa) {
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
                return stack[i];
            }
        }
        return null;
    }
}
