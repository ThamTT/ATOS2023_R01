package tuanTT;

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
        String str = "3,7,8,1,3,5";
        System.out.println("\nCác số trong mảng: ");
        String [] arr = str.split(",");
        for(int i = 0; i < arr.length;i++)
            System.out.print(arr[i] + "\t");
    }
    public static void main(String[] args) {
        Sum();
        outputPrime();
        outputArray();

    }
}
