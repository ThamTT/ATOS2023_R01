package kieuNT.javacore;

public class bai1 {
    public static int KTNT(int n){
        if(n < 2)
            return 0;
        for(int i = 2; i< n;i++)
            if(n % i == 0)
                return 0;
        return 1;
    }
    public static void main(String[] args) {
        String n = "so luong 350";
        //n = n.replaceAll("[^0-9,-\\.]",",");
        String[] item = n.split(" ");
        for(int i = 0; i < item.length;i++){
            System.out.println(item[i]);
        }
        int x = Integer.parseInt(item[item.length - 1]);
        System.out.println("x: "+ x);
        System.out.println(item.toString());
        String so ="";
        for(int i=0;i<item.length; i++){
            try {

                /*System.out.println(item[i]);*/
                so += Double.parseDouble(item[i]);

            }catch(NumberFormatException e) {
            }
        }
        System.out.println(so);
        Double a = Double.parseDouble(so);
        System.out.println(a);
        for(int i = 1;i < a;i++){
            if(KTNT(i) == 1)
                System.out.println(i + " ");
        }
    }

}
