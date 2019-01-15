//author: Tanisha Ahuja
//version: 1.0.0
//Purpose:4.Compute the sum of the series: 1+x+x2 /2!+x3/3!+……



import java.util.Scanner;
class fseries
{
    public static int facto(int input)
    {
      int p = 1, k;
      for(k = 1; k <= input; k ++)
      {
            p = p*k;
      }
        return p;
    }
    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
       int k , n, x;
       double frac, sum=1;
       System.out.println("Enter the number of terms");
       n = in.nextInt();
       System.out.println("Enter the numerator");
        
       x = in.nextInt();
       for(k = 1; k <= n; k ++)
       {
            frac = Math.pow(x, k)/facto(k);
            sum = sum + frac;
        }
        System.out.println("The sum of the given series is "+sum);
    }
}