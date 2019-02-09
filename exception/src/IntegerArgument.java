/*
Author:tanisha
Version: 1.0.0
Purpose: Write a program that takes 5 integer command line arguments.Create a user defined Exception named CheckArgumentException to check the number of arguments passed through command line.If the number of arguments is less than five, throw the CheckArgumentException, else print the addition of all five numbers.
*/

import java.util.*;
class CheckArgument extends Exception

{

}
class IntegerArgument
{
public static void main(String args[])

     {

         int x,n;

         int ans= 0;



         Scanner num = new Scanner(System.in);

         int s[]=new int[5];

         try
         {
             int cnt=0;

              for(x=0;x<5;x++)

             {

             	n = num.nextInt();

                    s[x]= n;

                    cnt++;



                    if(s.length >5)

                    {

                          throw new CheckArgument();

                    }

                    
             }

 

             for(x=0;x<s.length;x++)

            {

                   ans=ans+s[x];

             }
    }

   catch(CheckArgument m)
   {
        System.out.println("Passed 5 Integer");
   }    

   System.out.println("The sum is " + ans);

  }

}