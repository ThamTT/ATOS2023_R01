package hueXinh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.sqrt;

public class baitap {
    public static boolean soNguyenTo(int soA)
    {
        if (soA < 2)
            return false;

        for (int i = 2; i <= sqrt((float)soA); i ++)
        {
            if (soA%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void BT1(String str){
        String[] arStr11 = str.split("\\s",3);
        int a= Integer.valueOf(arStr11[2]);
        System.out.println("=================BT1=====================");
        for (int i=2; i<a; i++){
            if (soNguyenTo(i)) System.out.print(i+ "\t");
        }
    }
    public static void BT2(String str2){
        String[] arStr2 = str2.split("\\,");
        int n= arStr2.length;
        ArrayList <String> list1 = new ArrayList<String>();
        for (int i=0; i<n; i++) {
            list1.add(arStr2[i]);
        }
        System.out.println("\n==================BT2====================");
        for (int i=0; i< list1.size(); i++) {
            System.out.print(list1.get(i)+"\t");
        }

    }
    public static void main(String[] args) {
        String n="so luong 350";
        BT1(n);
        String str = "5,7,3,8,3,7";
        BT2(str);
    }
}
