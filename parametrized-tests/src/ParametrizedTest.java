import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import java.util.Map;

public class ParametrizedTest {
    @Test
    void areAllCharactersUniqueTest() {
        UniqueCharacters checker = new UniqueCharacters();
        Assertions.assertTrue(checker.areAllCharactersUnique("abcdefg"));
        Assertions.assertTrue(checker.areAllCharactersUnique("123456"));
        Assertions.assertTrue(checker.areAllCharactersUnique(""));
        Assertions.assertFalse(checker.areAllCharactersUnique("Hello"));
        Assertions.assertFalse(checker.areAllCharactersUnique("aabcd"));
    }

    @Test
    void wordCountTest() {
        WordCounter wordCounter = new WordCounter();
        String sentence1 = "This is a test sentence.";
        String sentence2 = "This is a test sentence to count words.";
        String sentence3 = "";
        Map<String, Integer> result1 = wordCounter.wordsCounter(sentence1);
        Map<String, Integer> result2 = wordCounter.wordsCounter(sentence2);
        Map<String, Integer> result3 = wordCounter.wordsCounter(sentence3);
        Assertions.assertEquals(1, result1.get("this"));
        Assertions.assertEquals(1, result2.get("sentence"));
        Assertions.assertTrue(result3.isEmpty());
    }

    @Test
    void primeNumberTest() {
        PrimeChecker primeChecker = new PrimeChecker();
        Assertions.assertTrue(primeChecker.isPrime(2));
        Assertions.assertFalse(primeChecker.isPrime(1));
        Assertions.assertTrue(primeChecker.isPrime(3));
        Assertions.assertFalse(primeChecker.isPrime(20));
    }
}
