//author: Tanisha 
//version: 1.0.0
//Purpose:Create a class called Date that includes three instance variables—a month (typeint), a day (type int) and a year (type int). Provide a method displayDate that 
//displays the month, day and year separated by forwardslashes (/). Write a test application named DateTest that demonstrates class Date’s capabilities

import java.util.*;
class Date

{

	int month,year,day;
    Date()

	{

		this.month=1;
		this.day=1;
        this.year=2000;

	}

	Date(int d, int m, int y) 

	{

		this.month=m;
		this.day=d;
        this.year=y;

	}

	void displayDate()

	{

		System.out.println("The Date is: "+this.day+"/"+this.month+"/"+this.year);

	}

}
public class DateTest

{

	public static void main(String[]args)

	{

		Scanner scan=new Scanner(System.in);
        Date d1 = new Date();
        d1.displayDate();

		Date d2;
        System.out.println("Enter the Day, Month and Year");

		int d = scan.nextInt();
        int m = scan.nextInt();
        int y = scan.nextInt();

		d2 = new Date(d,m,y);
        d2.displayDate();

	}

}

