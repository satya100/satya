import java.util.Scanner;
class Shoritting 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a length of array:- ");
		int size =s.nextInt();
		int x [] = new int[size];
		System.out.println("Enter element of array");
		for (int i=0;i<x.length;i++)
		{
			x[i]=s.nextInt();
		}
		//[10,20,30,60]
		int y [] = new int[size];
		int max=x[0];
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if (x[i]>max)
				{
					y[j]=x[i];	
				}
			}
		}
		for (int i=0;i<y.length;i++)
		{
			System.out.println(y[i]);
		}
	}
}
