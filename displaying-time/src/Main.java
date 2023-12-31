import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        TimeInput timeInput = new TimeInput();
        timeInput.readTime();

        int hour = timeInput.getHour();
        int minute = timeInput.getMinute();

        String formattedTime = TimeFormatter.formatTime(hour, minute);
        System.out.println(new String(formattedTime.getBytes(), "UTF-8"));
    }
}
