package com.icicibank.personalloans;

public class Z 
{
	
	public void m3(Object o)
	{
		System.out.println("Hi iam m3 method..."    + o);
	}
	
	public Integer m3(Integer i)
	{
		System.out.println("Hi iam m3 method..."  +  i);
		return i;
	}
	
	public void  m3(String s)
	{
		System.out.println("Hi iam m3 method..."  +  s);
	}
	
	public Number m3(Number n)
	{
		System.out.println("Hi iam m3 method..."  +  n);
		return n;
	}
	

	public static void main(String[] args) 
	{
		Z z=new Z();
		z.m3(10);
		z.m3(20.39f);
		//z.m3("ravilella");
		
		//String str=new String("vmware");
		//z.m3(str);
		z.m3(new String("prolifics"));
		
	}

}
