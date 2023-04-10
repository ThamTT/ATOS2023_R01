package thamTT.javacore;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.*;

public class baiTapB2 {
    public static void main(String[] args) throws ParseException {
        List<String> arr = Arrays.asList("1", "2", "3", "4");
        Map<String, String> map = new HashMap<>();
        SimpleDateFormat simpleformat;
        for (String item : arr) {

            String month = Month.of(Integer.parseInt(item)).getDisplayName(TextStyle.FULL_STANDALONE, Locale.ENGLISH);

            simpleformat = new SimpleDateFormat("MMM");
            Date date = simpleformat.parse(month);
            String strMonth = simpleformat.format(date);

            map.put(item, strMonth);
        }
        for (Map.Entry<String, String> a : map.entrySet()) {
            System.out.println(a.getKey() + "  " + a.getValue());
        }
    }
}
