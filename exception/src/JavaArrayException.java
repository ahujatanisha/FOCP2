class JavaArrayException
{
	public static void main(String args[])
	{
    try
      {
    	int a[]=new int[5]; 
    	a[6]=30/5 ;
      }
    catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}
    {
    	System.out.println("rest of the code..");
    }
  }
}