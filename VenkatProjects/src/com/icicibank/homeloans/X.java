package com.icicibank.homeloans;

import java.util.InputMismatchException;
import java.util.Scanner;

public class X 
{
	int s;
	
	public static void main(String[] args) throws Exception
	{
		
		while(true)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter Numarator: ");
			int n=sc.nextInt();
			
			System.out.println("enter Denominator: ");
			int d=sc.nextInt();
			
			System.out.println("Enter the String :");
			String str = sc.nextLine();
			
			try
			{
				
				int result=n/d;
				System.out.println(result);
				if(str.length()<3)
				{
					throw new Exception("String should be greater than 3...");
				}
				break;
			}
			
			
			
			catch(ArithmeticException e)
			{
				//e.printStackTrace();
				//System.out.println(e);
				System.out.println("numarator should be greater than zero...");
			}
			
			catch(InputMismatchException e)
			{
				e.printStackTrace();
			} 
			catch (Exception e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
