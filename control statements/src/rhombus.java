//author: Tanisha Ahuja
//version: 1.0.0
//Purpose: Write a Java program to display the following character rhombus structure.  
import java.util.Scanner;

public class rhombus
  {
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input the number: ");
    int p = sc.nextInt();
    int count = 1;
    int count2 = 1;
    char c = 'A';

    for (int i = 1; i < (p * 2); i++) 
    {
      for (int spc = p - count2; spc > 0; spc--)   
      {
            System.out.print(" ");
      }
        if (i < p) 
            {
            count2++;
            } 
            else 
            {
                count2--;
            }
            for (int j = 0; j < count; j++) 
            {
                System.out.print(c);
                if (j < count / 2) 
                {
                    c++;
                } else 
                {
                    c--;
                }
            }
            if (i < p)
            {
                count = count + 2;
            } 
            else
            {
                count = count - 2;
            }
            c = 'A';

            System.out.println();
        }
    }
}