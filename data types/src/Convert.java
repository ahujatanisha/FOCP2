//author: Tanisha Ahuja
//version: 1.0.0


class Convert
{
   public static void main(String[] args)
   {
     double min=345566788;
     double minutesinyear = 60*24*365;
     long years = (long) (min/minutesinyear);
     int days=(int) (min/60/24)%365;

     System.out.println((int)min+"minutes is approximately"+years+"years and"+days+"days");
    }
}    