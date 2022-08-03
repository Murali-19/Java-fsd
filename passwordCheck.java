package program.collection;

import java.util.regex.Pattern;
import java.util.Scanner;
public class passwordCheck {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a password:");
		
		String x=s.nextLine();
		
		
	if(Pattern.matches("^[A-Z]{1}[@!.-]{1}[0-9]{4}[a-zA-Z]{4}+$",x))
	{
		System.out.println("Match");
	}
	else
	{
		System.out.println("Not Match");
	}
	}

}
