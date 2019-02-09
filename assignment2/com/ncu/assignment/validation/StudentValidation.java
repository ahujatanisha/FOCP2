package com.ncu.assignment.validation;

import com.ncu.assignment.exception.*;

import com.ncu.assignment.StudentValidationMessage;

public class StudentValidation

{

	static void checkDate() throws DateFormatException

	{

       if ( (day<0 && day>31) && (month<0  && month>3) && ( year<0))

       	throw new DateFormatException(dateexception);

	}



	static void checkString() throws MandatoryMissingException

	{

		if ( firstname == null || lastname== null || eMail == null || contactNo == null)

			throw new MandatoryMissingException(mandatoryexception);

	}



	static void checkArray() throws MandatoryMissingException

	{

		if ( skills == null || qual == null)

			throw new MandatoryMissingException(mandatoryexception);

	}





}