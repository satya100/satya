import java.util.Scanner;
class Test 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enetr your name");
		String x=s.next();
		System.out.println("your name is "+x);
		System.out.print("your name in revers order is ");
		for (int i=(x.length()-1);i>=0;i-- )
		{
			System.out.print(x.charAt(i));
		}
		System.out.println();
	}
}
