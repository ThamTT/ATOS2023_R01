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
        //b2

                ArrayList<String> numbers = new ArrayList<>();
                numbers.add("1");
                numbers.add("2");
                numbers.add("3");
                numbers.add("4");
                numbers.add("5");
                numbers.add("6");
                numbers.add("7");
                numbers.add("8");
                numbers.add("9");
                numbers.add("10");
                numbers.add("11");
                numbers.add("12");

                Map<String, String> monthMap = new HashMap<>();
                monthMap.put("1", "Jan");
                monthMap.put("2", "Feb");
                monthMap.put("3", "Mar");
                monthMap.put("4", "Apr");
                monthMap.put("5", "May");
                monthMap.put("6", "Jun");
                monthMap.put("7", "Jul");
                monthMap.put("8", "Aug");
                monthMap.put("9", "Sep");
                monthMap.put("10", "Oct");
                monthMap.put("11", "Nov");
                monthMap.put("12", "Dec");

                for (String number : numbers) {
                    String monthName = monthMap.get(number);
                    System.out.println("Map{" + number + "," + monthName + "}");
                }




    }

    }
