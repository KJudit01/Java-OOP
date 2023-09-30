import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TimeFormatterTest {
    @Test
    public void testMidnight() {
        Assertions.assertEquals("It is midnight.", TimeFormatter.formatTime(0, 0));
    }
    @Test
    public void testNoon() {
        Assertions.assertEquals("It is noon.", TimeFormatter.formatTime(12, 0));
    }

    @Test
    public void testOclock() {
        Assertions.assertEquals("It is one o’clock.", TimeFormatter.formatTime(1, 0));
    }

    @Test
    public void testHalfPast() {
        Assertions.assertEquals("It is half past seven.", TimeFormatter.formatTime(7, 30));
    }

    @Test
    public void testQuarterPast() {
        Assertions.assertEquals("It is quarter past three.", TimeFormatter.formatTime(3, 15));
    }

    @Test
    public void testQuarterTo() {
        Assertions.assertEquals("It is quarter to eleven.", TimeFormatter.formatTime(10, 45));
    }

    @Test
    public void testTenTo() {
        Assertions.assertEquals("It is ten to eight.", TimeFormatter.formatTime(7, 50));
    }
}
