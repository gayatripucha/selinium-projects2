package com.icicibank.carloans;

public class HDFCBank extends ICICIBank implements RBI 
{

	public static void main(String[] args) 
	{
		HDFCBank h=new HDFCBank();
		h.m2();
		h.withDrawal();
	}
	
	void m2()
	{
		System.out.println("m2");
	}

	@Override
	public void withDrawal() 
	{
		System.out.println("Hi iam withDrawal method implemented in HDFCBank");
		
	}

	
}
