package com.icicibank.carloans;

public class ICICIBank implements RBI
{

	public static void main(String[] args) 
	{
		ICICIBank i=new ICICIBank();
		i.m1();
		i.withDrawal();

	}
	
	void m1()
	{
		System.out.println("m1");
	}

	@Override
	public void withDrawal() 
	{
		System.out.println("Hi iam withDrawal method implemented in ICICIBank");
		
	}

	

	
}
