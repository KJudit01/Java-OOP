public class Main {
    public static void main(String[] args) {
        TimeInput input = new TimeInput();
        input.readTime();
        int hour = input.getHour();
        int minute = input.getMinute();
        String formattedTime = TimeConverter.convertToWords(hour, minute);
        System.out.println(formattedTime);
    }
}