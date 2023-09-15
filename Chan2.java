class  Chan2
{
	public void m1()
	{
		System.out.println("satya");
	}
	public void m2()
	{
		Chan2 a=new Chan2();
		a.m1();
	}
	public void m3()
	{
		Chan2 a=new Chan2();
		a.m2();
	}
	public void m4()
	{
		Chan2 a=new Chan2();
		a.m3();
	}
	public static void main(String [] args)
	{
		Chan2 a=new Chan2();
		a.m4();
	}
}
