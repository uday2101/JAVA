public class Q17 {
    public static void main(String[]args){
        String str1 = "Red Green Orange Yellow";
        String str2 = "Yellow Orange Green Red";
        boolean match1 = str1.regionMatches(0, str2, 28, 8);
        boolean match2 = str2.regionMatches(9, str2, 9, 8);
        System.out.println(match1);
        System.out.println(match2); 
    }
}
