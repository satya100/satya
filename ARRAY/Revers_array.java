import java.util.Scanner;
class Revers_array 
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
		System.out.println("Revers array is");
		for (int i=x.length-1;i>=0;i--)
		{
			System.out.println(x[i]);
		}
	}
}
