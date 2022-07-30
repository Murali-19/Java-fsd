package assisted.practice1;
import java.util.*;
import java.io.*;
public class ThrowExample 
{
	static int area(int l,int b) throws IOException
	{ 
		int area=0;
		
		if(l>b)
		{
			throw new IOException("Length is greater than breadth and exception is thrown");
		}
		else
		{
			area=l*b;
		}
		return area;
	}
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter length:");
		int l=s.nextInt();
		
		System.out.println("Enter breadth:");
		int b=s.nextInt();
		int result = 0;
		try
		{
			result=area(l,b);
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
			
		}
		catch (Exception x)
		{
			System.out.println(x.getMessage());
		}
		System.out.println("Result:"+result);
		
	}

}
