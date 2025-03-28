package com.Exceptions;

public class myclass
{
	public static void main(String[] args) 
	{
	 System.out.println("Main Start");
	 try
	 {
		 m1();
	 }
       catch(Exception e)
	 {
    	   System.out.println(e.getMessage());
	 }
	 System.out.println("Main Ends");
	}
	public static void m1() throws ArrayIndexOutOfBoundsException
	{
		System.out.println("M1 Start");
		int a[]= {1,2,3,4,5};
		System.out.println(a[5]);
		System.out.println("M2 Ends");
}
}