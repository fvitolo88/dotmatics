package dotmatics.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseArrayTest {

    @Test
    public void shouldReverseArray() {
        int[] values = {1, 5, 6, 7, 8, 0, -1};
        int[] results = {-1, 0, 8, 7, 6, 5, 1};
        Assertions.assertArrayEquals(ReverseArray.reverseArray(values),results);
    }

    @Test
    public void shouldReturnEmptyArrayWhenInputIsEmpty() {
        int[] values = {};
        Assertions.assertArrayEquals(ReverseArray.reverseArray(values), new int[0]);
    }

    @Test
    public void shouldReturnEmptyArrayWhenInputIsNull() {
        Assertions.assertArrayEquals(ReverseArray.reverseArray(null), new int[0]);
    }
}
