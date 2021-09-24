public class Add{
    static int x =50;
    int y = 50;
    
    void add(){
        x=x+10;
        y=y+10;
    }
    public static void main(String[]args){
        Add obj1=new Add();
        System.out.println("X= "+x +"\t" + "Y= "+obj1.y); //x=50,y=50
        obj1.add();
        System.out.println("X= "+x +"\t" + "Y= "+obj1.y); //x=60,y=60
        Add obj2=new Add();
        System.out.println("X= "+x +"\t" + "Y= "+obj2.y); //x=60,y=50(because it is initialzied with the default value) but x remains 60 as it is a static variable.
        obj2.add();
        System.out.println("X= "+x +"\t" + "Y= "+obj2.y); // x=70,y=60
        
    }
}