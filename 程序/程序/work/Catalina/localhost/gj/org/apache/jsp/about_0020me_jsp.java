package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.*;
import java.sql.*;

public final class about_0020me_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>沈阳市公交查询</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".style3 {\r\n");
      out.write("\tfont-family: \"幼圆\";\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write(".style5 {\r\n");
      out.write("\tfont-family: \"幼圆\";\r\n");
      out.write("\tfont-style: italic;\r\n");
      out.write("}\r\n");
      out.write(".style9 {font-family: \"幼圆\"}\r\n");
      out.write(".style10 {\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\tfont-style: normal;\r\n");
      out.write("\tline-height: normal;\r\n");
      out.write("\tfont-variant: normal;\r\n");
      out.write("\tfont-family: \"宋体\";\r\n");
      out.write("\tcolor: #FF0000;\r\n");
      out.write("}\r\n");
      out.write(".style11 {color: #FF0000}\r\n");
      out.write(".style17 {font-size: 12px}\r\n");
      out.write(".style18 {color: #009900}\r\n");
      out.write("body {\r\n");
      out.write("\tbackground-color: #FFFFFF;\r\n");
      out.write("}\r\n");
      out.write("a:link {\r\n");
      out.write("\tcolor: #669900;\r\n");
      out.write("}\r\n");
      out.write("a:visited {\r\n");
      out.write("\tcolor: #999999;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<script language=\"JavaScript\" type=\"text/JavaScript\">\r\n");
      out.write("<!--\r\n");
      out.write("function MM_reloadPage(init) {  //reloads the window if Nav4 resized\r\n");
      out.write("  if (init==true) with (navigator) {if ((appName==\"Netscape\")&&(parseInt(appVersion)==4)) {\r\n");
      out.write("    document.MM_pgW=innerWidth; document.MM_pgH=innerHeight; onresize=MM_reloadPage; }}\r\n");
      out.write("  else if (innerWidth!=document.MM_pgW || innerHeight!=document.MM_pgH) location.reload();\r\n");
      out.write("}\r\n");
      out.write("MM_reloadPage(true);\r\n");
      out.write("//-->\r\n");
      out.write("</script>\r\n");
      out.write("<SCRIPT language=JAVASCRIPT type=text/javascript>\r\n");
      out.write("<!--\r\n");
      out.write("function loginSubmit(theObj)\r\n");
      out.write("{\r\n");
      out.write("\tif (theObj.fromStep.value == \"\" && theObj.toStep.value != \"\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"始发站不能为空\");\r\n");
      out.write("\t\ttheObj.fromStep.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\telse if (theObj.fromStep.value != \"\" && theObj.toStep.value == \"\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"终点站不能为空\");\r\n");
      out.write("\t\ttheObj.toStep.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\telse if (theObj.fromStep.value == \"\" && theObj.toStep.value == \"\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"始发站和终点站不能为空\");\r\n");
      out.write("\t\ttheObj.fromStep.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\treturn true;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("// -->\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("<link href=\"css/css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".style21 {color: #CC9900}\r\n");
      out.write(".style22 {font-size: 24px}\r\n");
      out.write(".style23 {\r\n");
      out.write("\tfont-family: \"华文新魏\";\r\n");
      out.write("\tcolor: #FF0000;\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write(".style24 {color: #00CC00}\r\n");
      out.write(".style25 {font-family: \"华文细黑\"}\r\n");
      out.write(".style26 {\r\n");
      out.write("\tfont-family: \"宋体\";\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("}\r\n");
      out.write(".style29 {\r\n");
      out.write("\tfont-size: 16px;\r\n");
      out.write("\tcolor: #999999;\r\n");
      out.write("}\r\n");
      out.write(".style31 {color: #999999}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("  <table width=\"800\" height=\"100\" border=\"0\">\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td width=\"285\"><img src=\"images/busLOGO.jpg\" width=\"327\" height=\"149\"></td>\r\n");
      out.write("      <td width=\"505\"><img src=\"images/logo3.jpg\" width=\"463\" height=\"149\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("</div>\r\n");
      out.write("<table width=\"800\" border=\"0\" align=\"center\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"21\"><div align=\"right\"><span class=\"css style3\"><span class=\"css  style5\"><span class=\"css style3\"><span class=\"css  style9 style11\"><span class=\"css  style9\"><img src=\"images/jt_r2_c2.gif\" width=\"15\" height=\"14\" align=\"absbottom\"> <span class=\"style9\">沈阳市公交车路线查询系统</span></span></span></span></span></span></div></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"800\" border=\"0\" align=\"center\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"10\"><div align=\"right\"><img src=\"images/layout_26.gif\" width=\"451\" height=\"8\" align=\"middle\"></div></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><div align=\"right\" class=\"css style17\">\r\n");
      out.write("      <div align=\"right\" class=\"style9 style18\"><a href=\"stationsearch.jsp\">终始站点查询</a><span class=\"style24\">｜</span><a href=\"bussearch.jsp\">车次线路查询</a><span class=\"style24\">｜</span><a href=\"stationinfosearch.jsp\"><span class=\"style21\">车站信息</span>查询</a>｜<a href=\"cpsearch.jsp\">车牌信息查询</a>｜<a href=\"about%20me.jsp\">联系方法</a></div>\r\n");
      out.write("    </div></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"800\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"224\" height=\"349\" align=\"left\" valign=\"top\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "login.jsp", out, true);
      out.write("</td>\r\n");
      out.write("    <td width=\"576\" align=\"center\" valign=\"bottom\"><p align=\"center\" class=\"style25 style11 style23 style17 style31\"><strong>本系统为沈阳航空学院北方软件学院毕业设计题目</strong></p>      <p align=\"center\" class=\"style22 style23 style11 style26 style31\">&quot;城市公交查询系统&quot;</p>\r\n");
      out.write("      <p align=\"center\" class=\"style25 style11 style23 style17 style31\"><strong>系统制作人：<span class=\"style29\">曾兆伟</span> 学号 <span class=\"style31\">200502331297</span> </strong></p>\r\n");
      out.write("      <div id=\"Layer1\" style=\"position:absolute; width:137px; height:132px; z-index:1; left: 344px; top: 391px; font-weight: bold; font-size: 12px; color: #999999;\"><img src=\"images/login_bg.jpg\" width=\"138\" height=\"149\"></div>      <p align=\"center\" class=\"style25 style11 style23 style17 style31\"><strong> 如有意见或好的建议请与作者联系</strong></p>\r\n");
      out.write("      <p align=\"center\" class=\"style25 style23 style17 style31\"><strong>联系方法：</strong><strong>E-MAIL </strong></p>\r\n");
      out.write("      <p align=\"center\" class=\"style23 style17 style31\"><strong>zzwwsd1752@sina.com </strong></p>      <p align=\"center\" class=\"style23 style17 style31\"><strong>zzwwsd1752@sina.com</strong></p>\r\n");
      out.write("      <p align=\"center\" class=\"style23 style17 style31\"><strong>QQ:83926496</strong></p>\r\n");
      out.write("    <p class=\"style11\">&nbsp;</p></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"800\" border=\"0\" align=\"center\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"16\"><div align=\"center\"><img src=\"images/layout_26.gif\" width=\"760\" height=\"15\" align=\"middle\"></div></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"800\" border=\"0\" align=\"center\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"45\"><div align=\"center\">\r\n");
      out.write("      <pre class=\"style9  style10\">沈阳航空学院北方软件学院 “城市公交查询系统” </pre>\r\n");
      out.write("      <pre class=\"style9  style10\">系统制作人：曾兆伟 学号：200502331297 E-Mail:zzwwsd1752@sina.com  </pre>\r\n");
      out.write("      </div></td>\r\n");
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
