import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;


public class ParametrizedTest {
    @ParameterizedTest
    @MethodSource("provideStringsForUniqueCharactersTest")
    void areAllCharactersUniqueTest(String input, boolean expected) {
        UniqueCharacters checker = new UniqueCharacters();
        Assertions.assertEquals(expected, checker.areAllCharactersUnique(input));
    }

    private static Stream<Arguments> provideStringsForUniqueCharactersTest() {
        return Stream.of(
                Arguments.of("abcdefg", true),
                Arguments.of("123456", true),
                Arguments.of("", true),
                Arguments.of("Hello", false),
                Arguments.of("aabcd", false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideSentencesForWordCountTest")
    void wordCountTest(String sentence, Map<String, Integer> expected) {
        WordCounter wordCounter = new WordCounter();
        Assertions.assertEquals(expected, wordCounter.wordsCounter(sentence));
    }

    private static Stream<Arguments> provideSentencesForWordCountTest() {
        Map<String, Integer> result1 = new HashMap<>();
        result1.put("hello", 1);
        result1.put("world", 1);
        Map<String, Integer> result2 = new HashMap<>();
        result2.put("hello", 3);
        Map<String, Integer> result3 = new HashMap<>();
        result3.put("mixedcase", 2);
        result3.put("words", 2);
        return Stream.of(
                Arguments.of("hello world", result1),
                Arguments.of("hello hello hello", result2),
                Arguments.of("MixedCase words MixedCASE Words", result3),
                Arguments.of("", Collections.emptyMap())
        );
    }

    @ParameterizedTest
    @MethodSource("provideNumbersForPrimeNumberTest")
    void primeNumberTest(int number, boolean expected) {
        PrimeChecker primeChecker = new PrimeChecker();
        Assertions.assertEquals(expected, primeChecker.isPrime(number));
    }

    private static Stream<Arguments> provideNumbersForPrimeNumberTest() {
        return Stream.of(
                Arguments.of(2, true),
                Arguments.of(1, false),
                Arguments.of(3, true),
                Arguments.of(20, false)
        );
    }
}