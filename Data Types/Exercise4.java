import java.util.*;
public class Exercise4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value");
        int minutes = sc.nextInt();
        int year = minutes/525600;
        int remainingminutes = minutes%525600;
        int day = remainingminutes/1440;
        System.out.println(minutes + " minutes is " + year + " years and " + day + " days" );
        sc.close();
    }
}
