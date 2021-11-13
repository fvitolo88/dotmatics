package dotmatics.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConcatStringTest {

    @Test
    public void shouldConcatNotEmptyArrays() {
        String[] array1 = {"a", "b", "c"};
        String[] array2 = {"a1", "a3", "2"};
        String[] result = {"a", "b", "c", "a1", "a3", "2"};

        Assertions.assertArrayEquals(ConcatString.concat(array1, array2), result);
    }

    @Test
    public void shouldConcatEmptyAndNotEmptyArrays() {
        String[] array1 = {};
        String[] array2 = {"a1", "a3", "2"};
        String[] result = {"a1", "a3", "2"};

        Assertions.assertArrayEquals(ConcatString.concat(array1, array2), result);
    }

    @Test
    public void shouldConcatNullAndNotNullArrays() {
        String[] array1 = null;
        String[] array2 = {"a1", "a3", "2"};
        String[] result = {"a1", "a3", "2"};

        Assertions.assertArrayEquals(ConcatString.concat(array1, array2), result);
    }
}
