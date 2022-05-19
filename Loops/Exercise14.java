import java.util.*; //exponent 
public class Exercise14 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int power = sc.nextInt();
        int base = sc.nextInt();
        int result = 1;
        for(int i = 1; i<=power; i++){
            result = result*base;
        }
        System.out.println("Required exponent is : "+result);
        sc.close();
    }
}
