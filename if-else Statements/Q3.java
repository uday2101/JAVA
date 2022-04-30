import java.util.*;
public class Q3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && b>c){
            System.out.println("a is the greatest number");
        }
        else if(a<b && b<c){
            System.out.println("c is the greatest number");
        }
        else{
            System.out.println("b is the greatest number");
        }
        sc.close();
    }
}
