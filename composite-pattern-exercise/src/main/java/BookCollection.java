import java.util.ArrayList;

public class BookCollection implements Book {

    private ArrayList<Book> books = new ArrayList();

    public void addBook(Book nonfictionBook) {
        books.add(nonfictionBook);
    }


    public void checkout() {
        books.forEach(Book::checkout);
    }

    public void returnBook() {
        books.forEach(Book::returnBook);
    }


}
