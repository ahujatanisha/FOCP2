//author: Tanisha Ahuja
//version: 1.0.0
//Purpose:1.	Create a class Circle with instance variable radius and member functions:
//a)	area( ) b) circumference( ) c) display( ). Write a test application named CircleTest that demonstrates class Circle’s capabilities


import java.util.*;
public class CircleTest
{
	public static void main(String args[])
	{
	   Circle x = new Circle();
	   Circle y = new Circle();
	   Scanner num = new Scanner(System.in);
       System.out.println("Enter value of radius");
	   double rad = num.nextDouble();
	   x.radius= rad;
	   x.display();
	   y.display();
	}  
}
class Circle
    {
    	double radius;
    	double area()
    	{
    	return radius*radius*3.14;
        }
        double cir()
        {
        	return 2*3.14*radius;
        }
        void display()
        {
        System.out.println("Area=" + area());
        System.out.println("Circumference=" + cir());
        }
        void Circle(double radius)
        
        {
           this.radius=radius;
        }
        Circle()
        {
           this.radius= 1;
        }
    }   








