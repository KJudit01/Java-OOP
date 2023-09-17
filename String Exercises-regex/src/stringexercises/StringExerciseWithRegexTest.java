package stringexercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringExerciseWithRegexTest {
    @Test
    void isValidEAN13Test(){
        Assertions.assertEquals(false, StringExerciseWithRegex.isValidEAN13("1234567891234"));
    }
}
