package tuNA.javacore;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.TextStyle;
import java.util.*;

public class btb2 {
    public static void main(String[] args) {
        String datehn="2011-04-30";
        SimpleDateFormat dateFormat = new SimpleDateFormat( "yyyy-MM-dd" );
        Calendar cal = Calendar.getInstance();
        try {
            cal.setTime( dateFormat.parse(datehn));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        cal.add( Calendar.DATE, 1 );
        String convertedDate=dateFormat.format(cal.getTime());
        System.out.println("Date.."+convertedDate);

        //thang
        List<String> arr = Arrays.asList("1","2","3","4","5","6","7","8","9","10","11","12");
        Map<String, String> map = new HashMap<>();
        SimpleDateFormat simpleDateFormat;
        for (String item: arr){
            String month = Month.of(Integer.parseInt(item)).getDisplayName(TextStyle.FULL_STANDALONE, Locale.ENGLISH);
            simpleDateFormat = new SimpleDateFormat("MMM");
            Date date = null;
            try {
                date = simpleDateFormat.parse(month);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            String strMonth = simpleDateFormat.format(date);
            map.put(item, strMonth);
        }
        for (Map.Entry<String, String> imap: map.entrySet()){
            System.out.printf(imap.getKey()+" : " + imap.getValue() + "\n");
        }
    }
}
