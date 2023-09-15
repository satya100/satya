interface I1
{
	void m1();
}
interface I2
{
	void m1(int x);
}
class A
{
	public void m1()
	{
		System.out.println("hi");
	}
	public void m1(int x)
	{
		System.out.println("hope");
	}
	public static void main(String[] args) 
	{
		A a=new A();
		a.m1();
		a.m1(10);
	}
}
