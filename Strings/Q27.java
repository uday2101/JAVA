public class Q27 {
    private static void showPermutation(String str1, String str2){
        if(str2.length() == str1.length()){
            System.out.println(str2);
            return;
        }
        for(int i = 0; i<str1.length(); i++){
            showPermutation(str1, str2+str1.charAt(i));
        }
    }
    private static void permutationWithRepetition(String str1){
        System.out.println("The given string is: PQR");
        System.out.println("The Permuted Strings are : ");
        showPermutation(str1,"");
    }
    public static void main(String[]args){
        permutationWithRepetition("PQR");
    }
}
