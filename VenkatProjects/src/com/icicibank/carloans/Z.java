package com.icicibank.carloans;

public class Z  implements Interf
{
	
	public void m3()
	{
		System.out.println("Hi iam overridden  m3 method....");
	}
	
	public void m5()
	{
		System.out.println("Hi iam m5 method....");
	}

	public static void main(String[] args) 
	{
		Z z=new Z();
		z.m3();
		z.m4();
		z.m5();
		z.m6();
		
		Interf s=new Z();
		s.m4();
		s.m6();
		
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("hi iam implemented m4 method");
		
	}

	@Override
	public void m6() {
		// TODO Auto-generated method stub
		System.out.println("hi iam implemented m6 method");
		
	}

}
