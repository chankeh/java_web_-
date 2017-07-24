package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.*;
import java.sql.*;

public final class searchinfo2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write('	');
      MyBean.dbcon dbc = null;
      synchronized (session) {
        dbc = (MyBean.dbcon) _jspx_page_context.getAttribute("dbc", PageContext.SESSION_SCOPE);
        if (dbc == null){
          dbc = new MyBean.dbcon();
          _jspx_page_context.setAttribute("dbc", dbc, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("<title>查询说明</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("@import url(\"css/css.css\");\r\n");
      out.write(".style9 {font-family: \"幼圆\"}\r\n");
      out.write(".style20 {color: #FF0000}\r\n");
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
      out.write(".style30 {color: #CC9900}\r\n");
      out.write(".style31 {color: #00CC00}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t");

		request.setCharacterEncoding("gb2312");
		ResultSet rs=null;//记录集
		String sql="";
		String cc="";

		cc=request.getParameter("select");
		sql="select * from cc where cci='"+cc+"'";
		rs=dbc.executeQuery(sql);

      out.write("\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("  <table width=\"800\" height=\"100\" border=\"0\">\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td width=\"285\" class=\"css\"><img src=\"images/busLOGO.jpg\" width=\"327\" height=\"149\"></td>\r\n");
      out.write("      <td width=\"505\"><img src=\"images/logo3.jpg\" width=\"463\" height=\"149\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("</div>\r\n");
      out.write("<table width=\"800\" border=\"0\" align=\"center\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"21\"><div align=\"right\"><span class=\"css\"><img src=\"images/jt_r2_c2.gif\" width=\"15\" height=\"14\" align=\"absbottom\"> </span><span class=\"css style3\"><span class=\"css  style5\"><span class=\"css  style9 style11\"><span class=\"css  style9 style20\"><span class=\"css  style9\">沈阳市公交车路线查询系统</span></span></span></span></span></div></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"800\" border=\"0\" align=\"center\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"10\"><div align=\"right\" class=\"css\"><img src=\"images/layout_26.gif\" width=\"451\" height=\"8\" align=\"middle\"></div></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><div align=\"right\" class=\"css style17\">\r\n");
      out.write("        <div align=\"right\" class=\"css\"><span class=\"style9 style18\"><a href=\"stationsearch.jsp\">终始站点查询</a><span class=\"style31\">｜</span><a href=\"bussearch.jsp\">车次线路查询</a><span class=\"style31\">｜</span><a href=\"stationinfosearch.jsp\"><span class=\"style30\">车站信息</span>查询</a><span class=\"style30\">｜<a href=\"cpsearch.jsp\">车牌信息查询</a>｜</span><a href=\"about%20me.jsp\">联系方法</a></span></div>\r\n");
      out.write("    </div></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"800\" height=\"334\" border=\"0\" align=\"center\">\r\n");
      out.write("  <tr>\r\n");
      out.write("     <td width=\"224\" height=\"116\" rowspan=\"2\" align=\"left\" valign=\"top\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "login.jsp", out, true);
      out.write("</td>\r\n");
      out.write("    <td width=\"578\" bgcolor=\"#FFFFFF\"><div align=\"center\">\r\n");
      out.write("      <table width=\"293\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td height=\"44\" valign=\"top\"><span class=\"cuyouyuan\">");
      out.print(cc);
      out.write("</span><span class=\"youyuan\"> 路　行车路线</span></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("     <table width=\"490\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("        <tr>\r\n");
      out.write("\t\t");

		if(rs.next()){
	 	String cz=rs.getString("czan");
	  
      out.write("\r\n");
      out.write("          <td valign=\"top\" class=\"youyuan\"><span class=\"youyuan\">");
      out.print(cz);
      out.write("</span></td>\r\n");
      out.write("      ");
 } 
      out.write("\r\n");
      out.write("\t  </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("      <p>&nbsp;</p>\r\n");
      out.write("    </div></td>\r\n");
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
      out.write("<p class=\"css\">&nbsp;</p>\r\n");
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
