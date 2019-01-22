/* Author : Tanisha
Version : 1.0.0
Purpose : Write a Java program to read numbers in an integer array of size 5 and display the following (using functions for each functionality):
i)  its elements.
ii) Sum of all the elements
iii)    Largest number in the array
iv) Smallest number in the array
v)  Second largest number in the array
vi) Sum of alternate elements in the array
vii)    Count of even numbers in the array
viii)   Occurrence of a given number in the array and its frequency*/



import java.util.*;
class IntArray
{
   public static void main(String[] args) 
   {
     int [] arr1 = new int[5];
     int counter =0;
     Scanner scan = new Scanner(System.in); 

     System.out.println(" Enter array  :");
     for (counter=0 ; counter<5 ; counter++)
   {
     arr1[counter] = scan.nextInt();
   }

	 System.out.println(" the elements of the array are ");
     for(counter = 0; counter<5 ; counter++)
   {
     System.out.println(arr1[counter]);
   }

	 int s =0;
     for( int n : arr1)
   {
     s = s+n;
   }

     System.out.println("Sum of array elements is"+s);
     int mx;

      mx = arr1[0];
      for(counter = 0; counter < 5; counter++)
      {

        if(mx < arr1[counter])
        {
           mx = arr1[counter];
        }
      }

     System.out.println("Maximum value in the array "+mx);

      int mn;
      mn = arr1[0];
      
      for(counter = 0; counter < 5; counter++)
    {
      if(mn > arr1[counter])
    {
      mn = arr1[counter];
    }
}

    System.out.println("the Minimum value in the array "+mn);

    int largest = arr1[0];
    int secondLargest= arr1[0];

  for (counter = 0; counter< arr1.length; counter++) 
  {

     if (arr1[counter] > largest) 
     {
        secondLargest = largest;
        largest = arr1[counter];

     } 
     else if (arr1[counter] > secondLargest) 
     {
        secondLargest = arr1[counter];
     }
     }
     System.out.println("\nSecond largest number is" + secondLargest);

	   int position = 1;
       for ( counter = (position-1); counter<arr1.length; counter+=2)
       {
       s = arr1[counter] + arr1[counter+1];
       System.out.println(" the sum of alternate numbers is "+ s);
       int count =0 , i;
       System.out.print("Enter the element of which you want to count number of occurrences");
       i = scan.nextInt();
        
        for(counter = 0; counter< 5; counter++)
       {
       if(arr1[counter] == i)
       {
       count++;
       }
    }
     System.out.println("Number of Occurrence of the Elements"+count);
}

}

}


































