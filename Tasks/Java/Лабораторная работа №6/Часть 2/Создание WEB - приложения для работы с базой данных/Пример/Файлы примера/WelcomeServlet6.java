import javax.servlet.*; 
import javax.servlet.http.*; 
import java.io.*;
public class WelcomeServlet6 extends HttpServlet { 
public void doPost(HttpServletRequest request,
 HttpServletResponse response) throws ServletException, IOException
{
response.setContentType("text/html"); 
PrintWriter out = response.getWriter(); 
out.println("<HTML>"); 
out.println("<HEAD>"); 
out.println("<TITLE>Welcome</TITLE>"); 
out.println("</HEAD>"); 
out.println("<BODY>");
out.println("<P>Quit</P>");
out.println("</BODY>");
out.println("</HTML>");
}
}

