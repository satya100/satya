import java.util.Scanner;
class  Strong
{
	public static void main(String[] args) 
	{
		int d=0;
		while (true)
		{	
			int num,originalNum,rem,fact,i,sum=0;
			//Scanner s= new Scanner(System.in);
			//System.out.print("Enter a number:- ");
			//num=s.nextInt();
			num=d;
			originalNum=num;
			while (num>0)
			{
				rem=num%10;
				fact=1;
				for(i=1;i<=rem;i++){
					fact=fact*i;
				}
				sum=sum+fact;
				num=num/10;
			}
			if (sum == originalNum) 
			{
				System.out.println(originalNum + " is STRONG NUMBER");
			} 
			d++;
		}
   }
}
