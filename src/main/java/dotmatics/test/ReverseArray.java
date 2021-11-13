package dotmatics.test;

import java.util.Arrays;

public class ReverseArray {

    public static int[] reverseArray(int [] values) {
        if(values == null || values.length == 0)
            return new int[0];
        int swap;
        int start = 0;
        int end = values.length -1;
        while (start < end) {
            swap = values[start];
            values[start] = values[end];
            values[end] = swap;
            start++;
            end--;
        }
        return values;
    }

}
