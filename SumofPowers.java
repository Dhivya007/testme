package myproject;

import java.util.Scanner;

public class SumofPowers {
	public int value(int num)
	{
		int num1=0;
	    int len=Integer.toString(num).length()-1;
		while(len>=0)
		{
			  num1+= Math.pow(num%10, len);
			  num=num/10;
			len--;
		}
		return num1;
	}
public static void main(String[] args) {
 
	SumofPowers sp=new SumofPowers();	
	System.out.println(sp.value(124));
	
}
}

