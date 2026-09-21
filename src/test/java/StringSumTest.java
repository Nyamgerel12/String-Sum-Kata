import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringSumTest {

    @Test
    void sum_twoEmptyStrings_returnsZero() {
        StringSum stringSum = new StringSum();
        assertEquals("0", stringSum.sum("", ""));
    }
    @Test 
    void sum_oneNumberAndEmptyString_returnsTheNumber() {
        StringSum stringSum = new StringSum();
        assertEquals("1", stringSum.sum("1", ""));
    }
}