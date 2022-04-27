import java.util.*;
public class Exercise6 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight : ");
        double pounds = sc.nextDouble();
        System.out.println("Enter the height in inches");
        double inches = sc.nextDouble();
        double BMI = (pounds/(inches*inches))*703;
        System.out.println("The Body Mass Index is : " +BMI);
        sc.close();
    }
}
