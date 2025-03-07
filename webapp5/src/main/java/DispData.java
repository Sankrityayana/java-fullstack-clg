
import java.sql.*;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DispData
 */
@WebServlet("/DispData")
public class DispData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DispData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html"); 
	       PrintWriter out = response.getWriter(); 
	       try{ 
	          String rno=request.getParameter("rollno"); 
	          int rn=Integer.valueOf(rno); 
	          Class.forName("com.mysql.cj.jdbc.Driver"); 
	          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/uni","root","root@123"); 
	          PreparedStatement ps=con.prepareStatement("select * from mark where rollno=?"); 
	          ps.setInt(1,rn); 
	          out.print("<table width=50% border=1>"); 
	          out.print("<caption>Result:</caption>"); 
	          ResultSet rs=ps.executeQuery(); 
	         /* Printing column names */ 
	          ResultSetMetaData rsmd=rs.getMetaData(); 
	          int total=rsmd.getColumnCount(); 
	          out.print("<tr>"); 
	          for(int i=1;i<=total;i++) 
	          { 
	              out.print("<th>"+rsmd.getColumnName(i)+"</th>"); 
	          } 
	          out.print("<th>Status</th></tr>"); 
	         /* Printing result */ 
	         while(rs.next()) 
	         { 
	              out.print("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+ "</td><td>" + rs.getInt(4)+"</td><td>" + rs.getInt(5)+"</td><td>" +  rs.getInt(6)+"</td><td>"+ rs.getInt(7)+"</td><td>" + rs.getInt(8)+"</td><td>"+ rs.getInt(9)+"</td><td>"+ rs.getInt(10)+"</td><td>"+rs.getInt(11)+"</td><td>"); 
	if(rs.getInt(4)>=40 && rs.getInt(5)>=40 && rs.getInt(6)>=40 && rs.getInt(7)>=40 && rs.getInt(8)>=40 && rs.getInt(9)>=40 && rs.getInt(10)>=40 && rs.getInt(11)>=40) 
	out.print("<td>Pass</td>"+"</td></tr>");
	else
	out.print("<td>Fail</td>"+"</td></tr>");
	} 
	out.print("</table>"); 
	}catch (Exception e2) {e2.printStackTrace();} 
	finally{out.close();}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
