import java.util.Scanner;
class All_no 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number:- ");
		int num=s.nextInt();
		Palindrome_no(num);
		Happy_no(num);
		Automorphic_no(num);
		Magic_no(num);
		Buzz_no(num);
		Abundant_no(num);
		Neon_no(num);
		Xylem_no(num);
		Niven_no(num);
		Tech_no(num);
		Fascinating_no(num);
		Harsad_no(num);
		Pretty_no(num);
		Ugly_no(num);
		Perfect_no(num);
		Armstrong_no(num);
		Strong_no(num);
		Prime_no(num);
	}
	public static void Palindrome_no(int num)
	{
		int temp=num;
		int r,sum=0;
		while (num>0)
		{
			r=num%10;
			sum = (sum*10)+r;
			num=num/10;
		}
		if (temp==sum)
		{
			System.out.println(temp+" is a palindrome number");
		}
		else
		{
			System.out.println(temp+" is not a palindrome number");
		}	
	}
	public static void Happy_no(int n)
	{
		int r = 1, num, sum = 0;
        num = n;
		int z=n;
        while (num > 9)
        {
            while (num > 0)
            {
                r = num % 10;
                sum = sum + (r * r);
                num = num / 10;
            }
            num = sum;
            sum = 0;
        }
        if (num == 1)
        {
            System.out.println(z+" is a Happy Number");
        }
        else
        {
            System.out.println(z+" is Not a Happy Number");
        }	
	}
	public static void Automorphic_no(int num)
	{ 
		int count=0;  
		int square = num*num;  
		int temp = num;    
		while(temp>0)  
		{  
		count++;  
		temp=temp/10;  
		}   
		int lastDigit = (int) (square%(Math.pow(10, count)));   
		if(num == lastDigit)  
		System.out.println(num+ " is an automorphic number.");  
		else  
		System.out.println(num+ " is not an automorphic number.");	
	}
	public static void Magic_no(int n)
	{
		int remainder = 1, number, sum = 0,z;    
		number = n;
		z=number;
		while (number > 9) 
		{  
		while (number > 0)  
		{  
		remainder = number % 10;   
		sum = sum + remainder;  
		number = number / 10;     
		}  
		number = sum;  
		sum = 0;  
		}  
		if (number == 1)  
		{  
		System.out.println(z+" is a magic number.");  
		}  
		else  
		{  
		System.out.println(z+" is not a magic number.");  
		}  	
	}
	public static void Buzz_no(int number)
	{
		if(number % 10 == 7 || number % 7 == 0)
		{
			System.out.println(number + " is an Buzz number");
		}
		else
		{
			System.out.println(number + " is not an Buzz number");
		}	
	}
	public static void Abundant_no(int n)
	{
		int sum = 0;
		for (int i = 1; i < n; i++) { if (n % i == 0) sum = sum + i; } if (sum > n)
		{
			System.out.println (n + " is an Abundant Number and the  Abundance is: "+ (sum - n));
		}
		else
		{
			System.out.println (n + " is not an Abundant Number");
		}
	}
	public static void Neon_no(int n)
	{
		int sum = 0;       
		int square = n * n;  
		while(square != 0)  
		{  
			int digit = square % 10;  
			sum = sum + digit;  
			square = square / 10;  
		}  
		if(n == sum)  
			System.out.println(n + " is a Neon Number");  
		else  
			System.out.println(n + " is not a Neon Number");	
	}
	public static void Xylem_no(int num)
	{
		int extreme_sum = 0, mean_sum = 0, n;   
		num = Math.abs(num);  
		n = num;  
		while(n != 0)  
		{  
			if(n == num || n < 10)  
			extreme_sum = extreme_sum + n % 10;  
			else  
			mean_sum = mean_sum + n % 10;  
			n = n / 10;  
		}
		if(extreme_sum  == mean_sum)  
			System.out.println(num + " is a xylem number.");  
		else  
			System.out.println(num + " is a phloem number.");	
	}
	public static void Niven_no(int originalNumber)
	{
		int copyOfOriginalNumber = originalNumber;
		int sum = 0;
		while(originalNumber > 0)
		{
			int rem = originalNumber%10;
			sum = sum + rem;
			originalNumber = originalNumber/10;
		}
		if(copyOfOriginalNumber % sum == 0)
			System.out.println(copyOfOriginalNumber+" is a niven number");
		else
			System.out.println(copyOfOriginalNumber+" is not a niven number");	
	}
	public static void Tech_no(int n)
	{
		int num, firstHalf, secondHalf, digits = 0, squareOfSum = 0;  
		num = n;  
		while (num > 0)  
		{  
		digits++;  
		num = num / 10;  
		}  
		if (digits % 2 == 0)  
		{  
			num = n;  
			firstHalf = num % (int) Math.pow(10, digits / 2);  
			secondHalf = num / (int) Math.pow(10, digits / 2);  
			squareOfSum = (firstHalf + secondHalf) * (firstHalf + secondHalf);  
			if (n == squareOfSum)  
			{  
				System.out.println(n+" is a tech number.");  
			}  
			else  
			{  
				System.out.println(n+" is not a tech number.");  
			}  
		}  
		else  
		{  
			System.out.println(n+ " is not a tech number.");  
		}  	
	}
	public static void Fascinating_no(int num)
	{
		int n2, n3;
		n2 = num * 2;  
		n3 = num * 3;  
		String concatstr = num + "" + n2 + n3;  
		boolean found = true;  
		for(char c = '1'; c <= '9'; c++)  
		{  
			int count = 0;  
			for(int i = 0; i < concatstr.length(); i++)  
			{  
				char ch = concatstr.charAt(i);  
				if(ch == c)  
				count++;  
			}  
			if(count > 1 || count == 0)  
			{  
				found = false;  
				break;  
			}  
		}  
		if(found)  
			System.out.println(num + " is a fascinating number.");  
		else  
			System.out.println(num + " is not a fascinating number.");	
	}
	public static void Harsad_no(int num)
	{  
        int rem = 0, sum = 0, n;           
        n = num;            
        while(num > 0)
		{  
            rem = num%10;  
            sum = sum + rem;  
            num = num/10;  
        } 
        if(n%sum == 0)  
            System.out.println(n + " is a harshad number");  
        else  
            System.out.println(n + " is not a harshad number"); 	
	}
	public static void Pretty_no(long n)
	{
		long sum=0;  
		int i=1;  
		while(i <= n/2)  
		{  
			if(n % i == 0)  
			{  
				sum = sum + i;  
			}  
			i++;  
		} 
		if(sum==n)  
		{  
			System.out.println(n+" is a perfect number.");  
		} 
		else  
			System.out.println(n+" is not a perfect number.");	
	}
	public static void Ugly_no(int n)
	{
		int z = n;
		int x = 0;
        while (n != 1) 
		{
            if (n % 5 == 0) 
			{
                n /= 5;
            } 
			else if (n % 3 == 0) 
			{
                n /= 3;
            } 
			else if (n % 2 == 0) 
			{
                n /= 2;
            } 
			else 
			{
                System.out.println(z+" is not an ugly number");
				x = 1;
				break;
            }
        }
        if (x==0)
			System.out.println(z+" is an ugly number");	
	}
	public static void Perfect_no(long n)
	{
		long sum=0;  
		int i=1;  
		while(i <= n/2)  
		{  
			if(n % i == 0)  
			{  
				sum = sum + i;  
			} 
			i++;  
		}  
		if(sum==n)  
		{  
			System.out.println(n+" is a perfect number.");  
		}
		else  
			System.out.println(n+" is not a perfect number.");	
	}
	public static void Armstrong_no(int number)
	{
		int originalNumber, remainder, result = 0;
        originalNumber = number;
        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");	
	}
	public static void Strong_no(int num)
	{
		int originalNum,rem,fact,i,sum=0;
        originalNum=num;
        while (num>0)
        {
            rem=num%10;
            fact=1;
            for(i=1;i<=rem;i++){
                fact*=i;
            }
            sum+=fact;
            num=num/10;
        }
        if (sum == originalNum) {
            System.out.println(originalNum + " is STRONG NUMBER");
        } else {
            System.out.println(originalNum + " is not a STRONG NUMBER");
        }	
	}
	public static void Prime_no(int num)
	{
		int count = 0;
		for (int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count ++;
			}
		}
		if (count==2)
		{
			System.out.println(num+" is Prime number");
		}
		else
		{
			System.out.println(num+" is Not a Prime number");
		}
	}
}