package library;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(1,"Stephen King","Carrie",Genre.HORROR,true);
        Book book2 = new Book(2,"Jane Austen","Pride and Prejudice",Genre.ROMANTIC,true);
        Book book3 = new Book(3,"James Orvell","Animal Farm",Genre.ADVENTURE,false);
        BookStore bookStore = new BookStore();
        bookStore.addBook(book1);
        bookStore.addBook(book2);
        bookStore.addBook(book3);


        System.out.println(bookStore.toString());
    }
}
