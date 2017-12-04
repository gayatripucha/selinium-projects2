package com.icicibank.carloans;

public class KOTAKBank extends HDFCBank implements RBI
{
	static RBI r;
	
	public static void main(String[] args) 
	{
				
		r=new KOTAKBank();
		r.withDrawal();
		
		r=new HDFCBank();
		r.withDrawal();
		
		r=new ICICIBank();
		r.withDrawal();
	}
	
	void m3()
	{
		System.out.println("m3");
	}

	@Override
	public void withDrawal() 
	{
		System.out.println("Hi iam withDrawal method implemented in KotakBank");
		
	}

	
}
