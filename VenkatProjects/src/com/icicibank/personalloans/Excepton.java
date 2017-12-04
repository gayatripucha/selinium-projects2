package com.icicibank.personalloans;

import java.util.Scanner;

public class Excepton 
{
	
	public static void main(String[] args) 
	{
		while(true)
		{
			 Scanner sc = new Scanner(System.in);
			 System.out.println("Enter Numarator : ");
			 int n = sc.nextInt();
			
			 System.out.println("Enter Denominator :");
			 int d = sc.nextInt();
			 
			try
			{
				int result=n/d;
				System.out.println(result);
				break;
			}
			
			
			
			catch(NullPointerException e)
			{
				e.printStackTrace();
			}
			
			catch(ArithmeticException e)
			{
				//e.printStackTrace();
				//System.out.println(e);
				System.out.println("denominator should be greater than zero..");
			}
			
			catch(Exception e)
			{
				//e.printStackTrace();
				//System.out.println(e);
				System.out.println("denominator should be greater than zero..");
			}	
			
			
		}

	}

}
