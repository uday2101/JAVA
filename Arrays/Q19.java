import java.util.*;
public class Q19 {
    public static void main(String[]args){
        int[] array = {10,34,56,21,14,67,12};
        Arrays.sort(array);
        System.out.println("Sorted Array is : " +Arrays.toString(array));
        int res = array[1];
        System.out.println("2nd smallest element is : " +res);
    }
}
