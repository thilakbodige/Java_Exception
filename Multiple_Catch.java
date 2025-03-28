package com.Exceptions;
import java.util.*;
public class Multiple_Catch 
{
public static void main(String[] args) 
{
	System.out.println("Main Start");
	Scanner sc=new Scanner(System.in);
    try
    {
    System.out.println("Enter the first Number");
    int a=sc.nextInt();
	System.out.println("Enter the Second Number");
	int b=sc.nextInt();
	System.out.println(a/b);
	int a1[]= {1,2,3,4,5};
	System.out.println("Enter the Index in Length of Element");
	int i=sc.nextInt();
	System.out.println(a1[i]);
    }
    catch(ArithmeticException a2)
    {
    	System.out.println(a2.getMessage());
	}
    catch(ArrayIndexOutOfBoundsException a3)
    {
    	System.out.println(a3.getMessage());

    }
	System.out.println("Main Ends");

	}
}
