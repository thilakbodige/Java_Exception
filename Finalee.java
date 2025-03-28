package com.Exceptions;

public class Finalee
{
	public static void main(String[] args) 
	{
		System.out.println("Main Start");
		try
		{
			System.out.println("Try Called");
			System.out.println(0/0);
		}
		finally
		{
			System.out.println("Finally called");
		}
		System.out.println("Main Ends");
		}
}
