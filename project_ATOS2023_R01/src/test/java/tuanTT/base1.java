package tuanTT;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class base1 {
    public static void Sum(){
        int s = 0;
        for(int i = 20; i <=30;i+=2)
            s += i;
        System.out.println("Tong: " +s);
    }
    public  static boolean checkPrime(int x){
        if(x < 2)
            return false;
        for(int i = 2; i <= x/2; i++)
            if(x % i == 0)
                return false;
        return true;
    }
    public static void outputPrime(){
        String str = "so nguyen 350";
        String [] arr = str.split(" ");
        int n = Integer.parseInt(arr[arr.length - 1]);
        System.out.println("So: " + n);
        System.out.println("Cac so nguyen to: ");
        for(int i = 1; i < n;i++){
            if(checkPrime(i) ){
                System.out.print(i +"\t");
            }
        }
    }
    public static void outputArray(){
        String str = "3,7,8,1,3,5,-5,-8,-8,9";
        System.out.println("\nCác số trong mảng: ");
        String [] arr = str.split(",");

        ArrayList<Integer> listAm = new ArrayList<>();
        for(String item: str.split(",") ){
            if(Integer.parseInt(item) < 0){
                listAm.add(Integer.parseInt(item));
            }
        }
        System.out.println("Mang so am: ");
        for(int i : listAm){
            System.out.println(i);
        }
        int [] list = new int[arr.length];
        for(int i = 0; i < arr.length;i++){
            try{
                list[i] = Integer.parseInt(arr[i]);
            }catch (NumberFormatException e){
                System.out.println("Ngoai le so");
            }
        }
        for(int i = 0; i < list.length; i++){
            System.out.println(list[i] + "\t");
        }
    }
    public static void Map(){
        Map<String, Integer> myMap = new HashMap<>();
        // Thêm các cặp key-value vào HashMap
        myMap.put("apple", 2);
        myMap.put("banana", 3);
        myMap.put("orange", 4);

        // Truy cập giá trị của một key
//        int value = myMap.get("banana");
//        System.out.println("The value of 'banana' is: " + value);

        // Duyệt qua các cặp key-value của HashMap
        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void formatDate(){
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
    public static void main(String[] args) {
//        Sum();
//        outputPrime();
//        outputArray();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));







    }
}
