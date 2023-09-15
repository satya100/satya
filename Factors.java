import java.util.Scanner;
class Factors
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a nummber:- ");
		int x=s.nextInt();
		System.out.println("Factor of "+x+" is");
		for (int i=1;i<=x ;i++ )
		{
			if(x%i==0)
			{
				System.out.println(i);
			}
		}
	}
}
