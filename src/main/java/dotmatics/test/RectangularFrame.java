package dotmatics.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RectangularFrame {

    public static List<String> printRectangularFrame(String[] strings) {
        if(strings == null || strings.length == 0)
            throw new IllegalArgumentException("Empty array");
        List<String> lineToPrint = new ArrayList<>();
        int maxLength = Arrays.stream(strings).map(String::length).max(Integer::compareTo).get();
        String borderLineFormat = "%"+(maxLength+4)+"s\n";
        String borderLine = String.format(borderLineFormat," ").replace(" ", "*");
        lineToPrint.add(borderLine);
        for (String string : strings) {
            String format = maxLength > string.length() ? "* %s%"+(maxLength- string.length())+"s *\n" : "* %s *\n";
            lineToPrint.add(String.format(format, string, " "));
        }
        lineToPrint.add(borderLine);
        return lineToPrint;
    }

}
