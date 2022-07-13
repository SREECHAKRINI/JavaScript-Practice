import java.io.*;
import javax.servlet.*;
import java.util.*;
public class Gs1 extends GenericServlet
{
public void service(ServletRequest rq,ServletResponse rs)
{
rs.setContentType("text/HTML");
try
{
PrintWriter out=rs.getWriter();
Enumeration e=getServletConfig().getInitParameterNames();
while(e.hasMoreElements())
{
String name=(String)e.nextElement();
String value=getServletConfig().getInitParameter(name);
out.println("<h1>Name:"+name+"</h1>");
out.println("<h2>Value:"+value+"</h2>");
}
}
catch(Exception ex)
{
ex.printStackTrace();
}
}
}