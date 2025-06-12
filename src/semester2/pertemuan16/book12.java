package semester2.pertemuan16;

public class book12 {
    public String isbn;
    public String title;

    public book12(){

    }
    public book12 (String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public String toString(){
        return "ISBN :" + this.isbn + "Title :" + this.title;
    }
}
