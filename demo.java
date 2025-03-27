package com.Exceptions;
import java.util.*;
public class demo
{
	public static void main(String[] args)
	{
		System.out.println("Main Start");
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Number to divided with 10");
		int s=sc.nextInt();
		System.out.println("Try Start");
    
    try
    {
    	System.out.println("Try Start");
    	System.out.println(10/5);
    	System.out.println("Try Ends");
    }
	catch(ArithmeticException a1)
    {
		System.out.println("Catch Starts");
		System.out.println("Exception has handled bcz of zero");
		System.out.println("Catch Ends");
    }
    System.out.println("Main Ends");
	}

}
