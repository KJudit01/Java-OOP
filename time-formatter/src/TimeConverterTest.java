import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TimeConverterTest {
    @Test
    void TimeConverterTest(){
        Assertions.assertEquals("It is noon.",TimeConverter.convertToWords(12,0));
        Assertions.assertEquals("It is midnight.",TimeConverter.convertToWords(0,0));
        Assertions.assertEquals("It is quarter past one.",TimeConverter.convertToWords(1,15));
        Assertions.assertEquals("It is half past two.",TimeConverter.convertToWords(2,30));
        Assertions.assertEquals("It is twenty-five past three.",TimeConverter.convertToWords(3,25));
        Assertions.assertEquals("It is quarter to four.",TimeConverter.convertToWords(3,45));
        Assertions.assertEquals("It is twenty to six.",TimeConverter.convertToWords(5,40));
    }
}
