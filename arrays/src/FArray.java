// author:tanisha
//version : 1.0.0
//Purpose: To get an array input with elements maximum upto 2 digits and get the odd elements multiplied by 2

import java.util.*;
public class FArray

{
   public static void main (String[]args)
   {
   Scanner scan = new Scanner(System.in);
   System.out.println("enter the 2-D array (4x4) so that each element is of two digits");
   int arr [][]=new int[4][4];

	  for (int a=0;a<4;a++)
      {
      for (int b=0; b<4;b++)
      {
        arr[a][b] = scan.nextInt();
    while(true)
      {

		if (arr[a][b]>9 && arr[a][b]<100)
break;
        else
      {

	System.out.println("Re enter the element (TWO DIGIT)");

	   arr[a][b] = scan.nextInt();
       }
    }
}
    }
    System.out.println("The entered 2-D array in matrix form is");
    for (int a=0;a<4;a++)
      {
    for (int b=0; b<4;b++)
    {
    System.out.print(arr[a][b]+"\t");
    }
    System.out.println("");
    }

    for (int a=0;a<4;a++)
    {
     for (int b=0;b<4;b++)
    {

		if (arr[a][b]%2==1)
        arr[a][b]*=2;
   else
   continue;
     }
     }
     System.out.println("Array after being operated is:");
     for (int a=0;a<4;a++)
     {
     for (int b=0; b<4;b++)
     {
     System.out.print(arr[a][b]+"\t");
     }
     System.out.println("");
     }
}
}


