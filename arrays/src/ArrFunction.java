// author : Tanisha
//Version : 1.0.0
//Purpose : to find a particular element in an array and display the elements of the array using functions

import java.util.Scanner;
class ArrFunction

{
   int selement;
   int flag= -1;
   int counter =0;
   
   Scanner scan = new Scanner(System.in);

   int elements[] = new int[10];

   void Inputelements()
   {

   System.out.println(" enter any 10 elements of the array :");
   for( counter = 0 ; counter<10 ; counter ++)
   {
        elements[counter] = scan.nextInt();

   }
}

    void Getelement()
{

    System.out.println(" Enter the number to be searched :");
    selement = scan.nextInt();
}

void Displayelement()
{
    System.out.println(" the following elements were entered in the array :");
    for( counter = 0 ; counter<10 ; counter ++)
    {
        System.out.println(elements[counter]);
    }
    }
 void Searchelement()
{

    for( counter = 0 ; counter<10 ; counter ++)
    {
    
    if(elements[counter] == selement)

    {
    flag=1;

break;
    }
    else
    {
    flag=-1;
    }

	}
    if (flag == 1)
    System.out.println(" element "+elements[counter]+" found at position "+counter);
    else
    System.out.println(" element"+ elements[counter]+"not found "+flag);
    }


    public static void main(String[] args) 
    { 

       ArrFunction input = new ArrFunction();

       input.Inputelements();

       input.Getelement();

       input.Displayelement();

       input.Searchelement();
    }
}


	

