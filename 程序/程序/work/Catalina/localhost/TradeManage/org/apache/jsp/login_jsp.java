package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=gb2312");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      com.mingri.dbconn.DBResult rst = null;
      synchronized (_jspx_page_context) {
        rst = (com.mingri.dbconn.DBResult) _jspx_page_context.getAttribute("rst", PageContext.PAGE_SCOPE);
        if (rst == null){
          rst = new com.mingri.dbconn.DBResult();
          _jspx_page_context.setAttribute("rst", rst, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');
      com.mingri.showtime.ShowTime calendar = null;
      synchronized (_jspx_page_context) {
        calendar = (com.mingri.showtime.ShowTime) _jspx_page_context.getAttribute("calendar", PageContext.PAGE_SCOPE);
        if (calendar == null){
          calendar = new com.mingri.showtime.ShowTime();
          _jspx_page_context.setAttribute("calendar", calendar, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');

   request.setCharacterEncoding("gb2312");//对请求进行统一编码，能正常接受到中文
   String username=request.getParameter("username"); //接收表单中的username属性
   String password=request.getParameter("password");//接收表单中的password属性
   String str="select * from tb_user where "+
               "username='"+username+"' and password='"+password+"'";
   ResultSet rs=rst.getResult(str);//执行SQL语句获得结果集对象
   session.setAttribute("isLog",new String("0"));//判断用户是否登陆，当isLog的属性为0时，说明用户并没有登陆
   if(!rs.next())//结果集没有找到所要查找的行
   {
    out.println("<script language='javascript'>alert('用户名或密码错误');"+
                "parent.location.href='login.html';</script>");
   }
   else
   {
     session.setAttribute("username",rs.getString("username"));//保存登录信息到session对象中
     session.setAttribute("password",rs.getString("password"));
     session.setAttribute("isLog",new String("1"));//将isLog属性设置为1
     //获得用户上次登陆系统的时间
     session.setAttribute("userLastLogTime",rs.getString("userLastLogTime"));
     String strsql=calendar.getDate();
     int id=rs.getInt("ID");
     //将该用户本次登陆系统的时间在用户信息表中更新
     String strUpdate="update tb_user set userLastLogTime='"+strsql+"' where ID="+id+"";
     rst.getResult(strUpdate);//执行SQL语句
     response.sendRedirect("chat.jsp");//登陆成功后转到系统主页面
   }

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
