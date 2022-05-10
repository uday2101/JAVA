import java.util.*;
public class Q22 { //program to convert arraylist into an array
    public static void main(String[]args){
        ArrayList<String> mylist = new ArrayList<String>();
        mylist.add("Orange");
        mylist.add("Banana");
        mylist.add("Apple");
        mylist.add("Peach");
        mylist.add("Cherry");
        System.out.println("Contents of the list are : " +mylist);
        String[] myarray = new String[mylist.size()];
        mylist.toArray(myarray);
        for(int i = 0; i<myarray.length; i++){
            System.out.println("Element at index "+i+" is : "+myarray[i]);
        }
    }
}
