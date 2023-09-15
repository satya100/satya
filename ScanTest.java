import java.util.Scanner;
class ScanTest 
{
	static void m1()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number ");
		int i=s.nextInt();
		System.out.println("Your no is "+i);	
	}
	public static void main(String[] args) 
	{
		ScanTest.m1();
	}
}
