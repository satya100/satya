import java.util.Scanner;
class Zacck 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the base size of the array");
		int row =s.nextInt();
		int x [] []=new int[row][];
		int col;
		for (int i=0;i<row ;i++ )
		{
			System.out.println("Enter the inner size of "+(i+1)+ " array");
		    col=s.nextInt();
			x[i]=new int[col];
		}
		System.out.println("Enter the element in the array");
		for (int i = 0; i < x.length; i++) 
		{
			for (int j = 0; j < x[i].length; j++) 
			{
				System.out.print("positen="+i+" "+j+"- ");
				x[i][j]=s.nextInt();
			}
		}
		System.out.println("The elements of array are");
		for (int i = 0; i < x.length; i++) 
		{
			for (int j = 0; j < x[i].length; j++) 
			{
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
	}
}
