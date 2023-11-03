package library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookStore {
    private List<Book> books;

    public BookStore(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        int totalBooks = books.size();
        long rentableBooks = books.stream().filter(Book::isRentable).count();

        Map<Genre, List<Book>> booksByGenre = books.stream()
                .collect(Collectors.groupingBy(Book::getGenre));

        StringBuilder result = new StringBuilder();
        result.append("Total ").append(totalBooks).append(" pieces of books which are ").append(rentableBooks).append(" available.\n");

        for (Map.Entry<Genre, List<Book>> entry : booksByGenre.entrySet()) {
            Genre genre = entry.getKey();
            List<Book> genreBooks = entry.getValue();
            long rentableGenreBooks = genreBooks.stream().filter(Book::isRentable).count();

            result.append(genreBooks.size()).append(" pieces ").append(genre).append(" which are ").append(rentableGenreBooks).append(" available.\n");
        }

        return result.toString();
    }
}
