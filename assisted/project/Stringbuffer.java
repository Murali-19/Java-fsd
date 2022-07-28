package assisted.project;

public class Stringbuffer {
	public static void main(String[] args)
	{
	StringBuffer s=new StringBuffer("Started Java");
	
	
	
	s.append("Phasel");
	System.out.println(s);
	
	s.delete(2, 5);
	System.out.println(s);
	
	s.replace(5,9,"Python");
	System.out.println(s);
	
	s.reverse();
	System.out.println(s);

	System.out.println(s.charAt(9));
	
	s.insert(7, "language");
	System.out.println(s);
	
	}
}
