import java.util.regex.Pattern;

public class Validator {
    private static final Pattern ALLOWED_CHARS_PATTERN = Pattern.compile("^[A-Za-z0-9 .,]+$");

    public boolean isSafe(String input) {
        return ALLOWED_CHARS_PATTERN.matcher(input).matches();
    }
}
