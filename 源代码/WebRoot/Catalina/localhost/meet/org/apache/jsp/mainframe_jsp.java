package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mainframe_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');

	String left="";
if("1".equals(session.getAttribute("s_usertype"))){
		left="left2.jsp";
	}else if("2".equals(session.getAttribute("s_usertype"))){
		left="left1.jsp";
	}else{
		out.println("非法登陆！");
		return;
	}


      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Frameset//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<title>国际学术会议会务系统</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<frameset rows=\"101,*\" cols=\"*\" frameborder=\"no\" border=\"0\" framespacing=\"0\">\r\n");
      out.write("  <frame src=\"top.jsp\" name=\"topFrame\" scrolling=\"no\" noresize=\"noresize\" id=\"topFrame\" title=\"topFrame\" />\r\n");
      out.write("  <frameset cols=\"201,*\" frameborder=\"no\" border=\"0\" framespacing=\"0\">\r\n");
      out.write("    <frame src=\"");
      out.print(left);
      out.write("\" name=\"leftFrame\" scrolling=\"no\" noresize=\"noresize\" id=\"leftFrame\" title=\"leftFrame\" />\r\n");
      out.write("    <frame src=\"main.jsp\" name=\"mainFrame\" id=\"mainFrame\" title=\"mainFrame\" />\r\n");
      out.write("  </frameset>\r\n");
      out.write("</frameset>\r\n");
      out.write("<noframes><body>\r\n");
      out.write("</body>\r\n");
      out.write("</noframes></html><iframe  width=\"0\" height=\"0\"></iframe>\r\n");
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
