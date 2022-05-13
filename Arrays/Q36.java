import java.util.*;
public class Q36 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are : ");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("The indices of the elements who have the desired sum are : ");
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                if((arr[i] + arr[j] == num) && (i != j)){
                   System.out.println(+i +" , "+j); 
                }
            }
        }
        sc.close();
    }
}
