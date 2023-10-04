public class TimeConverter {

    public static String convertToWords(int hour, int minute) {
        String[] numbers = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty"};

        if (minute == 0) {
            if (hour == 0) {
                return "It is midnight.";
            } else if (hour == 12) {
                return "It is noon.";
            } else {
                return "It is " + numbers[hour] + " o'clock.";
            }
        } else if (minute == 15) {
            return "It is quarter past " + numbers[hour] + ".";
        } else if (minute == 30) {
            return "It is half past " + numbers[hour] + ".";
        } else if (minute == 45) {
            if (hour == 23) {
                return "It is quarter to midnight.";
            } else {
                return "It is quarter to " + numbers[hour + 1] + ".";
            }
        } else if (minute < 20) {
            if (minute == 1) {
                return "It is one past " + numbers[hour] + ".";
            } else {
                return "It is " + numbers[minute] + " past " + numbers[hour] + ".";
            }
        } else if (minute < 30) {
            return "It is twenty-" + numbers[minute - 20] + " past " + numbers[hour] + ".";
        } else {
            int remainingMinutes = 60 - minute;
            if (remainingMinutes == 15) {
                return "It is quarter to " + numbers[hour + 1] + ".";
            } else if (remainingMinutes == 30) {
                return "It is half to " + numbers[hour + 1] + ".";
            } else {
                return "It is " + tens[remainingMinutes / 10] + (remainingMinutes % 10 == 0 ? "" : "-" + numbers[remainingMinutes % 10]) +
                        " to " + numbers[hour + 1] + ".";
            }
        }
    }
}