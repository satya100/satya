import java.util.Scanner;
class A4
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=s.nextInt();
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
			}
		}
	}
}
