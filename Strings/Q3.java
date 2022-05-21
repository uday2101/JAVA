public class Q3 { // equalsIgnoreCase is just like the .equals method but just ignores the case(upper,lower) of the string
    public static void main(String[]args){
        String str1 = "This is Exercise 1";
        String str2 = "this is exercise 1";
        System.out.println("String 1 is : " +str1);
        System.out.println("String 2 is : " +str2);
        System.out.println(str1.compareToIgnoreCase(str2));
    }
}
