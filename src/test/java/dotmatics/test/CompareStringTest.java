package dotmatics.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CompareStringTest {

    @Test
    public void shouldReturnTrueWhenStringsAreNull() {
        Assertions.assertTrue(CompareStrings.compareStrings(null,null));
    }

    @Test
    public void shouldReturnFalseWhenFirstStringIsNull() {
        Assertions.assertFalse(CompareStrings.compareStrings(null,"Hello"));
    }

    @Test
    public void shouldReturnFalseWhenSecondStringIsNull() {
        Assertions.assertFalse(CompareStrings.compareStrings("Hello", null));
    }

    @Test
    public void shouldReturnTrueWhenStringsAreEquals() {
        Assertions.assertTrue(CompareStrings.compareStrings("Hello", "Hello"));
    }

    @Test
    public void shouldReturnFalseWhenStringsAreEmptyAndNull() {
        Assertions.assertFalse(CompareStrings.compareStrings("", null));
    }

    @Test
    public void shouldReturnFalseWhenStringsAreBlankAndEmpty() {
        Assertions.assertFalse(CompareStrings.compareStrings(" ", ""));
    }
}
