package assisted.project;

public class TypeCasting {
public static void main(String[] args) {
		
		int age=21;
		System.out.println("Age :"+age);
		
		long l=age;
		System.out.println("After type casting:"+l);
		
        long distance =535337635233L;
        System.out.println("Distance :"+distance);
        
        int dis= (int)distance;
        System.out.println("Aftre type casting:"+dis);
        
        double max=19283338384398.363647364;
        long lo=(long)max;
        int i=(int)max;
        
        System.out.println("DOUBLE:"+max);
        System.out.println("LONG:"+lo);
        System.out.println("INT:"+i);
        
        
        int x=264;
        byte b;
        b = (byte)x;
        System.out.println("BYTE:"+b);
        
        int w=100;
        char c=(char)w;
        System.out.println("CHAR:"+c);
        
	}
}

