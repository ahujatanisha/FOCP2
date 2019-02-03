/* Author: tanisha
Version: 1.0.0
Purpose: to create a class stack that maintains a stack of integers */



import java.util.*;
class Stack{



        int[] arr= new int[10]; 

        int i; 

        Scanner scan = new Scanner(System.in);

    

        void push(){  

                System.out.println("Enter an array of 10 digits :");

                for ( i=0 ;i<10 ;i++)

                {

                        arr[i] = scan.nextInt();

                }



        }



        void pop(){  

                System.out.println("Enter the element you want to delete:");

       int  del = scan.nextInt();

        for ( i = 0; i < 10; i++) 

        {

            if(arr[i] == del)

            {

               

        for( i = i+1; i < 10; i++)

            {

                arr[i-1] = arr[i];

            }

            System.out.println("After Deleting:");

            for ( i = 0; i < 8; i++) 

            {

                System.out.println(arr[i]+",");

            }

        }

        }

}



    void isEmpty(){  

        if ( arr.length > 0)

                System.out.println("the array is not empty ");

        else

                        System.out.println(" the array is empty");

        }



    

    void isFull(){ 

        if( arr.length == 10)

                System.out.println(" The array is full");

        else

                System.out.println("The array is not full");

     }

    

    void spaceLeft(){ 

        

                if( arr.length < 10)

                        System.out.println("The array still has some space left");

                else

                        System.out.println("The array is full without any spaces left");

        

    }

        



}


class StackTest{

	public static void main(String[] args) {

		int option;

		Scanner input = new Scanner(System.in);

		Stack st = new Stack(); 



		st.push();  
        st.pop(); 

		System.out.println(" Menu :");

		System.out.println("  1 for checking whether empty \n 2 for checking whether full \n 3 for checking for any emptyspace  ");

        

        option = input.nextInt(); 

        switch(option)

        {

        	 

        	

        	case 1: st.isEmpty(); 

        	

        	case 2: st.isFull();

        	

        	case 3 : st.spaceLeft();

        	

        	default: System.out.println("invalid input");

        }

	}

}
