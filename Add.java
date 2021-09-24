public class Add{
    static int x =50;
    int y = 50;
    
    void add(){
        x=x+10;
        y=y+10;
    }
    public static void main(String[]args){
        Add obj1=new Add();
        System.out.println("X= "+x +"\t" + "Y= "+obj1.y);
        obj1.add();
        System.out.println("X= "+x +"\t" + "Y= "+obj1.y);
        obj1.add();
        System.out.println("X= "+x +"\t" + "Y= "+obj1.y);
    }
}