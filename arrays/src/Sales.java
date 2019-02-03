
//Author : tanisha
//Version : 1.0.0
//Purpose : to get an output in the tabular format indicating the sales of a product and the salesman

import java.util.*;
public class Sales

  {
      Scanner scan = new Scanner(System.in);
      public static void main(String[]args)
      {

        float sales[][] = new float [5][4];
        Sales sale = new Sales();	
        sale.getSales(sales);
        System.out.print("\t\t\tSP1\t\tSP2\t\tSP3\t\tSP4\t\tTotal\n\n");

        sale.printSales(sales);
  }

     void getSales(float sales[][])
  {
      int salesPerson;
      int product;
      float value;
      System.out.println("Enter the salesperson, product, and total sales:");

    for (int x=0;x<4;x++)
    {
      System.out.print("SalesPerson: ");
      salesPerson = scan.nextInt();
      System.out.println();
      System.out.print("Product: ");

      product = scan.nextInt();

      System.out.println();

      System.out.print("Sales: ");

		  value = scan.nextFloat();

		  System.out.println("\n");

      sales[product - 1][salesPerson - 1] += value;
    }
  }
  
	 void printSales(float sales[][])
  {

    for (int x=0; x<5;x++)
    {

     System.out.print("Product "+(x+1)+"\t\t");
     System.out.print(sales[x][0]+"\t\t"+sales[x][1]+"\t\t"+sales[x][2]+"\t\t"+sales[x][3]+"\t\t");
     System.out.println((sales[x][0]+sales[x][1]+sales[x][2]+sales[x][3]));
    }
     System.out.print("\nTotal\t\t\t");
    for (int y=0;y<4;y++)
   {
     System.out.print((sales[0][y]+sales[1][y]+sales[2][y]+sales[3][y]+sales[4][y])+"\t\t");
    }
   	System.out.println("");
  }
}

