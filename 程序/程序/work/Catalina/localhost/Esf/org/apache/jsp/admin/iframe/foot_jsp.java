package org.apache.jsp.admin.iframe;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class foot_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\r\n");
      out.write("<HTML><HEAD>\r\n");
      out.write("<META http-equiv=Content-Type content=\"text/html; charset=gb2312\">\r\n");
      out.write("<STYLE>TD {\r\n");
      out.write("\tFONT-SIZE: 12px; COLOR: #ffffff; FONT-FAMILY: Verdana, Arial, Helvetica, sans-serif\r\n");
      out.write("}\r\n");
      out.write("</STYLE>\r\n");
      out.write("\r\n");
      out.write("<META content=\"MSHTML 6.00.2900.3243\" name=GENERATOR></HEAD>\r\n");

	String username=(String)session.getAttribute("user");
	if(username==null){
		response.sendRedirect(basePath+"error.jsp");
	}
	else{

      out.write("\r\n");
      out.write("<BODY  oncontextmenu=\"return false;\" onselectstart=\"return false;\" leftMargin=0 topMargin=0 scroll=no marginheight=\"0\" marginwidth=\"0\">\r\n");
      out.write("<TABLE cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("  <TBODY>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD bgColor=#73a3d4 height=6>\r\n");
      out.write("    </TD>\r\n");
      out.write("  </TR>\r\n");
      out.write("  </TBODY>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<TABLE height=28 cellSpacing=0 cellPadding=0 width=\"100%\" bgColor=#3a6592 border=0>\r\n");
      out.write("  <TBODY>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD>\r\n");
      out.write("      <TABLE height=\"100%\" cellSpacing=2 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("        <TBODY>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD align=right width=109>\r\n");
      out.write("            <DIV id=st title=全屏/半屏 style=\"CURSOR: hand\" onclick=ChangeLeftFrameStatu(); align=center>\r\n");
      out.write("            <FONT color=red>×</FONT> 关闭左栏</DIV></TD>\r\n");
      out.write("          <TD align=right width=628></TD>\r\n");
      out.write("          <TD style=\"FONT-WEIGHT: bolder; FILTER: shadow(Color=#000000,direction=180)\" align=right width=250></TD>\r\n");
      out.write("        </TR>\r\n");
      out.write("        </TBODY>\r\n");
      out.write("      </TABLE>\r\n");
      out.write("    </TD>\r\n");
      out.write("  </TR>\r\n");
      out.write("  </TBODY>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<SCRIPT language=javascript>\r\n");
      out.write("    var screen=false;i=0;width=0;\r\n");
      out.write("    function ChangeLeftFrameStatu()    \r\n");
      out.write("    {        \r\n");
      out.write("    \tif(screen==false)        \r\n");
      out.write("    \t{            \r\n");
      out.write("    \t\tparent.FrameMain.cols='0,*';            \r\n");
      out.write("    \t\tscreen=true;            \r\n");
      out.write("    \t\tself.st.innerHTML = \"√ 打开左栏\"        \r\n");
      out.write("    \t}        \r\n");
      out.write("    \telse if(screen==true)        \r\n");
      out.write("    \t{            \r\n");
      out.write("    \t\tparent.FrameMain.cols='165,*';           \r\n");
      out.write("    \t\tscreen=false;            \r\n");
      out.write("    \t\tself.st.innerHTML = \"<font color=red>×</font> 关闭左栏\"        \r\n");
      out.write("    \t}    \r\n");
      out.write(" \t}\r\n");
      out.write(" </SCRIPT>\r\n");
      out.write("<!-- 此处下面加站长统计代码 -->\r\n");
      out.write("</BODY>\r\n");
      out.write("<script src='http://s86.cnzz.com/stat.php?id=584145&web_id=584145' language='JavaScript' charset='gb2312'></script>\r\n");
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
