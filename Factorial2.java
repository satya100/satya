import java.util.Scanner;
class Factorial2
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number:- ");
		int x=s.nextInt();
		int z=1;
		for (int i=1;i<=x ;i++ )
		{
			z=i*z;
		}
		System.out.println(z);
	}
}
