//author: Tanisha Ahuja
//version: 1.0.0

class Circle
{
    int a;
    double findArea()
    {
       double A;
       A=Math.PI*a*a;
       return A;
    }
    void displayArea(double A)
    {
    System.out.println("Area is "+A);
    }
}
class CircleDemo
{
    public static void main(String args[])
    {
       Circle c = new Circle();
       c.a=2;
       c.displayArea(c.findArea());
    }
}    