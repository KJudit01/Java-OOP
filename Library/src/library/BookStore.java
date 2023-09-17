package library;

import java.util.ArrayList;
import java.util.List;

public class BookStore {
    private List<Book> books;

    public BookStore(){
    books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public String toString() {
        return "BookStore{" +
                "books=" + books +
                '}';
    }
}
