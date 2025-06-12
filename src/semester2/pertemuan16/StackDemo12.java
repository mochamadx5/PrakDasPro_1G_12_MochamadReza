package semester2.pertemuan16;

import java.util.ArrayList;
import java.util.Stack;

public class StackDemo12 {
    Book12 book1 = new Book12("1234", "Dasar Pemrograman");
    Book12 book2 = new Book12("7145", "Bumi Manusia");
    Book12 book3 = new Book12("3562", "Bulan");

    Stack<Book12> books = new Stack<>();

    public StackDemo12() {
        books.push(book1);
        books.push(book2);
        books.push(book3);

    }
    public void peek(){
        Book12 temp = books.peek();

        if (temp != null) {
            System.out.println(temp.toString());
        }
    }
    public void pop(){
        Book12 temp2 = books.pop();

        if (temp2 != null) {
            System.out.println(temp2.toString());
        }
    }
    public void looping () {
        for (Book12 book : books) {
            System.out.println(book.toString());
        }
    }
    public static void main(String[] args) {
        StackDemo12 demo = new StackDemo12();
        
        System.out.println(demo.books);
    }
}
