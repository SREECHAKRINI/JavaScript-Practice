import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import java.util.*;
import java.text.*;
public class PageFilter implements Filter
{
private String encoding;
public void init(FilterConfig config) throws ServletException
{
encoding="UTF-8";
String enc=config.getInitParameter("encoding");
if(enc!=null&&enc.length()>0)
{
encoding=enc;
}
}
public void destroy()
{}
public void doFilter(ServletRequest request,ServletResponse response,FilterChain chain)throws IOException,ServletException
{
request.setCharacterEncoding(encoding);
HttpServletRequest
rq=(HttpServletRequest)request;
response.setContentType("text/html");
Date d=new Date();
int h=d.getHours();
if(h<8||h>10)
{
PrintWriter out=response.getWriter();
out.println("<h3><center><br><br><br><br><br><hr><font color=red>service available only between 8 to 10<hr></center></h3>");
}
else
{
chain.doFilter(request,response);
}
}
}