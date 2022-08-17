package com.ecommerce;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 * Servlet implementation class Product_serv
 */
@WebServlet("/Product_serv")
public class Product_serv extends HttpServlet 
{
	static private final String url = "jdbc:mysql://localhost:3306/db_world";
	static private final String user = "root";
	static private final String password = "root";
	
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String query = "select * from product where Id=?";
		int pid = Integer.parseInt(request.getParameter("pid"));
		PrintWriter out = response.getWriter();
		
		try{
			try{
				Class.forName("com.mysql.jdbc.Driver");
			}
			catch(Exception e){
				e.getStackTrace();
			}
			
			con = DriverManager.getConnection(url,user,password);
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, pid);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
		}
		catch(Exception e){
			e.getStackTrace();
		}
		finally{
			try{
				con.close();
				rs.close();
				pstmt.close();
			}
			catch (Exception e){
				e.getStackTrace();
			}
		}
	
	}

}
