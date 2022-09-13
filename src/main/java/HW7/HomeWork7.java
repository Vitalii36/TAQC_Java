package HW7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork7 {

    HomeWork7() {}

    public static String getMaxLengthName(List<String> arr) {
        String maxName = arr.get(0);
        for (int i = 1; i < arr.size(); i++){
            if (maxName.length() < arr.get(i).length()) {
                maxName = arr.get(i);
            }
        }
        return maxName;
    }

    public static String getSecondReversWord(List<String> arr) {
        Collections.reverse(arr);
        return arr.get(1);
    }

    public static String delDoubleSpace(String s) {
        return s.replaceAll("( )+", " ");
    }

    public static List<String> getAllCurrency(String s) {
        Pattern pattern = Pattern.compile("\\$\\d+\\.\\d{2}");
        Matcher matcher = pattern.matcher(s);
        matcher.matches();
        List<String> arr = new ArrayList<String>();
        while (matcher.find()) {
            arr.add(matcher.group());
        };
        return arr;

    }
}
