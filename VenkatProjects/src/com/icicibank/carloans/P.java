package com.icicibank.carloans;

public class P extends Z 
{
	int i=100;
	
	public void m6()
	{
		System.out.println("Hi iam m6 method....");
		System.out.println(i);
		m7();
	}
	
	public void m7()
	{
		System.out.println("Hi iam m7 method....");
		
	}
	
	public static void main(String[] args)
	{
		P p=new P();
		p.m6();
	

	}

}
