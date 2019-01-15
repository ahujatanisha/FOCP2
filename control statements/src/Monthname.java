//author: Tanisha Ahuja
//version: 1.0.0


import java.util.Scanner;

public class Monthname
{
    public static void main(String[] args) 
    { 
      Scanner in = new Scanner(System.in);
      System.out.print("Input a number: ");
      int month = in.nextInt();

    System.out.println(getMonthName(month));
    } 
    
    public static String getMonthName(int month) 
    {
       String monthName = "";
       switch (month)
       { 

           case 1: monthName = "Jan";break;
           case 2: monthName = "Feb";break;
           case 3: monthName = "March";break;
           case 4: monthName = "April";break;
           case 5: monthName = "May";break;
           case 6: monthName = "June";break;
           case 7: monthName = "July";break;
           case 8: monthName = "August";break;
           case 9: monthName = "Sept";break;
           case 10: monthName = "Oct";break;
           case 11: monthName = "Nov";break;
           case 12: monthName = "Dec";break;
           default:monthName = "Invalid Month range";
        }
          return monthName;
      }

}

    
