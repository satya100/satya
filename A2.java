import java.util.Scanner;
class A2 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a  number:-");
		int num = s.nextInt();
		int count = 0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("prime number");			}
		else
		{
			System.out.println("Not a prime number");
		}
	}
}
