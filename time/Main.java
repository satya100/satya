import java.time.*;
public class Main 
{
  public static void main(String[] args)
	{
		while(true)
		{
			LocalDate myObj1 = LocalDate.now();
			LocalTime myObj2 = LocalTime.now();
			System.out.println(myObj1);
			System.out.println(myObj2);
			try 
			{ 
				Thread.sleep(1000); 
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			}  
			catch (Exception expn)   
			{  
			}  
		}
	}
}
