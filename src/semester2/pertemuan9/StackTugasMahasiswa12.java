package semester2.pertemuan9;

public class StackTugasMahasiswa12 {
    mahasiswa12[] stack;
    int top;
    int size;

    public StackTugasMahasiswa12(int size){
        this.size=size;
        stack = new mahasiswa12[size];
        top = -1;
    }
    public boolean isFull(){
        if (top == size -1) {
            return true;
        } else{
            return false;
        }
    }
    public boolean isEmpty(){
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
    public void push (mahasiswa12 mhs){
        if (!isFull()) {
            top++;
            stack[top]=mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }
    public mahasiswa12 pop (){
        if (!isEmpty()) {
            mahasiswa12 m = stack [top];
            top--;
            return m;
        } else {
            System.out.println("stack Kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }
    public mahasiswa12 peek() {
        if (!isEmpty()) {
            return stack [top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }
    public void print () {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim  + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }
}
