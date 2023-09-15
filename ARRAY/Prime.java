import java.util.Scanner;
class Prime
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
			int count=0;
			for (int j=1;j<=x[i];j++ )
			{
				if(x[i]%j==0)
			{
				count ++;
			}
			
			}
			if (count==2)
			{
				System.out.println(x[i]+" is a prime no");
			}
			else
			{
				System.out.println(x[i]+" is not a prime no");			
			}
		}
	}
}
