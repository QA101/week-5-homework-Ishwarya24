import java.util.Scanner;

public class lastpartofstring {
	public static void main(String[] args)
	{
		String s,s1;
		System.out.println("Enter the first string");
		Scanner console=new Scanner(System.in);
		s=console.nextLine();
		System.out.println("Enter the second string");
		s1=console.nextLine();
		console.close();
		if(s.length() > s1.length())
		{
			if(s.toLowerCase().substring(s.length()-s1.length(), s.length()).equals(s1.toLowerCase()))
			{
				System.out.println("Found");
			}
			else
			{
				System.out.println("Not Found");
			}
		}
		else if(s1.length() > s.length())
		{
			if(s1.toLowerCase().substring(s1.length()-s.length(), s1.length()).equals(s.toLowerCase()))
			{
				System.out.println("Found");
			}
			else
			{
				System.out.println("Not Found");
			}
		}				
	}
}
