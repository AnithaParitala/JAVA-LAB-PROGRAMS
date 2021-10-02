import java.util.*;
class lab5e
{
      public static void main(String args[])
      {
          System.out.println("before sorting strings");
          for(int j=0;j<args.length;j++)
          System.out.println(args[j]);
          Arrays.sort(args);
          System.out.println("after string");
          for(int i=0;i<args.length;i++)
          System.out.println(args[i]);
      }
}