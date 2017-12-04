package com.icicibank.carloans;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Caliculation 
{


	public static void main(String[] args) throws Exception
	{
		int n,d,result;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		
			System.out.println("Enter Numarator value : ");
			n=sc.nextInt();
			
			System.out.println("Enter Denominator value :");
			d=sc.nextInt();
				result=n/d;
				System.out.println(result);
				break;
		}
	}
}
