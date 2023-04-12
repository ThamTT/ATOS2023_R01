package vanNT;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BtapBuoi2 {
    public static void main(String[] args) {
        //b1
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime plus7Days = now.plusDays(7);
        String formattedDate = dtf.format(plus7Days);
        System.out.println(formattedDate);

    }

    }
