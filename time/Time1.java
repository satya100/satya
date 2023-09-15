import java.util.Scanner;
class Time1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Plese set the time");
		System.out.print("Enter the h:- ");
		int h=sc.nextInt();
		System.out.print("Enter the min:- ");
		int m=sc.nextInt();
		System.out.print("Enter the sec:- ");
		int s=sc.nextInt();
		while(true)
		{
			for (;h<=12;h++)
			{
				for (;m<60;m++)
				{
					for (;s<60;s++)
					{
						System.out.print("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n");
						System.out.print("                                                   ");
						System.out.println(h+":"+m+":"+s);
						try 
						{ 
							Thread.sleep(1000);
							new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
						}  
						catch (Exception e)   
						{ 
							e.printStackTrace();
						}
					}
					s=0;
				}
				m=0;
			}
			h=1;
		}
	}
}