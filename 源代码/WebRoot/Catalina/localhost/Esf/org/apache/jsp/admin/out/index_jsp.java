package org.apache.jsp.admin.out;

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
      com.bean.HouseBean hsb = null;
      synchronized (_jspx_page_context) {
        hsb = (com.bean.HouseBean) _jspx_page_context.getAttribute("hsb", PageContext.PAGE_SCOPE);
        if (hsb == null){
          hsb = new com.bean.HouseBean();
          _jspx_page_context.setAttribute("hsb", hsb, PageContext.PAGE_SCOPE);
        }
      }
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
      out.write("<HTML><HEAD>\r\n");
      out.write("<LINK href=\"");
      out.print(basePath );
      out.print(dir);
      out.write("/images/Admin_Style.css\" type=text/css rel=stylesheet>\r\n");
      out.write("<LINK href=\"");
      out.print(basePath );
      out.print(dir);
      out.write("/images/style.css\" type=text/css rel=stylesheet>\r\n");
      out.write("<STYLE type=text/css>\r\n");
      out.write("BODY {\r\n");
      out.write("\tMARGIN-LEFT: 0px; BACKGROUND-COLOR: #ffffff\r\n");
      out.write("}\r\n");
      out.write(".STYLE1 {color: #ECE9D8}\r\n");
      out.write("</STYLE>\r\n");
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

      out.write("\r\n");
      out.write("<BODY oncontextmenu=\"return false;\" onselectstart=\"return false;\" leftMargin=0 background=");
      out.print(basePath );
      out.print(dir);
      out.write("/images/MainBg.gif topMargin=0 scroll=yes marginheight=\"0\" marginwidth=\"0\">\r\n");
      out.write("<TABLE cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("  <TBODY>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD align=\"center\" vAlign=top >\r\n");
      out.write("<table width='100%' cellspacing='1' cellpadding='3' bgcolor='#CCCCCC' class=\"tablewidth\">\r\n");
      out.write("<TBODY><!-- 户型 视频 面积 价格 电话 联系人  地址 介绍 发布时间 -->\r\n");
      out.write("     <tr class=\"head\"> \r\n");
      out.write("      <td width=\"5%\" align=\"center\">序号</td>\r\n");
      out.write("      <td  align=\"center\">户型</td>\r\n");
      out.write("      <td  align=\"center\">面积</td>\r\n");
      out.write("      <td  align=\"center\">价格</td>\r\n");
      out.write("      <td  align=\"center\">电话</td>\r\n");
      out.write("      <td  align=\"center\">联系人</td>\r\n");
      out.write("      <td  align=\"center\">地址</td>\r\n");
      out.write("      <td  align=\"center\">发布时间</td>\r\n");
      out.write("      <td  align=\"center\">修改</td>\r\n");
      out.write("      <td  align=\"center\">删除</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    ");
	List pagelist3=hsb.getAllOut();
				if(!pagelist3.isEmpty()){
				for(int i=0;i<pagelist3.size();i++){
					List pagelist2 =(ArrayList)pagelist3.get(i);				
			
      out.write(" \r\n");
      out.write("\t<tr  class=\"trA\" onMouseOver=\"this.className='trB'\" onMouseOut=\"this.className='trA'\"> \r\n");
      out.write("      <td width='5%' align=\"center\" style=\"border-bottom:1px dotted #ccc;\">");
      out.print(i+1 );
      out.write("</td>\r\n");
      out.write("      <td align=\"center\" bgcolor=\"#FFFFFF\"  style=\"border-bottom:1px dotted #ccc;\">\r\n");
      out.write("      <a title=\"信息预览\" href=\"");
      out.print(basePath );
      out.write("outinfo.jsp?id=");
      out.print(pagelist2.get(0).toString());
      out.write("\" target=\"_blank\">");
      out.print(pagelist2.get(1).toString() );
      out.write("</a></td>\r\n");
      out.write("      <td align=\"center\" bgcolor=\"#FFFFFF\"  style=\"border-bottom:1px dotted #ccc;\">");
      out.print(pagelist2.get(3).toString() );
      out.write("</td>\r\n");
      out.write("      <td align=\"center\" bgcolor=\"#FFFFFF\"  style=\"border-bottom:1px dotted #ccc;\">");
      out.print(pagelist2.get(4).toString() );
      out.write("</td>\r\n");
      out.write("      <td align=\"center\" bgcolor=\"#FFFFFF\"  style=\"border-bottom:1px dotted #ccc;\">");
      out.print(pagelist2.get(5).toString() );
      out.write("</td>\r\n");
      out.write("      <td align=\"center\" bgcolor=\"#FFFFFF\"  style=\"border-bottom:1px dotted #ccc;\">");
      out.print(pagelist2.get(6).toString());
      out.write("</td>\r\n");
      out.write("      <td align=\"center\" bgcolor=\"#FFFFFF\"  style=\"border-bottom:1px dotted #ccc;\">");
      out.print(pagelist2.get(7).toString());
      out.write("</td>\r\n");
      out.write("      <td align=\"center\" bgcolor=\"#FFFFFF\"  style=\"border-bottom:1px dotted #ccc;\">");
      out.print(pagelist2.get(9).toString());
      out.write("</td>\r\n");
      out.write("      <td align=\"center\" bgcolor=\"#FFFFFF\"  style=\"border-bottom:1px dotted #ccc;\"><a href=\"");
      out.print(basePath );
      out.write("admin/out/add.jsp?method=upOut&id=");
      out.print(pagelist2.get(0).toString());
      out.write("\">修改</a></td>\r\n");
      out.write("      <td align=\"center\" bgcolor=\"#FFFFFF\"  style=\"border-bottom:1px dotted #ccc;\"><a href=\"");
      out.print(basePath );
      out.write("HouseServlet?method=delOut&id=");
      out.print(pagelist2.get(0).toString());
      out.write("\">删除</a></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\t\r\n");

	}}

      out.write("  \r\n");
      out.write("\t </TBODY>\r\n");
      out.write("\t </TABLE>\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
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
