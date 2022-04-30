import java.util.*;
public class Q4 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        float n = sc.nextFloat();
        float absolute_n = Math.abs(n);
        if(n==0){
            System.out.println("Zero");
        }
        else if(n>0.0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }
        if(absolute_n<1.0){
            System.out.println("Small");
        }
        if(absolute_n>100000){
            System.out.println("Large");
        }
        sc.close();
    }
}
