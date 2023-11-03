package library;

import java.util.Objects;

public class Book {
    private int serialNumber;
    private String author;
    private String title;
    private Genre genre;
    private boolean isRentable;

    public Book(int serialNumber,String author, String title, Genre genre, boolean isRentable){
        this.serialNumber = serialNumber;
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.isRentable = isRentable;
    }
    @Override
    public String toString(){
        String rentability = isRentable ? "available" : "not available";
        return "The author of the book is " + author + ", the title " + title + ", its genre " + genre + ", and currently " + rentability + ".";
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber, author, title, genre, isRentable);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Book)) return false;
        Book book = (Book) object;
        return serialNumber == book.serialNumber && isRentable == book.isRentable && Objects.equals(author, book.author) && Objects.equals(title, book.title) && genre == book.genre;
    }


    public static boolean isRentable(Book book) {
        return book.isRentable;
    }

    public static <G, B extends Book> G getGenre(B book) {
        if (book instanceof Book) {
            G genre = (G) book.getGenre();
            return genre;
        }
        return null;
    }
}
