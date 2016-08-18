package com.wipro.logical;

import java.util.Scanner;

public class NumberReverse
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
	int res=0;
	int temp=num;
	while(num!=0)
	{
		res=res*10;
		res=res+num%10;
		num=num/10;
	}
	System.out.println("reversed number of "+temp+" is "+res);
	sc.close();
}
}
