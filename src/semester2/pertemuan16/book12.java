package semester2.pertemuan16;

public class Book12 {
    public String isbn;
    public String title;

    public Book12(){

    }
    public Book12 (String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public String toString(){
        return "ISBN : " + this.isbn + " title :" + this.title;
    }
}
