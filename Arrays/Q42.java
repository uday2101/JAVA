public class Q42 {
    public static void main(String[]args){
        int[] arr = {10,20,30,40,1,2};
        int n = arr.length;
        int sum = 53;
        System.out.println("Given value is : "+sum);
        System.out.print("Combination of four elements: ");
        for(int i = 0; i<n-3; i++){
            for(int j = i; j<n-2; j++){
                for(int k = j; k<n-1; k++){
                    for(int l = k; l<n; l++){
                        if(arr[i]+arr[j]+arr[k]+arr[l] == sum){
                            System.out.println(+arr[i] +" " +arr[j] +" " +arr[k] +" " +arr[l]);
                        }
                    }
                }
            }
        }
    }
}
