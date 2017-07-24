package org.apache.jsp.yaopin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class teshu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("<title>无标题文档</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("body {\r\n");
      out.write("\tmargin-left: 0px;\r\n");
      out.write("\tmargin-top: 0px;\r\n");
      out.write("\tmargin-right: 0px;\r\n");
      out.write("\tmargin-bottom: 0px;\r\n");
      out.write("\tbackground-color: #CCFFFF;\r\n");
      out.write("}\r\n");
      out.write("a:link {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("a:visited {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("a:hover {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("a:active {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<link href=\"../Style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".style1 {font-size: 24px}\r\n");
      out.write(".style2 {color: #0000FF}\r\n");
      out.write(".style3 {font-size: 36px}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"hongbiaoti\">\r\n");
      out.write("<table width=\"600\" height=\"600\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"324\" align=\"center\" class=\"hongbiaoti\"><table width=\"540\" height=\"412\" border=\"1\" bordercolor=\"#0000FF\">\r\n");
      out.write("      <tr align=\"center\" valign=\"middle\">\r\n");
      out.write("        <td height=\"78\" colspan=\"2\" class=\"huanying1 style3\">药品特殊信息</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      <tr align=\"center\" valign=\"middle\">\r\n");
      out.write("        <td width=\"227\" height=\"53\" class=\"huanying1 style1\">药品符号</td>\r\n");
      out.write("        <td width=\"297\" class=\"huanying1 style1\">药品符号对应信息</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr align=\"center\" valign=\"middle\">\r\n");
      out.write("        <td height=\"55\"><span class=\"style2\">*</span></td>\r\n");
      out.write("        <td class=\"huanying1\">处方药</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr align=\"center\" valign=\"middle\">\r\n");
      out.write("        <td height=\"54\"><span class=\"style2\">#</span></td>\r\n");
      out.write("        <td class=\"huanying1\">非处方药</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr align=\"center\" valign=\"middle\">\r\n");
      out.write("        <td height=\"51\" class=\"style2\">★</td>\r\n");
      out.write("        <td class=\"huanying1\">带四星的药</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr align=\"center\" valign=\"middle\">\r\n");
      out.write("        <td height=\"54\" class=\"style2\">★★</td>\r\n");
      out.write("        <td class=\"huanying1\">2007年增加的药</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr align=\"center\" valign=\"middle\">\r\n");
      out.write("        <td height=\"49\" class=\"style2\">★★★</td>\r\n");
      out.write("        <td class=\"huanying1\">带五星的药</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
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
