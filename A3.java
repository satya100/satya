import java.util.Scanner;
class A3 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a numbe: ");
		int num=s.nextInt();
		Long count = 1l;
		for(int i=1;i<=num;i++)
		{
			count = count*i;
		}
		System.out.println("Factoril="+count);
	}
}
