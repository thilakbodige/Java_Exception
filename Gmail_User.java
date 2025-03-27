package com.Exceptions;//user defined Exception
import java.util.*;
public class Gmail_User 
{
	public static void main(String[] args)
{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Gmail Id");
		String mail=sc.next();
		try 
	{
	mail_valid(mail);
	}
		catch(Exception e)
    {
	System.out.println(e.getMessage());
    }
	}
	public static void mail_valid(String mail) throws Gmail
    {
	if(mail.endsWith("@gmail.com"))
	{
		System.out.println("Gmail Accepted");
	}
	else
	{
		throw new Gmail();
	}
}

}
