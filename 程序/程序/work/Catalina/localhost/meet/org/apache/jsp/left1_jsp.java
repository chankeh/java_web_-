package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mypackage.*;
import java.util.*;

public final class left1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<title>会议系统</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".STYLE1 {font-size: 12px}\r\n");
      out.write(".STYLE2 {\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("\tfunction changeColor(){\r\n");
      out.write("\t\tdocument.getElementById(\"no1\").style.background=\"#F9FCFF\";\r\n");
      out.write("\t\tdocument.getElementById(\"no2\").style.background=\"#F9FCFF\";\r\n");
      out.write("\t\tdocument.getElementById(\"no3\").style.background=\"#F9FCFF\";\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction changeFrame(filename){\r\n");
      out.write("\t\tparent.mainFrame.location.href=filename;\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body leftmargin=\"0\" topmargin=\"0\" bgcolor=\"#F7F7F7\">\r\n");
      out.write("<table width=\"200\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"border-right:1px solid #9EC3F2\">\r\n");
      out.write("  <!--DWLayoutTable-->\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"13\" colspan=\"3\" valign=\"top\"><!--DWLayoutEmptyCell-->&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"11\" height=\"104\">&nbsp;</td>\r\n");
      out.write("    <td width=\"175\" valign=\"top\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"1\" bgcolor=\"#9EC3F2\" style=\"font-size:12px\">\r\n");
      out.write("      <!--DWLayoutTable-->\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"173\" height=\"25\" align=\"center\" valign=\"middle\" background=\"img/bg_titlebarr.gif\" bgcolor=\"#F9FCFF\" class=\"STYLE1\" id=\"no3\" style=\"cursor:hand;\" onclick=\"javascript:changeFrame(' ');\" onmousedown=\"javascript:changeColor();this.style.background='#FFFFFF'\"><span class=\"STYLE2\"><img src=\"img/info.gif\" width=\"16\" height=\"16\" /></span>会议信息</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td id=\"no3\" height=\"25\" align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\" class=\"STYLE1\" onmousedown=\"javascript:changeColor();this.style.background='#FFFFFF'\" onclick=\"javascript:changeFrame('tzmanager2.jsp');\" style=\"cursor:hand;\">会议通知查看</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td id=\"no3\" height=\"25\" align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\" class=\"STYLE1\" onmousedown=\"javascript:changeColor();this.style.background='#FFFFFF'\" onclick=\"javascript:changeFrame('addsc.jsp');\" style=\"cursor:hand;\">稿件上传</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td id=\"no3\" height=\"25\" align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\" class=\"STYLE1\" onmousedown=\"javascript:changeColor();this.style.background='#FFFFFF'\" onclick=\"javascript:changeFrame('scmanager.jsp');\" style=\"cursor:hand;\">稿件跟踪</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td id=\"no3\" height=\"25\" align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\" class=\"STYLE1\" onmousedown=\"javascript:changeColor();this.style.background='#FFFFFF'\" onclick=\"javascript:changeFrame('xzmanager2.jsp');\" style=\"cursor:hand;\">会议信息下载</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      \r\n");
      out.write("    </table></td>\r\n");
      out.write("    <td width=\"13\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"483\">&nbsp;</td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
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
