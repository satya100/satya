import java.util.Scanner;
class Demo
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number:- ");
		int n = s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i+j<=n+1)
					System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
}
