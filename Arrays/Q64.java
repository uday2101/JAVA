public class Q64 { //Kadane's Algorithm to find the largesgt sum contiguous subarray
    static int maxSubArraySum(int[] arr){
        int size = arr.length;
        int max_so_far = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i<size; i++){
            sum = sum+arr[i];
            if(max_so_far<sum){
                max_so_far = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
        return max_so_far;
    }
    public static void main(String[]args){
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println("Maximum contiguous sum is : " +maxSubArraySum(arr));
    }
}
