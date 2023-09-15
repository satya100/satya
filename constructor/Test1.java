class Test1
{
	int i;
	Test1(int i1)
	{
		i=i1;
	}
	public int hashCode()
	{
		return i;
	}
	public String toString()
	{
		return Integer.toHexString(hashCode());
	}
	public static void main(String [] args)
	{
		Test1 t1=new Test1(10);
		Test1 t2=new Test1(185);
		//System.out.println(t1);
		//System.out.println(t2);
		System.out.println(t1.equals(t2));
	}
}