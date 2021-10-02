import Pack.*;
public class Sum
{
     int a=20;
     int b=30;
     public void call()
    {
       int s=a+b;
       System.out.println("sum:"+s);
    }

}
Pack com.maths.calculators;
class SumTest
{
       public static void main(String args[])
       {
           Sum s=new Sum();
           s.call();
       }
}