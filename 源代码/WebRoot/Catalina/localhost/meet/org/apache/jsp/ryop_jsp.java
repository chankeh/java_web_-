package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mypackage.*;
import java.util.*;

public final class ryop_jsp extends org.apache.jasper.runtime.HttpJspBase
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

String op=DateFormate.toGb((String)request.getParameter("op"));
String username="",password="",nl,dw,dh,dz;
int    li_count=0;
ptuserop ptop=new ptuserop();
 if("del".equals(op)){
	username=DateFormate.toGb((String)request.getParameter("username"));
	
 
	 
	ptop.delete(username);
	
      out.write("\r\n");
      out.write("\t<script language=\"javascript\">\r\n");
      out.write("\talert(\"操作成功\");\r\n");
      out.write("\tdocument.location.href=\"rymanager.jsp\";\r\n");
      out.write("\t</script>\r\n");
      out.write("\t");
	 
}else if("mod".equals(op)){
	username=DateFormate.toGb((String)request.getParameter("username"));
	password=DateFormate.toGb((String)request.getParameter("password"));
	 
	 ptop.update(username,password);
	 
	
      out.write("\r\n");
      out.write("\t<script language=\"javascript\">\r\n");
      out.write("\talert(\"操作成功\");\r\n");
      out.write("\tdocument.location.href=\"rymanager.jsp\";\r\n");
      out.write("\t</script>\r\n");
      out.write("\t");
	}
 else if("add".equals(op)){
	username=DateFormate.toGb((String)request.getParameter("username"));
	password=DateFormate.toGb((String)request.getParameter("password"));
	 nl=DateFormate.toGb((String)request.getParameter("nl"));
	 dw=DateFormate.toGb((String)request.getParameter("dw"));
	 dh=DateFormate.toGb((String)request.getParameter("dh"));
	 dz=DateFormate.toGb((String)request.getParameter("dz"));
	 ptop.add(username,password,nl,dw,dh,dz);
	 
	
      out.write("\r\n");
      out.write("\t<script language=\"javascript\">\r\n");
      out.write("\talert(\"用户注册成功，请输入用户名密码进行登陆... ...\");\r\n");
      out.write("\tdocument.location.href=\"login.jsp\";\r\n");
      out.write("\t</script>\r\n");
      out.write("\t");
	}
	
	
	

      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<title> </title>\r\n");
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
