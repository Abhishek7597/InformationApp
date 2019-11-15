

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 * Servlet implementation class AddOrEdit
 */
@WebServlet("/AddOrEdit")
public class AddOrEdit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddOrEdit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*if(request.getParameter("addyuvak")!= "null")
		{
			addYuvak(request);
		}*/
		if(request.getParameter("edityuvak")!= "null")
		{
			editYuvak(request);
		}
		
	}
	
	protected void addYuvak(HttpServletRequest request) throws ServletException, IOException
	{
		try {
			String firstName = request.getParameter("firstName");
			String lastName = request.getParameter("lastName");
			String address = request.getParameter("address");
			String age =request.getParameter("age");
			
			Class.forName("com.mysql.jdbc.Driver");  

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
			Statement stmt = conn.createStatement();

			String sql1 = " Insert Into yuvaks (FirstName, LastName, Address, Age) values ('" +  firstName + "','" + lastName + "','" + address + "','" + age + "')";
			int rows1 = stmt.executeUpdate(sql1);
			
			//out.println(rows + " rows added to the table.");
			
			//response.sendRedirect("YuvakData.jsp"); 
			conn.close();
		}

		catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	
	protected void editYuvak(HttpServletRequest request) throws ServletException, IOException
	{
		try {
			
			String firstName = request.getParameter("firstName");
			String lastName = request.getParameter("lastName");
			String address = request.getParameter("address");
			String age =request.getParameter("age");
			String id = request.getParameter("num");
			System.out.print(id);
			
			Class.forName("com.mysql.jdbc.Driver");  

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
			Statement stmt = conn.createStatement();

			String sql = "UPDATE test.Yuvaks set FirstName = '"+firstName+"',LastName = '"+lastName+"',Address = '"+address+"',Age = '"+age+"' where Id = '"+id+"'";
			//String sql2 = "Delete from yuvaks where FirstName = 'null' and LastName = 'null' and Address = 'null' and Age = 'null'";
			//select userId, password from test.user where userId = 'Abhishek' and password = 'abhi'
			int rows = stmt.executeUpdate(sql);
			//int rows2= stmt.executeUpdate(sql2);
			
			conn.close();
		}

		catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

}
