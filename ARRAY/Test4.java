class Test4 
{
	public static void main(String[] args) 
	{
		String s1="satya";
		String s2="satya";
		String s3="mrs satya";
		System.out.println(s1==s2);
		s1="mrs "+s1;
		System.out.println(s1==s2);
		System.out.println(s1==s3);
	}
}
