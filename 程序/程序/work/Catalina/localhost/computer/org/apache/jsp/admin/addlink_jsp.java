package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class addlink_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  public Object getDependants() {
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("<title>添加友情链接</title>\r\n");
      out.write("</head>\r\n");
      out.write("<link href=\"../css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("<body>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("<!--\r\n");
      out.write("\tfunction check(){\r\n");
      out.write("\t\tif(form1.linkname.value==\"\"){\r\n");
      out.write("\t\t\talert(\"请输入链接网址的名称\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t\tform1.linkname.focus();\r\n");
      out.write("\t\t\thistory.back();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(form1.address.value==\"\"){\r\n");
      out.write("\t\t\talert(\"请输入链接的地址\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t\tform1.address.focus();\r\n");
      out.write("\t\t\thistory.back();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("-->\t\r\n");
      out.write("</script>\r\n");
      out.write("<br>\r\n");
      out.write("<table width=\"400\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#E8FFFF\" class=\"tableBorder\">\r\n");
      out.write("  <form action=\"link.jsp\" method=\"post\" name=\"form1\">\r\n");
      out.write("  <tr align=\"center\" bgcolor=\"#42CF39\">\r\n");
      out.write("    <td height=\"38\" colspan=\"4\" class=\"head\">添加链接</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"59\" height=\"24\">&nbsp;</td>\r\n");
      out.write("    <td width=\"100\">链接名称</td>\r\n");
      out.write("    <td width=\"228\" height=\"24\"><input name=\"linkname\" type=\"text\" class=\"txt_grey\" size=\"28\"></td>\r\n");
      out.write("    <td width=\"13\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"24\">&nbsp;</td>\r\n");
      out.write("    <td height=\"24\">链接地址</td>\r\n");
      out.write("    <td height=\"24\"><input name=\"address\" type=\"text\" class=\"txt_grey\" size=\"28\"></td>\r\n");
      out.write("    <td height=\"24\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr align=\"center\">\r\n");
      out.write("    <td height=\"24\" colspan=\"4\"><input name=\"Submit\" type=\"submit\" class=\"btn_grey\" value=\"提交\" onClick=\"return check()\">\r\n");
      out.write("    <input name=\"Submit2\" type=\"reset\" class=\"btn_grey\" value=\"重置\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  </form>\r\n");
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
