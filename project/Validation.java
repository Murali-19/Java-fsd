package project;

import java.util.regex.*;    
import java.util.*;  
public class Validation 
{
	public static void main(String args[]){  
        ArrayList<String> e = new ArrayList<String>();  
        e.add("maxi@domain.co.in");  
        e.add("murali@domain.com");  
        e.add("murali.name@domain.com");  
        e.add("jack#@domain.co.in");  
    
      
        
        e.add("@yah.com");  
        e.add("#domain.com");  
   
        
        
        String regex = "^(.+)@(.+)$";  
        
        Pattern pattern = Pattern.compile(regex);  
  
        for(String email : e){  
    
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }  
    }  
}  

