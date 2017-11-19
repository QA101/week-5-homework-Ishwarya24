import java.util.Scanner;

public class halfofstring {
	public static void main(String[] args)
	{
		String s;
		int i=0,j;
		//int count=0;
		System.out.println("Enter the string");
		Scanner console=new Scanner(System.in);
		s=console.nextLine();
		//System.out.println(s);
		console.close();
		if(s.length()%2==0)
		{
			//i=s.length()/2;
			System.out.print(s.substring(0, s.length()/2));		
		}
		else
		{
			System.out.println("Length of string is odd");
		}
	}
	
}
