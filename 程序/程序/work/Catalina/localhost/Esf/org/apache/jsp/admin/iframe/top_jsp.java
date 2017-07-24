package org.apache.jsp.admin.iframe;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.util.*;

public final class top_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=gb2312");
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
      com.bean.SystemBean sn = null;
      synchronized (_jspx_page_context) {
        sn = (com.bean.SystemBean) _jspx_page_context.getAttribute("sn", PageContext.PAGE_SCOPE);
        if (sn == null){
          sn = new com.bean.SystemBean();
          _jspx_page_context.setAttribute("sn", sn, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String dir=sn.getDir();

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<META http-equiv=Content-Type content=\"text/html; charset=gb2312\">\r\n");
      out.write("<STYLE type=text/css>BODY {\r\n");
      out.write("\tSCROLLBAR-FACE-COLOR: #73a2d6; SCROLLBAR-HIGHLIGHT-COLOR: #73a2d6; SCROLLBAR-SHADOW-COLOR: #73a2d6; SCROLLBAR-3DLIGHT-COLOR: #73a2d6; SCROLLBAR-ARROW-COLOR: #ffffff; SCROLLBAR-TRACK-COLOR: #aabfec; SCROLLBAR-DARKSHADOW-COLOR: #73a2d6\r\n");
      out.write("}\r\n");
      out.write(".logo {\r\n");
      out.write("\tFONT-WEIGHT: bold; FONT-SIZE: 36px; COLOR: #73a2d6; FONT-FAMILY: Georgia, \"Times New Roman\", Times, serif\r\n");
      out.write("}\r\n");
      out.write(".font_text {\r\n");
      out.write("\tFONT-SIZE: 12px; COLOR: #ffffff; LINE-HEIGHT: 20px; TEXT-DECORATION: none\r\n");
      out.write("}\r\n");
      out.write(".font_nav_active {\r\n");
      out.write("\tFONT-WEIGHT: bold; FONT-SIZE: 14px; BACKGROUND-IMAGE: url(images/topnav_active.jpg); COLOR: #ffffff; LINE-HEIGHT: 20px; HEIGHT: 31px; TEXT-DECORATION: none\r\n");
      out.write("}\r\n");
      out.write(".font_nav_unactive {\r\n");
      out.write("\tBORDER-RIGHT: 0px solid; BORDER-TOP: #adbbc7 1px solid; FONT-WEIGHT: bold; FONT-SIZE: 14px; BORDER-LEFT: 0px solid; CURSOR: hand; COLOR: #436e9d; LINE-HEIGHT: 20px; BORDER-BOTTOM: #5085c5 1px solid; HEIGHT: 27px; BACKGROUND-COLOR: #f6f8f9; TEXT-DECORATION: none\r\n");
      out.write("}\r\n");
      out.write(".br_nav {\r\n");
      out.write("\tBORDER-RIGHT: 0px solid; BORDER-TOP: #adbbc7 1px solid; FONT-SIZE: 14px; BORDER-LEFT: 0px solid; CURSOR: hand; COLOR: #436e9d; LINE-HEIGHT: 20px; BORDER-BOTTOM: #5085c5 1px solid; HEIGHT: 27px; BACKGROUND-COLOR: #f6f8f9; TEXT-DECORATION: none\r\n");
      out.write("}\r\n");
      out.write("A.white:link {\r\n");
      out.write("\tFONT-WEIGHT: bold; FONT-SIZE: 13px; COLOR: #ffffff; LINE-HEIGHT: 20px; TEXT-DECORATION: none\r\n");
      out.write("}\r\n");
      out.write("A.white:active {\r\n");
      out.write("\tFONT-WEIGHT: bold; FONT-SIZE: 13px; COLOR: #ffffff; LINE-HEIGHT: 20px; TEXT-DECORATION: none\r\n");
      out.write("}\r\n");
      out.write("A.white:visited {\r\n");
      out.write("\tFONT-WEIGHT: bold; FONT-SIZE: 13px; COLOR: #ffffff; LINE-HEIGHT: 20px; TEXT-DECORATION: none\r\n");
      out.write("}\r\n");
      out.write("A.white:hover {\r\n");
      out.write("\tFONT-WEIGHT: bold; FONT-SIZE: 13px; COLOR: #ffffff; LINE-HEIGHT: 20px; TEXT-DECORATION: none\r\n");
      out.write("}\r\n");
      out.write(".button {\r\n");
      out.write("\tBORDER-RIGHT: #436e9d 1px double; BORDER-TOP: #436e9d 1px double; FONT-SIZE: 12px; BACKGROUND-IMAGE: url(images/bg.gif); BORDER-LEFT: #436e9d 1px double; CURSOR: hand; COLOR: #333333; LINE-HEIGHT: 16px; BORDER-BOTTOM: #436e9d 1px double; TEXT-DECORATION: none\r\n");
      out.write("}\r\n");
      out.write("A:link {\r\n");
      out.write("\tFONT-SIZE: 12px; COLOR: #666666; LINE-HEIGHT: 20px; TEXT-DECORATION: none\r\n");
      out.write("}\r\n");
      out.write("A:active {\r\n");
      out.write("\tFONT-SIZE: 12px; COLOR: #666666; LINE-HEIGHT: 20px; TEXT-DECORATION: none\r\n");
      out.write("}\r\n");
      out.write("A:visited {\r\n");
      out.write("\tFONT-SIZE: 12px; COLOR: #666666; LINE-HEIGHT: 20px; TEXT-DECORATION: none\r\n");
      out.write("}\r\n");
      out.write("A:hover {\r\n");
      out.write("\tFONT-SIZE: 12px; COLOR: #f29422; LINE-HEIGHT: 20px; TEXT-DECORATION: none\r\n");
      out.write("}\r\n");
      out.write("A.blue:link {\r\n");
      out.write("\tFONT-SIZE: 12px; COLOR: #ffffff; LINE-HEIGHT: 20px; TEXT-DECORATION: none\r\n");
      out.write("}\r\n");
      out.write("A.blue:active {\r\n");
      out.write("\tFONT-SIZE: 12px; COLOR: #73a2d6; LINE-HEIGHT: 20px; TEXT-DECORATION: none\r\n");
      out.write("}\r\n");
      out.write("A.blue:visited {\r\n");
      out.write("\tFONT-SIZE: 12px; COLOR: #ffffff; LINE-HEIGHT: 20px; TEXT-DECORATION: none\r\n");
      out.write("}\r\n");
      out.write("A.blue:hover {\r\n");
      out.write("\tFONT-SIZE: 12px; COLOR: #73a2d6; LINE-HEIGHT: 20px; TEXT-DECORATION: underline\r\n");
      out.write("}\r\n");
      out.write("</STYLE>\r\n");
      out.write("<SCRIPT language=javascript>\t\t\r\n");
      out.write("function out(src){\r\n");
      out.write("\tif(confirm(\"确定要退出吗？\"))\t{\r\n");
      out.write("\t\treturn true;\t\r\n");
      out.write("\t}\r\n");
      out.write("\treturn false;\r\n");
      out.write("}\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("<SCRIPT language=JavaScript src=\"");
      out.print(basePath );
      out.print(dir );
      out.write("/Common.js\"></SCRIPT>\r\n");
      out.write("<SCRIPT language=JavaScript src=\"");
      out.print(basePath );
      out.print(dir );
      out.write("/images/SetFocus.js\"></SCRIPT>\r\n");
      out.write("<META content=\"MSHTML 6.00.2900.3243\" name=GENERATOR>\r\n");
      out.write("</HEAD>\r\n");

	String username=(String)session.getAttribute("user");
	if(username==null){
		response.sendRedirect(path+"/error.jsp");
	}
	else{
	    List list = sn.getSiteInfo();
	    String str = list.get(0).toString();

      out.write("\r\n");
      out.write("<SCRIPT language=javascript>\r\n");
      out.write("<!--\r\n");
      out.write("parent.window.defaultStatus=\"当前用户：");
      out.print(session.getAttribute("user").toString() );
      out.write("  IP地址：");
      out.print(request.getRemoteAddr() );
      out.write("\";\r\n");
      out.write("//-->\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("<BODY leftMargin=0 topMargin=0 scroll=no marginheight=\"0\" marginwidth=\"0\">\r\n");
      out.write("<TABLE cellSpacing=0 cellPadding=0 width=\"100%\" bgColor=#3a6592 border=0>\r\n");
      out.write("  <TBODY>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD height=25>\r\n");
      out.write("      <TABLE cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("        <TBODY>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD><IMG src=\"");
      out.print(basePath );
      out.print(dir );
      out.write("/images/Title.gif\"></TD>\r\n");
      out.write("          <TD>\r\n");
      out.write("            <TABLE height=\"100%\" width=\"100%\" border=0>\r\n");
      out.write("              <TBODY>\r\n");
      out.write("              <TR>\r\n");
      out.write("                <TD class=font_text width=\"40%\">\r\n");
      out.write("                  <SCRIPT language=JavaScript src=\"");
      out.print(basePath );
      out.print(dir );
      out.write("/images/date.js\"></SCRIPT>\r\n");
      out.write("                </TD>\r\n");
      out.write("                <TD class=font_text style=\"DISPLAY: none\" align=right>\r\n");
      out.write("                <FONT color=#ffffff></FONT></TD>\r\n");
      out.write("                <TD style=\"DISPLAY: none\" width=\"40%\"></TD>\r\n");
      out.write("                <TD class=font_text align=right>\r\n");
      out.write("                [<A class=blue href=\"");
      out.print(basePath );
      out.write("\" target=_blank>网站首页</A>] \r\n");
      out.write("                  [<A class=blue href=\"");
      out.print(path);
      out.write('/');
      out.print(dir );
      out.write("/system/editpwd.jsp\" target=\"MainFrame\">修改密码</A>] \r\n");
      out.write("                  [<A class=blue onclick=\"return out(this)\" href=\"");
      out.print(path);
      out.write("/Admin.shtml?method=exit\" target=_top>安全退出</A>] \r\n");
      out.write("    </TD></TR></TBODY></TABLE></TD></TR></TBODY></TABLE></TD></TR></TBODY></TABLE>\r\n");
      out.write("<TABLE class=HeaderStyle height=30 cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("  <TBODY>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD width=14 background=");
      out.print(basePath );
      out.print(dir );
      out.write("/images/topnav_bg.jpg>&nbsp;</TD>\r\n");
      out.write("    <TD vAlign=bottom background=");
      out.print(basePath );
      out.print(dir );
      out.write("/images/topnav_bg.jpg>\r\n");
      out.write("      <TABLE class=font_nav_active id=TDTT0  cellSpacing=0 cellPadding=0 width=150 border=0>\r\n");
      out.write("        <TBODY>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD >\r\n");
      out.write("            <DIV align=center>");
      out.print(str );
      out.write("</DIV></TD></TR></TBODY></TABLE></TD>    \r\n");
      out.write("</TR></TBODY></TABLE>\r\n");
      out.write("<TABLE cellSpacing=0 cellPadding=0 width=\"100%\">\r\n");
      out.write("  <TBODY>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD bgColor=#73a3d4 height=6></TD></TR></TBODY></TABLE></BODY>\r\n");
		
	}

      out.write("    \r\n");
      out.write("</HTML>\r\n");
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
