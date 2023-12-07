public class TimeFormatter {
    static String formatTime(int hour, int minute) {
        String[] numbers = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty"};

        if (hour < 0 || hour > 23 || minute < 0 || minute > 59) {
            return "Invalid input";
        }

        String timeText = "";

        if (minute == 0) {
            if (hour == 0) {
                timeText = "midnight";
            } else if (hour == 12) {
                timeText = "noon";
            } else {
                timeText = numbers[hour] + " o'clock";
            }
        } else if (minute == 30) {
            timeText = "half past " + numbers[hour];
        } else if (minute == 15) {
            timeText = "quarter past " + numbers[hour];
        } else if (minute == 45) {
            timeText = "quarter to " + numbers[(hour + 1) % 12];
        } else if (minute == 59) {
            timeText = "one minute to " + numbers[(hour + 1) % 12];
        } else if (minute == 1) {
            timeText = numbers[minute] + " minute past " + numbers[hour];
        } else if (minute >= 2 && minute <= 29) {
            if (minute % 10 == 0) {
                timeText = tens[minute / 10] + " minutes past " + numbers[hour];
            } else {
                timeText = tens[minute / 10] + " " + numbers[minute % 10] + " minutes past " + numbers[hour];
            }
        } else if (minute >= 31 && minute <= 44) {
            int minutesToNextHour = 60 - minute;
            if (minutesToNextHour % 10 == 0) {
                timeText = tens[minutesToNextHour / 10] + " minutes to " + numbers[(hour + 1) % 12];
            } else {
                timeText = tens[minutesToNextHour / 10] + " " + numbers[minutesToNextHour % 10] + " minutes to " + numbers[(hour + 1) % 12];
            }
        } else if (minute >= 46 && minute <= 58) {
            int minutesToNextHour = 60 - minute;
            timeText = numbers[minutesToNextHour] + " minutes to " + numbers[(hour + 1) % 12];
        } else {
            timeText = "Invalid input";
        }

        return "It is " + timeText + ".";
    }
}
