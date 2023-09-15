import java.util.Scanner;
class Var 
{
	public static void sum(int...x)
	{
		int sum1=0;
		for (int i=0;i<x.length ;i++ )
		{
			sum1=sum1+x[i];
		}
		System.out.println(sum1);
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter numbers:- ");
		int...x=s.nextInt();
		sum(int...x);
	}
}