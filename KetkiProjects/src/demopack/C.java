package demopack;

strictfp class D// parent class
{
	//abstract void m3();
	
	void m2()
	{
		System.out.println("Hi iam m2() method in class D");
	}
}

public class C extends D // c - is a child class
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c=new C();
		c.m3();
		c.m2();
		
	}

	@Override
	void m3() {
		// TODO Auto-generated method stub
		System.out.println("Hi aim implemented method m3() in class C");
	}

}
