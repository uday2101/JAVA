import java.util.*;
public class Exercise2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("N natural numbers are : ");
        int sum = 0;
        for(int i = 1; i<=n; i++){
            System.out.println(i);
            sum = sum+i;
        }
        System.out.println("Sum of N natural numbers are : " +sum);
        sc.close();
    }
}
