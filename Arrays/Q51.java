import java.util.*;
public class Q51 {
    public static void main(String[]args){
        int[] arr = {21,33,32,22,12,2,5,67,65,54};
        int n = arr.length;
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("Original Array is : " +Arrays.toString(arr));
        System.out.println("Even Numbers are as follows : ");
        for(int i = 0; i<n; i++){
            if(arr[i]%2 == 0){
              System.out.print(arr[i]+" ");  
            }
        }
        System.out.println("\nOdd Numbers are as follows : ");
        for(int i = 0; i<n; i++){
            if(arr[i]%2 != 0){
                System.out.print(arr[i]+ " ");
            }
        }
    }
}
