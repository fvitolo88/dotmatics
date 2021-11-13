package dotmatics.test;

import java.util.Arrays;

public class LargestElement {

    public static int findLargestElement(int[] values) {
        if(values == null || values.length == 0)
            throw new IllegalArgumentException("Empty array");

        return Arrays.stream(values).max().getAsInt();
    }

}
