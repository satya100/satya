import java.util.Scanner;
class Fetorial 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = s.nextInt();
		double a = 1l;
		for(double i=1;i<=num;i++)
		{
			a = a*i;
		}
		System.out.println(a);
	}
}
