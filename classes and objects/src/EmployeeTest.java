/*author: Tanisha 
version: 1.0.0
Purpose:Create a class called Employee that includes three instance variables—a first name (type String), a last name (type String) and a monthly salary (double). Provide a constructor that initializes the three instance variables. If the monthly salary is not positive, ask the user to re-enter a positive value. Write a test application named EmployeeTest that demonstrates class Employee’s capabilities. Create two Employee objects and display each object’s yearly salary. Then give each Employee a 10% raise and display each Employee’s yearly salary again.*/ 

import java.util.*;
class Employee

 {

    private String firstName; 
    private String lastName; 
    private double monthlySalary;

    Employee()

    {

        this.firstName="ram";
        this.lastName="sharma";
        this.monthlySalary=30000;

    }

    Employee(String name, String name2, double salary)

     {

        firstName = name;
        lastName = name2;
        monthlySalary = salary;

    }

    public void setFirstName(String name)

     {

        firstName = name;

    }
    public String getFirstName() 

    {

        return firstName;

    }

     public void setLastName(String name) 

    {

        lastName = name;

    }

    public String getLastName() 

    {

        return lastName;

    }

    public void setmonthlySalary(double salary) 

    {

        monthlySalary = salary;

    }

 
    public double getmonthlySalary() 

    {

        return monthlySalary;

    }

 

    public double yearlySalary()

     {

        double yearlySalary;
        yearlySalary = (monthlySalary * 12);
        return yearlySalary;

    }

    public double yearlySalaryIncrease() 

    {

        double yearlySalaryIncrease;
        yearlySalaryIncrease = (((yearlySalary() * (0.1)) + yearlySalary()));
        return yearlySalaryIncrease;

    }

     public void displayYearlySalary() 

    {

        System.out.printf("%s %s's Yearly Salary is $%.2f\n", firstName, lastName,yearlySalary());

    }

    public void displayYearlySalaryIncrease()

     {

        System.out.printf("%s %s = $%.2f\n", firstName, lastName, yearlySalaryIncrease());

    }
    }

public class EmployeeTest

 {

    public static void main(String[] args) 

    {

        Employee empl1 = new Employee("first", "last", 0.0);
        Employee empl2 = new Employee("first", "last", 0.0);

        Scanner input = new Scanner(System.in);

        String firstName;
        String lastName;

        double monthlySalary;
        System.out.println("Enter details of employee1:\n");
        System.out.print("Enter First Name: ");
        firstName = input.next();

        empl1.setFirstName(firstName);
        empl1.getFirstName();
        System.out.print("Enter Last Name: ");
        lastName = input.next();
        empl1.setLastName(lastName);
        empl1.getLastName();

        System.out.print("Enter Monthly Salary: ");
        monthlySalary = input.nextDouble();


         if (monthlySalary > 0) 
        empl1.setmonthlySalary(monthlySalary);
         empl1.getmonthlySalary();

        System.out.println();
        System.out.println("Enter details of employee2:\n");
        System.out.print("Enter First Name: ");
        firstName = input.next();



        empl2.setFirstName(firstName);
        empl2.getFirstName();
        System.out.print("Enter Last Name: ");
        lastName = input.next();
        empl2.setLastName(lastName);
        empl2.getLastName();
        System.out.print("Enter Monthly Salary: ");
        monthlySalary = input.nextDouble();

        if (monthlySalary > 0)
        empl2.setmonthlySalary(monthlySalary);
         empl2.getmonthlySalary();
         System.out.println();
         empl1.yearlySalary();
         empl2.yearlySalary();
         empl1.displayYearlySalary();

 

        System.out.println();
        empl2.displayYearlySalary();
          System.out.println();
          empl1.yearlySalaryIncrease();
        empl2.yearlySalaryIncrease();

 

        System.out.printf("Congratulations to %s %s and %s %s. You just earned" + " for yourselves a 10%c increase in your yearly salaries. "

                + "\nYour new yearly salaries are:\n\n", empl1.getFirstName(),empl1.getLastName(), empl2.getFirstName(), empl2.getLastName(), '%');

          empl1.displayYearlySalaryIncrease();
          System.out.println();
          empl2.displayYearlySalaryIncrease();
     }

}






