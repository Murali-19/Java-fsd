package phase.java;

public class Immutablestring {
	public static void main(String[] args)
	{
			String t= "Delhi";    
			String o = "Mumbai"; 
			String k= "delhi";   
			String y= new String ("Mumbai");    
			String l= new String ("delhi");     
			String p = new String("Hello"); 
			
			if(o.equals(l))
			{
				System.out.println("True");
			}
			else
			{
				System.out.println("False");
			}
			if(o==l)
			{

				System.out.println("True");
			}
			else
			{
				System.out.println("False");
			}

			if(y.equals(p))
			{
				System.out.println("True");
			}
			else
			{
				System.out.println("False");
			}
			if(y==p)
			{

				System.out.println("True");
			}
			else
			{
				System.out.println("False");
			}
			if(t.equals(o))
			{
				System.out.println("True");
			}
			else
			{
				System.out.println("False");
			}
			if(t==o)
			{

				System.out.println("True");
			}
			else
			{
				System.out.println("False");
			}
			if(k.equals(y))
			{
				System.out.println("True");
			}
			else
			{
				System.out.println("False");
			}
			if(k==y)
			{

				System.out.println("True");
			}
			else
			{
				System.out.println("False");
			}
			if(p.equals(y))
			{
				System.out.println("True");
			}
			else
			{
				System.out.println("False");
			}
			if(p==y)
			{

				System.out.println("True");
			}
			else
			{
				System.out.println("False");
			}
			
	}

}
