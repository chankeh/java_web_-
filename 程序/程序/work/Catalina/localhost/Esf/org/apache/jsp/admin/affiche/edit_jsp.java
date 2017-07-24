package org.apache.jsp.admin.affiche;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      com.bean.AfficheBean ab = null;
      synchronized (_jspx_page_context) {
        ab = (com.bean.AfficheBean) _jspx_page_context.getAttribute("ab", PageContext.PAGE_SCOPE);
        if (ab == null){
          ab = new com.bean.AfficheBean();
          _jspx_page_context.setAttribute("ab", ab, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String dir=sn.getDir();

      out.write("\r\n");
      out.write("<HTML><HEAD><TITLE>后台操作区</TITLE>\r\n");
      out.write("<LINK href=\"");
      out.print(basePath );
      out.print(dir );
      out.write("/images/Admin_Style.css\" type=text/css rel=stylesheet>\r\n");
      out.write("<LINK href=\"");
      out.print(basePath );
      out.print(dir );
      out.write("/images/style.css\" type=text/css rel=stylesheet>\r\n");
      out.write("<STYLE type=text/css>\r\n");
      out.write("BODY {\r\n");
      out.write("\tMARGIN-LEFT: 0px; BACKGROUND-COLOR: #ffffff\r\n");
      out.write("}\r\n");
      out.write(".STYLE1 {color: #ECE9D8}\r\n");
      out.write("</STYLE>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function sub()\r\n");
      out.write("{\r\n");
      out.write("\tif(document.form1.title.value.replace(/\\s+$|^\\s+/g,\"\").length<=0)\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"请输入新闻标题！\");\r\n");
      out.write("\t\tdocument.form1.title.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(document.form1.content.value.replace(/\\s+$|^\\s+/g,\"\").length<=0||document.form1.content.value.replace(/\\s+$|^\\s+/g,\"\").length>1000)\r\n");
      out.write("   \t{\r\n");
      out.write("   \t\talert(\"请输入公告内容，字数在1000个字符以内！\");\r\n");
      out.write("       \tdocument.form1.content.focus();\r\n");
      out.write("      \treturn false;  \r\n");
      out.write("   \t}\r\n");
      out.write("\tform1.submit();\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");

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
		String method=request.getParameter("method");
		String id=request.getParameter("id");
		String ifhide = "";	
		String title="";
		String content="";
		if(id!=null){
			System.out.println(id+"id不为空");
			List afficheList = ab.getOneAffiche(Integer.parseInt(id));
			title=afficheList.get(1).toString();
			content=afficheList.get(2).toString();
			ifhide=afficheList.get(5).toString();
		}		
		String str1="";String str2="";
		if(ifhide.trim().equals("0")){
			str2="checked";
		}else{
			str1="checked";
		}

      out.write("\r\n");
      out.write("<BODY oncontextmenu=\"return false;\" onselectstart=\"return false;\" leftMargin=0 \r\n");
      out.write("background=");
      out.print(basePath );
      out.print(dir );
      out.write("/images/MainBg.gif topMargin=0 scroll=yes \r\n");
      out.write("marginheight=\"0\" marginwidth=\"0\">\r\n");
      out.write("<TABLE height=\"100%\" cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("  <TBODY>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD align=\"left\" vAlign=top >\r\n");
      out.write("<table width='100%' cellspacing='1' cellpadding='3' bgcolor='#CCCCCC' class=\"tablewidth\">\r\n");
      out.write("<tr class=\"head\"> \r\n");
      out.write("      <td colspan=\"2\">     \r\n");

	if(method.trim().equals("addAffiche")){

      out.write("\r\n");
      out.write("        发布公告 \r\n");
}else{
      out.write("\r\n");
      out.write("\t   修改公告\r\n");
} 
      out.write("\r\n");
      out.write("      </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\t<form name=\"form1\" action=\"");
      out.print(basePath );
      out.write("Affiche.shtml\" method=\"post\"  >\r\n");
      out.write("  <tr bgcolor='#FFFFFF'> <input type=\"hidden\" name=\"method\" value=\"");
      out.print(method );
      out.write("\"> <input type=\"hidden\" name=\"id\" value=\"");
      out.print(id );
      out.write("\">\r\n");
      out.write("    <td width='30%'><div align=\"right\">标&nbsp;&nbsp;&nbsp;&nbsp;题：</div></td>\r\n");
      out.write("    <td ><input name=\"title\" type=\"text\" id=\"title\" size=\"60\" maxlength=\"100\" value=\"");
      out.print(title );
      out.write("\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr bgcolor='#FFFFFF'> \r\n");
      out.write("      <td width='30%'> \r\n");
      out.write("        <div align=\"right\">是否显示： </div>\r\n");
      out.write("      </td>\r\n");
      out.write("      <td bgcolor='#FFFFFF' > \r\n");
      out.write("        <input type=\"radio\" name=\"ifhide\" value=\"1\" ");
      out.print(str1 );
      out.write(">\r\n");
      out.write("        显示 \r\n");
      out.write("        <input type=\"radio\" name=\"ifhide\" value=\"0\" ");
      out.print(str2 );
      out.write(">\r\n");
      out.write("        不显示 </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr bgcolor='#FFFFFF'> \r\n");
      out.write("      <td width='30%'> \r\n");
      out.write("        <div align=\"right\">公告内容： </div>\r\n");
      out.write("      </td>\r\n");
      out.write("      <td bgcolor='#FFFFFF' > \r\n");
      out.write("        <textarea name=\"content\" cols=\"50\" rows=\"8\" >");
      out.print(content );
      out.write("</textarea> </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  <tr bgcolor='#FFFFFF'> \r\n");
      out.write("      <td colspan=\"2\" align=\"center\"> \r\n");
      out.write("        <input class=mmcinb type='button' name='button' value='提交数据' onclick='sub()'>\r\n");
      out.write("      </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\t</form>\r\n");
      out.write("</table>\r\n");
      out.write("   </TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("  </TBODY>\r\n");
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
