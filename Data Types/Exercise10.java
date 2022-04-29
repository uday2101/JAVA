import java.util.*;
public class Exercise10 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number ");
        int num = sc.nextInt();
        String string_number = Integer.toString(num);
        for(int i=0; i<string_number.length(); i++){
            System.out.println( string_number.charAt(i) );
            sc.close();
        }
    }
}
