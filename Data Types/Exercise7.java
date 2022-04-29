import java.util.*;
public class Exercise7 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double mps,kph,mph;
        System.out.println("Enter the distance : ");
        double distance = sc.nextDouble();
        System.out.println("Enter the no of hours : ");
        double hour = sc.nextDouble();
        System.out.println("Enter the no of minutes : ");
        double minute = sc.nextDouble();
        System.out.println("Enter the number of seconds");
        double second = sc.nextDouble();
        double timeSeconds = (hour*3600) + (minute*60) + second;
        mps = distance/timeSeconds; 
        kph = (distance/1000)/(timeSeconds/3600);
        mph = (kph/1.609);

        System.out.println("Your speed in meter per seconds is " +mps);
        System.out.println("Your speed in kilometer per hour is " +kph);
        System.out.println("Your speed in miles per hour is " +mph);
        sc.close();
    }
}
