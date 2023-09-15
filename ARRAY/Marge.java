class Marge 
{
	public static void main(String[] args) 
	{
		int [] x={1,2,3,4,5};
		int [] y={6,7,8,9,10};
		int num=x.length+y.length;
		int sum[]=new int[num];
		int i=0;
		for (;i<x.length;i++)
		{
			for (int j=0;j<i;j++)
			{
				sum[i]=x[j];
				
			}
		}
		for (;i<sum.length;i++)
		{
			for (int j=0;j<i;j++)
			{
				sum[i]=y[j];
			}
		}
		System.out.println("The element of array are");
		for (int j=0;j<sum.length;j++)
		{
			System.out.print(sum[j]+" ");
		}
	}
}
