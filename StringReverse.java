package com.wipro.logical;
import java.util.Scanner;
public class StringReverse 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string to reverse");
		String str=sc.nextLine();
		StringBuffer stb=new StringBuffer(str);
		String res=stb.reverse().toString();
		System.out.println("reversed string:  "+res);
	}

}
