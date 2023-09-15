class  Largestnumber3
{
	public static void main(String[] args) 
	{
		int a = 40;
		int b = 60;
		int c = 30;
		if (a<b)
		{
			if (b<c)
			{
				System.out.println(c+" is Largest number");
			}
			else
			{
				System.out.println(b+" is Largest number");
			}
		}
		else
		{
			if (a<c)
			{
				System.out.println(c+" is Largest number");
			}
			else
			{
				System.out.println(a+" is Largest number");
			}
		}
	}
}
