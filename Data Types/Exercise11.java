import java.util.*;
public class Exercise11 { //Another approach of the previous problem
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        while(number>0){
            int remainder= number%10;
            System.out.println(remainder);
            number = number/10;
            sc.close();

        }
    }
}
