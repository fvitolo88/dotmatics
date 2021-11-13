package dotmatics.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LargestElementTest {

    @Test
    public void shouldReturnMaxElementOfArray() {
        int[] values = {1, 5, 6, 7, 8, 0, -1};
        Assertions.assertEquals(LargestElement.findLargestElement(values),8);
    }

    @Test
    public void shouldReturnMaxElementOfArrayWhenAllTheElementAreNegative() {
        int[] values = {-9, -12, -100, -3};
        Assertions.assertEquals(LargestElement.findLargestElement(values),-3);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenArrayIsEmpty() {
        int[] values = {};
        Assertions.assertThrows(IllegalArgumentException.class,() -> LargestElement.findLargestElement(values));
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenArrayIsNull() {
        int[] values = null;
        Assertions.assertThrows(IllegalArgumentException.class,() -> LargestElement.findLargestElement(values));
    }
}
