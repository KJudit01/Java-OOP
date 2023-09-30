import java.util.Scanner;

public class TimeInput {
    private int hour;
    private int minute;

    public TimeInput() {
        this.hour = -1;
        this.minute = -1;
    }

    public void readTime() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please give me the hour (0-23): ");
            int inputHour = scanner.nextInt();
            System.out.println("Please give me the minute (0-59): ");
            int inputMinute = scanner.nextInt();
            if (isValidTime(inputHour, inputMinute)) {
                this.hour = inputHour;
                this.minute = inputMinute;
                break;
            } else {
                System.out.println("Invalid input! Try again!");
            }
        }
    }

    private boolean isValidTime(int hour, int minute) {
        return (hour >= 0 && hour <= 59) && (minute >= 0 && minute <= 59);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }
}

