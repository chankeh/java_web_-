package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.bwm.db.Condb;
import java.util.Date;

public final class check_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("<title>处理登录页面</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");

	Date date=new Date();
	Condb con=new Condb();
	String username=request.getParameter("username");
	String Rname=request.getParameter("Rname");
	String password=request.getParameter("password");
	String email=request.getParameter("email");
	String address=request.getParameter("address");
	String photo=request.getParameter("photo");
	String pass=request.getParameter("pass");
	String question=request.getParameter("question");
	String str="select Username from tb_User where Username='"+username+"'";
	ResultSet rs=con.executeQuery(str);
	if(rs.next()){

      out.write("\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("\talert(\"此用户已经被占用请重新注册\");\r\n");
      out.write("\thistory.back();\r\n");
      out.write("</script>\r\n");

	}else{
		String sql="insert into tb_User(Username,Rname,Userpass,Email,Address,Photo,Question,Result,Dattime)values('"+username+"','"+Rname+"','"+password+"','"+email+"','"+address+"','"+photo+"','"+pass+"','"+question+"','"+date.toLocaleString()+"')";
		int temp=con.executeUpdate(sql);

      out.write("\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("\talert(\"注册成功\");\r\n");
      out.write("\twindow.location.href=(\"../index.jsp\");\r\n");
      out.write("</script>\r\n");
		
}con.close();

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
