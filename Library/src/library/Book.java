package library;

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
        return "Serial Number: " + serialNumber +
                ", Author: " + author +
                ", Title: " + title +
                ", Genre: " + genre +
                ", isRentable: " + (isRentable ? "yes" : "no");
    }

}
