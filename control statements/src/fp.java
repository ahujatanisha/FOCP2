//author: Tanisha Ahuja
//version: 1.0.0
//Purpose:3.Write a Java program that reads in two floating-point numbers and tests whether they are the same up to three decimal places.

import java.util.Scanner;
public class fp
{
  public static void main(String[] args)
  { 
      Scanner in = new Scanner(System.in);

      System.out.print("Input a floating point number: ");
      double a = in.nextDouble();
      System.out.print("Input a floating point number: ");
      double b = in.nextDouble();

      a = Math.round(a * 1000);
      a = a / 1000;

      b = Math.round(b * 1000);
      b = b / 1000;

      if (a == b)
      {
        System.out.println("they are the same upto three decimal places");
      }
      else
      {
        System.out.println("they are the same upto three decimal places");

      }
  } 
}