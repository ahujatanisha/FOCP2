import java.util.*;
import com.ncu.assignment.validation.*;
import com.ncu.assignment.processor.*;
import com.ncu.assignment.exception.*;
package com.ncu.assignment.main;

public class StudentDriver

{
public static void main(String args[])

	{

		Scanner scan = new Scanner(System.in);

		Student stud = new Student();

		StudentValidation sv = new StudentValidation();

	try

     {

		System.out.println("Enter the name of Student:");

		stud.firstName = scan.nextLine();

		stud.lastName = scan.nextLine();

		sv.checkString();


        System.out.println("Enter the address details: (Line1,Line2,City,State,PinCode)");

		System.out.print("Line1: ");

		String line1 = scan.nextLine();

		System.out.print("\nLine2: ");

		String line2 = scan.nextLine();

		System.out.print("\nCity: ");

		String city = scan.nextLine();

		System.out.print("\nState: ");

		String state = scan.nextLine();

		System.out.print("\nPinCode: ");

		int pincode = scan.nextInt();

		stud.addr.setValueAddress(line1,line2,city,state,pinCode);


        System.out.println("Enter the DOB: (date,month,year)");

		int day,month,year;

		day = scan.nextInt();

		month = scan.nextInt();

		year = scan.nextInt();

		stud.dob.setValueDate(day,month,year);

		sv.checkDate();


        System.out.println("Enter the number of skills the student possess");

		int noOfSkills = scan.nextInt();

		stud.skills = new String [noOfSkills];



		for (int i=0;i<noOfSkills;i++)

		{

			System.out.println("Enter skill no. "+(i+1));

			scan.nextLine();

			stud.skills[i]=scan.nextLine();

		}

		sv.checkArray();


        System.out.println("How many qualifications does the student have?");

		int noOfQual = scan.nextInt();

		stud.qual = new Qualification [noOfQual];

		System.out.println("Enter the data for each Qualification:");

		for (int i=0; i<noOfQual;i++)

		{

			System.out.println((i+1)+".");

			System.out.println("Name");

			scan.nextLine();

			String qualName = scan.nextLine();

			System.out.println("University");

			String university = scan.nextLine();

			System.out.println("Institute");

			String institute = scan.nextLine();

			System.out.println("CGPA");

			float cgpa = scan.nextFloat();

			stud.qual[i] = new Qualification();

			stud.qual[i].setQual(qualName,university,institute,cgpa);

		}

		sv.checkArray();


        System.out.println("How many projects does the student have done?");

		int noOfProjects = scan.nextInt();

		stud.projects = new Project[noOfProjects];

		System.out.println("Enter the data for each project: Name, StartDate, EndDate, Role, Responsibilities");

		for (int i=0;i<noOfProjects;i++)

		{

			System.out.println("Project No. "+(i+1)+".");

			scan.nextLine();

			String name = scan.nextLine();

			System.out.println("Started on");

			int day1 = scan.nextInt();

			int month1 = scan.nextInt();

			int year1 = scan.nextInt();

			System.out.println("Ended on");

			int day2 = scan.nextInt();

			int month2 = scan.nextInt();

			int year2 = scan.nextInt();

			System.out.println("Role:");

			scan.nextLine();

			String role = scan.nextLine();

			System.out.println("How many responsibilities were there for this project?");

			int noOfRespo = scan.nextInt();

			stud.projects[i] = new Project();

			stud.projects[i].responsibilities = new String[noOfRespo];



			for (int j=0;j<noOfRespo;j++)

			{

				System.out.println("Enter responsibility no. "+(j+1));

				scan.nextLine();

				stud.projects[i].responsibilities[j] = scan.nextLine();

			}

            stud.projects[i].setProject(name,role);

			stud.projects[i].startDate = new Date();

			stud.projects[i].setStartDate(day1,month1,year1);

			stud.projects[i].endDate = new Date();

			stud.projects[i].setEndDate(day2,month2,year2);

		}


        System.out.println("Enter student's email address");

		stud.eMail = scan.nextLine();

		System.out.println("Enter student's contact number");

		stud.contactNo = scan.nextLine();

		sv.checkString();

	}

		catch( Exception e)

		{

			System.out.println(e);

		}


       stud.display();

	}

}