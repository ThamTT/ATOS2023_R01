package tuNA.javacore;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class date {
    public static void main(String[] args) {
        String dateUI = "30 04 2023";
        SimpleDateFormat dt = new SimpleDateFormat("dd MM yyyy");
        Date date = null;
        try {
            date = dt.parse(dateUI);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        String dates = dt.format(date);

        System.out.printf("date " + dates);
        SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-mm-dd");
        date date1 = new date();
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, 1);
        date = c.getTime();
        System.out.println("\n" + dt1.format(date));
    }

}
