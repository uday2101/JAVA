import java.util.*;
public class Q41 { // check gfg for other approach as well
    public static void main(String[]args){
        int[] arr = {13,19,2,8,3,78,56};
        Arrays.sort(arr);
        System.out.println("Sorted Array is : " +Arrays.toString(arr));
        System.out.println("Smallest Element is : " +arr[0]);
        System.out.println("Second Smallest Element is : " +arr[1]);
    }
}
