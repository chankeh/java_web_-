package org.apache.jsp.admin.iframe;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<TITLE>后台操作区</TITLE>\r\n");
      out.write("<META http-equiv=Content-Type content=\"text/html; charset=gb2312\">\r\n");
      out.write("<LINK href=\"");
      out.print(basePath );
      out.print(dir );
      out.write("/images/Admin_Style.css\" type=text/css rel=stylesheet>\r\n");
      out.write("<LINK href=\"");
      out.print(basePath );
      out.print(dir );
      out.write("/images/style.css\" type=text/css rel=stylesheet>\r\n");
      out.write("<SCRIPT language=JavaScript src=\"");
      out.print(basePath );
      out.print(dir );
      out.write("/images/Common.js\"></SCRIPT>\r\n");
      out.write("<STYLE type=text/css>BODY {\r\n");
      out.write("\tMARGIN-LEFT: 0px; BACKGROUND-COLOR: #ffffff\r\n");
      out.write("}\r\n");
      out.write("</STYLE>\r\n");
      out.write("<META content=\"MSHTML 6.00.2900.3243\" name=GENERATOR>\r\n");
      out.write("</HEAD>\r\n");

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

      out.write('\r');
      out.write('\n');

	String username=(String)session.getAttribute("user");
	if(username==null){
		response.sendRedirect(path+"/error.jsp");
	}
	else{
		List list=(List)session.getAttribute("list");
		List list2 = sn.getSiteInfo();
	    String str = list2.get(0).toString();

      out.write("\r\n");
      out.write("\r\n");
      out.write("<BODY  oncontextmenu=\"return false;\" onselectstart=\"return false;\" leftMargin=0 background=");
      out.print(basePath );
      out.print(dir );
      out.write("/images/MainBg.gif topMargin=0 scroll=no marginheight=\"0\" marginwidth=\"0\">\r\n");
      out.write("<TABLE height=\"100%\" cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("  <TBODY>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD vAlign=top height=\"50%\">     \r\n");
      out.write("            <TABLE class=topdashed cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("              <TBODY>\r\n");
      out.write("              <TR>\r\n");
      out.write("                <TD height=25>&nbsp;&nbsp;<FONT color=red>");
      out.print(list.get(0).toString() );
      out.write("</FONT> \r\n");
      out.write("                  您好，欢迎进入[<FONT color=red>");
      out.print(str );
      out.write("</FONT>]网站后台管理系统！您的身份：<FONT color=red>");
      out.print(Integer.parseInt(list.get(1).toString())==1?"超级管理员":"普通管理员");
      out.write("</FONT> 登录次数：");
      out.print(list.get(2).toString() );
      out.write("次 本次登录时间：");
      out.print(list.get(3).toString() );
      out.write(" \r\n");
      out.write("                </TD>\r\n");
      out.write("              </TR>\r\n");
      out.write("              </TBODY>\r\n");
      out.write("            </TABLE>\r\n");
      out.write("          <BR>\r\n");
      out.write("      <TABLE cellSpacing=0 cellPadding=0 width=\"90%\" align=center border=0>\r\n");
      out.write("        <TBODY>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD height=10>\r\n");
      out.write("            <DIV align=center>\r\n");
      out.write("\t\t\t<TABLE cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("        <TBODY>\r\n");
      out.write("       \r\n");
      out.write("\t\t<TR>\r\n");
      out.write("\t\t  <TD colspan=\"3\" width=100%>\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t</TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t<TD colspan=\"3\">\r\n");
      out.write("<TABLE class=tablewidth cellSpacing=1 cellPadding=3 width=\"100%\" border=0>\r\n");
      out.write("  <TBODY>\r\n");
      out.write("  <TR class=head>\r\n");
      out.write("    <TD colSpan=2 height=23>服 务 器 信 息</TD></TR>\r\n");
      out.write("  <TR bgColor=#ffffff>\r\n");
      out.write("    <TD id=map width=\"50%\">服务器解译引擎： ");
 String publish=getServletContext().getServerInfo(); out.println(publish); 
      out.write("</TD>\r\n");
      out.write("    <TD id=map width=\"50%\">服务器所在时间： ");
 out.println(new java.util.Date()); 
      out.write("</TD></TR>\r\n");
      out.write("  <TR bgColor=#ffffff>\r\n");
      out.write("    <TD id=map width=\"50%\">JDK版本： ");
      out.print(System.getProperty("java.vm.version") );
      out.write("</TD>\r\n");
      out.write("    <TD id=map width=\"50%\">服务器名（IP）： ");
      out.print(request.getServerName() );
      out.write("</TD></TR>\r\n");
      out.write("  <TR bgColor=#ffffff>\r\n");
      out.write("    <TD id=map width=\"50%\">JAVA虚拟机名称： ");
      out.print(System.getProperty("java.vm.name") );
      out.write("</TD>\r\n");
      out.write("    <TD id=map width=\"50%\">服务器端口: ");
      out.print(request.getServerPort() );
      out.write("</TD></TR>\r\n");
      out.write("  <TR bgColor=#ffffff>\r\n");
      out.write("    <TD id=map width=\"50%\">服务器操作系统： ");
      out.print(System.getProperty("os.name"   )+" "+System.getProperty("os.version") );
      out.write("</TD>\r\n");
      out.write("    <TD id=map width=\"50%\">网站所在磁盘物理位置： ");
      out.print(System.getProperty("user.dir") );
      out.write("</TD></TR>\r\n");
      out.write("  <TR bgColor=#ffffff>\r\n");
      out.write("    <TD id=map width=\"50%\">服务器时区: ");
      out.print(System.getProperty("user.timezone"  ) );
      out.write("</TD>\r\n");
      out.write("    <TD id=map width=\"50%\">当前文件: ");
      out.print(request.getRealPath(request.getServletPath()) );
      out.write("</TD></TR>\r\n");
      out.write("  <TR bgColor=#ffffff>\r\n");
      out.write("    <TD id=map width=\"50%\">HTTP解译引擎: ");
      out.print(request.getProtocol() );
      out.write("</TD>\r\n");
      out.write("    <TD id=map width=\"50%\">你的IP： ");
      out.print(request.getRemoteAddr() );
      out.write("</TD></TR>\r\n");
      out.write("  <TR bgColor=#ffffff>\r\n");
      out.write("    <TD id=map width=\"50%\">当前用户:");
      out.print(list.get(0).toString() );
      out.write("</TD>\r\n");
      out.write("    <TD id=map width=\"50%\">当前域名： ");
      out.print(basePath );
      out.write("</TD></TR></TBODY></TABLE></TD></TR>\r\n");
      out.write("\t<TR><TD colspan=\"3\">\r\n");
      out.write("</TD></TR>\r\n");
      out.write("\t<TR><TD colspan=\"3\">\r\n");
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TBODY>\r\n");
      out.write("</TABLE>\r\n");
      out.write("</DIV>\r\n");
      out.write("</TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TBODY>\r\n");
      out.write("</TABLE>\r\n");
      out.write("</TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TBODY>\r\n");
      out.write("</TABLE>\r\n");
      out.write("</BODY>\r\n");
} 
      out.write("\r\n");
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
