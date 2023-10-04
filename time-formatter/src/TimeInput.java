import java.util.Scanner;

public class TimeInput {
    private int hour;
    private int minute;

    public boolean readTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please give me the hour (0-23): ");
        int inputHour = scanner.nextInt();
        System.out.print("Please give me the minute (0-59): ");
        int inputMinute = scanner.nextInt();

        if (isValidTime(inputHour, inputMinute)) {
            this.hour = inputHour;
            this.minute = inputMinute;
            return true;
        } else {
            return false;
        }
    }

    private boolean isValidTime(int hour, int minute) {
        return (hour >= 0 && hour <= 23) && (minute >= 0 && minute <= 59);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }
}
