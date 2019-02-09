 class Point2D

{

   private float i;

   private float j;



   public Point2D()

   {

   this.i = 0;

   this.j = 0;

   }



   public Point2D(float i,float j) 

   {

     this.i = i;

     this.j = j;

   }



   public void setI(float i)
   {

   

this.i = i;

   }



   public float getI()

   {

      return i;

   }



   public void setJ(float j)

   {

      this.j = j;

   }



   public float getJ()

   {

      return j;

   }



   public String toString()

   {

      return "(" + i + ", " + j + ")" ;

   }

}



class Point3D extends Point2D

{

  private float k;



  public Point3D() 

  {

    super();

    this.k = 0;

  }

  

  public Point3D(float i, float j, float k)

  {

    super(i, j);

    this.k = k;

  }



  public void setK(float k)

   {

      this.k = k;

   }



   public float getK()

   {

      return k;

   }



   public String toString()

   {

      return "(" + super.getI() + ", " + super.getJ() + ", " + k + ")" ;

   }

}



class PointTest

{

  public static void main(String[] args) 

  {

    Point2D pt2a = new Point2D(1,1);



    System.out.println("Value of 2D point a");      

    System.out.println(pt2a.toString());



    Point2D pt2b = new Point2D();

    System.out.println("Value of 2D point b");      

    System.out.println(pt2b.toString());



    pt2b.setI(3);

    pt2b.setJ(4);



    System.out.println("New value of 2D point b");

    System.out.println("x = " + pt2b.getI());

    System.out.println("y = " + pt2b.getJ());



    Point3D pt3a = new Point3D();

    System.out.println("Value of 3D point a");

    System.out.println(pt3a.toString());



    Point3D pt3b = new Point3D(1,2,3);

    System.out.println("Value of 2D point b");

    System.out.println(pt3b.toString());

    

    pt3b.setI(2);

    pt3b.setJ(4);

    pt3b.setK(6);



    System.out.println("New value of 3D point b");

    System.out.println("x = " + pt3b.getI());

    System.out.println("y = " + pt3b.getJ());

    System.out.println("z = " + pt3b.getK());



   }

}