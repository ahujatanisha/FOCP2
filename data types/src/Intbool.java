//author: Tanisha Ahuja
//version: 1.0.0


import java.util.Scanner;
class Intbool 
{
  public static void main(String[] args) 
  { 	

    int a , b , c;
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter nos.");
    a = input.nextInt();
    b = input.nextInt();
        
     if (a > b)
     {
    	System.out.println("a is greater than b");
     }
     else
     {
    	System.out.println("b is greater than a");
     }
      
     System.out.println("Enter nos.");
     a = input.nextInt();
     b = input.nextInt();
     c = input.nextInt();
     boolean result;
        
     result = (a > b) || (c > a);        
     
     System.out.println(result);          
        
     result = (a > b) && (c > a);
     System.out.println(result);
    }
}