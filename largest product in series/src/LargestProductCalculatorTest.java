import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

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

    @ParameterizedTest
    @CsvSource({
            "602144509,2,20",
            "602144509, 4,80",
            "602144509, 5,160",
            "602144509,1,9",
            "602144509,15,-1",
            "602144509,0,-1",
            "'', 2, -1",
            "null,5,-1"
    })
    public void testGetLargestProduct(String input, int digits, int expected) {
        int result = LargestProductCalculator.getLargestProduct(input, digits);
        Assertions.assertEquals(expected, result);
    }
}
