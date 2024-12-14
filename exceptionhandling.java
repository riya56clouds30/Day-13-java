public class exceptionhandling{
   public static void main(String[]args){
    //try-catch
    try{
        int d=90/0;
   }
   catch(ArithmeticException v)
   {
    System.out.println("bad request");
   }
   //try-catch and finally
   try{
    int d=90/0;
     }
     catch(ArithmeticException v){
      System.out.println("catch block is running");  
     }
     finally{
        System.out.println("finally is running");
     }
   }
}