import java.util.Scanner;
class  Cal2
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		loop: while(true) {
			System.out.println("\nChoose one option: ");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Mulitiplication");
			System.out.println("4. Division");
			System.out.println("5. Modulus");
			System.out.println("6. Exit");
			System.out.print("\nEnter option: ");
			int option = s.nextInt();
			switch(option) {
				case 1:
				{
					System.out.print("Enter 1st no:");
					int a=s.nextInt();
					System.out.print("Enter 2st no:");
					int b=s.nextInt();
					System.out.println("Addition result is "+(a+b));
					break;
				}
				case 2:
				{
					System.out.print("Enter 1st no:");
					int a=s.nextInt();
					System.out.print("Enter 2st no:");
					int b=s.nextInt();
					System.out.println("Subtraction result is "+(a-b));
					break;
				}
				case 3:
				{
					System.out.print("Enter 1st no:");
					int a=s.nextInt();
					System.out.print("Enter 2st no:");
					int b=s.nextInt();
					System.out.println("Mulitiplication result is "+(a*b));
					break;
				}
				case 4:
				{
					System.out.print("Enter 1st no:");
					int a=s.nextInt();
					System.out.print("Enter 2st no:");
					int b=s.nextInt();
					System.out.println("Division result is "+(a/b));
					break;
				}
				case 5:
				{
					System.out.print("Enter 1st no:");
					int a=s.nextInt();
					System.out.print("Enter 2st no:");
					int b=s.nextInt();
					System.out.println("Modulus result is "+(a%b));
					break;
				}
				case 6:
					{
					System.out.println("Thank you visit again");
					break loop;
				}

				default : {
					System.out.println("Invalid option");
				}
			}
		}
	}
}
