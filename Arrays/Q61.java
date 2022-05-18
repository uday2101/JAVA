import java.util.*;
public class Q61 {
    public static void equilibriumIndex(int[] arr){
        int totalSum = 0; 
        for(int i = 0; i<arr.length; i++){
            totalSum = totalSum +arr[i];
        }
        int RunningSum = 0;
        for(int i = 0; i<arr.length; i++){
            int n = arr[i];
            if(totalSum-RunningSum-n == RunningSum){
                System.out.println("Equilibrium indices found at : " +i);
            }
            RunningSum = RunningSum + n;
        }
    }
    public static void main(String[]args){
        int[] arr = {-7,1,5,2,-4,3,0};
        System.out.println("Original Array is : " +Arrays.toString(arr));
        equilibriumIndex(arr);
    }
}
