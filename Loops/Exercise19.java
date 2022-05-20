import java.util.*;
public class Exercise19 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int factorial = 1;
        for(int i = num; i>=1; i--){
            factorial = factorial*i;
        }
        System.out.println("Factorial of the given numbr is : " +factorial);
        sc.close();
    }
}
