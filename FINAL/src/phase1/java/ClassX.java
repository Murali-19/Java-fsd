package phase1.java;

public class ClassX {
	private int x1=83;
	  long x2=84;
	  protected float x3=32.4f;
	  public char x4='A';
	  
	public void methodofpublicX()
	{
		System.out.println("Class X: public method");
		System.out.println("Value of x1 "+x1);
		System.out.println("Value of x2 "+x2);
		System.out.println("Value of x3 "+x3);
		System.out.println("Value of x4 "+x4);
	}
	protected void methodofprotectedX()
	{
		System.out.println("Class X: Protected method");
	}
	void methodofdefaultX()
	{
		System.out.println("Class X: Default method");
	}
	private void methodofprivateX()
	{
		System.out.println("Class X: Private method");
	}


}
