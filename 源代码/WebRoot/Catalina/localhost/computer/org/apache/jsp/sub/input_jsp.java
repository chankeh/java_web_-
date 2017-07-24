package org.apache.jsp.sub;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class input_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      			"", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("<title>查询订单号</title>\r\n");
      out.write("</head>\r\n");
      out.write("<link href=\"../css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("<!--\r\n");
      out.write("\tfunction check(){\r\n");
      out.write("\t\tif(form1.subid.value==\"\"){\r\n");
      out.write("\t\t\talert(\"请输入你的订单号\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("-->\r\n");
      out.write("</script>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("<table width=\"345\" height=\"149\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("  <form action=\"query.jsp\" name=\"form1\" method=\"post\">\r\n");
      out.write("  <tr align=\"center\" bgcolor=\"#FCBE3F\">\r\n");
      out.write("    <td height=\"44\" colspan=\"4\" background=\"../images/images/inputsub_1.gif\" class=\"head\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"11\" rowspan=\"3\" background=\"../images/images/inputsub_2.gif\">&nbsp;</td>\r\n");
      out.write("    <td width=\"54\">订单号:</td>\r\n");
      out.write("    <td width=\"265\" height=\"23\"><input name=\"subid\" type=\"text\" class=\"txt_grey\" size=\"40\"></td>\r\n");
      out.write("    <td width=\"15\" rowspan=\"3\" background=\"../images/images/inputsub_4.gif\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr align=\"center\">\r\n");
      out.write("    <td height=\"33\" colspan=\"2\"><input name=\"Submit\" type=\"submit\" class=\"btn_grey\" onClick=\"return check()\" value=\"提交\">\r\n");
      out.write("      <input name=\"Submit2\" type=\"reset\" class=\"btn_grey\" value=\"重置\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  <tr align=\"left\">\r\n");
      out.write("    <td height=\"36\" colspan=\"2\" align=\"center\"><font color=\"#FF0000\"><a href=\"../index.jsp\">&#36820;&#22238;&#39318;&#39029;</a></font></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  <tr align=\"left\">\r\n");
      out.write("    <td height=\"13\" colspan=\"4\" background=\"../images/images/inputsub_5.gif\">&nbsp;</td>\r\n");
      out.write("    </tr>\r\n");
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
