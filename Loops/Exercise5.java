import java.util.*;
public class Exercise5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        System.out.println("n odd natural numbers are ");
        for(int i = 1; i<=n; i++){
            if(i%2 != 0){
                System.out.println(i);
                sum = sum+i;
            }
        }
        System.out.println("The sum of odd numbers is " +sum);
        sc.close();
    }
}
