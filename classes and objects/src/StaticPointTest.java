import java.util.*;

class StaticPoint

{

	private static float x;

	private static float y;



	StaticPoint()

	{

		this.x=0;

		this.y=0;

	}



	StaticPoint (float x,float y)

	{

		this.x=x;

		this.y=y;

	}



	public void setValueX(float x)

	{

		this.x=x;

	}

	public void setValueY(float y)

	{

		this.y=y;

	}

	public static float getValueX()

	{

		return x;

	}



	public static float getValueY()

	{

		return y;

	}



	public static float calcDistance(StaticPoint p2)

	{

		float dist = (float) Math.sqrt(Math.pow((getValueX()-p2.getValueX()),2)+Math.pow((getValueY()+p2.getValueY()),2));

		return dist;

	}

}


 


class StaticPointTest

{

	public static void main (String []args)

	{

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the value of x1: ");

		float x1 = scan.nextFloat();

		System.out.println("Enter the value of y1: ");

		float y1 = scan.nextFloat();

		System.out.println("Enter the value of x2: ");

		float x2 = scan.nextFloat();

		System.out.println("Enter the value of y2: ");

		float y2 = scan.nextFloat();

		StaticPoint p1 = new StaticPoint();

		StaticPoint p2 = new StaticPoint();

		p1.setValueX(x1);

		p1.setValueY(y1);

		p2.setValueX(x2);

		p2.setValueY(y2);

		float dist = p1.calcDistance(p2);

		System.out.println("The distance between the two points is: "+String.format("%7.2f",dist));

	}

}

