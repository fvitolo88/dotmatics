package dotmatics.test;

import java.util.Arrays;
import java.util.stream.Stream;

public class ConcatString {

    public static String [] concat(String [] a1, String [] a2) {
        if(a1 == null) {
            a1 = new String[0];
        }
        if(a2 == null) {
            a2 = new String[0];
        }
        return Stream.concat(Arrays.stream(a1), Arrays.stream(a2)).toArray(String[]::new);
    }

}
