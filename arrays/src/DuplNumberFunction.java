//Author : tanisha
//version : 1.0.0
//Purpose : to enter an array of 5 elements lying between 10 and 100 and all elements must be diffirent from one another

import java.util.Scanner;
class DuplNumberFunction 
{

  static int[] arr;               	
  public static void main(String[] args) 
  {
    arr = new int[5];           
    inputnum();                
  }
  static boolean isduplicate(int pos, int a) 
  {    

    for (int b=pos-1;b>=0;b--) 
  {            
  if(a==arr[b])
  {                     
return false;
  }
  }
return true;
  }
  static void inputnum() 
  {               
Scanner num = new Scanner(System.in);
  boolean c;
  int a,i;
  for(i=0;i<5;i++)
  {
System.out.println("Enter number");

  a = num.nextInt();
while(!checkbetween(a)) 
{
System.out.println("Enter integer between 10 - 100:");  

  a = num.nextInt();

  }
  if(!isduplicate(i,a))
  {         
System.out.println("Duplicate entry");
  i=i-1;
continue;
  }
arr[i]=a;
printarray(i);
  }
}

static boolean checkbetween(int a) 
{  
  if(a>9 && a<101)
  {
return true;
}
else 
{

return false;

 }
}

static void printarray(int pos)
{
for(int i=0;i<=pos;i++)
{       
System.out.print(arr[i]+" ");
 }
}
}


