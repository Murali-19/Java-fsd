package assisted.project;

 class Employee
{
int salary=100000;

class permemployee
{
	String code="PE01";
	float hike=.45f;
	float n1;
	void new_salary()
	{
	 n1=salary+(salary*hike);
	}
	void dsplay()
	{
		System.out.println("New salary of permemployee:"+n1+"code is:"+code+"Hike is:"+hike);
	}
}
class tempemployee
{

	String code="TE01";
	float hike=.30f;
    float n2;
	
	void new_salary()
	{
	   n2=salary+(salary*hike);
	}
	void display()
	{
		System.out.println("New salary of tempemployee:"+n2+"code is:"+code+"Hike is:"+hike);
	}
}

void role()
{
	class contractemp
	{
		String code="TE01";
		float hike=.30f;
		float n3;
		void new_salary()
		{
			n3=salary+(salary*hike);
			
		}
		void display()
		{
			System.out.println("New salary of contractemployee:"+n3+"code is:"+code+"Hike is:"+hike);
		}
		
	}
	contractemp c=new contractemp();
	c.new_salary();
	c.display();
}
}
public class OpenInnerClass {
	public static void main(String[] args)
	{
		Employee e=new Employee();
		Employee.permemployee p=e.new permemployee();
		p.new_salary();
		p.dsplay();
		Employee.tempemployee t=e.new tempemployee();
		t.new_salary();
		t.display();
		
		e.role();
		
	}

}
