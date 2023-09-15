class Swap2 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		System.out.println("Valu of a:"+a);
		System.out.println("Valu of b:"+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After swap");
		System.out.println("Valu of a:"+a);
		System.out.println("Valu of b:"+b);
	}
}
