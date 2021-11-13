package dotmatics.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveOddValueTest {

    @Test
    public void shouldRemoveAllOddValues() {
        Integer[] values = {1, 5, 6, 7, 8, 0, -1};
        Integer[] results = {6, 8, 0};
        Assertions.assertArrayEquals(RemoveOddValue.removeOdds(values), results);
    }

    @Test
    public void shouldReturnEmptyArrayWhenAllValuesAreOdd() {
        Integer[] values = {1, 3, 5};
        Integer[] results = {};
        Assertions.assertArrayEquals(RemoveOddValue.removeOdds(values), results);
    }

    @Test
    public void shouldReturnEmptyArrayWhenInputIsEmpty() {
        Integer[] values = {};
        Assertions.assertArrayEquals(RemoveOddValue.removeOdds(values), new Integer[0]);
    }

    @Test
    public void shouldReturnEmptyArrayWhenInputIsNull() {
        Integer[] values = null;
        Assertions.assertArrayEquals(RemoveOddValue.removeOdds(values), new Integer[0]);
    }
}
