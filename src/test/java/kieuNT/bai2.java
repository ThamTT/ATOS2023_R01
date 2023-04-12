package kieuNT;

import java.util.Arrays;

public class bai2 {
    public static void main(String[] args) {
        String str ="9,7,3,8,3,7";

        String[] a = str.split(",");
        a.toString();
        int []arr = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            arr[i] = Integer.parseInt(a[i]);
            System.out.println(arr[i]);
        }

      /*  for(String item : a) {

                System.out.println(item);

        }*/
    }
}
