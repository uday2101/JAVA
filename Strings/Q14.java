public class Q14 {
   public static void main(String[]args){
       String str = "The quick brown fox jumps over the lazy dog";
       int a = str.indexOf("a",0);
       int b = str.indexOf("h", 0);
       int c = str.indexOf("p",0);
       System.out.println("The index of letter a is " +a);
       System.out.println("The index of letter h is " +b);
       System.out.println("The index of letter p is " +c);
   } 
}
