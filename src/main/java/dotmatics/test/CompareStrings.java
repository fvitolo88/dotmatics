package dotmatics.test;

import java.util.Optional;

public class CompareStrings {

    public static boolean compareStrings(String s1, String s2) {
        if (s1 == null) {
            return s2 == null;
        } else if (s2 == null) {
            return false;
        }
        if (!Optional.of(s1).map(String::length).orElse(0).equals(Optional.of(s2).map(String::length).orElse(0))) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                break;
            }
        }
        return true;
    }

}
