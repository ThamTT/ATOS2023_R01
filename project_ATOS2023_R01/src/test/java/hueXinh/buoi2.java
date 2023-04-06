package hueXinh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class buoi2 {
    public  static void BT1(){
        String date1="24-12-1945";

        String pattern = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date date= null;
        try {
            date = simpleDateFormat.parse(date1);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        SimpleDateFormat dt1 = new SimpleDateFormat(pattern);
        System.out.println(dt1.format(date));

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();


        c1.setTime(date);
        c2.setTime(date);

        System.out.println("Ngày ban đầu : " + dateFormat.format(c1.getTime()));
        c1.roll(Calendar.DATE, 7);
        System.out.println("Ngày được tăng thêm 8 ngày: "+ dateFormat.format(c1.getTime()));
    }
    public static void BT2(){
        String list1 ="1,2,3,4,5,6,7,8,9,10,11,12";
        String[] arStr2 = list1.split("\\,");
        ArrayList <String> list = new ArrayList<String>();
        ArrayList<Date> date = new ArrayList<>();
        SimpleDateFormat format = new SimpleDateFormat("MMM");
        for (String item: arStr2){

            Date date1 = null;
            try {
                date1 = new SimpleDateFormat("MM").parse(item);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            list.add(date1.toString().split(" ")[1]);
        }
        Map<String,Object> map = new HashMap<String,Object>();
        for(int j = 0 ; j < arStr2.length ; j ++) {
            map.put(arStr2[j], list.get(j));
        }
        Set<String> set = map.keySet();
        for (String key : set) {
            System.out.println(key + " " + map.get(key));
        }



    }
    public static void main(String[] args) throws ParseException {

        BT2();

    }
}
