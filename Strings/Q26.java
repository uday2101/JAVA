public class Q26 {
    static final int NO_OF_CHARS = 256;
    static char getSecondHighest(String str){
        int[] count = new int[NO_OF_CHARS];
        for(int i = 0; i<str.length(); i++){
            (count[str.charAt(i)])++;
        }
        int first = 0 , second = 0;
        for(int i = 0; i<NO_OF_CHARS; i++){
            if(count[i]>count[first]){
                second = first;
                first = i;
            }
            else if(count[i]>count[second] && count[i] != count[first]){
                second = i;
            }
        }
        return (char)second;
    }
    public static void main(String[]args){
        String str = "geeksforgeeks";
        char res = getSecondHighest(str);
        if(res != '\0'){
            System.out.println("Second most freq character is : " +res);
        }
        else{
            System.out.println("No second most freq character");
        }
    }
}
