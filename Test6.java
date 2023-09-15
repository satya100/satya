class A
{
	public void m1(int x)
	{
		System.out.println("hey");
	}
}
class B extends A
{
	public void m1(int x)
	{
		System.out.println("hello");
	}
}
class Test6
{
	public static void main(String [] args)
	{
		A a=new A();
		a.m1(10);
		B b=new B();
		b.m1(100);
		A a1=new B();
		a1.m1(1000);
	}
}