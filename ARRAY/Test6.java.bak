import java.util.Scanner;
class Test6 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter how much data you want to entery:- ");
		int size=scn.nextInt();
		int age []=new int [size];
		String name []=new String [size];
		int Atemp;
		String Ntemp;
		System.out.println("Enter your data");
		for (int i=0;i<size;i++)
		{
			System.out.print("Enter "+(i+1)+" person name:- ");
			name[i]=scn.next();
			System.out.print("Enter "+name[i]+" age:- ");
			age[i]=scn.nextInt();
		}
		for (int i=0;i<age.length;i++)
		{
			for (int j=i+1;j<age.length;j++)
			{
				if (age[i]>age[j])
				{
					Atemp=age[i];
					Ntemp=name[i];
					age[i]=age[j];
					name[i]=name[j];
					age[j]=Atemp;
					name[j]=Ntemp;
				}
			}
		}
		for (int i=0;i<age.length;i++)
		{
			System.out.print(name[i]+" ");
			System.out.println(age[i]);
		}
	}
}