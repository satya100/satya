class A 
{
	public int m1()
	{
		System.out.println("satya");
		return 10;
	}
}
class B extends A
{
	public int m1()
	{
		System.out.println("ojha");
		return 200;
	}
	public static void main(String [] args)
	{
		A a=new A();
		System.out.println(a.m1());
		B b=new B();
		System.out.println(b.m1());
		A a1=new B();
		System.out.println(a1.m1());
	}
}
