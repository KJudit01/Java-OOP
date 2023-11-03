public class TaskOne {
    public static void main(String[] args) {
        String text = "sherlock";
        int number = 4;
        System.out.println(getString(text,number));
    }

    private static String getString(String text, int number) {
        return text.repeat(number);
    }
}
