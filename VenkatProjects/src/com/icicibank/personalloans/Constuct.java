package com.icicibank.personalloans;

import java.util.Scanner;

public class Constuct 
{
	
	static void m1() 
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter N value: ");
		int n=sc.nextInt();
		
		System.out.print("Enter d value: ");
		int d=sc.nextInt();
		
		int q;
		String s=null;
		
		try
		{
			
			q=n/d;
			System.out.println(q);
			System.out.println(s.length());
		}
		
	
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
	}
	
	
	public static void main(String[] args) 
	{
		Constuct.m1();
	}

}
