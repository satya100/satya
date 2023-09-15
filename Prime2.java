import java.util.Scanner;
class Prime2
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		//System.out.print("Enter range:- ");
		//int n=s.nextInt();
		long z=1l;
		while(true)
		{

		for (int x=1; ;x++)
		{
			int count = 0;
			for (int y=1;y<=x;y++)
			{
				if(x%y==0)
				{
					count++;
				}
			}

				if(count==2)
				{
					System.out.println(x + " is a prime number");
				}
			
		}
		}
	}

}