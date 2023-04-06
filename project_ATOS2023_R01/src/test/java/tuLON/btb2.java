package tuLON;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Scanner;

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
        Scanner arrlist = new Scanner(System.in);
        System.out.println("Nhap mot thang tu (1-12): ");
        int month = arrlist.nextInt();
        String[][] monthArray = {{"January", "1"}, {"February", "2"}, {"March", "3"}, {"April", "4"},
                {"May", "5"}, {"June", "6"}, {"July", "7"}, {"August", "8"},
                {"September", "9"}, {"October", "10"}, {"November", "11"}, {"December", "12"}};
        int monthNumber = 3;
        String monthName = "";
        for (int i = 0; i < monthArray.length; i++) {
            if (monthArray[i][1].equals(String.valueOf(monthNumber))) {
                monthName = monthArray[i][0];
                break;
            }
        }
        System.out.println("Tháng " + monthNumber + " là " + monthName);
    }
}
