//author: Tanisha Ahuja
//version: 1.0.0
//purpose:1.	Write a program that takes two integers (values to be given within the program) 
//and displays the output of the following operators: addition, subtraction, multiplication, division and modulus. 

public class arithmetic
{
 
    public static void main(String args[])
    {
        int num1 = 24;
        int num2 = 13;
 
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quot = num1 / num2;
        int rem = num1 % num2;
 
        
        System.out.println("num1 : "+num1);
        System.out.println("num2 : "+num2);
        System.out.println("sum : "+sum);
        System.out.println("difference : "+difference);
        System.out.println("product : "+product);
        System.out.println("quot : "+quot);
        System.out.println("rem : "+rem);
    }
}
