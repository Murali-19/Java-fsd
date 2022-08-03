package project;

import java.util.Scanner;
public class Calculator {
	public static void main(String[] args)
	{
		double n1,n2;
		Scanner s=new Scanner(System.in);
		
		
		System.out.println("Enter the numbers");
		n1=s.nextDouble();
		n2=s.nextDouble();
		
		System.out.println("Enter the operator:");
		
		char c=s.next().charAt(0);
		
		double ans=0;
		
		switch(c)
		{
		case '+':
			ans=n1+n2;
	        break;
	    case '-':
		    ans=n1-n2;
		    break;
	    case '*':
	    	ans=n1*n2;
	    	break;
	    case '/':
	    	ans=n1/n2;
	    	break;
	    default:
	    	System.out.println("Wrong input");
	    	break;
	}  
        System.out.println(n1 + " " + c+ " " + n2
                           + " = " + ans);
	}
}
