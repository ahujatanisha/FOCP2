// Author : tanisha
//Version : 1.0.0
//Purpose : to  get an array entered with only different numbers entered each time lying between 10 and 100

import java.util.Scanner;
class DuplNumber 
{

    static int[] arr;              
    public static void main(String[] args) 
    {
       arr = new int[5];           
       Scanner num = new Scanner(System.in);
       boolean c,flag;
       int b,a,k;
       for(a=0;a<5;a++)
    {
    System.out.println("Enter number:");
       b= num.nextInt();
       while(true) 
       {
      if(b>9 && b<101) 
    {
break;
    }
       System.out.println("Enter integer between 10 - 100:");  
       b = num.nextInt();

	        }
       flag=false;
       for (k=a-1;k>=0;k--) 
       {            
       if(b==arr[k]){                      
				
	   System.out.println("Duplicate entry");
       flag=true;

    }
    }
    if(flag==true){
    a=a-1;
continue;

    }
    arr[a]=b;
    System.out.print(arr[k]+" ");
    }
}
}


