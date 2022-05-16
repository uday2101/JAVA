public class Q52{ // alternative approach for Q51
    static void segregateEvenOdd(int[] arr, int n){
        int left = 0; 
        int right = n-1;
        while(left<right){
            while(arr[left]%2 == 0 && left<right){
                left++;
            }
            while(arr[right]%2 == 1 && left<right){
                right--;
            }
            if(left<right){ //Swapping 
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
    public static void main(String[]args){
        int[] arr = new int[] {12,34,45,9,8,90,3};
        int n = arr.length;
        segregateEvenOdd(arr,n);
        System.out.print("Array after Segregation ");
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}