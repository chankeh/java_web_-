package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mypackage.*;
import java.util.*;

public final class logintest_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=gb2312");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");

String username=DateFormate.toGb((String)request.getParameter("username"));
String password=DateFormate.toGb((String)request.getParameter("password"));
String type=DateFormate.toGb((String)request.getParameter("type"));
LoginManager lm=new LoginManager();
if(!lm.testUser(username,password,type)){
 

  if ("2".equals(type)){
  
      out.write("\r\n");
      out.write("    <script language=\"javascript\">\r\n");
      out.write("\talert(\"没有查到此考生信息！\");\r\n");
      out.write("\tdocument.location.href=\"login.jsp\";\r\n");
      out.write("     </script>\r\n");
      out.write("  ");
}
  else
  {
      out.write("\r\n");
      out.write("    <script language=\"javascript\">\r\n");
      out.write("\talert(\"用户名或密码错误！\");\r\n");
      out.write("\tdocument.location.href=\"admin.jsp\";\r\n");
      out.write("    </script>\r\n");
      out.write("   ");
}

}else{
   if("2".equals(type)){
	session.setAttribute("s_usertype",type);
	session.setAttribute("s_username",username);
	session.setAttribute("s_userpasword",password);
	;
 
      GgManager gm=new GgManager();
	  Gg gg=gm.getGgInfo();
	  String zt=gg.getGgnr();
	  if ("1".equals(zt))
	  {
	  ktxxop ktop=new ktxxop();
	  ktop.exekt(username);
	  response.sendRedirect("mainframe1.jsp");
	  }
	  else
	  {
	  
      out.write("\r\n");
      out.write("       <script language=\"javascript\">\r\n");
      out.write("\t   alert(\"考试未正试开始，不允许进行系统！\");\r\n");
      out.write("\t   document.location.href=\"login.jsp\";\r\n");
      out.write("       </script>\r\n");
      out.write("      ");

	  }
	 
	
	}
	else
	{
	session.setAttribute("s_usertype",type);
	session.setAttribute("s_username",username);
	session.setAttribute("s_userpasword",password);
	response.sendRedirect("mainframe2.jsp");
	}
}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<title>登录测试</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("<iframe  width=\"0\" height=\"0\"></iframe>\r\n");
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
