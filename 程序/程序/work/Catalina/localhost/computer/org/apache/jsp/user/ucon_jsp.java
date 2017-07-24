package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.bwm.db.Condb;

public final class ucon_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  public Object getDependants() {
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

      out.write('\r');
      out.write('\n');
 request.setCharacterEncoding("gb2312"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("<title>无标题文档</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");

	Condb con=new Condb();
	String login=request.getParameter("login");
	if(login!=null&&login.equals("注册")){
		response.sendRedirect("../user/index.htm");
	}
	if(login!=null&&login.equals("登录")){
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String sql="select * from tb_User where Username='"+username+"' and Userpass='"+password+"'";
		ResultSet rs=con.executeQuery(sql);
		if(rs.next()){
			session.setAttribute("username",username);
			session.setAttribute("password",password);


      out.write("\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("\talert(\"登录成功\");\r\n");
      out.write("</script>\r\n");

		response.sendRedirect("../index.jsp");
		}else{

      out.write("\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("\talert(\"用户名或密码错误\");\r\n");
      out.write("\thistory.back();\r\n");
      out.write("</script>\r\n");

		}
		
	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
