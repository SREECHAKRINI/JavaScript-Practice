import java.io.*;
import javax.servlet.*;
public class Si implements Servlet
{
ServletConfig cfg;
public void init(ServletConfig cfg)
{
this.cfg=cfg;
}
public void service(ServletRequest rq,ServletResponse rs)
{
rs.setContentType("text/HTML");
try
{
PrintWriter out=rs.getWriter();
out.println("<h1> welcome to java servlets </h1>");
}
catch(Exception e)
{
e.printStackTrace();
}
}
public ServletConfig getServletConfig()
{
return cfg;
}
public String getServletInfo()
{
return "this is my first servlet";
}
public void destroy()
{
cfg=null;
}
}