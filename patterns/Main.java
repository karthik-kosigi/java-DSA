import java.util.*;
class Suv
{
    int fibonacci(int i){
        if (i==0 || i==1){
          return(i);}
        else{
            return fibonacci(i-1)+fibonacci(i-2);
        }
        }
    }

public class Main
{
  public static void main (String[]args)
  { Scanner s =new Scanner(System.in);
    System.out.println ("Enter n: ");
   int n=s.nextInt();
   Suv ob= new Suv();
   for (int i=0;i<n;i++){
   System.out.print(" " + ob.fibonacci(i));
   
  }
}
}
