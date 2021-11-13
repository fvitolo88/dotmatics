package dotmatics.test;

import java.util.ArrayList;
import java.util.List;

public class RemoveOddValue {

    public static Integer[] removeOdds(Integer[] values) {
        if(values == null || values.length == 0)
            return new Integer[0];
        List<Integer> results = new ArrayList<>();
        for (int value : values) {
            if (value % 2 == 0) {
                results.add(value);
            }
        }
        return results.toArray(new Integer[0]);
    }

}
