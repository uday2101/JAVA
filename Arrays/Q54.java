public class Q54 {
    static void MaxElement(int[] arr, int n){
        n = arr.length;
        int mfr = arr[n-1];
        arr[n-1] = -1;
        for(int i = n-2; i>=0; i--){
            int temp = arr[i];
            arr[i] = mfr;
            if(mfr<temp){
                mfr = temp;
            }
        }
    }    
    static void printArray(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[]args){
        int[] arr = {16,17,4,3,5,2};
        int n = arr.length;
        MaxElement(arr, n);
        printArray(arr);
    }
}
