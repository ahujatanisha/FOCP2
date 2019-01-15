import java.util.*;
public class CircleTest
{
	public static void main(String args[])
	{
	   Circle c1 = new Circle();
	   Circle c2 = new Circle();
	   Scanner num = new Scanner(System.in);
	   double rad = num.nextDouble();
	   c1.radius= rad;
	   c1.display();
	   c2.display();
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








