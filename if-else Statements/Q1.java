import java.util.*;
public class Q1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int num = sc.nextInt();
        if(num>0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
            sc.close();
        }
    }
}
