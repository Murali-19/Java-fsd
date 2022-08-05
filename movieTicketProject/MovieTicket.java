package movieTicketProject;


import java.util.Scanner;
import java.util.LinkedList;
import java.util.ArrayList;

public class MovieTicket 
{
	static int count=0;
	
	public static void BookTicket(int time,LinkedList rowA,LinkedList  rowB,LinkedList rowC)
	{
		int price=250;
		int flag=0;
		int f=0;
		Scanner sc=new Scanner(System.in);
	 
		System.out.print("\nSeats available in row A are "+ rowA+"\nSeats available in row B are "+ rowB+"\nSeats available in row C are "+ rowC+"\n");
	 
	    if(time==1 || time==2)
	    {
	    
	   
	    	
	        while(true)
	        {
	        	 if(f==1)break;
	        	 System.out.println("Please Select a row (A to C)");
			 	   String row=sc.next();
		 	  
	        switch (row)
	        {
	        case "A":
	        {
	        	f=1;
	        	while(true){
	        	if(flag==1)break;
	        	System.out.println("Please select a seat from A1 to A10 ");
	        	String seat=sc.next();
	        	if(rowA.contains(seat))
	        	{
	        		count=count+1;
        			System.out.println(count);
	        		System.out.println("Do you want to add another Please press Yes or No");
	        		String c=sc.next();
	        		if(c.equalsIgnoreCase("Yes"))
	        		{
	        			if(rowA.contains(seat))
	        			{
	        				flag=1;
	        				for(int i=1;i<=10;i++)
		        			{
		        				if(seat.equalsIgnoreCase("A"+i))
		        					rowA.remove("A"+i);
		        			}
	        			try{
	        		    	ShowTime(rowA,rowB,rowC);
	        		    	}
	        		    	catch(Exception e)
	        		    	{
	        		    		System.out.println(e);
	        		    	}
	        			}
	        			else
    	        			System.out.println("Please select number between A1 - A10");
	        		}
	        		else
	        		{
	        			System.out.println(count);
	        			System.out.println("Total amount you have to paid is "+(count*price));
	        			break;
	        		}
	        	}
	        	else
        			System.out.println("Seat is Not available, Please select the another seat");  	
	        }
	        }
	        break;
	        case "B":
	        {
	        	f=1;
	        	while(true){
	        	if(flag==1)break;
	        	System.out.println("Please select a seat from B1 to B10 ");
	        	String seat=sc.next();
	        	if(rowB.contains(seat))
	        	{
	        		count=count+1;
        			System.out.println(count);
	        		System.out.println("Do you want to add another Please press Yes or No");
	        		String c=sc.next();
	        		if(c.equalsIgnoreCase("Yes"))
	        		{
	        			if(rowB.contains(seat))
	        			{
	        				flag=1;
		        			for(int i=1;i<=10;i++)
		        			{
		        				if(seat.equalsIgnoreCase("B"+i))
		        					rowB.remove("B"+i);
		        			}
	        			
	        			try{
	        		    	ShowTime(rowA,rowB,rowC);
	        		    	}
	        		    	catch(Exception e)
	        		    	{
	        		    		System.out.println(e);
	        		    	}
	        			}
	        			else
    	        			System.out.println("Please select number between B1 - B10");
	        		}
	        		else
	        		{
	        			System.out.println("Total number of persons "+count);
	        			System.out.println("Total amount you have to paid is "+(count*price));
	        			break;
	        		}
	        	}
	        	else
        			System.out.println("Seat is Not available, Please select the another seat");
	        }
	        }
	        break;
	    case "C":
	    {
	    	f=1;
	    	while(true){
	        	if(flag==1)break;
	        	System.out.println("Please select a seat from C1 to C10 ");
	        	String seat=sc.next();
	        	if(rowC.contains(seat))
	        	{
	        		count=count+1;
        			System.out.println(count);
	        		System.out.println("Do you want to add another Please press Yes or No");
	        		String c=sc.next();
	        		if(c.equalsIgnoreCase("Yes"))
	        		{
	        			if(rowC.contains(seat))
	        			{
	        				flag=1;
		        			
	        				for(int i=1;i<=10;i++)
		        			{
		        				if(seat.equalsIgnoreCase("C"+i))
		        					rowC.remove("C"+i);
		        			}
	        			try{
	        		    	ShowTime(rowA,rowB,rowC);
	        		    	}
	        		    	catch(Exception e)
	        		    	{
	        		    		System.out.println(e);
	        		    	}
	        			}
	        			else
    	        			System.out.println("Please select number between C1 - C10");
	        		}
	        		else
	        		{
	        			System.out.println("Total number of persons "+count);
	        			System.out.println("Total amount you have to paid is "+(count*price));
	        			break;
	        		}
	        	}
	        	else
        			System.out.println("Seat is Not available, Please select the another seat");
	        }
	    }
	    break;
	        }
	        }
	  
	    }
	    else
	    {
	    	System.out.println("No show at this time Please choose available time slot");
	    	try{
	    	ShowTime(rowA,rowB,rowC);
	    	}
	    	catch(Exception e)
	    	{
	    		System.out.println(e);
	    	}
	    }
	    
	}
	    
	
		
	
	   
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		LinkedList<String> RowA=new LinkedList<String>();
		LinkedList<String> RowB=new LinkedList<String>();
		LinkedList<String> RowC=new LinkedList<String>();
		
