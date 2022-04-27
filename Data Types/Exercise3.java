import java.util.*;
public class Exercise3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer : ");
        int num = sc.nextInt();
        int sum = 0;
        while(num!=0){
            int temp = num%10;
            sum=sum+temp;
            num=num/10;
        }
        System.out.println("The sum is : " +sum);
        sc.close();
    }
}
