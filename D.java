class A
{
	public void m1()
	{
		System.out.println("m1");
	}
}
class B extends A
{
	public void m2()
	{
		System.out.println("m2");
	}
}
class C extends B
{
	public void m3()
	{
		System.out.println("m3");
	}
}
class D
{
	public static void main(String [] args)
	{
		C c1=new C();
		c1.m1();
	}
}
