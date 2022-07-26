package phase.java;

public class Student {
	String name;
	int age;
	char section;
	char gender;
	int subject1=0;
	int subject2=0;
	int subject3=0;
	int total;
	int per;
	public Student (String n,int a,char s,char g,int sub1,int sub2,int sub3)
	{
		name=n;
		age=a;
		section=s;
		gender=g;
		subject1=sub1;
		subject2=sub2;
		subject3=sub3;
	}
	public Student (String n,int a,char s,char g,int sub2,int sub3)
	{
		name=n;
		age=a;
		section=s;
		gender=g;

		subject2=sub2;
		subject3=sub3;
	}
	
	void display()
	{
		
	
		total=subject1+subject2+subject3;
		per=(total/3);
		System.out.println("NAME:"+name+  "AGE:"+age+  "SECTION:"+section+
				"GENDER:"+gender +"TOTAL:"+total+"PERCENTAGE:"+per);
}
   
	public static void main (String[] args)
	{
		Student s1=new Student("MAXI",22,'A','M',80,90,90);
		Student s2=new Student("JESSI",21,'A','F',90,90);
		Student s3=new Student("MAC",22,'B','M',80,85);
		Student s4=new Student("JACK",22,'B','M',76,65,88);
		
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		
	}
}
