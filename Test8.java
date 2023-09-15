import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
class Test8 
{
	public static void main(String[] args) 
	{
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd");
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MM");
		DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yy");
		String Time1 = now.format(formatter1);
		String Time2 = now.format(formatter2);
		String Time3 = now.format(formatter3);
		int d = Integer.parseInt(Time1);
		int m = Integer.parseInt(Time2);
		int y = Integer.parseInt(Time3);
	}
}
