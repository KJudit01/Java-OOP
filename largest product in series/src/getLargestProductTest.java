import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class getLargestProductTest {
    @Test
    void getLargestProductTest() {
        Assertions.assertEquals(20, getLargestProduct.getLargestProduct("602144509", 2));
        Assertions.assertEquals(80, getLargestProduct.getLargestProduct("602144509", 4));
        Assertions.assertEquals(160, getLargestProduct.getLargestProduct("602144509", 5));
        Assertions.assertEquals(9, getLargestProduct.getLargestProduct("602144509", 1));
        Assertions.assertEquals(-1, getLargestProduct.getLargestProduct("602144509", 15));
        Assertions.assertEquals(-1, getLargestProduct.getLargestProduct("602144509", 0));
        Assertions.assertEquals(-1, getLargestProduct.getLargestProduct("", 1));
    }

}
