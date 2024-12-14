import java.util.*;
class a{
    public void print()
    {
        System.out.println("hello students");
    }
}
class b extends a{
    public void r (){
        System.out.println("hello Teachers");
    }
}
class c extends b {
    public void r1(){
        System.out.println("hello professors");
    }
}
public class multilevelinheritance{
    public static void main(String args[]){
        c f=new c();
        f.print();
        f.r();
        f.r1();
    }
}
