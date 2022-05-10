import java.util.*;
public class Q21 { //program to convert array into array list
    public static void main(String[]args){
        String[] arr = {"Java","PHP","C++","Python","Bootstrap","HTML"};
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));
        System.out.println(list);
    }
}
