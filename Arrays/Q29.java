import java.util.*;
public class Q29 {
    public static void main(String[]args){
        int[] arr = {12,23,14,34,56,24,1,99,76};
        Arrays.sort(arr);
        System.out.println("Sorted Array is : " +Arrays.toString(arr));
        int sum = arr[0] + arr[8];
        System.out.println("Sum of the largest and the smallest element in the array is : " +sum);
    }
}
