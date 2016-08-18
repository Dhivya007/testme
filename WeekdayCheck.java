package com.wipro.logical;

import java.util.Scanner;

public class WeekdayCheck
{
public static void main(String[] args) 
{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the day");
		String s=sc.nextLine();
		String str1=new String("monday");
		String str2=new String("tuesday");
		String str3=new String("wednesday");
		String str4=new String("thursday");
		String str5=new String("friday");
		String str6=new String("satarday");
		if((s.equals(str1))||(s.equals(str2))||(s.equals(str3))||(s.equals(str4))||(s.equals(str5))||(s.equals(str6)))
		{
		System.out.println("True");
		}
		else
		{
		System.out.println("False");
		}
		sc.close();
}
}