		for(int i=1;i<=10;i++)
		{
			RowA.add("A"+i);
		}
		for(int i=1;i<=10;i++)
		{
			RowB.add("B"+i);
		}
		for(int i=1;i<=10;i++)
		{
			RowC.add("C"+i);
		}
		
		
		System.out.println("Are you a Admin or User?");
		String I1=s.nextLine();
		
		if(I1.equals("Admin"))
		{
			System.out.println("Enter the user name:");
			String username=s.nextLine();
			System.out.println("Enter the password:");
			String password=s.nextLine();
			
			if(username.equals("Murali") && password.equals("Maxi"))
			{
				System.out.println("Do you want to update  your password: Type Yes or No");
				String I2=s.nextLine();
				
				if(I2.equals("Yes"))
				{
					System.out.println("Enter your old password");
					String I3=s.nextLine();
					if(I3.equals("Maxi"))
					{
						System.out.println("Password Matches....");
						while(true)
						{
							System.out.println("Please enter new password:");
							String I4=s.nextLine();
							if(!(I4.equals("Maxi")))
							{
								System.out.println("Password changes");
								break;
							}
							else
							{
								System.out.println("Please enter correct new password ,it is same as old password!");
							}
						}	
					}
					else
					{
						System.out.println("Please enter correct password!!");
					}
					
				}
				else
				{
					System.out.println("Please enter correct password!!");
				}
			}
			else
			{
				System.out.println("Password doesn't matches,Please enter correct password!!");
			}
		}
		
	    else if(I1.equals("User"))
	    {
				ShowTime(RowA,RowB,RowC);
	    }
		
			
	}
	public static void ShowTime(LinkedList RowA,LinkedList RowB,LinkedList RowC )
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Show Timings");
		System.out.println("1)10.00AM TO 12.00PM");
		System.out.println("2)1.00PM TO 4.00PM");
		System.out.println("3)6.00PM TO 9.00PM");
	    System.out.println("4)10.00PM TO 12.OOAM");
	   
	    System.out.println("Enter your slot Time");
	    int Time=sc.nextInt();
	    
	 if(Time==1)
	 {
	    	
	    	System.out.println("Thanks for booking....Your slot time is 10.00AM TO 12.00PM");
	    	BookTicket(Time,RowA,RowB,RowC);
	   
	 }
	 else if(Time==2)
	 {
	    	System.out.println("Thanks for booking....Your slot time is 1.00PM TO 4.00PM");
	    	BookTicket(Time,RowA,RowB,RowC);
	  
	 }
	    	
	 else
	 {
		 System.out.println("Remaining show are not available");
	 }
		
		
		
	}
}
	

	

