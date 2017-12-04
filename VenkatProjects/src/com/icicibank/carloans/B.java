package com.icicibank.carloans;

class B
{
	int a,b,result;
	
	public B(int a, int b) 
	{
		this.a=a;
		this.b=b;
	}
	
	public void add()
	{
		result=a+b;
		System.out.println("Addition result is :" + result);
	}
	
	public void sub()
	{
		result=a-b;
		System.out.println("Sub result is :" + result);
	}

	public static void main(String args[])
	{
		B x=new B(100,50);
		x.add();
		x.sub();
	}
	
}


