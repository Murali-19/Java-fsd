package assisted.practice1;

public class ExceptionHandling 
{
	
	public static void main(String[] args)
	{
		int n1,n2,n3;
		n1=10;
		n2=0;
		
		
		try
		{
			n3=n1/n2;
			System.out.println(n3);
		}
		catch(ArithmeticException a)
	    {
		System.out.println("Numbers cannot be divided by zero");
		System.out.println(a.getMessage());
		}
//		if the exception name is wrong the only down condition work
//		catch(NullPointerException a)
//		{
//			System.out.println("Numbers cannot be divided by zero");
//			System.out.println(a.getMessage());
//		}
//		catch(Exception e)
//		{
//		    System.out.println("I am before the subclass exception");	
//		}
		finally
		{
			n3=n1+n2;
			System.out.println("Result:"+n3);
			
		}
		
	}

}
