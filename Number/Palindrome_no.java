import java.util.Scanner;
class Palindrome_no 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number:- ");
		int num=s.nextInt();
		int temp=num;
		int r,sum=0;
		while (num>0)
		{
			r=num%10;
			sum = (sum*10)+r;
			num=num/10;
		}
		if (temp==sum)
		{
			System.out.println(temp+" is a palindrome number");
		}
		else
		{
			System.out.println(temp+" is not a palindrome number");
		}
	}
}

