import java.util.*;
public class Exercise9{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N ");
        int n = sc.nextInt();
        int cube = 0;
        for(int i = 1; i<=n; i++){
            System.out.println("Number is : " +i + " Cube is : " +(i*i*i));
        }
    }
}