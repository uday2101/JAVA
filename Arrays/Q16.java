import java.util.*;
public class Q16 {
   public static void main(String[]args){
       String[] array1 = {"A","B","C","D","E","F"};
       String[] array2 = {"G","H","C","A","I","J"};
       System.out.println("Array Number One : " +Arrays.toString(array1));
       System.out.println("Array Number Two : " +Arrays.toString(array2));
       HashSet<String> set = new HashSet<String>();
       for(int i = 0; i<array1.length; i++){
           for(int j = 0; j<array2.length; j++){
               if(array1[i].equals(array2[j])){
                   set.add(array1[i]);
               }
           }
       }
       System.out.println("Common Elements are : " +(set));
   } 
}
