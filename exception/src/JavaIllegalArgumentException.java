class JavaIllegalArgumentException
{public static void main(String args[])
  {
  try
  {
  	switch(5)
  	{
  		case 1:System.out.println("case 1");
  		default: throw new  IllegalArgumentException("invalid");
  	}
  }
  catch(IllegalArgumentException e){System.out.println(e);}
  {
    	System.out.println("rest of the code..");
    }
  }
}	