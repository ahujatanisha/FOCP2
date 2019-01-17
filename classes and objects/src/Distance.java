//author: Tanisha Ahuja
//version: 1.0.0
//Purpose:Write a program to calculate the distance between twopoints (x1, y1) and (x2, y2). All numbers and return values should be of type double. 

import java.util.*;
import java.lang.Math.*;
class Point
{
	private double x1;
	private double x2;
    Point () 
    {
	   this.x1=0;
	   this.x2=0;
     }
     Point (double x1, double x2)
    {this.x1=x1;
     this.x2=x2;
    }
    void setValue1(double x1)
     {this.x1=x1;}
    void setValue2(double x2)
    {this.x2=x2;}
    double getValue1()
    {return x1;}
    double getValue2()
    {return x2;}
    double calculateDistance(Point p2)
    {
    	double distance= Math.sqrt(Math.pow((getValue1()-p2.getValue1()),2)+Math.pow((getValue2()-p2.getValue2()),2));

    	return distance;	
}
}
 class Distance
 {
 public static void main(String args[])
     {
     double x1,x2,y1,y2;
     double dist;
     Scanner N= new Scanner(System.in);
     System.out.println("enter x1 point");
     x1=N.nextDouble();
     System.out.println("enter y1 point");
     y1=N.nextDouble();
     System.out.println("enter x2 point");
     x2=N.nextDouble();
     System.out.println("enter y2 point");
     y2=N.nextDouble();
     Point p1 = new Point();
     p1.setValue1(x1);
     p1.setValue2(x2);
     Point p2 = new Point();
     p2.setValue1(y1);
     p2.setValue1(y2);
     dist=p1.calculateDistance(p2);

 System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dist);
      } 
	}