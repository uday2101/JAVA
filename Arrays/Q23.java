import java.util.*;
public class Q23 {
     public static void main(String[]args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the size of the array : ");
         int size = sc.nextInt();
         int[] array = new int[size];
         System.out.println("Enter the elements of the array : ");
         for(int i = 0; i<size; i++){
             array[i] = sc.nextInt(); 
         }
         System.out.println("Enter the number : ");
         int num = sc.nextInt();
         System.out.println("The array created is : "+Arrays.toString(array));  
         System.out.println("Indices of the elements whose sum is equal to the given number are : ");
         for(int i = 0; i<array.length; i++){
             for(int j = i; j<array.length; j++){
                 if(array[i] + array[j] == num && i != j ){
                     System.out.println(i+", "+j);
                 }
             }
         }
         sc.close();
     }
}
