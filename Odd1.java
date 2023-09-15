class Odd1 
{
	public static void main(String[] args) 
	{
		int z=1;
		while(z<=10)
		{
			int count = 0;
			int y=1;
			while (y<=z)
			{
				if(z%y==0)
				{
					count++;
				}
				y++;
			}
				if(count==2)
				{
					System.out.println(z + " is a prime number");
				}
		z ++;
		}
	}
}
