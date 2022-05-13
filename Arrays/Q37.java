public class Q37 {
    boolean triplet(int[] arr, int arr_size, int sum){
        for(int i = 0; i<arr_size; i++){
            for(int j = i; j<arr_size; j++){
                for(int k = j; k<arr_size; k++){
                    if((i != j && j != k && i != k) && (arr[i]+arr[j]+arr[k] == sum)){
                        System.out.println("Triplet is : " +arr[i]+", "+arr[j]+", "+arr[k]);
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[]args){
        Q37 trip = new Q37();
        int[] arr = {1,4,45,6,10,8};
        int sum = 22;
        int arr_size = arr.length;
        trip.triplet(arr, arr_size, sum);
    }
}
