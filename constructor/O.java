class O 
{
	O()
	{
		this(10);
		System.out.println("no arg");
	}
	O(int x)
	{
		this(true);
		System.out.println("int");
	}
	O( boolean b)
	{
		System.out.println("boolean");
	}
	public static void main(String[] args) 
	{
		O a=new O();
		//O a1=new O(10);
	}
}
