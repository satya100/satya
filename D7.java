import java.util.Scanner;
class D7 
{
	public static void main(String[] args) 
	{
		int x=1;
		while(true)
		{
			if(x%4==1)
				System.out.println(x);
			x++;
			if(x>=100)
				break;
		}
	}
}
