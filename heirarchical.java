import java.util.*;
class a{
    public void print()
    {
        System.out.println("hello students");
    }
}
class b extends a{
    public void r()
    {
        System.out.println("hello teachers");
    }
}
class c extends a{
    public void r1(){
        System.out.println("hello professores");
    }
}
public class heirarchical{
    public static void main(String args[]){
        
    b h=new b();
    c j=new c();
    h.print();
    h.r();
    j.print();
    j.r1();
}
}