package org.apache.jsp.admin.affiche;

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
      out.write(' ');
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
      out.write("<SCRIPT language=JavaScript src=\"");
      out.print(basePath );
      out.print(dir );
      out.write("/images/Common.js\"></SCRIPT>\r\n");
      out.write("<STYLE type=text/css>\r\n");
      out.write("BODY {\r\n");
      out.write("\tMARGIN-LEFT: 0px; BACKGROUND-COLOR: #ffffff\r\n");
      out.write("}\r\n");
      out.write(".STYLE1 {color: #ECE9D8}\r\n");
      out.write("</STYLE>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<script  language=\"javascript\" >\r\n");
      out.write("function del()\r\n");
      out.write("{\r\n");
      out.write("\tpageform.submit();\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\t\r\n");

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
		

      out.write("\r\n");
      out.write("<BODY oncontextmenu=\"return false;\" onselectstart=\"return false;\" leftMargin=0 \r\n");
      out.write("background=");
      out.print(basePath );
      out.print(dir );
      out.write("/images/MainBg.gif topMargin=0 scroll=no \r\n");
      out.write("marginheight=\"0\" marginwidth=\"0\">\r\n");
      out.write("<TABLE  cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("  <TBODY>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD align=\"left\" vAlign=top >\r\n");
      out.write("<table width='100%' cellspacing='1' cellpadding='3' bgcolor='#CCCCCC' class=\"tablewidth\">\r\n");
      out.write("     <tr class=\"head\"> \r\n");
      out.write("      <td width=\"5%\" align=\"center\">ID </td>\r\n");
      out.write("      <td  align=\"center\">标题</td>\r\n");
      out.write("      <td  align=\"center\">发布时间</td>\r\n");
      out.write("      <td  align=\"center\">发布人</td>\r\n");
      out.write("      <td  align=\"center\">是否显示</td>\r\n");
      out.write("      <td  align=\"center\">选择</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    ");

			List pagelist3=ab.getAllAfficheManage();
			
      out.write("\r\n");
      out.write("\t<script type=\"text/JavaScript\">\r\n");
      out.write("\tfunction allch()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tfor(i=0;i<");
      out.print(pagelist3.size());
      out.write(";i++)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tdocument.pageform.checkit(i).checked=document.pageform.checkall.checked;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\t <form action=\"");
      out.print(basePath );
      out.write("Affiche.shtml?method=delaffiche\" method=\"post\" name=\"pageform\">\r\n");
      out.write("\t\t\t");
		
				if(!pagelist3.isEmpty()){
				for(int i=0;i<pagelist3.size();i++){
					List pagelist2 =(ArrayList)pagelist3.get(i);
			
      out.write(" \r\n");
      out.write("\t<tr  class=\"trA\" onMouseOver=\"this.className='trB'\" onMouseOut=\"this.className='trA'\"> \r\n");
      out.write("      <td width='5%' align=\"center\" style=\"border-bottom:1px dotted #ccc;\">");
      out.print(i+1 );
      out.write("</td><input type=\"hidden\" name=\"id");
      out.print(i );
      out.write("\" value=\"");
      out.print(pagelist2.get(0).toString());
      out.write("\" >\r\n");
      out.write("      <td align=\"center\" bgcolor=\"#FFFFFF\"  style=\"border-bottom:1px dotted #ccc;\"><a href=\"");
      out.print(basePath );
      out.print(dir );
      out.write("/affiche/edit.jsp?method=editAffiche&id=");
      out.print(pagelist2.get(0).toString());
      out.write('"');
      out.write(' ');
      out.write('>');
      out.print(pagelist2.get(1).toString() );
      out.write("</a> </td>\r\n");
      out.write("      <td align=\"center\" bgcolor=\"#FFFFFF\"  style=\"border-bottom:1px dotted #ccc;\">");
      out.print(pagelist2.get(2).toString() );
      out.write("</td>\r\n");
      out.write("      <td align=\"center\" bgcolor=\"#FFFFFF\"  style=\"border-bottom:1px dotted #ccc;\">");
      out.print(pagelist2.get(3).toString() );
      out.write("</td>\r\n");
      out.write("      <td align=\"center\" bgcolor=\"#FFFFFF\"  style=\"border-bottom:1px dotted #ccc;\"><a href=\"");
      out.print(basePath );
      out.write("Affiche.shtml?method=hideAffiche&id=");
      out.print(pagelist2.get(0).toString());
      out.write('"');
      out.write('>');
      out.print(Integer.parseInt(pagelist2.get(4).toString())==1?"显示":"隐藏" );
      out.write("</a></td>\r\n");
      out.write("      <td align=\"center\" bgcolor=\"#FFFFFF\"  style=\"border-bottom:1px dotted #ccc;\"><input type=\"checkbox\" name=\"checkit\" value=\"");
      out.print(pagelist2.get(0).toString());
      out.write("\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\t\r\n");

	}}

      out.write("  \r\n");
      out.write("<TR align=\"right\" >\r\n");
      out.write("\t\t\t <TD colspan=\"6\" id=map>\r\n");
      out.write("\t\t\t <input type=\"checkbox\" name=\"checkall\" onClick=\"allch()\" >&nbsp;全选&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t </TD>\r\n");
      out.write("\t\t\t </TR>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t </TBODY>\r\n");
      out.write("\t </TABLE>\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("<TR>\r\n");
      out.write("    \t   <TD align=\"center\" vAlign=top >\r\n");
      out.write("             <TABLE  align=\"center\" vAlign=top width=\"100%\" border=0 align=\"center\" cellPadding=3 cellSpacing=1>\r\n");
      out.write("\t\t     <TBODY>\r\n");
      out.write("\t\t     <TR align=\"center\" class=head>\r\n");
      out.write("\t\t\t <TD >\r\n");
      out.write("\t\t\t <input type=\"button\" name=\"button\" value=\"删除\" onClick=\"del()\" >\r\n");
      out.write("\t\t\t </TD>\r\n");
      out.write("\t\t\t </TR>\r\n");
      out.write("\t\t\t </TBODY>\r\n");
      out.write("\t\t\t </TABLE>\r\n");
      out.write("\t\t  </TD>\r\n");
      out.write("\t\t </TR>\r\n");
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
