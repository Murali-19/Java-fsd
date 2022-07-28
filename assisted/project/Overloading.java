package assisted.project;

public class Overloading {

	
	public void calculate(int a,int b)
	{
		int c=a+b;
		System.out.println("Add two num:"+c);
	}
	public void calculate(int r)
	{
	
		System.out.println("Aera of circle:"+(int)3.14*r*r);
	}
	public void calculate(float a,int b)
	{
		
		System.out.println("Add of rectangle:"+(int)a*b);
	}
	public void calculate (float a)
	{
		System.out.println("Add of square:"+(int)a*a);
	}
	
	public static void main(String []args)
	{
		Overloading c=new Overloading();
		c.calculate(4,5);
		c.calculate(3);
		c.calculate(2.4f,3);
		c.calculate(2.4f);
	}
	

}
