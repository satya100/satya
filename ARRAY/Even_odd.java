import java.util.Scanner;
class Even_odd 
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
		for (int i=0;i<x.length;i++)
		{
			if (x[i]%2==0)
			{
				System.out.println("even");
			}
			else
			{
				System.out.println("odd");
			}
		}
	}
}
