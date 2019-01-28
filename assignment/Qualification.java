import java.io.*;
import java.util.*;
class Qualification
{

    String qualName;
    String university;
    String institute;
    float cgpa;
    
    Qualification(String qualName, String  university , String institute,  float cgpa )
    {

      this.qualName= qualName;
      this. university= university;
      this.institute=institute;
      this.cgpa= cgpa;
    }

   public void setQN(String qualName) 
   {   
      this.qualName= qualName;
   }

   public String getQN()
   {
      return qualName;

   }

  public void setUni(String university) 
  {   

      this.university= university;
  }

   public String getUni()
   {
      return university;

   }

    public void setIn(String institute) 
    {   

      this.institute= institute;
    }

   public String getIn()
   {

    return institute;
   }

    public void setCgpa(float cgpa) 
    {   

      this.cgpa= cgpa;
    }

   public float getCgpa()
   {
      return cgpa;
   }

    public void displayQualification()
    {
      System.out.println("The qualification of the student is \n" + "Qualification is= " + qualName "University is =" + university +"Institute is = "+ institute+ " CGPA  =" +cgpa);

    }

}


