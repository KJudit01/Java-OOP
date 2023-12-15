import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public Map<String, Integer> wordsCounter(String sentence) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        if (sentence == null || sentence.isEmpty()) {
            return wordCountMap;
        }
        String[] words = sentence.trim().split("\\s+");
        for (String word : words) {
            String lowerCaseWord = word.toLowerCase();
            wordCountMap.put(lowerCaseWord, wordCountMap.getOrDefault(lowerCaseWord, 0) + 1);
        }
        return wordCountMap;
    }

    public static void main(String[] args) {
        WordCounter wordCounter = new WordCounter();
        String test1 = "hello world";
        String test2 = "hello hello hello";
        String test3 = "MixedCase words MixedCASE Words";
        String test4 = "";

        Map<String, Integer> result1 = wordCounter.wordsCounter(test1);
        Map<String, Integer> result2 = wordCounter.wordsCounter(test2);
        Map<String, Integer> result3 = wordCounter.wordsCounter(test3);
        Map<String,Integer> result4 = wordCounter.wordsCounter(test4);

        System.out.println("Test 1: " + result1);
        System.out.println("Test 2: " + result2);
        System.out.println("Test 3: " + result3);
        System.out.println("Test 4: " + result4);
    }
}
