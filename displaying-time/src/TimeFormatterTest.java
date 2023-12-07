import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TimeFormatterTest {
    @Test
    void formatTimeTest() {
        Assertions.assertEquals("It is midnight.", TimeFormatter.formatTime(0, 0));
        Assertions.assertEquals("It is noon.", TimeFormatter.formatTime(12, 0));
        Assertions.assertEquals("It is one o'clock.", TimeFormatter.formatTime(1, 0));
        Assertions.assertEquals("It is half past seven.", TimeFormatter.formatTime(7, 30));
        Assertions.assertEquals("It is quarter past three.", TimeFormatter.formatTime(3, 15));
        Assertions.assertEquals("It is quarter to eleven.", TimeFormatter.formatTime(10, 45));
        Assertions.assertEquals("It is ten minutes to eight.", TimeFormatter.formatTime(7, 50));
        Assertions.assertEquals("It is twenty five minutes to three.", TimeFormatter.formatTime(2, 35));
        Assertions.assertEquals("It is ten minutes to five.", TimeFormatter.formatTime(4, 50));
    }
}
