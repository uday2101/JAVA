import java.util.*;
public class Q2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double res = (b*b)-4*a*c;
        if(res>0.0){
            double r1 = (-b + Math.pow(res, 0.5))/2*a;
            double r2 = (-b - Math.pow(res,0.5))/2*a;
            System.out.println("The roots are : " +r1+ " & "+r2);
        }
        else if(res==0.0){
            double r1 = (-b)/2*a;
            System.out.println("The root is : " +r1);
        }
        else{
            System.out.println("The equation has no real roots");
        }
        sc.close();
    }
}
