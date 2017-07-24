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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("<title>沈阳公交查询系统</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("@import url(css/css.css);\r\n");
      out.write(".style20 {\r\n");
      out.write("\tfont-family: \"宋体\";\r\n");
      out.write("\tcolor: #FF0000;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("}\r\n");
      out.write("a:link {\r\n");
      out.write("\tcolor: #669900;\r\n");
      out.write("}\r\n");
      out.write("a:visited {\r\n");
      out.write("\tcolor: #999999;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<link href=\"Style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".style27 {font-size: 36px}\r\n");
      out.write(".style28 {\r\n");
      out.write("\tfont-family: \"隶书\";\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tcolor: #000000;\r\n");
      out.write("}\r\n");
      out.write(".style32 {\r\n");
      out.write("\tcolor: #669900;\r\n");
      out.write("\tfont-size: 38px;\r\n");
      out.write("}\r\n");
      out.write(".style35 {\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("\tfont-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("\tcolor: #FF0000;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<script language=\"JavaScript\" type=\"text/JavaScript\">\r\n");
      out.write("<!--\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function MM_preloadImages() { //v3.0\r\n");
      out.write("  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();\r\n");
      out.write("    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)\r\n");
      out.write("    if (a[i].indexOf(\"#\")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}\r\n");
      out.write("}\r\n");
      out.write("//-->\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("  <table width=\"800\" height=\"100\" border=\"0\">\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td width=\"285\" class=\"css\"><img src=\"images/busLOGO.jpg\" width=\"327\" height=\"149\"></td>\r\n");
      out.write("      <td width=\"505\"><img src=\"images/logo3.jpg\" width=\"463\" height=\"149\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("</div>\r\n");
      out.write("<table width=\"800\" height=\"395\" border=\"0\" align=\"center\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"800\" height=\"391\" class=\"css\"><div align=\"center\" class=\"youyuan style27\">\r\n");
      out.write("      <p align=\"right\" class=\"style28 style32\">沈阳市公交查询系统</p>\r\n");
      out.write("      <p align=\"center\" class=\"style28\"><strong><img src=\"images/BUS1.jpg\" width=\"528\" height=\"329\"><strong><span class=\"style35\"><a href=\"stationsearch.jsp\"><img src=\"images/Dockxrt9.jpg\" width=\"100\" height=\"100\" border=\"0\"></a>-enter</span></strong></strong></p>\r\n");
      out.write("      </div></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"800\" border=\"0\" align=\"center\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"16\"><div align=\"center\" class=\"css\"><img src=\"images/layout_26.gif\" width=\"760\" height=\"15\" align=\"middle\"></div></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"800\" border=\"0\" align=\"center\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"45\"><div align=\"center\">\r\n");
      out.write("        <pre class=\"css style20\">沈阳航空学院北方软件学院 “城市公交查询系统” </pre>\r\n");
      out.write("        <pre class=\"css style20\">系统制作人：曾兆伟 学号：200502331297 E-Mail:zzwwsd1752@sina.com  </pre>\r\n");
      out.write("    </div></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<div align=\"left\" class=\"css\">\r\n");
      out.write("  <p class=\"css\">&nbsp;</p>\r\n");
      out.write("</div>\r\n");
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
