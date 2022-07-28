package assisted.project;

public class InnerClass {

		 private String m="Welcome to "; 
		 
		 class Inner{  
		  void hello(){System.out.println(m+" Java");}  
		 }  


		public static void main(String[] args) {

			InnerClass obj=new InnerClass();
			InnerClass.Inner in=obj.new Inner();  
			in.hello();  
		}
	}


	
