package org.apache.jsp.admin.sale;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.util.*;
import com.bean.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
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
      out.write("<SCRIPT language=JavaScript src=\"");
      out.print(basePath );
      out.print(dir );
      out.write("/images/calendar.js\"></SCRIPT>\r\n");
      out.write("<STYLE type=text/css>\r\n");
      out.write("BODY {\r\n");
      out.write("\tMARGIN-LEFT: 0px; BACKGROUND-COLOR: #ffffff\r\n");
      out.write("}\r\n");
      out.write(".STYLE1 {color: #ECE9D8}\r\n");
      out.write("</STYLE>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<!--  -->\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function check()\r\n");
      out.write("{\r\n");
      out.write("\tif(document.form1.type.value==\"\"||document.form1.video.value==\"\"||document.form1.sum.value==\"\"\r\n");
      out.write("\t||document.form1.price.value==\"\"||document.form1.tel.value==\"\"||document.form1.linkman.value==\"\"\r\n");
      out.write("\t||document.form1.address.value==\"\"||document.form1.intro.value==\"\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"所有项目必须填写！\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
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
	//String sname,String sex,String bir,String sheng,String city,String tel,String address,String email,String intro
	String method=request.getParameter("method").trim();
	String id=request.getParameter("id");
	String type="";String video="";String sum="";String price="";String tel="";String linkman="";String address="";String intro="";
	if(method.equals("upSale")){
		List list=hsb.getOneSale(Integer.parseInt(id));
		type=list.get(1).toString();video=list.get(2).toString();sum=list.get(3).toString();price=list.get(4).toString();
		tel=list.get(5).toString();linkman=list.get(6).toString();address=list.get(7).toString();intro=list.get(8).toString();
	}
		

      out.write("\r\n");
      out.write("<BODY >\r\n");
      out.write(" <TABLE width=\"100%\" border=0 align=\"center\" cellPadding=3 cellSpacing=1 class=tablewidth>\r\n");
      out.write("\t\t  <TBODY>\r\n");
      out.write("\t\t  <TR align=\"center\" class=head>\r\n");
      out.write("\t\t\t<TD height=23>出售信息管理 所有项目必须填写</TD>\r\n");
      out.write("\t\t  </TR>\r\n");
      out.write("\t\t  <TR align=\"center\" >\r\n");
      out.write("\t\t\t<TD >\r\n");
      out.write("\t\t<form name=\"form1\" action=\"");
      out.print(basePath );
      out.write("HouseServlet\" method=\"post\" onsubmit=\"return check()\">\r\n");
      out.write("\t\t  <TABLE width=\"100%\" border=0 align=\"center\" cellPadding=3 cellSpacing=1 >\r\n");
      out.write("\t\t  <TBODY>\t  <!-- 户型 视频 面积 价格 电话 联系人  地址 介绍 发布时间 -->\r\n");
      out.write("\t\t  <TR  align=\"center\" bgColor=#ffffff>\r\n");
      out.write("\t\t\t<TD width=40% id=map align=right>房产户型：<input type=hidden name=method value=");
      out.print(method );
      out.write("><input type=hidden name=id value=");
      out.print(id );
      out.write("></TD>\r\n");
      out.write("\t\t\t<TD align=left><input type=text size=30 maxlength=50 name=type value=\"");
      out.print(type );
      out.write("\" ></TD>\r\n");
      out.write("\t\t  </TR>\r\n");
      out.write("\t\t   <TR  align=\"center\" bgColor=#ffffff>\r\n");
      out.write("\t\t\t<TD width=40% id=map align=right>视&nbsp;&nbsp;&nbsp;&nbsp;频：</TD>\r\n");
      out.write("\t\t\t<TD align=left><input type=text size=30 maxlength=150 name=video value=\"");
      out.print(video );
      out.write("\" > 请填写视频地址</TD>\r\n");
      out.write("\t\t  </TR>\r\n");
      out.write("\t\t  <TR  align=\"center\" bgColor=#ffffff>\r\n");
      out.write("\t\t\t<TD width=40% id=map align=right>房产面积：</TD>\r\n");
      out.write("\t\t\t<TD align=left><input type=text size=30 maxlength=50 name=sum value=\"");
      out.print(sum );
      out.write("\" > </TD>\r\n");
      out.write("\t\t  </TR>\r\n");
      out.write("\t\t <TR  align=\"center\" bgColor=#ffffff>\r\n");
      out.write("\t\t\t<TD width=40% id=map align=right>房产价格：</TD>\r\n");
      out.write("\t\t\t<TD align=left><input type=text size=30 maxlength=50 name=price value=\"");
      out.print(price );
      out.write("\" > </TD>\r\n");
      out.write("\t\t  </TR>\r\n");
      out.write("\t\t   <TR  align=\"center\" bgColor=#ffffff>\r\n");
      out.write("\t\t\t<TD width=40% id=map align=right>联系电话：</TD>\r\n");
      out.write("\t\t\t<TD align=left><input type=text size=30 maxlength=50 name=tel value=");
      out.print(tel );
      out.write("> </TD>\r\n");
      out.write("\t\t  </TR>\r\n");
      out.write("\t\t   <TR  align=\"center\" bgColor=#ffffff>\r\n");
      out.write("\t\t\t<TD width=40% id=map align=right>联 系 人：</TD>\r\n");
      out.write("\t\t\t<TD align=left><input type=text size=30 maxlength=50 name=linkman value=");
      out.print(linkman );
      out.write("> </TD>\r\n");
      out.write("\t\t  </TR>\r\n");
      out.write("\t\t  <TR  align=\"center\" bgColor=#ffffff>\r\n");
      out.write("\t\t\t<TD width=40% id=map align=right>地&nbsp;&nbsp;&nbsp;&nbsp;址：</TD>\r\n");
      out.write("\t\t\t<TD align=left><input type=text size=30 maxlength=50 name=address value=");
      out.print(address );
      out.write("> </TD>\r\n");
      out.write("\t\t  </TR>\r\n");
      out.write("\t\t  <TR  align=\"center\" bgColor=#ffffff>\r\n");
      out.write("\t\t\t<TD width=40% id=map align=right>详细资料：</TD>\r\n");
      out.write("\t\t\t<TD align=left><textarea name=intro rows=10 cols=50>");
      out.print(intro );
      out.write("</textarea></TD>\r\n");
      out.write("\t\t  </TR>\r\n");
      out.write("\t\t  <TR  align=\"center\" bgColor=#ffffff>\r\n");
      out.write("\t\t\t<TD colspan=2 align=center><input type=submit value=\"提交\"></TD>\r\n");
      out.write("\t\t  </TR>\r\n");
      out.write("\t\t  </TBODY>\r\n");
      out.write("\t   </TABLE>\r\n");
      out.write("\t\t  </form>\r\n");
      out.write("\t\t  </TD>\r\n");
      out.write("\t\t  </TR>\r\n");
      out.write("\t\t  </TBODY>\r\n");
      out.write("\t   </TABLE>\r\n");
      out.write("</BODY>\r\n");
} 
      out.write("\r\n");
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
