import java.util.Scanner;
class Arrayshort2 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the  array length ");
		int size = scn.nextInt();
		int A [] = new int [size];
		int temp;
		System.out.println("Enetr the element of array");
		for (int i=0;i<A.length;i++)
		{
			A[i]=scn.nextInt();
		}
		for (int i=0;i<A.length;i++)
		{
			for (int j=i+1;j<A.length;j++)
			{
				if (A[i]>A[j])
				{
					temp=A[i];
					A[i]=A[j];
					A[j]=temp;
				}
			}
		}
		System.out.println("shot array");
		for (int i=0;i<A.length;i++)
		{
			System.out.println(A[i]);
		}
	}
}
