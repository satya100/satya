class Upper_case 
{
	public static void main(String[] args) 
	{
		String s="satya";
		for (int i=0;i<s.length();i++) 
		{
			int a=s.charAt(i);
			a=a-32;
			char c=(char)a;
			System.out.print(c);
		}
	}
}
