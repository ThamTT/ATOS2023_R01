package lanhD;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class date {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));


        String key = "23/03/2023";
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd-MM-yyyy");
        String dt;
        Date date;
        try {
            date = dateFormat.parse(key);
            System.out.println(dateFormat1.format(date) + " hehee");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_YEAR, 7);

        Date newDate = calendar.getTime();
        System.out.println("Date khi tăng 7 ngày: " + dateFormat1.format(newDate));

    }
}
