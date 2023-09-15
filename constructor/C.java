class A
{
	public void m1()
	{
		System.out.println("A");
	}
}
class B extends A
{
	public void m2()
	{
		System.out.println("B")
	}
}
class C extends B
{
	public void m3()
	{
		System.out.println("C");
	}
	public static void main(String[] args) 
	{
		C c=new C();

	}
}
