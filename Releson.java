class  Releson
{
	public static void main(String[] args) 
	{
		int i = 10;
		float f = 10f;
		long l = 10l;
		boolean b1 = i<i;
		boolean b2 = i<f;
		boolean b3 = i<l;
		boolean b4 = 10<10.0;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
	}
}
