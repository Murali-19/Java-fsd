package assisted.project;

public class Shape {
	int x,y,z;
	int tri,rho;
	public Shape()
	{
		System.out.println("Default");
	}
	public Shape(int a)
	{
	    x=a*a;
		
	}
	public Shape(int l ,int w)
	{
        y=l*w;
		
	}
	public Shape(float r)
	{
		z=(int) (3.14*((int)r*r));
		
	}
	public void triangle(float h,float b)
	{
		tri=(int)((h+b)/2);
	}
	public void rhombus(int p,float q)
	{
		rho=(int)((p+q)/2);
	}
	void display_square()
	{
		System.out.println("Area of square:"+x);

		
	}
	void display_rectangle()
	{
	
		System.out.println("Area of rectangle:"+y);
	}
	void display_circle()
	{
		
		System.out.println("Area of circle:"+z);
	}
	void display_triangle()
	{
		System.out.println("Area of triangle:"+tri);
		
	}
	void display_rhombus()
	{
		System.out.println("Area of rhombus:"+rho);
		
	}
	public static void main(String args[])
	{
		Shape s1=new Shape();
		Shape s2=new Shape(2);
		Shape s3=new Shape(2,3);
		Shape s4=new Shape(2.3f);
	    
		s2.display_square();
		s3.display_rectangle();
		s4.display_circle();
		
		Shape x=new Shape();
		x.triangle(2.5f,2.2f);
		x.rhombus(6, 2.3f);
		
		x.display_triangle();
		x.display_rhombus();
		
		

	}

}
