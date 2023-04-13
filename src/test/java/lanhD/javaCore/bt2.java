package lanhD.javaCore;

public class bt2 {
    public static void chuyenMnag(){
        String str = "9,7,8,1,6,5";
        System.out.println("\nCác số co trong mảng la: ");
        String [] arr = str.split(",");
        for(int i = 0; i < arr.length;i++)
            System.out.print(arr[i] + "\t");
    }

    public static void main(String[] args) {
        chuyenMnag();



    }
}
