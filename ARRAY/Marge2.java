import java.util.Scanner;
class Marge2 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the 1st array size:- ");
		int size1=s.nextInt();
		int [] x=new int [size1];
		for (int i=0;i<x.length;i++)
		{
			System.out.print("Enter the element of array "+(i+1)+":- ");
			x[i]=s.nextInt();
		}
		System.out.print("Enter the 2nd array size:- ");
		int size2=s.nextInt();
		int [] y=new int [size2];
		for (int i=0;i<y.length;i++)
		{
			System.out.print("Enter the element of array "+(i+1)+":- ");
			y[i]=s.nextInt();
		}
		int num=x.length+y.length;
		int sum[]=new int[num];
		for (int i=0;i<num;i++)
		{
			for (int j=0;j<x.length;j++)
			{
				sum[i]=x[j];
			}
			for (int j=0;j<y.length;j++)
			{
				sum[i]=y[j];
			}
		}
		for (int i=0;i<sum.length;i++)
		{
			System.out.print(sum[i]+" ");
		}
	}
}
