import java.util.*;
public class Q30 {
    public static void main(String[] args){
        int []array_nums = {5,7,2,4,9};
        System.out.println("Original Array is : " +Arrays.toString(array_nums));
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        float sum = array_nums[0];
        for(int i = 1; i<array_nums.length; i++){
            sum = sum + array_nums[0];
            if(max<array_nums[i]){
                max = array_nums[i];
            }
            else if(min>array_nums[i]){
                min = array_nums[i];
            }
        }
        float x = (sum-max-min)/(array_nums.length-2);
        System.out.printf("Average is : %.2f",x);
        System.out.print("\n");
    }
}
