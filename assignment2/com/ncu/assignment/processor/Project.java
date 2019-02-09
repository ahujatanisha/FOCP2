package com.ncu.assignment.processor;

public class Project

{

	String name;

	Date startDate;

	Date endDate;

	String role;

	String [] responsibilities;



	void setProject(String name,String role)

	{

		this.name=name;

		this.role=role;

	}



	void setStartDate (int day,int month, int year)

	{

		startDate.setValueDate(day,month,year);	

	}



	void setEndDate (int day,int month, int year)

	{

		endDate.setValueDate(day,month,year);	

	}

}