package assisted.project;
import java.util.*;
public class Collections {
	public static void main (String[] args)
	{
		System.out.println("Aarray");
		ArrayList<String>city=new ArrayList<String>();
		city.add("Chennai");
		city.add("Bangalore");
		System.out.println(city);
		
		
		System.out.println("Vector");
		Vector<Integer>v=new Vector();
		v.addElement(20);
		v.addElement(30);
		System.out.println(v);
		

		System.out.println("Hash");
		HashSet<Integer>h=new HashSet<Integer>();
		h.add(1);
		h.add(2);
		System.out.println(h);
		
		System.out.println("LinkedList");
		LinkedList<String>l=new LinkedList<String>();
		l.add("Maxi");
		l.add("Jack");
		Iterator<String>i=l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println("LinkedHashset");
		LinkedHashSet<Integer>h1=new LinkedHashSet<Integer>();
		h1.add(1);
		h1.add(2);
		System.out.println(h1);
				
		
	}
}
