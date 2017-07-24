package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');
      com.bean.SystemBean sn = null;
      synchronized (_jspx_page_context) {
        sn = (com.bean.SystemBean) _jspx_page_context.getAttribute("sn", PageContext.PAGE_SCOPE);
        if (sn == null){
          sn = new com.bean.SystemBean();
          _jspx_page_context.setAttribute("sn", sn, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');

List list = sn.getSiteInfo();
String str = list.get(0).toString();
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Frameset//EN\">\r\n");
      out.write("<HTML><HEAD><TITLE>网站后台管理---");
      out.print(str );
      out.write("</TITLE>\r\n");
      out.write("<META http-equiv=Content-Type content=\"text/html; charset=gb2312\">\r\n");
      out.write("<META content=\"MSHTML 6.00.2900.3243\" name=GENERATOR></HEAD>\r\n");

	String username=(String)session.getAttribute("user");
	if(username==null){
		response.sendRedirect(path+"/error.jsp");
	}
	else{
		String dir=sn.getDir();		

      out.write("\r\n");
      out.write("<FRAMESET border=0 frameSpacing=0 rows=65,*,33 frameBorder=0>\r\n");
      out.write("<FRAME name=FrameTop src=\"");
      out.print(basePath );
      out.print(dir );
      out.write("/iframe/top.jsp\" frameBorder=no noResize scrolling=no>\r\n");
      out.write("<FRAMESET border=0 name=FrameMain frameSpacing=0 frameBorder=0 cols=165,*>\r\n");
      out.write("<FRAME name=LeftFrame marginWidth=0 marginHeight=0 src=\"");
      out.print(basePath );
      out.print(dir );
      out.write("/iframe/left.jsp\" frameBorder=no scrolling=no>\r\n");
      out.write("<FRAMESET border=0 frameSpacing=0 rows=*,26 frameBorder=0>\r\n");
      out.write("<FRAME name=MainFrame marginWidth=0 marginHeight=0 src=\"");
      out.print(basePath );
      out.print(dir );
      out.write("/iframe/main.jsp\" frameBorder=no noResize scrolling=yes>\r\n");
      out.write("<FRAME name=BottomFrame marginWidth=0 marginHeight=0 src=\"");
      out.print(basePath );
      out.print(dir );
      out.write("/iframe/help.jsp\" frameBorder=no scrolling=no>\r\n");
      out.write("</FRAMESET>\r\n");
      out.write("</FRAMESET>\r\n");
      out.write("<FRAME name=FrameBottom marginWidth=0 marginHeight=0 src=\"");
      out.print(basePath );
      out.print(dir );
      out.write("/iframe/foot.jsp\" frameBorder=no noResize scrolling=no>\r\n");
      out.write("</FRAMESET>\r\n");
} 
      out.write("\r\n");
      out.write("</HTML>\r\n");
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
