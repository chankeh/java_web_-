package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mypackage.*;
import java.util.*;

public final class tuop_jsp extends org.apache.jasper.runtime.HttpJspBase
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
String  s_tu_bh,s_tu_name,s_tu_yx,s_tu_password,s_tu_dh,s_tu_dz;
 
tuxxop stop=new tuxxop();
 if("del".equals(op)){
    s_tu_bh=DateFormate.toGb((String)request.getParameter("sid"));
   	stop.delete(s_tu_bh);
 
	 
	
      out.write("\r\n");
      out.write("\t<script language=\"javascript\">\r\n");
      out.write("\talert(\"操作成功\");\r\n");
      out.write("\tdocument.location.href=\"tumanager.jsp\";\r\n");
      out.write("\t</script>\r\n");
      out.write("\t");
	
 
}else if("mod".equals(op)){
     s_tu_bh=DateFormate.toGb((String)request.getParameter("s_tu_bh"));
	 s_tu_name=DateFormate.toGb((String)request.getParameter("s_tu_name"));
	 s_tu_yx=DateFormate.toGb((String)request.getParameter("s_tu_yx"));
	 s_tu_dh=DateFormate.toGb((String)request.getParameter("s_tu_dh"));
	 s_tu_dz=DateFormate.toGb((String)request.getParameter("s_tu_dz"));
	 stop.update(s_tu_bh,s_tu_name,s_tu_yx,s_tu_dh,s_tu_dz);
	 
	
      out.write("\r\n");
      out.write("\t<script language=\"javascript\">\r\n");
      out.write("\talert(\"操作成功\");\r\n");
      out.write("\tdocument.location.href=\"tumanager.jsp\";\r\n");
      out.write("\t</script>\r\n");
      out.write("\t");
	 
	 }
 else if("add".equals(op)){
	 s_tu_bh=DateFormate.getId();
	 s_tu_name=DateFormate.toGb((String)request.getParameter("s_tu_name"));
	 s_tu_yx=DateFormate.toGb((String)request.getParameter("s_tu_yx"));
	  s_tu_dh=DateFormate.toGb((String)request.getParameter("s_tu_dh"));
	 s_tu_dz=DateFormate.toGb((String)request.getParameter("s_tu_dz"));
	 s_tu_password="1";
	 
	 stop.add(s_tu_bh,s_tu_name,s_tu_yx,s_tu_password,s_tu_dh,s_tu_dz);
	 
	
      out.write("\r\n");
      out.write("\t<script language=\"javascript\">\r\n");
      out.write("\talert(\"操作成功\");\r\n");
      out.write("\tdocument.location.href=\"tumanager.jsp\";\r\n");
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
