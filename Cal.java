import java.util.Scanner;
class  Cal
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter 1st no:");
		int a=s.nextInt();
		System.out.print("Enter 2st no:");
		int b=s.nextInt();
		System.out.print("Enter a arithmetic operator:");
		char c=s.next().charAt(0);
		switch(c)
		{
			case '+':
				System.out.print(a+b);
			break;
			case '-':
				System.out.print(a-b);
			break;
			case '*':
				System.out.print(a*b);
			break;
			case '/':
				System.out.print(a/b);
			break;
			case '%':
				System.out.print(a%b);
			break;
			default : {
					System.out.println("Invalid option");
				}
			
		}
	}
}
