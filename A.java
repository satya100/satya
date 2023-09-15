class A
{
	public void m1(int x,float f)
	{
		System.out.println("int float");
	}
	public void m1(double d,float f)
	{
		System.out.println("double float");
	}
	public static void main(String [] args)
	{
		A a=new A();
		a.m1(10.0,10);
	}
}