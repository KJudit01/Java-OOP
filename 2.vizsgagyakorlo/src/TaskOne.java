public class TaskOne {
    public static void main(String[] args) {
        System.out.println(getString("sherlock", 4));
        System.out.println(getString("hello", 2));
        System.out.println(getString("mama", 3));
        System.out.println(getString("Hello123", 2));
    }

    private static String getString(String text, int number) {
        if (!validText(text)) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            for (int i = 0; i < number; i++) {
                result.append(c);
            }
        }
        return result.toString();
    }

    private static boolean validText(String text) {
        return text.matches("^[a-zA-Z]+$");
    }
}
