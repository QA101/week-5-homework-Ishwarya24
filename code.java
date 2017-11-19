import java.util.Scanner;

public class code {
public static void main(String[] args)
{
	String s;
	int count=0;
	System.out.println("Enter the string");
	Scanner console=new Scanner(System.in);
	s=console.nextLine();
	//System.out.println(s);
	console.close();
	for(int i=0;i<=s.length()-3;i++)
	{
		if(s.toUpperCase().charAt(i) == 'C')
		{
			if(s.toUpperCase().charAt(i+1) == 'O')
			{
				if(s.toUpperCase().charAt(i+3) == 'E')
				{
					count++;
				}
			}
		}
	}
	if(count > 0)
	{
		System.out.println(count);
	}
	else
	{
		System.out.println("Pattern not found");
	}
	
}
}
