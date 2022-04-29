import java.util.*;
public class Exercise8 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        System.out.printf("Square is : %.2f\n",num*num );
        System.out.printf("Cube is : %.2f\n", num*num*num);
        System.out.printf("Fourth power is : %.2f\n", Math.pow(num, 4));
        sc.close();
    }
}
