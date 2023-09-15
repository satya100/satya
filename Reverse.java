import java.util.Scanner;
class Reverse
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number:- ");
		int x=s.nextInt();
		int y=0;
		while(x!=0)
		{
			int z = x%10;
			y=y*10+z;
			x=x/10;
		}
		System.out.println("Reverse no is"+y);
	}
}
