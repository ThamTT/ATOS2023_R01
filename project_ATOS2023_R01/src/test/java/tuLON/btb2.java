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


        Scanner input = new Scanner(System.in);
        System.out.println("Nhap mot thang tu (1-12): ");
        int month = input.nextInt();
        String[] monthName = {"January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October", "November", "December"};
        if (month >=1 && month <=12){
            System.out.println("Thang do la: " + monthName[month-1]);
        }
        else {
            System.out.println("co ca thang nay nua a` ?");
        }
    }
}
