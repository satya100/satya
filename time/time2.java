class time2
{
	public static void main(String[] args) 
	{
		for (int h=1;h<=12;h++)
		{
			for (int m=0;m<60;m++)
			{
				for (int s=0;s<60;s++)
				{
					System.out.print("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n");
					System.out.print("                                          ");
					System.out.println(h+":"+m+":"+s);
					try 
					{ 
						Thread.sleep(1000); 
					}  
					catch (Exception expn)   
					{  
					}  
				}
			}
		}
	}
}
