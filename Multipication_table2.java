import java.util.Scanner;
class Multipication_table2
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number:- ");
		int x=s.nextInt();
		int i=1;
		while(i<=10)
		{
			System.out.println(x+"*"+i+"="+x*i);
			i++;
		}
	}
}
