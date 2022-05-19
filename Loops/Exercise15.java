import java.util.*;
public class Exercise15 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0.0; 
        for(int i = 1; i<=n; i++){
            sum = sum + (1.0/i);
        }
        System.out.println("Sum is : " +sum);
        sc.close();
    }
}
