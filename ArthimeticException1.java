package com.Exceptions;
public class ArthimeticException1 
{
public static void main(String[] args)
{
		System.out.println("Main Start");
		try
		{
			System.out.println("Try Start");
			System.out.println(10/0);
			System.out.println("Try Ends");
		}
			catch(ArithmeticException a)
		{
		  System.out.println("Catch Start");
		  String s=a.getMessage();
		  System.out.println(s);
		  System.out.println("Catch Ends");
		}
		System.out.println(100/0);
		System.out.println("Main Ends");	
		}
	}

