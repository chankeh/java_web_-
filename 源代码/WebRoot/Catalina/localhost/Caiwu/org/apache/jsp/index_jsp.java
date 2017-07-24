package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

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

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write('\r');
      out.write('\n');
      com.util.CheckCode yzm = null;
      synchronized (_jspx_page_context) {
        yzm = (com.util.CheckCode) _jspx_page_context.getAttribute("yzm", PageContext.PAGE_SCOPE);
        if (yzm == null){
          yzm = new com.util.CheckCode();
          _jspx_page_context.setAttribute("yzm", yzm, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\r\n");
      out.write("<HTML><HEAD><TITLE>财务管理系统</TITLE>\r\n");
      out.write("<META http-equiv=Content-Type content=\"text/html; charset=gb2312\">\r\n");
      out.write("<META content=\"MSHTML 6.00.2900.3268\" name=GENERATOR>\r\n");
      out.write("<STYLE type=text/css>TD {\r\n");
      out.write("\tFONT-SIZE: 12px; VERTICAL-ALIGN: top; COLOR: #333333\r\n");
      out.write("}\r\n");
      out.write("</STYLE>\r\n");
      out.write("</HEAD>\r\n");
      out.write("\r\n");

String message = (String)request.getAttribute("message");
	if(message == null){
			message = "";
	}
	if (!message.trim().equals("")){
		out.println("<script language='javascript'>");
		out.println("alert('"+message+"');");
		out.println("</script>");
	}
	request.removeAttribute("message");
 	String code=yzm.getCheckCode();

      out.write("\r\n");
      out.write("<BODY bgColor=#006599 leftMargin=0 topMargin=0 marginwidth=\"0\" marginheight=\"0\">\r\n");
      out.write("<TABLE cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("  <TBODY>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD height=600 align=\"center\"><BR><BR><BR><BR>\r\n");
      out.write("\t<h2><font color=\"#FF0000\">财务管理系统</font></h2>\r\n");
      out.write("\t<br>\r\n");
      out.write("      <TABLE class=tableborder cellSpacing=0 cellPadding=0 width=427 \r\n");
      out.write("      align=center border=0>\r\n");
      out.write("        <TBODY>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD background=images/index_hz01.gif colSpan=3 \r\n");
      out.write("            height=64>&nbsp; </TD></TR>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD style=\"FONT-SIZE: 1px; LINE-HEIGHT: 1px\" width=3 \r\n");
      out.write("          background=images/index_hz02.gif></TD>\r\n");
      out.write("          <TD style=\"BORDER-TOP: #666666 1px double\" vAlign=top \r\n");
      out.write("          background=images/index_hz03.gif height=162><BR><BR><!--\r\n");
      out.write("-->\r\n");
      out.write("            <TABLE id=adminlogin cellSpacing=0 cellPadding=0 width=\"100%\" \r\n");
      out.write("            align=center border=0>\r\n");
      out.write("        <form action=\"");
      out.print(basePath );
      out.write("Admin.shtml\" name=form1 method=post onSubmit=\"return checkform(form1)\" autocomplete=\"off\">\r\n");
      out.write("              <TBODY>\r\n");
      out.write("              <TR>\r\n");
      out.write("                <TD class=td align=right width=\"33%\">帐&nbsp;&nbsp;&nbsp;&nbsp;号:</TD>\r\n");
      out.write("                <TD class=td width=\"67%\"><INPUT \r\n");
      out.write("                  style=\"BORDER-RIGHT: #0d5c95 1px solid; BORDER-TOP: #0d5c95 1px solid; BACKGROUND: #fff; BORDER-LEFT: #0d5c95 1px solid; WIDTH: 140px; BORDER-BOTTOM: #0d5c95 1px solid; HEIGHT: 21px\" \r\n");
      out.write("                  name=username> </TD></TR>\r\n");
      out.write("              <TR>\r\n");
      out.write("                <TD class=td align=right width=\"33%\">密&nbsp;&nbsp;&nbsp;&nbsp;码:<input type=hidden name=method value=\"one\" /></TD>\r\n");
      out.write("                <TD class=td width=\"67%\"><INPUT \r\n");
      out.write("                  style=\"BORDER-RIGHT: #0d5c95 1px solid; BORDER-TOP: #0d5c95 1px solid; BACKGROUND: #fff; BORDER-LEFT: #0d5c95 1px solid; WIDTH: 140px; BORDER-BOTTOM: #0d5c95 1px solid; HEIGHT: 21px\" \r\n");
      out.write("                  type=password size=21 name=password> </TD></TR><!---->\r\n");
      out.write("              <TR>\r\n");
      out.write("                <TD class=td vAlign=center align=right width=\"33%\">验&nbsp;证&nbsp;码:</TD>\r\n");
      out.write("                <TD width=\"67%\" ><INPUT \r\n");
      out.write("                  style=\"BORDER-RIGHT: #0d5c95 1px solid; BORDER-TOP: #0d5c95 1px solid; BACKGROUND: #fff; BORDER-LEFT: #0d5c95 1px solid; WIDTH: 70px; BORDER-BOTTOM: #0d5c95 1px solid; HEIGHT: 21px\" \r\n");
      out.write("                  size=8 name=yzm> ");
      out.print(code );
      out.write("</TD></TR><!---->\r\n");
      out.write("              <TR>\r\n");
      out.write("                <TD class=td width=\"33%\">&nbsp;</TD>\r\n");
      out.write("                <TD class=td width=\"67%\"><INPUT type=image height=33 width=83 \r\n");
      out.write("                  src=\"images/index_hz04.gif\" name=Submit> \r\n");
      out.write("              </TD></TR></FORM></TBODY></TABLE><!----></TD>\r\n");
      out.write("          <TD style=\"FONT-SIZE: 1px; LINE-HEIGHT: 1px\" width=3 \r\n");
      out.write("          background=images/index_hz02.gif></TD></TR>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD background=images/index_hz05.gif colSpan=3 \r\n");
      out.write("            height=127>&nbsp; \r\n");
      out.write("</TD></TR></TBODY></TABLE></TD></TR></TBODY></TABLE></BODY></HTML>\r\n");
      out.write("<script language=Javascript>\r\n");
      out.write("\t\r\n");
      out.write("\tform1.username.focus()\t\r\n");
      out.write("\r\n");
      out.write("\tfunction checkform(form)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar flag=true;\r\n");
      out.write("\t\tif(form(\"username\").value==\"\"){alert(\"请输入用户名!\");form(\"username\").focus();return false};\r\n");
      out.write("\t\tif(form(\"password\").value==\"\"){alert(\"请输入口令!\");form(\"password\").focus();return false};\r\n");
      out.write("\t\tif(form(\"yzm\").value==\"\"){alert(\"请输入验证码!\");form(\"yzm\").focus();return false};\r\n");
      out.write("\t\tif(isNaN(form(\"yzm\").value)){alert(\"请正确输入验证码!\");form(\"yzm\").focus();return false};\r\n");
      out.write("\t\tif(form(\"yzm\").value!=");
      out.print(code);
      out.write("){alert(\"验证码错误!\");form(\"yzm\").focus();return false};\r\n");
      out.write("\t\treturn flag;\r\n");
      out.write("\t}\r\n");
      out.write("</script>");
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
