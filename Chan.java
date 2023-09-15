class Chan 
{
	public void m1()
	{
		System.out.println("satya");	
	}
	public void m2()
	{
		Chan a=new Chan();
		a.m1();
	}
	public void m3()
	{	
		Chan a1=new Chan();
		a1.m2();
	}
	public void m4()
	{
		Chan a2=new Chan();
		a2.m3();
	}
	public static void main(String []args)
	{
		Chan a3=new Chan();
		a3.m4();
	}
}