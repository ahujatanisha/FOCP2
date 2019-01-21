//Author : tanisha
//Version : 1.0.0
//Purpose : to get an input of two sorted arrays from the user of varrying lenghts and merge their elements in a single array and display the sorted final array

import java.util.*;
class SortedArray
{
    public static void main(String[] args) 
    {
      int[] arr1 = new int[4]; 
      int[] arr2 = new int[6];  
      int[] arr3 = new int[arr1.length+arr2.length];
 
    Scanner input =new Scanner(System.in);

      int a=0;

    System.out.println("Enter a sorted array of 4 elements  :");

    for( a= 0 ; a<4 ; a ++)
    {
    arr1[a] = input.nextInt();
    }
    System.out.println(" the following elements were entered in the array :");
    for( a = 0 ; a<4 ; a++)
    {
    System.out.println(arr1[a]);
    }

   System.out.println("Enter a sorted array of 6 elements  :");
   for( a= 0 ; a<6 ; a++)
  {
    arr2[a] = input.nextInt();
}
    System.out.println(" the following elements were entered in the array :");

		for( a= 0 ; a<6 ; a++)

		  {System.out.println(arr2[a]);}

        int x=0 , y=0 , z=0;
        while( x<arr1.length && y<arr2.length)
        {

     if( arr1[x]<arr2[y])

        {
        arr3[z] = arr1[x];
        x++;
        }
        else
      {
      arr3[z] = arr2[y];
      y++;
 }
      z++;
 if ( x< arr1.length)
 {
System.arraycopy(arr1,x,arr3,z,(arr1.length - x));
}

  if ( y< arr2.length){

    System.arraycopy(arr2,y,arr3,z, (arr2.length-y));
    }

  System.out.println("merge Sorted array : " + Arrays.toString(arr3));
}
}
}

