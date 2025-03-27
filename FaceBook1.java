package com.Exceptions;

import java.util.Scanner;

public class FaceBook1 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter the age");
    int age=sc.nextInt(); 
    try
    { 
    age_valid(age);
    }
    catch(Exception e)
    		{
    			System.out.println("Age Should be above 18 Years");
    		}
	}
    public static void age_valid(int age) throws ArithmeticException
    {
    	if(age<18)
    	{
    		
    			throw new ArithmeticException();
    		
    	}
    	else
    	{
    		System.out.println("Age Accepted");
    	}
    }
}
