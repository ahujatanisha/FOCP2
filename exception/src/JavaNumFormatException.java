class JavaNumFormatException
{public static void main(String args[])
  {
  try
    {
    	String s ="java";
    	int i = Integer.parseInt(s);
    }
    catch(NumberFormatException e){System.out.println(e);}
    {
    	System.out.println("rest of the code..");
    }
  }
}