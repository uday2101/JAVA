public class Q44 {
    public static void main(String[]args){
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int n = array.length;
        System.out.println("Original Array is : ");
        for(int i = 0; i<n; i++){
            System.out.print(array[i]+" ");
        }
        int last = array[n-1];
        for(int i = n-1; i>0; i--){
            array[i] = array[i-1];
            array[0] = last;
        }
        System.out.print("\nTHE ROTATED ARRAY IS : ");
        for(int i = 0; i<n; i++){
            System.out.print(array[i]+" ");
        }
    }
}
