package exchange;

public class InvalidWishListException extends Exception {

    private static final String EXCEPTION_MESSAGE  = "Wish list should contain at least one item.";
    public InvalidWishListException(){
        super(EXCEPTION_MESSAGE);
    }
}
