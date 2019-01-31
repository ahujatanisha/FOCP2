import java.io.*;
import java.util.*;

class Grades
{
	public static void main(String[] args) 
	{
	   int sno;
	   String fname;
	   float cgpa;
	   char grade;
	   File f = null;

		 try
		 {    f = new File("file.txt");
			FileWriter fout = new FileWriter(f);
                  BufferedWriter bout= new BufferedWriter(fout);
	            Scanner sc = new Scanner(System.in);

                  System.out.println("\nEnter a serial no:");
                  sno = sc.nextInt();
                  bout.write(sno);
                  bout.newLine();

                  System.out.println("\nEnter name");
                  fname = sc.next();
                  bout.write(fname);
                  bout.newLine();

                  System.out.println("\nEnter cgpa ");
                  cgpa = sc.nextFloat();
                  bout.write(Double.toString(cgpa));
                  bout.newLine();

                  System.out.println("\nEnter grade");
                  grade = sc.next().charAt(0);
                  bout.write(grade);
                  bout.newLine();

                  bout.close();

	      }
	      catch(Exception e)
	      {
	    	     e.printStackTrace();
	      }
	}
}
 	      