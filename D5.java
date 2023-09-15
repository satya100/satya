import java.util.Scanner;
class D5
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		//System.out.print();
		int j=1;
		for (;;)
		{
			System.out.println(j);
			j=j+4;
			if(j>=100)
				break;
		}
	}
}
