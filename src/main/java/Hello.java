// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;  


// Extend HttpServlet class
public class Hello extends HttpServlet {

   private String message;

   public void init() throws ServletException {
      // Do required initialization
      message = "Hello World: src/main/java/Hello.java";
   }

   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

      // Set response content type
      response.setContentType("text/html");

      // Actual logic goes here.
      PrintWriter out = response.getWriter();
      out.println("<h1>" + message + "</h1>");
   }
}
class MysqlCon{  
   public static void main(String args[]){  
      try{  
         Class.forName("com.mysql.jdbc.Driver");  
         Connection con=DriverManager.getConnection(  
         "jdbc:mysql://localhost:3306/sonoo","root","root");  
         //here sonoo is database name, root is username and password  
         Statement stmt=con.createStatement();  
         ResultSet rs=stmt.executeQuery("select * from emp");  
         while(rs.next())  
         System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
         con.close();  
      }
      catch(Exception e){ 
         System.out.println(e);
      }  
    }  
}  
