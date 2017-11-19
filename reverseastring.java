import java.util.Scanner;

public class reverseastring {
	public static void main(String[] args)
	{
		String s;
		System.out.println("Enter the string");
		Scanner console=new Scanner(System.in);
		s=console.nextLine();
		console.close();
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
	}

}
