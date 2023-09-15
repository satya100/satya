class satya 
{
	public int hashCode()
	{
		return 10;
	}
	public static void main(String[] args) 
	{
		satya a=new satya();
		satya a1=new satya();
		System.out.println(a.hashCode());
		System.out.println(a1.hashCode());
	}
}
