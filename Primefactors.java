import java.util.Scanner;
class  Primefactors
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("num = ");
		int num = s.nextInt();
		for (int i=1;i<num ;i++)
		{
			int count = 0;
			for (int k=1;k<=i;k++)
			{
				if (i%k==0)
				{
				count ++;	
				}
			}
			if (count == 2)
			{
				if (num%i==0)
				{
					System.out.println(i);
				}
			}
		}
	}
}
