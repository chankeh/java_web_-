package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class dl_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Frameset//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      com.bwm.db.Conn con = null;
      synchronized (_jspx_page_context) {
        con = (com.bwm.db.Conn) _jspx_page_context.getAttribute("con", PageContext.PAGE_SCOPE);
        if (con == null){
          con = new com.bwm.db.Conn();
          _jspx_page_context.setAttribute("con", con, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<title>无标题文档</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<frameset rows=\"250,*,36\" cols=\"*\" frameborder=\"no\" border=\"0\" framespacing=\"0\">\r\n");
      out.write("  <frame src=\"../student/zs5.htm\" name=\"topFrame\" scrolling=\"No\" noresize=\"noresize\" id=\"topFrame\" title=\"topFrame\" />\r\n");
      out.write("  <frameset rows=\"*\" cols=\"190,*\" framespacing=\"0\" frameborder=\"no\" border=\"0\">\r\n");
      out.write("    <frame src=\"zc2.htm\" name=\"leftFrame\" scrolling=\"No\" noresize=\"noresize\" id=\"leftFrame\" title=\"leftFrame\" />\r\n");
      out.write("    <frameset rows=\"33,*\" cols=\"*\" framespacing=\"0\" frameborder=\"no\" border=\"0\">\r\n");
      out.write("\t\t<frame src=\"../zs1.htm\" name=\"topFrame1\" scrolling=\"No\" noresize=\"noresize\" id=\"topFrame1\" title=\"topFrame1\" />\r\n");
      out.write("\t\t<frame src=\"dl3.htm\" name=\"mainFrame\" id=\"mainFrame\" title=\"mainFrame1\" />\r\n");
      out.write("\t</frameset>\r\n");
      out.write("  </frameset>\r\n");
      out.write("  <frame src=\"../zs2.htm\" title=\"undefined1\" />\r\n");
      out.write("</frameset>\r\n");
      out.write("<noframes><body>\r\n");
      out.write("</body>\r\n");
      out.write("</noframes></html>\r\n");
      out.write("\r\n");
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
