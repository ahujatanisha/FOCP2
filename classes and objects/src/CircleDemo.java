//author: Tanisha Ahuja
//version: 1.0.0

class Circle
{
    private int a=2;
    public double findArea()
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
       
       c.displayArea(c.findArea());
    }
}    