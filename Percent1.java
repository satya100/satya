import java.util.Scanner;
class  Percent1
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a length of array:- ");
		int size =s.nextInt();
		//size=(size*1000)+1;
		long x [] = new long[size];
		for (int i=0;i<size ;i++ )
		{
			x[i]=i;
		}
		long y [] = new long[size];
		for (int i=0;i<x.length;i++)
		{
			y[i]=x[i];
			float A=i/x.length;
			//A=A*100;
			System.out.println(A);
			//System.out.println((i/x.length)*100);
		}
		System.out.println("copy array");
		for (int i=0;i<y.length;i++)
		{
			System.out.println(y[i]);
		}
	}
}
