import java.util.Scanner;
class Multipication_table
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number:- ");
		int x=s.nextInt();
		for (int i=1;i<=10 ;i++ )
		{
			System.out.println(x+"*"+i+"="+x*i);
		}
	}
}
