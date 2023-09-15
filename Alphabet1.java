class Alphabet1
{
	public static void main(String[] args) 
	{
		System.out.println("alphabet for loop");
		for (char i='a';i<='z' ;i++ )
		{
			System.out.print(i +" ");
		}
		System.out.println();
		System.out.println("alphabet while loop");
		char j='a';
		char k='z';
		while(j<=k)
		{
			System.out.print(j +" ");
			j++;
		}
	}
}
