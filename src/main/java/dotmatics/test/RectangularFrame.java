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
        String borderLine = getBorderLine(maxLength);
        lineToPrint.add(borderLine);
        for (String string : strings) {
            lineToPrint.add(String.format(calculateLineFormat(maxLength,string.length()), string, " "));
        }
        lineToPrint.add(borderLine);
        return lineToPrint;
    }

    private static String getBorderLine(int maxLength) {
        String borderLineFormat = "%"+(maxLength+4)+"s\n";
        return String.format(borderLineFormat," ").replace(" ", "*");
    }

    private static String calculateLineFormat(int maxLength, int stringLength) {
        StringBuilder builder = new StringBuilder();
        builder.append("* %s");
        if(maxLength>stringLength) {
            builder.append("%");
            builder.append(maxLength - stringLength);
            builder.append("s");
        }
        builder.append(" *\n");
        return builder.toString();
    }

}
