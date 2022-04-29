import java.util.*;
public class Exercise9 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the first integer : ");
        int firstInteger = sc.nextInt();
        System.out.println("Enter the value of the second integer : ");
        int secondInteger = sc.nextInt();
        System.out.printf("Sum of the two integers: %d%n", firstInteger+secondInteger );
        System.out.printf("Difference between the two integers: %d%n", firstInteger-secondInteger);
        System.out.printf("Product of the two integers : %d%n", firstInteger*secondInteger);
        System.out.printf("Average of the two integers : %.2f%n", (double) (firstInteger+secondInteger)/2);
        System.out.printf("Distance between the two integers : %d%n", Math.abs(firstInteger-secondInteger) );
        System.out.printf("Maximum of the two integers : %d%n", Math.max(firstInteger,secondInteger));
        System.out.printf("Minimum of the two integers : %d%n", Math.min(firstInteger,secondInteger));
        sc.close();
    }
}
