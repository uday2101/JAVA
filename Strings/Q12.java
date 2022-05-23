public class Q12 {
    public static void main(String[]args){
        String str = "Uday Agarwal";
        char ch[] = new char[10];
        str.getChars(1, 4, ch, 0);
        System.out.println(ch);
    }
}
