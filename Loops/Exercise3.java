import java.util.*;
public class Exercise3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int sum = a+b+c+d+e;
        System.out.println("Sum is " +sum);
        double avg = sum/5;
        System.out.println("Average is " +avg);
        sc.close();

    }
}
