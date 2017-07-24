package org.apache.jsp.AD;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class ad_005findex_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!-- author: zhangpeipei -->\r\n");
      out.write("<HTML><HEAD><TITLE>大学生心理健康教育协会</TITLE>\r\n");
      out.write("<META -equiv=Content-Type content=\"text/html; charset=gb2312\"><LINK \r\n");
      out.write("href=\"img/style.css\" type=text/css rel=stylesheet>\r\n");
      out.write("<META content=\"MSHTML 6.00.2900.2180\" name=GENERATOR></HEAD>\r\n");
      out.write("<BODY text=#000000 bgColor=#ffffff leftMargin=0 topMargin=0 marginheight=\"0\" \r\n");
      out.write("marginwidth=\"0\"><!--罗时针 -->\r\n");

//-------------------------------------
//功能：管理员管理网站首页
//作者：Zpp
//更新日期：
//-------------------------------------

      out.write("\r\n");
      out.write("<SCRIPT language=javascript>\r\n");
      out.write(" <!--\r\n");
      out.write(" var startTime,endTime;\r\n");
      out.write(" var d=new Date();\r\n");
      out.write(" startTime=d.getTime();\r\n");
      out.write(" //-->\r\n");
      out.write(" </SCRIPT>\r\n");
      out.write("\r\n");
      out.write("<META http-equiv=Content-Type content=text/html;charset=gb2312>\r\n");
      out.write("<SCRIPT>\r\n");
      out.write("<!--//\r\n");
      out.write("function switchBar(){\r\n");
      out.write("if (switchPoint.innerText==3){\r\n");
      out.write("switchPoint.innerText=4\r\n");
      out.write("document.all(\"leftFrame\").style.display=\"none\"\r\n");
      out.write("}else{\r\n");
      out.write("switchPoint.innerText=3\r\n");
      out.write("document.all(\"leftFrame\").style.display=\"\"\r\n");
      out.write("}}\r\n");
      out.write("//-->\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("\r\n");
      out.write("<STYLE type=text/css>.navPoint {\r\n");
      out.write("\tFONT-SIZE: 12px; CURSOR: hand; COLOR: white; FONT-FAMILY: Webdings\r\n");
      out.write("}\r\n");
      out.write("</STYLE>\r\n");
      out.write("\r\n");
      out.write("<META content=\"MSHTML 6.00.2800.1498\" name=GENERATOR>\r\n");
      out.write("<link href=\"Style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY style=\"MARGIN: 0px\" scroll=no>\r\n");
      out.write("<TABLE height=\"100%\" cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("  <TBODY>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD id=leftFrame vAlign=center noWrap align=middle \r\n");
      out.write("      name=\"leftFrame\"><iframe id=carnoc \r\n");
      out.write("      style=\"Z-INDEX: 2; VISIBILITY: inherit; WIDTH: 185px; HEIGHT: 100%\" \r\n");
      out.write("      name=carnoc src=\"left.jsp\" frameborder=0 \r\n");
      out.write("      scrolling=yes></iframe></TD>\r\n");
      out.write("    <TD style=\"WIDTH: 9pt\" bgColor=#9395c0>\r\n");
      out.write("      <TABLE height=\"100%\" cellSpacing=0 cellPadding=0 border=0>\r\n");
      out.write("        <TBODY>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD valign=\"middle\" style=\"HEIGHT: 100%\" title=打开/关闭全屏 onclick=switchBar()><p><FONT \r\n");
      out.write("            style=\"FONT-SIZE: 9pt; CURSOR: default; COLOR: #ffffff\"><BR>\r\n");
      out.write("                  <BR>\r\n");
      out.write("                  <BR>\r\n");
      out.write("                  <BR>\r\n");
      out.write("                  <BR>\r\n");
      out.write("                  <SPAN \r\n");
      out.write("            class=navPoint id=switchPoint \r\n");
      out.write("            title=打开/关闭全屏>3</SPAN><BR>\r\n");
      out.write("          </FONT></p>\r\n");
      out.write("            <p>&nbsp;</p>\r\n");
      out.write("            <p>&nbsp;</p>\r\n");
      out.write("            <p>&nbsp;</p></TD>\r\n");
      out.write("        </TR></TBODY></TABLE></TD>\r\n");
      out.write("    <TD style=\"WIDTH: 100%\"><iframe id=main \r\n");
      out.write("      style=\"Z-INDEX: 1; VISIBILITY: inherit; WIDTH: 100%; HEIGHT: 100%\" \r\n");
      out.write("      name=main \r\n");
      out.write("      src=\"right.jsp\" \r\n");
      out.write("      frameborder=0 \r\n");
      out.write("scrolling=yes> </iframe></TD>\r\n");
      out.write("  </TR></TBODY></TABLE>\r\n");
      out.write("</BODY></HTML>\r\n");
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
