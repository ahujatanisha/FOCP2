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
	   double radius = num.nextDouble();
	   x.frad= radius;
	   x.display();
	   y.display();
	}  
}
class Circle
    {
    	double frad;
    	double far()
    	{
    	return frad*frad*3.14;
        }
        double cir()
        {
        	return 2*3.14*frad;
        }
        void display()
        {
        System.out.println("Area=" + far());
        System.out.println("Circumference=" + cir());
        }
        void Circle(double frad)
        
        {
           this.frad=frad;
        }
        Circle()
        {
           this.frad= 1;
        }
    }   








