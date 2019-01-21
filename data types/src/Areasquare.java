class Areasquare
{
public static void main(String args[])

    {
       System.out.println("Enter Side of Square:");
      
       Scanner scanner = new Scanner(System.in);
       
      int side = scanner.nextInt();
      
       int area = side*side; 
       System.out.println("Area of Square is: "+area);
   }
}

