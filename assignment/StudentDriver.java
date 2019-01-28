import java.io.*;
import java.util.*;

class StudentDriver
{
   public static void main(String[] args)
   {     
     int x, y;
     String firstName, lastName,eMail,contactNo,line1,line2, city, state,qualName , university , institute,name, role,skills ;
     int pinCode, startDate, endDate , dateofBirth ; 
     float cgpa;

     Scanner input = new Scanner(System.in);
     System.out.println("Enter no. of students whose data is to be entered" );
     x = input.nextInt();
     System.out.println("Enter the serial no."); 
     y = input.nextInt();
     System.out.println("The personal details of the student " + y+ " is:");

      Student s = new Student(firstName,lastName, eMail,contactNo,line1, line2, city, state, pinCode, qualName,university,institute,cgpa,name,role, startDate, endDate , dateofBirth);

      System.out.println("The first name is:");

      firstName = input.next();
      
      System.out.println("The last name is:"); 	
      lastName = input.next();
      s.setLN(lastName);
      System.out.println("The email is:");       	 

      eMail = input.next();
      s.setEmail(eMail);

      System.out.println("The contact no is:");
      contactNo= input.next();

       s.setContactno(contactNo);                          
       System.out.println(" The skill of the student is ");

        skills=input.next();
        s.setSkills(skills); 

       System.out.println("The project details of the student  is:");
       System.out.println("The name of the project is:");

         Project pr= new Project(name,role);
        pr.setName(name);

        System.out.println("The role of the project  is:");
        pr.setRole(role);

        System.out.println("The qualification details of the student are ");
        Qualification qual = new Qualification(qualName,institute,university,cgpa); 

        System.out.println("The qualification name of the student  is:");
        qualName = input.next();

         qual.setQN(qualName);
         System.out.println("The Institute of the student  is:");

         	institute = input.next();
          qual.setIn(institute);

         	System.out.println("The project details of the student  is:");
          university = input.next();

         	qual.setUni(university);
          System.out.println("The cgpa of the student  is:");

         	cgpa= input.nextFloat();
         qual.setCgpa(cgpa);      	 

         	System.out.println("The address of the student is  ");
          Address addr= new Address(line1,line2,city,state,pinCode);
          System.out.println("The line 1 of  address of the student is  ");

          line1 = input.next();
          addr.setL1(line1);

          System.out.println("The line 2 of  address of the student is  ");

          line2 = input.next();
          addr.setL2(line2);

          System.out.println("The city is  ");
          city = input.next();

          addr.setC(city);
          System.out.println("The state is  ");
          state = input.next();
          addr.setS(state);

          System.out.println("The pincode is  ");

              

          pinCode =input.nextInt();

         	addr.setPN(pinCode);
     }

}
