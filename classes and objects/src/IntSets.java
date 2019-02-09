
// Author: tanisha
// Version:1.0.0
//Purpose:Create class IntegerSet. Each IntegerSet object can hold integers in the range 0–100. */


import java.util.*;
class IntegerSet

{

    private boolean[] set;
    public IntegerSet() 
    {

        this.set = new boolean[101];

        for(int x = 0; x < 101; x++)

        {

        this.set[x] = false; 
        }

    }



    public void insertElement(int y) 

    {

        this.set[y] = true;

    }

    

    public void deleteElement(int z)  

    {

        this.set[z] = false;

    }



    public static IntegerSet union(IntegerSet set1, IntegerSet set2)  

    {

        IntegerSet ans = new IntegerSet();

        for(int x= 0; x < 101; x++)

        {

            ans.set[x] = (set1.set[x] || set2.set[x]);

        }

        return ans;

    }



    public static IntegerSet intersection(IntegerSet set1, IntegerSet set2)  
    {

        IntegerSet ans = new IntegerSet();

        for(int x = 0; x < 101; x++)

        {

            ans.set[x] = (set1.set[x] && set2.set[x]);

        }

        return ans;

    }

    

    public String toString()  // method to return a String containing a set as a list of numbers separated by spaces

    {

        String ans=" ";

        boolean count = true;

        for(int x= 0; x< 101; x++)

        {

            if(this.set[x])

            {

                count = false;

                ans += x + " "; 

            }

        }

        if(count)

        {

            return ("[ --- ]");  // return value for empty set

        }

        return ("[" + ans + "]");  // return value for non-empty set

}

   

    public boolean isEqualTo(IntegerSet s) 

    {

        for(int x = 0; x < 101; x++)

        {

            if(this.set[x] != s.set[x])

            {

                return false;

            }

        }

        return true;

    }

}



public class IntSets

{

    public static void main(String[] args)

    {

        Scanner num = new Scanner(System.in);

        int n;



        IntegerSet intset1 = new IntegerSet();

        IntegerSet intset2 = new IntegerSet();



        System.out.println("Initial elements in Set1 and Set2 are:");



        System.out.println("Set1");

        System.out.println(intset1.toString());

        System.out.println("Set2"); 

        System.out.println(intset2.toString());



        System.out.println("Add elements to set1");



        n= num.nextInt();

        intset1.insertElement(n);

        n= num.nextInt();

        intset1.insertElement(n);

        n= num.nextInt();

        intset1.insertElement(n);

         n= num.nextInt();

        intset1.insertElement(n);

        n= num.nextInt();

        intset1.insertElement(n);



        System.out.println("Add elements to set2");



        n= num.nextInt();

        intset2.insertElement(n);

        n= num.nextInt();

        intset2.insertElement(n);

        n= num.nextInt();

        intset2.insertElement(n);

        n= num.nextInt();

        intset2.insertElement(n);

        n= num.nextInt();

        intset2.insertElement(n);



        System.out.println("Elements in Set1 and Set2 after adding elements:");



        System.out.println("Set1");

        System.out.println(intset1.toString());

        System.out.println("Set2");

        System.out.println(intset2.toString());



        IntegerSet union = IntegerSet.union(intset1, intset2);

        IntegerSet intersection = IntegerSet.intersection(intset1, intset2);



        System.out.println("Union");

        System.out.println(union.toString());

        System.out.println("Intersection");

        System.out.println(intersection.toString());



        System.out.println("Delete elements from set1");



        n= num.nextInt();

        intset1.deleteElement(n);

        n= num.nextInt();

        intset1.deleteElement(n);

        n= num.nextInt();

        intset1.deleteElement(n);

        n= num.nextInt();

        intset1.deleteElement(n);

        n= num.nextInt();

        intset1.deleteElement(n);



        System.out.println("Delete elements from set2");



        n= num.nextInt();

        intset2.deleteElement(n);

        n= num.nextInt();

        intset2.deleteElement(n);

        n= num.nextInt();

        intset2.deleteElement(n);

        n= num.nextInt();

        intset2.deleteElement(n);

        n= num.nextInt();

        intset2.deleteElement(n);



        System.out.println("Remaining elements in Set1 and Set2 are:");



        System.out.println("Set1");

        System.out.println(intset1.toString());

        System.out.println("Set2"); 

        System.out.println(intset2.toString());



        if(union.isEqualTo(intersection))

        {

            System.out.println("Elements of Set1 and Set2 are the same");

        }

        else

        {

            System.out.println("Elements of Set1 and Set2 are different");

        }

    }

}


