class  Percent
{
	public static void main(String[] args) 
	{

		long startTime = System.currentTimeMillis();
		System.out.println("satya");
		for (int i=0;i<100 ;i++ )
		{
			System.out.println("satya");
		}
		/*try 
		{ 
			Thread.sleep(1000);
		}  
		catch (Exception e)   
		{ 
		}*/
		long endTime = System.currentTimeMillis();
		long T = endTime - startTime;
		System.out.println(T);
	}
}
