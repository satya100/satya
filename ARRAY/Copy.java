import java.util.Scanner;
class Copy 
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
		int y [] = new int[size];
		for (int i=0;i<x.length;i++)
		{
			y[i]=x[i];
		}
		System.out.println("copy array");
		for (int i=0;i<y.length;i++)
		{
			System.out.println(y[i]);
		}
	}
}
