import java.util.*;
public class UserInput {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String s = sc.nextLine();
        System.out.println("String entered is : "+s);
        sc.close();
    }
}
