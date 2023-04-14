package kieuNT;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class datetime {
    public static void main(String[] args) throws ParseException {
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy MM dd");
//        LocalDateTime now = LocalDateTime.now();
//        System.out.println(dtf.format(now));
        String dateUI = "24 04 2023";
        SimpleDateFormat dt = new SimpleDateFormat("dd MM yyyy");
        Date date = dt.parse(dateUI);
        String dates = dt.format(date);

        System.out.printf("date" + dates);
        SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("\n" + dt1.format(date));
//Cộng date thêm 7 ngày (Ca
//        out put 7/5/2023
        Date date1 = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DAY_OF_YEAR, 7);
        date1 = c.getTime();
        System.out.println("Date khi thêm 7 ngày " + dt1.format(date1));



    }
}
