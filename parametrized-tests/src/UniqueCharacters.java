import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueCharacters {
    public boolean areAllCharactersUnique(String inputText) {
        Set<Character> set = new HashSet<>();
        for (char character : inputText.toCharArray()) {
            if (!set.add(character)) {
                return false;
            }
        }
        return true;
    }
}
