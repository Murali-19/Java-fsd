package assisted.practice1;
import java.util.Scanner;
public class ThrowClause 
{
	
	static int add(int n1,int n2)
	{
		if(n1>n2)
		{
			throw new ArithmeticException("N1 is greater than N2 and exception is thrown");
		}
		else
		{
			System.out.println("Both statement is correct");
		}
		return n1+n2;
		
	}
	
	public static void main(String[] args)
	{
		  Scanner s=new Scanner(System.in);
		  System.out.println("Enter number1");
		  int n1=s.nextInt();
		  System.out.println("Enter number2");
		  int n2=s.nextInt();
		  int result=0;
		  
		  try
		  {
			  result=add(n1,n2);
		  }
		  catch(Exception e)
		  {
			  System.out.println(e.getMessage());
		  }
		  System.out.println("result:"+result);
		  
	}

}
