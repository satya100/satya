class A
{
}
class B extends A
{
}
class C extends B
{
}
class Test
{
	public void m1(A a)
	{
		System.out.println("A a");
	}
	public void m1(B b)
	{
		System.out.println("B b");
	}
	public static void main(String [] args)
	{
		C c=new C();
		Test t=new Test();
		t.m1(c);
	}
}