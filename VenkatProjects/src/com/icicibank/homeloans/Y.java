package com.icicibank.homeloans;

import java.io.FileNotFoundException;

public class Y
{

	static void m1()
	{
		try {
			throw new FileNotFoundException("demo");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//CE
	}

	
	public static void main(String[] args) 
	{
		m1();
	}

}
