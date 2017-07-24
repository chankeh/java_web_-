package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.*;
import java.sql.*;

public final class chklog_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html; charset=GB2312");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write('	');
      MyBean.dbcon dbc = null;
      synchronized (session) {
        dbc = (MyBean.dbcon) _jspx_page_context.getAttribute("dbc", PageContext.SESSION_SCOPE);
        if (dbc == null){
          dbc = new MyBean.dbcon();
          _jspx_page_context.setAttribute("dbc", dbc, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');

String sworkerid;
sworkerid=(String)session.getValue("myid");

String userid=request.getParameter("id");
String userpass=request.getParameter("pwd");
String select=request.getParameter("sect");
String sql=null;
ResultSet rs=null;
if(sworkerid!=null)
{
out.print("<script>alert('您已经登录！');history.back();</script>");
}
else
{
int nId = Integer.parseInt(select);
switch(nId){
case 0:
sql="select * from t_worker where workerid='"+userid+"' and workerpass='"+userpass+"'";
break;
case 3:
sql="select * from t_employee where employeeid='"+userid+"' and pass='"+userpass+"'";
break;
case 4:
sql="select * from t_student where studentid='"+userid+"' and pass='"+userpass+"'";
break;
}
rs=dbc.executeQuery(sql);
if(!rs.next())
{
out.print("<script>alert('您输入的用户不存在或密码错误，请重新登录！');history.back();</script>");
}
else{
session.setAttribute("myid",userid);
//session.setAttribute("myid",rs.getString("userid"));
session.setAttribute("myselect",select);
//session.setAttribute("MM_Select",rs.getString("select"));
response.sendRedirect("main.jsp");
}
}

    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
