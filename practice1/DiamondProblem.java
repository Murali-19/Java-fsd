package assisted.practice1;

interface Aclass
{
	default void display()
	{
		System.out.println("classA method");
	}
	
	
}

interface Bclass
{
	default void display()
	{
		System.out.println("classB method");
	}
}

public class DiamondProblem implements Aclass,Bclass {
	
	@Override
	public void display() {
		Aclass.super.display();
		Bclass.super.display();
	}

	public static void main(String[] args) {
	DiamondProblem d=new DiamondProblem();
	d.display();

	System.out.println(" diamond Problem can be solved using interface");
	}

}

