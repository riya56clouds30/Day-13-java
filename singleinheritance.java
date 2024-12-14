import java.util.*;
class a{
    public void print()
    {
        System.out.println("hello student");
    }
}
class b extends a {
    public void r(){
        
    System.out.println("hello teachers");
}
}
public class singleinheritance{
    public static void main(String args[]){
     a h=new a();
     h.print();
     b y=new b();
     y.print();
     y.r();
    }
}
