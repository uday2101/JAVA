public class Q40 {
    static void minAbsSumPairs(int arr[], int arr_size){
        int sum = 0;
        int min_sum;
        int min_l, min_r;
        if(arr_size<2){
            System.out.println("Invalid Input");
            return;
        }
        min_l = 0;
        min_r = 1;
        min_sum = arr[0] + arr[1];
        for(int i = 0; i<arr_size-1; i++){
            for(int j = i+1; j<arr_size; j++){
                sum = arr[i]+arr[j];
                if(Math.abs(min_sum)>Math.abs(sum)){
                    min_sum = sum;
                    min_l = i;
                    min_r = j;
                }
            }
        }
        System.out.println("The two elements whose sum is minimum are : " +arr[min_l]+", "+arr[min_r]);
    }
    public static void main(String[]args){
        int[] arr = {1,60,-10,70,-80,85};
        int arr_size = arr.length;
        minAbsSumPairs(arr, arr_size);
    }
}
