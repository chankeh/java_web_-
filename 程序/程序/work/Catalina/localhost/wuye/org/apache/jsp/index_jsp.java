package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;
import java.sql.*;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(2);
    _jspx_dependants.add("/head.jsp");
    _jspx_dependants.add("/left.jsp");
  }

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
      			"", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
request.setCharacterEncoding("gb2312");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>无标题文档</title>\r\n");
      out.write("<link href=\"/css/text.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");

//String UserName = "";

String strURL = "";
if(request.getParameter("url") != null)
{
	strURL = "buildInfo/"+request.getParameter("url");
}
else
	strURL = "buildInfo/buildInfo.jsp";

      out.write("\r\n");
      out.write("<body bgcolor=\"#CCCCCC\" leftmargin=\"0\" topmargin=\"0\">\r\n");
      out.write("<table width=\"760\" height=\"598\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\"\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td height=\"163\" colspan=\"2\">");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<title>无标题文档</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".STYLE4 {font-size: 36px}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<table width=\"100%\" height=\"153\" border=\"0\" align=\"center\" bgcolor=\"#99CC66\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"150\" align=\"center\" valign=\"middle\"><span class=\"STYLE4\">物业管理系统</span></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td width=\"203\"  height=\"100%\"  align=\"center\" valign=\"top\" bgcolor=\"#99CC66\" id=Content>");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<title>无标题文档</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<table width=\"100%\" border=\"0\" bgcolor=\"#99CC66\">\r\n");
      out.write("  <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("    <td height=\"20\" colspan=\"2\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("    <td width=\"6%\" height=\"20\"><img src=\"image/fh.gif\" width=\"11\" height=\"12\" align=\"right\" /></td>\r\n");
      out.write("    <td width=\"94%\"><a href=\"buildInfo/buildInfo.jsp\" target=\"bb\">楼盘信息管理</a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("    <td height=\"20\" colspan=\"2\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("    <td height=\"20\"><img src=\"image/fh.gif\" width=\"11\" height=\"12\" align=\"right\" /></td>\r\n");
      out.write("    <td width=\"94%\"><a href=\"residentInfo/residentInfo.jsp\" target=\"bb\">住户信息管理</a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("    <td height=\"20\" colspan=\"2\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("    <td height=\"20\"><img src=\"image/fh.gif\" width=\"11\" height=\"12\" align=\"right\" /></td>\r\n");
      out.write("    <td width=\"94%\"><a href=\"wuyeCharge/wuyeChargeInfo.jsp\" target=\"bb\">物业收费管理</a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("    <td height=\"20\" colspan=\"2\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("    <td height=\"20\"><img src=\"image/fh.gif\" width=\"11\" height=\"12\" align=\"right\" /></td>\r\n");
      out.write("    <td width=\"94%\"><a href=\"sendRepairInfo/sendRepairInfo.jsp\" target=\"bb\">用户报修管理</a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("    <td height=\"20\" colspan=\"2\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("    <td height=\"20\"><img src=\"image/fh.gif\" width=\"11\" height=\"12\" align=\"right\" /></td>\r\n");
      out.write("    <td width=\"94%\"><a href=\"lodgeComplaintInfo/lodgeComplaintInfo.jsp\" target=\"bb\">用户投诉管理</a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("    <td height=\"20\" colspan=\"2\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("    <td height=\"20\"><img src=\"image/fh.gif\" width=\"11\" height=\"12\" align=\"right\" /></td>\r\n");
      out.write("    <td width=\"94%\"><a href=\"sysAdmin/person.jsp\" target=\"bb\">系统管理</a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("    <td width=\"555\" rowspan=\"4\" valign=\"top\" bgcolor=\"#FFFFFF\" height=\"100%\">\r\n");
      out.write("      <table width=\"92%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("        <tr class=\"text\"> \r\n");
      out.write("          <td height=\"598\" valign=\"top\"><iframe name=bb  frameborder=\"0\"  height=\"435\" width=\"555\" framespacing=\"0\" src=\"");
      out.print(strURL);
      out.write("\"  align=\"middle\"></iframe></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </table> \t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("                                                                    \r\n");
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
