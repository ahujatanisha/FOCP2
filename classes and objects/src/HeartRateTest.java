
import java.util.*;



     class HeartRates {

 

    String firstName, lastName;

    BirthDate dob ;

    int day;

    int month;

    int year;


     HeartRates(String fName, String lName,int month, int day, int year ) {

 

        firstName = fName;

        lastName = lName;

        dob = new BirthDate( day , month, year);

        

    }

     void setFirstName(String fName) {

        firstName = fName;

    }

    //Get First Name. 

    String getFirstName() {

        return firstName;

    }

 

    //Set Last Name.

     void setLastName(String lName) {

        lastName = lName;

        }

 

    //Get Last Name.

 

     String getlastName() {

        return lastName;

    }

    

 //Get Month, Day and Year

     void getBirthDate() {

        System.out.println(day+"/"+month+"/"+year);

    }



     int getAge(){

        return (year +((month *30)+day)/365);

        }

 

     int maximumHeartRate() {

        return (220 - getAge());

    }

 

    //displays the target heart rate range

     void targetHeartRate(){

    System.out.println("Target Heart Rate Range: "+ maximumHeartRate() * 0.5 + " to "+ maximumHeartRate() * 0.85);

    }

}


class HeartRateTest{



 public static void main(String[] args) {

     

        Scanner input = new Scanner(System.in); // we make input object for Scanner class

        HeartRates[] hr = new HeartRates[2];  // an array of class is defined and initialised



        for ( int i=0 ; i <2 ; i++){

        System.out.println("Enter First Name: ");

        String firstName = input.nextLine();

        System.out.println("Enter Last Name: ");

        String lastName = input.nextLine();

        System.out.println("Enter BirthDate: ");

         int day=input.nextInt();

         int month=input.nextInt();

         int year=input.nextInt();

 

        HeartRates hr1 = new HeartRates(firstName, lastName,day,month,year); // another object of the class is defined to call the functions

        System.out.println("Name: "+ firstName +", " + lastName);

        System.out.println("Age in years: "+hr1.getAge());

        System.out.println("Maximum Heartrate: "+ hr1.maximumHeartRate());

        hr1.getBirthDate();   // the methods are called using the object

        hr1.targetHeartRate();

    }

 

    }

}



class BirthDate{  // another class defined to calculate birth date of the user



int year;

int month;

int day;



	BirthDate( int  year , int month , int day){  // parametarised constructor

		this.year=year;

		this.month=month;

		this.day=day;

	}



	

}


