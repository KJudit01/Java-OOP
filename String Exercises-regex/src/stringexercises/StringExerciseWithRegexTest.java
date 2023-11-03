package stringexercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringExerciseWithRegexTest {
    @Test
    void isValidEAN13Test() {
        Assertions.assertEquals(false, StringExerciseWithRegex.isValidEAN13("1234567891234"));
    }

    @Test
    void isValidEAN13NormalTest() {
        Assertions.assertTrue(StringExerciseWithoutRegex.isValidEAN13Normal("1234567890123"));
        Assertions.assertFalse(StringExerciseWithoutRegex.isValidEAN13Normal("12345678"));
    }

    @Test
    void isValidItalianPhoneNumberTest() {
        Assertions.assertTrue(StringExerciseWithRegex.isValidItalianPhoneNumber("+3932324567"));
        Assertions.assertFalse(StringExerciseWithRegex.isValidItalianPhoneNumber("+393123123"));
    }

    @Test
    void isValidItalianPhoneNumberNormalTest() {
        Assertions.assertTrue(StringExerciseWithoutRegex.isValidItalianPhoneNumberNormal("+393232456798"));
        Assertions.assertFalse(StringExerciseWithoutRegex.isValidItalianPhoneNumberNormal("1234"));

    }

    @Test
    void isValidInputWordTest() {
        Assertions.assertTrue(StringExerciseWithRegex.isValidInputWord("hello"));
        Assertions.assertFalse(StringExerciseWithRegex.isValidInputWord("hi"));
        Assertions.assertTrue(StringExerciseWithRegex.isValidInputWord("world"));
    }

    @Test
    void isValidInputWordNormalTest() {
        Assertions.assertTrue(StringExerciseWithoutRegex.isValidInputWordNormal("hello"));
        Assertions.assertTrue(StringExerciseWithoutRegex.isValidInputWordNormal("world"));
        Assertions.assertFalse(StringExerciseWithoutRegex.isValidInputWordNormal("szia"));
    }

    @Test
    void isSpecialCodeTest() {
        Assertions.assertFalse(StringExerciseWithRegex.isSpecialCode("ABCXYz3abcde."));
        Assertions.assertFalse(StringExerciseWithRegex.isSpecialCode("1ABCD1E23FGH."));
        Assertions.assertFalse(StringExerciseWithRegex.isSpecialCode("ABCD1E23FGH."));
    }

    @Test
    void isSpecialCodeTestNormal() {
        Assertions.assertFalse(StringExerciseWithRegex.isSpecialCode("ABCXYz3abcde."));
        Assertions.assertFalse(StringExerciseWithoutRegex.isSpecialCode("1ABCD1E23FGH."));
        Assertions.assertFalse(StringExerciseWithoutRegex.isSpecialCode("ABCD1E23FGH."));
        Assertions.assertFalse(StringExerciseWithoutRegex.isSpecialCode("ABCe3x7456."));
    }
}

