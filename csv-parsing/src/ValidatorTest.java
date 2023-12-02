import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidatorTest {
    @Test
    public void isSafeTest() {
        Validator validator = new Validator();
        Assertions.assertFalse(validator.isSafe("<script>alert(5)</script>"));
        Assertions.assertFalse(validator.isSafe("javascript:alert('XSS')"));
        Assertions.assertTrue(validator.isSafe("John"));
        Assertions.assertTrue(validator.isSafe("Engineer"));
    }
}
