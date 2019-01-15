//author: Tanisha Ahuja
//version: 1.0.0


import java.util.Scanner;
public class pascaltriangle
{
   public static void main(String args[])
   {
	    int p, q, r, number=1, t;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the Number of Rows - ");
		p = scan.nextInt();
		
		for(q=0;q<p;q++)
		{
			 for(r=p; r>p; r--)
			 {
				System.out.print(" ");
			 }
             number = 1;
			 for(t=0;t<=q;t++)
			 {
				 System.out.print(number+ " ");
                 number = number * (q - t) / (t + 1);
			 }
			 System.out.println();
		}
	}
}