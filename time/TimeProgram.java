import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class TimeProgram 
{
	public static void main(String[] args)
	{
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("HH");
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("mm");
		DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("ss");
        String Time1 = now.format(formatter1);
		String Time2 = now.format(formatter2);
		String Time3 = now.format(formatter3);
		int h = Integer.parseInt(Time1);
		int m = Integer.parseInt(Time2);
		int s = Integer.parseInt(Time3);
		if (h> 12)
		{
			h=h-12;
		}
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
