import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestProductCalculatorTest {
    @Test
    void LargestProductCalculatorTest() {
        assertEquals(20, LargestProductCalculator.getLargestProduct("602144509", 2));
        assertEquals(80, LargestProductCalculator.getLargestProduct("602144509", 4));
        assertEquals(160, LargestProductCalculator.getLargestProduct("602144509", 5));
        assertEquals(9, LargestProductCalculator.getLargestProduct("602144509", 1));
        assertEquals(-1, LargestProductCalculator.getLargestProduct("602144509", 15));
        assertEquals(-1, LargestProductCalculator.getLargestProduct("602144509", 0));
        assertEquals(-1, LargestProductCalculator.getLargestProduct("", 1));
        assertEquals(-1, LargestProductCalculator.getLargestProduct("12345", 0));
        assertEquals(-1, LargestProductCalculator.getLargestProduct("12345", 6));
        assertEquals(-1, LargestProductCalculator.getLargestProduct("", 5));
        assertEquals(504, LargestProductCalculator.getLargestProduct("123456789", 3));
        assertEquals(-1, LargestProductCalculator.getLargestProduct(null, 5));
        assertEquals(378, LargestProductCalculator.getLargestProduct("3497653109", 3));
    }
   
}
