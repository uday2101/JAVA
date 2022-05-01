import java.util.*;
public class Q8 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.equals("a") || str.equals("e") || str.equals("i") || str.equals("o") || str.equals("u")){
            System.out.println("Vowel");
        }
        else if(str.length()>1){
            System.out.println("Error");
        }
        else{
            System.out.println("Consonant");
        }
        sc.close();
    }
}
