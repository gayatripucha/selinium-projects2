package com.icicibank.carloans;

import java.util.ArrayList;

public class BrowserLaunch 
{
	
	
	public static void main(String[] args)  
	{
		ArrayList<Object> a=new ArrayList<>();
		a.add(100);
		a.add(100);
		a.add(200);
		a.add(300);
		a.add("Ravilella");
		a.add(20.76f);
		
		System.out.println(a);
		
		Object item = a.get(4);
		if(item instanceof String)
		{
			String o1=(String)item;
			System.out.println(o1);
		}else if(item instanceof Integer)
		{
			Integer o2 = (Integer)item;
			System.out.println(o2);
		}
	}

}

