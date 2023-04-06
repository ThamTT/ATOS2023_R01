package lanhD;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class date {
    public static void main(String[] args) {
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }
}
