package phase.java;

public class ClassM {
	private int m1=1;
    long m2=12;
    protected float m3=44.5f;

public void methodofpublicM()
{
	System.out.println("Class M: public method");
	System.out.println("Value of m1 "+m1);
	System.out.println("Value of m2 "+m2);
	System.out.println("Value of m3 "+m3);
}
protected void methodofprotectedM()
{
	System.out.println("Class M: Protected method");
}
void methodofdefaultM()
{
	System.out.println("Class M: Default method");
}
private void methodofprivate()
{
	System.out.println("Class M: Private method");
}
}
