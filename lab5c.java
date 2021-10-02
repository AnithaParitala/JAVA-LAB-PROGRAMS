public class lab5c
{
   public static void main(String args[])
   {
     String string1=new String("Python");
     String string2=new String("Python");
     String string3=new String("C");
     String string4=new String("Ruby");
     String string5=new String("SQL");
     System.out.println("comparing"+string1+"and"+string2+":"+string1.equals(string2));
     System.out.println("comparing"+string3+"and"+string4+":"+string3.equals(string4));
     System.out.println("comparing"+string4+"and"+string5+":"+string4.equals(string5));
     System.out.println("comparing"+string1+"and"+string4+":"+string1.equals(string4));
  }
}    
      