import java.util.*;
public class Q6 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        a = Math.round(a*1000);
        a = a%1000;
        b = Math.round(a*1000);
        b = b%1000;
        if(a == b){
            System.out.println("They are same upto 3 decimal places");
        }
        else{
            System.out.println("Values are different");
        }
        sc.close();
    }
}
