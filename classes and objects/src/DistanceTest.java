
import java.util.*;



class Distance{

	float feet;

	float inch;



	Distance(){

		this.feet=0;

		this.inch=0;



	}

	Distance(float feet , float inch){

		this.feet=feet;

		this.inch=inch;

	}



	void setvaluefeet(float feet){

		this.feet = feet;

	}

	void setvalueinch(float inch){

		this.inch = inch;

	}

	 float getvaluefeet(){

	 	return feet;

	 }

	 float getvalueinch(){

	 	return inch;

    }

	

	void sum(Distance d1 , Distance d2){

		float sfeet = d1.feet + d2.feet;

		float sinch = d1.inch + d2.inch + (inch/12);

	

		System.out.println("sum of distances is " + sfeet + "feet"+ sinch + "inches");

	}	

}



class DistanceTest{

	public static void main(String[] args) {



		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the value of feet1: ");

		float feet1 = scan.nextFloat();

		System.out.println("Enter the value of inch1: ");

		float inch1 = scan.nextFloat();

		System.out.println("Enter the value of feet2: ");

		float feet2 = scan.nextFloat();

		System.out.println("Enter the value of inch2: ");

		float inch2 = scan.nextFloat();

		

		Distance d1 = new Distance(feet1,inch1);

		Distance d2 = new Distance(feet2 , inch2);

		Distance d =new Distance();

        d.sum(d1,d2);

		

		


	}

}