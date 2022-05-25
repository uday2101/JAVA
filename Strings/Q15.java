public class Q15 {
    public static void main(String[]args){
        String str = "The quick brown fox jumps over the lazy dog";
        int a = str.lastIndexOf("a",str.length()-1);
        int b = str.lastIndexOf("quick");
        int c = str.lastIndexOf("f",str.length()-1);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
