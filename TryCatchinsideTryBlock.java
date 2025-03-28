package com.Exceptions;

public class TryCatchinsideTryBlock
{
	public static void main(String[] args) 
	{
     System.out.println(name());
     }
    public static int name()
    {
    	try
    	{
    		try
    		{
    			return 1;
    		}
    		catch(Exception e)
    		{
    			return 2;
    		}
    		finally
    		{
    			return 3;
    		}
    	}
    	catch(Exception e)
    	{
    		return 4;
    	}
    	finally 
    	{
    		return 5;
    	}
    }

}
