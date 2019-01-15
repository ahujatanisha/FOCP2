//author: Tanisha Ahuja
//version: 1.0.0


import java.util.*;
public class Number
{
public static void main (String args[])
{
  Scanner input = new Scanner (System.in);
  int digit;
  System.out.print("enter positive number-");
  digit = input.nextInt();
  int power = 1;
  while (power <= digit) 
    {
    power *= 10;
    }
    power /= 10;
      while (power > 0) 
       {
            System.out.println(digit/power + "   ");
           digit  %= power;
           power  /= 10;
        }
    }
}    