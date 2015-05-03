package view;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {

    public static final Pattern pattern = Pattern.compile("[1-3]");

        public static boolean checkForRealCoordinat(String word) {
            Matcher matcher = pattern.matcher(word);
            return matcher.matches();
        }
}
