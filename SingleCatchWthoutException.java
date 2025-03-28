package com.Exceptions;
import java.util.*;
public class SingleCatchWthoutException
{
	public static void main(String[] args)
	{
		System.out.println("Main Start");
         Scanner sc=new Scanner(System.in);
       try
       {
    	    System.out.println("Enter the First Number");
    		int a=sc.nextInt();
    		System.out.println("Enter the Second Number");
            int b=sc.nextInt();
        	System.out.println(a/b);
        	int a1[]= {1,2,3,4,5};
        	System.out.println("Enter the Index Length of Element");
        	int i=sc.nextInt();
        	System.out.println(a1[i]);
        	//String s= null;
        	//System.out.println(s.length());
        	String t="thilak";
        	System.out.println("Enter the String Index");
             int c=sc.nextInt();
        	System.out.println(t.charAt(c));
       }  
       catch(StringIndexOutOfBoundsException|NullPointerException|ArithmeticException|ArrayIndexOutOfBoundsException a2)
       {
    	System.out.println(a2.getMessage());
       }
       
	}
	}