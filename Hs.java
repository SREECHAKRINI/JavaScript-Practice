import java.io.*;
import javax.servlet.http.*;
public class Hs extends HttpServlet
{
public void doGet(HttpServletRequest rq,HttpServletResponse rs)
{
rs.setContentType("text/HTML");
try
{
PrintWriter out=rs.getWriter();
out.println("<h1> hello from doget() </h1>");
}
catch(Exception e)
{
e.printStackTrace();
}
}
public void doPost(HttpServletRequest rq,HttpServletResponse rs)
{
rs.setContentType("text/HTML");
try
{
PrintWriter out=rs.getWriter();
out.println("<h1> hello from dopost() </h1>");
}
catch(Exception e)
{
e.printStackTrace();
}
}
public void doTrace(HttpServletRequest rq,HttpServletResponse rs)
{
rs.setContentType("text/HTML");
try
{
PrintWriter out=rs.getWriter();
out.println("<h1> hello from dotrace() </h1>");
}
catch(Exception e)
{
e.printStackTrace();
}
}public void doPut(HttpServletRequest rq,HttpServletResponse rs)
{
rs.setContentType("text/HTML");
try
{
PrintWriter out=rs.getWriter();
out.println("<h1> hello from doput() </h1>");
}
catch(Exception e)
{
e.printStackTrace();
}
}public void doHead(HttpServletRequest rq,HttpServletResponse rs)

{
rs.setContentType("text/HTML");
try
{
PrintWriter out=rs.getWriter();
out.println("<h1> hello from dohead() </h1>");
}
catch(Exception e)
{
e.printStackTrace();
}
}public void doOptions(HttpServletRequest rq,HttpServletResponse rs)

{
rs.setContentType("text/HTML");
try
{
PrintWriter out=rs.getWriter();
out.println("<h1> hello from dooptions() </h1>");
}
catch(Exception e)
{
e.printStackTrace();
}
}public void doDelete(HttpServletRequest rq,HttpServletResponse rs)

{
rs.setContentType("text/HTML");
try
{
PrintWriter out=rs.getWriter();
out.println("<h1> hello from dodelete() </h1>");
}
catch(Exception e)
{
e.printStackTrace();
}
}
}

