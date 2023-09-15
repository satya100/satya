import java.util.Scanner;
class Addopps 
{
	public static void m1()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a 1st number:- ");
		int x=s.nextInt();
		System.out.print("Enter a 2nd number:- ");
		int y=s.nextInt();
		int z=x+y;
		System.out.println(z);
	}
	public static void main(String[] args) 
	{
		Addopps.m1();
	}
}
