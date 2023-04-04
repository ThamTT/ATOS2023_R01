package tuLON;

public class bt_2 {
    public static void main(String[] args) {
        String str = "5,7,3,8,3,7";
        String[] arr = str.split(",");

        for (int i = 0; i < arr.length; i++){

            int x = Integer.parseInt(arr[i]);

            System.out.println("x = "+ arr[i]);

        }
    }
}
