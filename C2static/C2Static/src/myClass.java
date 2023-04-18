public class myClass {
    public static int x=10;
}
class Entry{
    public static void main(String[] args){
        myClass m1=new myClass();
        myClass m2=new myClass();
        m1.x=20;
        System.out.println(m1.x+m2.x);
    }
}
