package kieuNT;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.*;

public class bai2b2 {
    public static void main(String[] args) throws ParseException {
        List<String> arr = Arrays.asList("1", "2", "3", "4", "5", "6" , "7","8","9","10","11","12");
        Map<String,String> map = new HashMap<>();
        SimpleDateFormat simpleDateFormat;

        for (String item:arr){
            String month = Month.of(Integer.parseInt(item)).getDisplayName(TextStyle.FULL_STANDALONE,Locale.ENGLISH);
            simpleDateFormat = new SimpleDateFormat("MMM");
            Date date = simpleDateFormat.parse(month);
            String strMonth = simpleDateFormat.format(date);
            map.put(item, strMonth);

        }
        for(Map.Entry<String,String> imap: map.entrySet()){
            System.out.printf(imap.getKey()+":"+imap.getValue()+"\n");
        }
    }
}
