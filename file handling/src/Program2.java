
import java.io.*;
import java.util.*;

class Program2
{
   public static void main(String[] args) 
   {
   	  File f = null;
       
       try
       {
         
         f = new File("file.txt");
         FileReader fin = new FileReader(f);
	     BufferedReader bin= new BufferedReader(fin);
    	
    	 String c;
    	 int flag =0;
    	 Scanner sc= new Scanner(System.in);
    	 System.out.print("enter a word to be found:");
    	 String b =sc.next();

          while((c = bin.readLine())!=null)
         {
         	String[] a = c.split(" ");
             for(int i=0;i<a.length;i++)
             {	
                if(a[i].equals(b))
                flag=1;
            }
            if(flag==1)
            {
			System.out.print("Present");
			break;
			}
			else
			{
			System.out.print("not present");
			}
         }
        
    }

    catch(Exception e)
	{
	    e.printStackTrace();
	      
	}
}	
}



