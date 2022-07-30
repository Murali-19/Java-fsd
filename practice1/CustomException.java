package assisted.practice1;
import java.util.*;

public class CustomException 
{
	static void CheckSalary(int s)throws SalaryException
	{
		if(s<2100)
		{
			throw new SalaryException("You need to work hard");
		}
		else if(2100<=s && s>=5000)
		{
			throw new SalaryException("Your salary is somehow good");
		}
		else if(5100<=s && s>=9000)
		{
			throw new SalaryException("Your salary is too Good");
		}
	}
	public static void main(String[] args)
	{
		int salary;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter salary:");
		salary=s.nextInt();
		
		
		try
		{
			CheckSalary(salary);
		}
		catch(Exception e)
		{
			System.out.println("Exception occured:"+e.getMessage());
		}
		
		
	}

}

class SalaryException extends Exception
{
        SalaryException(String s)
        {
        	super(s);
        }
	     
}
