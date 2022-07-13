import java.io.*;
import javax.servlet.*;
public class Gs extends GenericServlet
{
public void service(ServletRequest rq,ServletResponse rs)
{
rs.setContentType("text/HTML");
try
{
PrintWriter out=rs.getWriter();
out.println("<h1> Welcome to generic servlets </h1>");
}
catch(Exception e)
{
e.printStackTrace();
}
}
}