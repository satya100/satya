import java.util.Scanner;
class Bigest_no 
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
		int max=x[0];
		for (int i=0;i<x.length;i++)
		{
			if (x[i]>max)
			{
				max=x[i];	
			}
		}
		System.out.println("The bigest no is "+max);
	}
}
