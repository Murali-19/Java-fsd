package phase.java;

public class Checkeven {
	public boolean Checkevennum(int a)
	{
		boolean r=(a%2==0);
		return r;
	}
	
	
	public static void main(String []args)
	{
		Checkeven c = new Checkeven();
		boolean t=c.Checkevennum(1);
		if(t)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
	}
}
