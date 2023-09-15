import java.util.Random;
import java.util.Scanner;
class Random1 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		Random R=new Random();
		int x=R.nextInt(100);
		System.out.println(x);
		System.out.print("Gaush a number- ");
		int a=scn.nextInt();
		try
		{
			System.out.print("I am a guseh a number");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.println();
		}
		catch (InterruptedException e)
		{
		}
		if (x>a)
		{
			System.out.println("Too low");
		}
		else if (x<a)
		{
			System.out.println("Too high");
		}
		else if (x==a)
		{
			System.out.println("same to you");
		}
	}
}
