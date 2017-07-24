package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<title>无标题文档</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("body {\r\n");
      out.write("\tbackground-image: url(images/solicit1.gif);\r\n");
      out.write("}\r\n");
      out.write(".STYLE1 {\r\n");
      out.write("\tfont-size: 16px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tcolor: #FF9900;\r\n");
      out.write("}\r\n");
      out.write("#Layer1 {\r\n");
      out.write("\tposition:absolute;\r\n");
      out.write("\twidth:76px;\r\n");
      out.write("\theight:43px;\r\n");
      out.write("\tz-index:1;\r\n");
      out.write("\tleft: 294px;\r\n");
      out.write("\ttop: 47px;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style></head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<table width=\"955\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"115\" colspan=\"5\"><table width=\"671\" border=\"0\" align=\"right\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"136\" height=\"40\"><a href=\"index.jsp\"><img src=\"images/top01.gif\" width=\"67\" height=\"17\" border=\"0\" /></a></td>\r\n");
      out.write("        <td width=\"118\"><a href=\"admin/seesolicit.jsp\"><img src=\"images/top02.gif\" width=\"65\" height=\"16\" border=\"0\" /></a></td>\r\n");
      out.write("        <td width=\"134\"><a href=\"admin/seebaoming.jsp\"><img src=\"images/top03.gif\" width=\"69\" height=\"16\" border=\"0\" /></a></td>\r\n");
      out.write("        <td width=\"116\"><a href=\"admin/seeacceptance.jsp\"><img src=\"images/top04.gif\" width=\"65\" height=\"16\" border=\"0\" /></a></td>\r\n");
      out.write("        <td width=\"167\"><a href=\"admin/seecharge.jsp\"><img src=\"images/top05.gif\" width=\"72\" height=\"16\" border=\"0\" /></a></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"259\" colspan=\"4\"><table width=\"130\" height=\"197\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"130\" height=\"74\">&nbsp;</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"27\"><div align=\"right\"><a href=\"admin/zc.htm\"><img src=\"images/zleft8.gif\" width=\"39\" height=\"21\" border=\"0\" /></a></div></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"50\">&nbsp;</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"46\"><div align=\"right\"><a href=\"admin/dl.jsp\"><img src=\"images/zleft9.gif\" width=\"39\" height=\"20\" border=\"0\" /></a></div></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("    <td height=\"259\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"35\" colspan=\"2\">&nbsp;</td>\r\n");
      out.write("    <td width=\"275\" rowspan=\"4\">&nbsp;</td>\r\n");
      out.write("    <td width=\"309\" rowspan=\"4\"><p>&nbsp;</p>\r\n");
      out.write("    <p>&nbsp;</p>\r\n");
      out.write("    <p>&nbsp;</p>\r\n");
      out.write("    <p class=\"STYLE1\"><a href=\"view.jsp\" target=\"_blank\" class=\"STYLE1\">more</a></p></td>\r\n");
      out.write("    <td width=\"254\" rowspan=\"4\"><p>&nbsp;</p>\r\n");
      out.write("    <p>&nbsp;</p>\r\n");
      out.write("    <p>&nbsp;</p>\r\n");
      out.write("    <p><span class=\"STYLE1\"><a href=\"view.jsp\" target=\"_blank\" class=\"STYLE1\">more</a></span></p></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"27\" height=\"45\"><div align=\"center\"></div></td>\r\n");
      out.write("    <td width=\"153\"><a href=\"admin/dl.jsp\"><img src=\"images/zleft1.gif\" width=\"78\" height=\"18\" border=\"0\" /></a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"26\"><div align=\"center\"></div></td>\r\n");
      out.write("    <td height=\"26\"><a href=\"admin/dl.jsp\"><img src=\"images/zleft2.gif\" width=\"78\" height=\"20\" border=\"0\" /></a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"37\"><div align=\"center\"></div></td>\r\n");
      out.write("    <td height=\"37\"><a href=\"admin/index.htm\"><img src=\"images/zleft3.gif\" width=\"102\" height=\"20\" border=\"0\" /></a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"350\" colspan=\"5\" class=\"STYLE1\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
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
