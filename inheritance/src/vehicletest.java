
//Author:tanisha

//Version:1.0.0

//Purpose:write a program that contains base class vehicle and is inherited by derived class bike ,car. 

import java.util.*;

class vehicle

{

	void display()

	{

		System.out.println("this is vehicle");

	}

}

class Bike extends vehicle

{

	void display()

	{

		System.out.println("this is bike");

	}

}

class Car extends vehicle

{

	void display()

	{

		System.out.println("this is car");

	}

}

class vehicletest

{

  public static void main(String arg[])

  {

  	Scanner input=new Scanner(System.in);

    int a;

    System.out.print(" enter the value of a : 2 or 4 \n ");

    a=input.nextInt();

    System.out.println(a);

    switch(a)

    {

    	case 2 :

    	{

    		Bike ob=new Bike();

    		ob.display();

    	}

    	break;

    	case 4:

    	{

    		Car ob1=new Car();

    		ob1.display();

    	}

    	break;

    	default:

    	{

    		vehicle ob2=new vehicle();

    		ob2.display();

    	}



    }



  	

  }

}


