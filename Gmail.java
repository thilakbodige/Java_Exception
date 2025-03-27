package com.Exceptions;//user defined exception

public class Gmail extends Exception
{
	@Override
	
	public String getMessage()
	{
		return "Invalid Gmail Id";
	}
}

