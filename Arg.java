class Arg
{
	public int m1(String s,int...x)
	{
		int sum=0;
		for (int i=0;i<x.length;i++)
		{
			sum=sum+x[i];
		}
			//System.out.println(sum);
			System.out.println(s);
			return sum;
	}
	public static void main(String [] args)
	{
		Arg a=new Arg();
		int x=a.m1("satya",10,20,30,40,50,60,70);
		System.out.println(x);
	}
}