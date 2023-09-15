class A
{
	public Object m1()
	{
		int z=10;
		System.out.println("hey");
		return 10;
	}
}
class B extends A
{
	public String m1()
	{
		System.out.println("hello");
		return null;
	}
}
class Test3
{
	public static void main(String [] args)
	{
		A a=new A();
		a.m1();
		//int Z=a.m1();
		B b=new B();
		b.m1();
		A a1=new B();
		a1.m1();
		//System.out.println(Z);
	}
}
