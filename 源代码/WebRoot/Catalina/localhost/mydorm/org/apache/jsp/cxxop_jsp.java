package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mypackage.*;
import java.util.*;

public final class cxxop_jsp extends org.apache.jasper.runtime.HttpJspBase
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
String lmc="",fmc="",cmc="";
 
cxxop cxx=new cxxop();
if("add".equals(op)){
	lmc=DateFormate.toGb((String)request.getParameter("lmc"));
	fmc=DateFormate.toGb((String)request.getParameter("fmc"));
	cmc=DateFormate.toGb((String)request.getParameter("cmc"));
 
	if(!cxx.checkfull(fmc,lmc))
	{
	
      out.write("\r\n");
      out.write("\t<script language=\"javascript\">\r\n");
      out.write("\talert(\"此房间床位数已达到上限\");\r\n");
      out.write("\tdocument.location.href=\"cxxmanager.jsp\";\r\n");
      out.write("\t</script>\r\n");
      out.write("\t");

	}
	else
	{
	cxx.add(cmc,fmc,lmc);
	
      out.write("\r\n");
      out.write("\t<script language=\"javascript\">\r\n");
      out.write("\talert(\"操作成功\");\r\n");
      out.write("\tdocument.location.href=\"cxxmanager.jsp\";\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("\t");
}
}else if("del".equals(op)){
	lmc=DateFormate.toGb((String)request.getParameter("lmc"));
	fmc=DateFormate.toGb((String)request.getParameter("fmc"));
	cmc=DateFormate.toGb((String)request.getParameter("cmc"));
	 
		
	cxx.delete(cmc,lmc,fmc);
	
      out.write("\r\n");
      out.write("\t<script language=\"javascript\">\r\n");
      out.write("\talert(\"操作成功\");\r\n");
      out.write("\tdocument.location.href=\"cxxmanager.jsp\";\r\n");
      out.write("\t</script>\r\n");
      out.write("\t \r\n");
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
