//author: Tanisha Ahuja
//version: 1.0.0


import java.util.Scanner;
public class Quadequation
{
  public static void main(String[] Strings) 
  {

    Scanner input = new Scanner(System.in);

        System.out.print("Input p: ");
            double p = input.nextDouble();
            System.out.print("Input q: ");
            double q = input.nextDouble();
            System.out.print("Input r: ");
            double r = input.nextDouble();

            double result = q * q - 4.0 * p * r;

            if (result > 0.0)
            {
            double a1 = (-q + Math.pow(result, 0.5)) / (2.0 * p);
            double a2 = (-q - Math.pow(result, 0.5)) / (2.0 * p);
            System.out.println("The roots are " + a1 + " and " + a2);
            } 
            else if (result == 0.0) 
            {
            double a1 = -q / (2.0 * p);
            System.out.println("The root is " + a1);
            } 
            else 
            {
                System.out.println("The equation has no real roots.");
            }
    }
}