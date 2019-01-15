class Circle
{
   int r;
   double findArea()
   {
      double ar;
      ar=Math.PI*r*r;
      return ar;
    }
    void displayArea(double ar)
    {
       System.out.println("Area is "+ar);
    }
}
class CircleDemo
{
    public static void main(String args[])
    {
       Circle c1 = new Circle();
       c1.r=2;
       c1.displayArea(c1.findArea());
    }
}    