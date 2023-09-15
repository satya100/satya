class A 
{
	public static void m1()
	{
		Classwork a1=new Classwork();
		a1.m3();
		System.out.println("satya");
	}
	public static void m2()
	{
		Classwork a1=new Classwork();
		a1.m4();
		System.out.println("ojha");
	}
}
class Classwork
{
	public void m3()
	{
		System.out.println("m3");
		//A.m1();
	}
	public void m4()
	{
		System.out.println("m4");
		//A.m2();	
	}
	public static void main(String []args)
	{
		Classwork a=new Classwork();
		//a.m3();
		//a.m4();
		A.m1();
		A.m2();
	}
}