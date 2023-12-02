public class Validator {
    public boolean isSafe(String input) {
        return !input.toLowerCase().contains("<script>") && !input.toLowerCase().contains("javascript:");
    }
}
