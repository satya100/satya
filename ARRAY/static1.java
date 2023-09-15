public class static1
{
	private static int i;
	static
	{
		System.out.println(i);
	}
	void show()
	{
		i++;
	}
	public static1()
	{
		i+=5;
	}
	static void display()
	{
		static1 st=new static1();
		st.i++;
		System.out.println(i);
	}
	public static void main(String [] args)
	{
		display();
		static1 st=new static1();
		st.i+=10;
		st.show();
		System.out.println(st.i);
	}
}