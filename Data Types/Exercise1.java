import java.util.*;
public class Exercise1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value in Fahrenheit ");
        double Fahrenheit = sc.nextDouble();
        double Celsius = (5*(Fahrenheit-32))/9;
        System.out.println(Fahrenheit + "degree Fahrenheit is equal to" + Celsius + "in degree Celsius");
        sc.close();
    }
}