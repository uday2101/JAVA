import java.util.*;
public class Exercise2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value in inches");
        double inches = sc.nextDouble();
        double meters = inches/39.37;
        System.out.println(inches + "of length is" + meters + " in meters");
        sc.close();
    }
}
