public class Palindrome {
    public static void main(String[]args){
        String str = "madam";
        String st = "";
        for(int i = 0; i<str.length();i++){
            st = str.charAt(i)+st;
        }
        if(st.equals(str)){
            System.out.println("The String is a Palindrome");
        }
        else{
            System.out.println("The String is not a Palindrome");
        }
    }
}
