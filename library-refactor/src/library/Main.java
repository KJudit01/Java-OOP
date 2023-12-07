package library;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        Random random = new Random();
        for (int i = 1; i <= 30; i++) {
            books.add(new Book(i, "William Shakespeare", "Romeo and Juliet", Genre.ROMANTIC, true));
            Book book = new Book(i, "William Shakespeare", "Romeo and Juliet", Genre.ROMANTIC, true);
            Genre genre = Book.getGenre(book);
        }


        for (int i = 31; i <= 80; i++) {
            books.add(new Book(i, "Edgar Allan Poe", "The Raven", Genre.HORROR, false));
        }

        for (int i = 81; i <= 100; i++) {
            boolean isRentable = random.nextBoolean();
            books.add(new Book(i, "Jules Verne", "Around the World in Eighty Days", Genre.ADVENTURE, isRentable));
        }

        BookStore bookStore = new BookStore(books);
        System.out.println(bookStore);
    }
}

