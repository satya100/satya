import java.util.Scanner;
class Multableopps
{
	public void m(int x)
	{
		for (int i=1;i<=10 ;i++ )
		{
			System.out.println(x+"*"+i+"="+x*i);
		}
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number:- ");
		int x=s.nextInt();
		Multableopps a=new Multableopps();
		a.m(x);
	}
}
