class Student

{
   String firstName;
   String lastName;
   String Address;
   Address addr = new Address();
   Date dob = new Date();
   String [] skills;
   Qualification qual[];
   Project projects[];
   String eMail;
   String contactNo;

   void display()
   {
      System.out.println("Name of the Student is "+firstName+" "+lastName);
      System.out.println("Address is "+addr.line1+", "+addr.line2+", "+addr.city+", "+addr.state+"-"+addr.pinCode);
      System.out.println("DOB: "+dob.day+"/"+dob.month+"/"+dob.year);		

      System.out.println("Skills");
      
      for (int a=0;a<skills.length;a++)
      {
          System.out.println((a+1)+". "+skills[a]);
      }

      System.out.println("Qualifications: ");

      for (int a=0;a<qual.length;a++)
      {
      System.out.println((a+1)+". "+qual[a].qualName+"- From "+qual[a].institute+" under "+qual[a].university+" with "+qual[a].cgpa+" cgpa");
      }

      System.out.println("Projects:");
      for (int a=0;a<projects.length;a++)
      {

		System.out.println((a+1)+". "+projects[a].name);
        System.out.println("Started on: "+projects[a].startDate.day+"/"+projects[a].startDate.month+"/"+projects[a].startDate.year);
        System.out.println("Ended on: "+projects[a].endDate.day+"/"+projects[a].endDate.month+"/"+projects[a].endDate.year);
        System.out.println("Role: "+projects[i].role);
        System.out.print("Responsibilities");

		for (int b=0;b<projects[a].responsibilities.length;b++)
        {
        System.out.print(projects[a].responsibilities[b]+"\t");

		}

		System.out.println();

		}
        System.out.println("E-Mail Address: "+eMail);
        System.out.println("Contact Number: "+contactNo);

}

}

  
