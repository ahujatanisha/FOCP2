// author : Tanisha
//Version : 1.0.0
//Purpose:1.  Write a Java program to find the index of an array element in an array of size 10. The program should not use any function other than main ( ) functions

import java.util.*; 
public class Index 
{ 
   
  public static int Index(int arr[], int t) 
  { 
        
              if (arr == null) 
          { 
               return -1; 
           } 
              int len = arr.length; 
     int p = 0; 
    while (p < len) 
    { 
  
               if (arr[p] == t) 
          { 
            return p; 
          } 
        
              else 
          { 
            p = p + 1; 
          } 
    } 
     return -1; 
  } 
   public static void main(String[] args) 
   { 
      int[] my_array = new int[10]; 
      Scanner input = new Scanner (System.in);
        
      System.out.print("Enter the elements ");
             for(int p=0;p<10;p++)
          {

            my_array[p] = input.nextInt();   
           } 

    System.out.println("enter number whose index is to be found");
             int q = input.nextInt();
    System.out.println("now the number is"+ q);

    System.out.println("Index position of q is:" +Index(my_array,q));
    
      } 
} 