class JavaException
{
  public static void main(String args[])
  {
  try
    {
    int m=100/0;
    }
   catch(ArithmeticException e){System.out.println(e);}
   System.out.println("rest of the code...");
}
}