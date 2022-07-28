package assisted.project;
import java.util.regex.*;
public class RegularExpression {

public static void main(String[] args) {

		String pattern = "[a-z]+";
		String check = "Java Program";
		Pattern p = Pattern.compile(pattern);
		Matcher c = p.matcher(check);
		
		while (c.find())
		{
	      	System.out.println( check.substring( c.start(), c.end() ) );
		}
	}
}

