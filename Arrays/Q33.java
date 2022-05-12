import java.util.*;
public class Q33 {
    public static boolean result(int[] numbers, int num1, int num2){
        for(int n: numbers){
            boolean r = n != num1 && n != num2;
            if(r){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        int[] numbers = {77,77,65,65,65,77};
        System.out.println("Original Array is : " +Arrays.toString(numbers));
        int num1 = 65;
        int num2 = 77;
        System.out.println("Result : "+result(numbers, num1, num2));
    }
}
