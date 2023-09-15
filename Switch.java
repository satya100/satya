class  Switch
{
	public static void main(String[] args) 
	{
		char c = 'a';
		switch(c)
		{
			case 'a':
				System.out.println("1");
			break;
			case 20:
				System.out.println("2");
			break;
			case 40:                                                                                     -:
				System.out.println("3");
			break;
			case c:
				System.out.println("4");
			break;
			default:
				System.out.println("5");
			break;
		}
	}
}
