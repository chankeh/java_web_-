package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class top_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<title>logo</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".STYLE1 {font-size: 12px}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("\tfunction exit(){\r\n");
      out.write("\t\tif(confirm(\"您真的要退出本系统吗？\")){\r\n");
      out.write("\t\t\tparent.document.location.href=\"login.jsp\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction modipass(){\r\n");
      out.write("\t\tparent.mainFrame.document.location.href=\"modipass.jsp\";\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body leftmargin=\"0\" topmargin=\"0\" bgcolor=\"#F7F7F7\">\r\n");
      out.write("\r\n");
      out.write("<table width=\"1024\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("  <!--DWLayoutTable-->\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"80\" colspan=\"3\" valign=\"top\" background=\"img/logo.gif\"><!--DWLayoutEmptyCell-->&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"193\" height=\"20\" align=\"left\" valign=\"bottom\" background=\"img/bg_titlebarr.gif\" class=\"STYLE1\" style=\"border-bottom:1px solid #9EC3F2\">&nbsp;<img src=\"img/topicon.gif\" width=\"7\" height=\"7\" /> 尊敬的 [");
      out.print(session.getAttribute("s_username") );
      out.write("] 您好!</td>\r\n");
      out.write("    <td width=\"388\" align=\"left\" valign=\"bottom\" background=\"img/bg_titlebarr.gif\" style=\"border-bottom:1px solid #9EC3F2\"><span class=\"STYLE1\">今天是：\r\n");
      out.write("      <script language=\"JavaScript\"  src=\"inc/date.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    </span></td>\r\n");
      out.write("    <td width=\"443\" align=\"left\" valign=\"bottom\" background=\"img/bg_titlebarr.gif\" class=\"STYLE1\" style=\"border-bottom:1px solid #9EC3F2\" onclick=\"javasciprt:modipass();\" style=\"cursor:hand;\">[修改个人密码] <span onclick=\"javasciprt:exit();\" style=\"cursor:hand;\">[退出系统]</span></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
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
