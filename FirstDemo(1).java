public class FirstDemo(1){
    static int age=34;
    String name="Uday Agarwal";
    public static void main(String[]args){
        System.out.println(FirstDemo.age);
        FirstDemo(1) obj=new FirstDemo(1)();
        System.out.println(obj.name);
    }
}
//Normal Method for calling static and instance variables.