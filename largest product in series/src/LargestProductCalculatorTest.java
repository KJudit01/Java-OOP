import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LargestProductCalculatorTest {
    @Test
    void LargestProductCalculatorTest() {
        Assertions.assertEquals(20, LargestProductCalculator.getLargestProduct("602144509", 2));
        Assertions.assertEquals(80, LargestProductCalculator.getLargestProduct("602144509", 4));
        Assertions.assertEquals(160, LargestProductCalculator.getLargestProduct("602144509", 5));
        Assertions.assertEquals(9, LargestProductCalculator.getLargestProduct("602144509", 1));
        Assertions.assertEquals(-1, LargestProductCalculator.getLargestProduct("602144509", 15));
        Assertions.assertEquals(-1, LargestProductCalculator.getLargestProduct("602144509", 0));
        Assertions.assertEquals(-1, LargestProductCalculator.getLargestProduct("", 1));
        Assertions.assertEquals(-1, LargestProductCalculator.getLargestProduct("12345", 0));
        Assertions.assertEquals(-1, LargestProductCalculator.getLargestProduct("12345", 6));
        Assertions.assertEquals(-1, LargestProductCalculator.getLargestProduct("", 5));
        Assertions.assertEquals(504, LargestProductCalculator.getLargestProduct("123456789", 3));
        Assertions.assertEquals(-1, LargestProductCalculator.getLargestProduct(null, 5));
        Assertions.assertEquals(378, LargestProductCalculator.getLargestProduct("3497653109", 3));
    }
}
