import java.util.*;
public class Q4 {
    public static void main(String[]args){
        int []my_arr1 = {123,143,125,235,546,789};
        String []my_arr2 = {"Java", "Python", "C++", "R","Bootstrap"};
        System.out.println("Original numeric array" +Arrays.toString(my_arr1));
        Arrays.sort(my_arr1);
        System.out.println("Sorted numeric array " +Arrays.toString(my_arr1));
        System.out.println("Original String Array" +Arrays.toString(my_arr2));
        Arrays.sort(my_arr2);
        System.out.println("Sorted string array" +Arrays.toString(my_arr2));
    }
}
