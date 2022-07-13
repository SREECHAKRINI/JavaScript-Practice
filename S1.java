import javax.servlet.*;
import java.io.*;
public class S1 extends GenericServlet
{
public void service(ServletRequest rq,ServletResponse rs)
{
try{
rs.setContentType("text/html");
PrintWriter out=rs.getWriter();
out.print("<Html>");
out.print("<Title>My Web</title>");
out.print("<H1>Welcome To Java Servlets</H1>");
out.print("<Hr>");
out.print("<h2><font color=red>It is safe and easy of using servlets</font></h2>");
out.print("</Html>");
out.flush();
}catch(Exception ex){}
}
}