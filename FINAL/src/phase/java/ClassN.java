package phase.java;

public class ClassN {
	protected long n1=4;
	public int n2=2;
	double n3=3423.56;
	
	public void methodofpublicN()
	{
		System.out.println("Class N: public method");
		System.out.println("Value of n1 "+n1);
		System.out.println("Value of n2 "+n2);
		System.out.println("Value of n3 "+n3);
	}
	protected void methodofprotectedN()
	{
		System.out.println("Class N: Protected method");
	}
	void methodofdefaultN()
	{
		System.out.println("Class N: Default method");
	}
	private void methodofprivateN()
	{
		System.out.println("Class N: private method");
	}
}
