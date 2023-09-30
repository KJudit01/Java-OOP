public class TimeFormatter {
    private static final String[] numbers = {
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };
    private static final String[] tens = {
            "", "", "twenty", "thirty", "forty", "fifty"
    };

    public static String formatTime(int hour, int minute) {
        if (minute == 0) {
            if (hour == 0) {
                return "It is midnight.";
            } else if (hour == 12) {
                return "It is noon.";
            } else {
                return "It is " + numbers[hour] + " o’clock.";
            }
        } else if (minute == 30) {
            return "It is half past " + numbers[hour];
        } else if (minute == 15) {
            return "It is quarter past " + numbers[hour];
        } else if (minute == 45) {
            return "It is quarter to " + numbers[(hour + 1) % 12];
        } else if (minute == 59) {
            return "It is one minute to " + numbers[(hour + 1) % 12];
        } else if (minute <= 19) {
            return "It is " + numbers[minute] + " past " + numbers[hour];
        } else {
            return "It is " + tens[minute / 10] + (minute % 10 == 0 ? "" : "-" + numbers[minute % 10]) +
                    " past " + numbers[hour];
        }
    }
}
