package thamTT.test;

public class base1 {
//    Tinh tong so chan tu 20-30
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 20; i<=30; i += 2){
            sum += i;
            System.out.print("   " + i);
        }
        System.out.println("sum =" + sum);
    }
}
