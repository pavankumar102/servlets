import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Hello extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html>");
		out.println("<body bgcolor=yellow>");
		out.println("<h1>hello welcome to servlet environment<h1>");
		out.println("</body>");
		out.println("<html>");
	}
}	
	

