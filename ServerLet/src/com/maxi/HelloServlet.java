package com.maxi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloServlet 
{
	 public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
     {
     	  System.out.println("Iam in the home servlet");
     }

}
