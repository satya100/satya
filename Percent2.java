import java.util.Scanner;
class Percent2 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your full mark");
		int full=scn.nextInt();
		System.out.println("Enter your no of subject");
		int n=scn.nextInt();
		int A [] =new int [n];
		System.out.println("Enter your number");
		for (int i=0;i<A.length;i++)
		{
			System.out.print("Sub "+(i+1)+"- ");
			A[i]=scn.nextInt();
		}
		int sum=0;
		for (int i=0;i<A.length;i++)
		{
			sum=sum+A[i];
		}
		System.out.println(sum);
		System.out.println(full);
		double f=sum*100/full;
		System.out.println("your percent is "+f);
	}
}
