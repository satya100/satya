import java.util.Scanner;
class  Az
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number:- ");
		int a=s.nextInt();
		System.out.print("Enter a number:- ");
		int b=s.nextInt();
		for (int i=0;i<b;i++)
		{
			a++;
		}
		System.out.println("Add result is "+a);
	}
}
