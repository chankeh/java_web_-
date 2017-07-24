package org.apache.jsp.admin.guestbook;

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
      com.bean.GuestBookBean lb = null;
      synchronized (_jspx_page_context) {
        lb = (com.bean.GuestBookBean) _jspx_page_context.getAttribute("lb", PageContext.PAGE_SCOPE);
        if (lb == null){
          lb = new com.bean.GuestBookBean();
          _jspx_page_context.setAttribute("lb", lb, PageContext.PAGE_SCOPE);
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
      out.write("<script  language=\"javascript\" >\r\n");
      out.write("function top(){\r\n");
      out.write("   \tform3.action=\"");
      out.print(basePath);
      out.print(dir );
      out.write("/guestbook/index.jsp?page=1\";\r\n");
      out.write("    form3.submit();\r\n");
      out.write("}\r\n");
      out.write("function last(){\r\n");
      out.write("    if(form3.pageCount.value==0){//如果总页数为0，那么最后一页为1，也就是第一页，而不是第0页\r\n");
      out.write("    form3.action=\"");
      out.print(basePath);
      out.print(dir );
      out.write("/guestbook/index.jsp?page=1\";\r\n");
      out.write("    form3.submit();\r\n");
      out.write("\t}else{\r\n");
      out.write("\tform3.action=\"");
      out.print(basePath);
      out.print(dir );
      out.write("/guestbook/index.jsp?page=\"+form3.pageCount.value;\r\n");
      out.write("    \tform3.submit();\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("function pre(){\r\n");
      out.write("  var page=parseInt(form3.page.value);\r\n");
      out.write("  if(page<=1){\r\n");
      out.write("    alert(\"已至第一页\");\r\n");
      out.write("  }else{\r\n");
      out.write("    form3.action=\"");
      out.print(basePath);
      out.print(dir );
      out.write("/guestbook/index.jsp?page=\"+(page-1);\r\n");
      out.write("    form3.submit();\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function next(){\r\n");
      out.write("  var page=parseInt(form3.page.value);\r\n");
      out.write("  var pageCount=parseInt(form3.pageCount.value);\r\n");
      out.write("  if(page>=pageCount){\r\n");
      out.write("    alert(\"已至最后一页\");\r\n");
      out.write("  }else{\r\n");
      out.write("    form3.action=\"");
      out.print(basePath);
      out.print(dir );
      out.write("/guestbook/index.jsp?page=\"+(page+1);\r\n");
      out.write("    form3.submit();\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("function bjump(){\r\n");
      out.write("  \tvar pageCount=parseInt(form3.pageCount.value);\r\n");
      out.write("  \tif( fIsNumber(form3.busjump.value,\"1234567890\")!=1 ){\r\n");
      out.write("\t\talert(\"跳转文本框中只能输入数字!\");\r\n");
      out.write("\t\tform3.busjump.select();\r\n");
      out.write("\t\tform3.busjump.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(form3.busjump.value>pageCount){//如果跳转文本框中输入的页数超过最后一页的数，则跳到最后一页\r\n");
      out.write("\t  if(pageCount==0){\t\r\n");
      out.write("\t  form3.action=\"");
      out.print(basePath);
      out.print(dir );
      out.write("/guestbook/index.jsp?page=1\";\r\n");
      out.write("\t  form3.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\telse{\r\n");
      out.write("\t\tform3.action=\"");
      out.print(basePath);
      out.print(dir );
      out.write("/guestbook/index.jsp?page=\"+pageCount;\r\n");
      out.write("\t\tform3.submit();\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("else if(form3.busjump.value<=pageCount){\r\n");
      out.write("var page=parseInt(form3.busjump.value);\r\n");
      out.write("   if(page==0){\r\n");
      out.write("      page=1;//如果你输入的是0，那么就让它等于1\r\n");
      out.write("      form3.action=\"");
      out.print(basePath);
      out.print(dir );
      out.write("/guestbook/index.jsp?page=\"+page;\r\n");
      out.write("      form3.submit();\r\n");
      out.write("   }else{\r\n");
      out.write("      form3.action=\"");
      out.print(basePath);
      out.print(dir );
      out.write("/guestbook/index.jsp?page=\"+page;\r\n");
      out.write("      form3.submit();\r\n");
      out.write("   }\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("//****判断是否是Number.\r\n");
      out.write("function fIsNumber (sV,sR){\r\n");
      out.write("var sTmp;\r\n");
      out.write("if(sV.length==0){ return (false);}\r\n");
      out.write("for (var i=0; i < sV.length; i++){\r\n");
      out.write("sTmp= sV.substring (i, i+1);\r\n");
      out.write("if (sR.indexOf (sTmp, 0)==-1) {return (false);}\r\n");
      out.write("}\r\n");
      out.write("return (true);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function del()\r\n");
      out.write("{\r\n");
      out.write("\tpageform.submit();\r\n");
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
		response.sendRedirect(basePath+"/error.jsp");
	}
	else{
	List list = sn.getSiteInfo();
	String sitename = list.get(0).toString();
	String method=request.getParameter("method");
	String stime="2";String etime="2";
	if(method!=null){
		if(method.equals("datequery")){
			stime=request.getParameter("stime");etime=request.getParameter("etime");
		}
		if(method.equals("showgb")){
			stime="1";etime="1";
		}
		if(method.equals("hidegb")){
			stime="0";etime="0";
		}
	}

      out.write("\r\n");
      out.write("<BODY oncontextmenu=\"return false;\" onselectstart=\"return false;\" leftMargin=0 background=");
      out.print(basePath );
      out.print(dir );
      out.write("/images/MainBg.gif topMargin=0 scroll=no marginheight=\"0\" marginwidth=\"0\">\r\n");
      out.write("\r\n");
      out.write("<TABLE cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("  <TBODY>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD align=\"left\" vAlign=top >\r\n");
      out.write("       <TABLE width=\"100%\" border=0 align=\"center\" cellPadding=3 cellSpacing=1 class=tablewidth>\r\n");
      out.write("\t\t  <TBODY>\r\n");
      out.write("\t\t  <TR align=\"center\" class=head>\r\n");
      out.write("\t\t\t<TD height=23>序号</TD>\r\n");
      out.write("\t\t\t<TD>昵称</TD>\r\n");
      out.write("\t\t\t<TD>邮箱</TD>\r\n");
      out.write("\t\t\t<TD>QQ</TD>\r\n");
      out.write("\t\t\t<TD>网址</TD>\r\n");
      out.write("\t\t\t<TD>博客网址</TD>\r\n");
      out.write("\t\t\t<TD>留言时间</TD>\r\n");
      out.write("\t\t\t<TD>ip地址</TD>\r\n");
      out.write("\t\t\t<TD>回复</TD>\r\n");
      out.write("\t\t\t<TD>是否显示</TD>\r\n");
      out.write("\t\t\t<TD>选择</TD>\r\n");
      out.write("\t\t  </TR>\r\n");
      out.write("\t\t");

			lb.setEVERYPAGENUM(10);
			int cou = lb.getMessageCountM(stime,etime);//得到信息总数			        
			String page1=request.getParameter("page");
			if(page1==null){
				page1="1";
			}
			session.setAttribute("busMessageCount", cou + "");
			session.setAttribute("busPage", page1);
			List pagelist1 = lb.getMessageM(Integer.parseInt(page1),stime,etime); //带进一个页数，并返回该页所要显示的信息 
			session.setAttribute("qqq", pagelist1);
			int pageCount = lb.getPageCount(); //得到页数  
			session.setAttribute("busPageCount", pageCount + ""); 
			List pagelist3=(ArrayList)session.getAttribute("qqq");
			
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
      out.write("GuestBook.shtml?method=delguestbook\" method=\"post\" name=\"pageform\">\r\n");
      out.write("\t\t\t");

				for(int i=0;i<pagelist3.size();i++){
					List pagelist2 =(ArrayList)pagelist3.get(i);
			
      out.write("   \r\n");
      out.write("\t\t  <TR align=\"center\" bgColor=#ffffff>\r\n");
      out.write("\t\t\t<TD width=\"30\" id=map>");
      out.print(i+1 );
      out.write("</TD>\r\n");
      out.write("\t\t\t<TD id=map><a href=\"");
      out.print(basePath );
      out.print(dir );
      out.write("/guestbook/replay.jsp?id=");
      out.print(pagelist2.get(0).toString());
      out.write('"');
      out.write('>');
      out.print(pagelist2.get(1).toString() );
      out.write("</a></TD>\r\n");
      out.write("\t\t\t<TD id=map><A title=\"E_mail\" href=\"mailto:");
      out.print(pagelist2.get(3).toString());
      out.write('"');
      out.write('>');
      out.print(pagelist2.get(3).toString() );
      out.write("</A></TD>\r\n");
      out.write("\t\t\t<TD id=map><A title=\"QQ:");
      out.print(pagelist2.get(4).toString());
      out.write("\"  href=\"tencent://message/?uin=");
      out.print(pagelist2.get(4).toString());
      out.write("&Site=");
      out.print(sitename);
      out.write("&Menu=yes\">");
      out.print(pagelist2.get(4).toString() );
      out.write("</A></TD>\r\n");
      out.write("\t\t\t<TD id=map><A title=\"网址\"  href=\"");
      out.print(pagelist2.get(5).toString());
      out.write("\" target=\"_blank\" >");
      out.print(pagelist2.get(5).toString() );
      out.write("</A></TD>\r\n");
      out.write("\t\t\t<TD id=map><A title=\"博客地址\"  href=\"");
      out.print(pagelist2.get(6).toString());
      out.write("\" target=\"_blank\" >");
      out.print(pagelist2.get(6).toString() );
      out.write("</A></TD>\r\n");
      out.write("\t\t\t<TD id=map>");
      out.print(pagelist2.get(9).toString() );
      out.write("</TD>\r\n");
      out.write("\t\t\t<TD id=map>");
      out.print(pagelist2.get(10).toString() );
      out.write("</TD>\r\n");
      out.write("\t\t\t<TD id=map>");
      out.print(pagelist2.get(11).toString().equals("1")?"<font color=red>已</font>":"<font color=blue>未</font>" );
      out.write("</TD>\r\n");
      out.write("\t\t\t<TD id=map><a href=\"");
      out.print(basePath);
      out.write("GuestBook.shtml?method=HIDEGUESTBOOK&id=");
      out.print(pagelist2.get(0).toString());
      out.write('"');
      out.write('>');
      out.print(Integer.parseInt(pagelist2.get(12).toString())==1?"已显示":"已屏蔽" );
      out.write("</a></TD>\r\n");
      out.write("\t\t\t<TD id=map><input type=\"checkbox\" name=\"checkit\" value=\"");
      out.print(pagelist2.get(0).toString());
      out.write("\"></TD>\r\n");
      out.write("\t\t  </TR>\r\n");
      out.write("\t\t");
}
      out.write("    \t\r\n");
      out.write("\t\t  <TR align=\"right\" >\r\n");
      out.write("\t\t\t <TD colspan=\"11\" id=map>\r\n");
      out.write("\t\t\t <input type=\"checkbox\" name=\"checkall\" onClick=\"allch()\" >&nbsp;全选\r\n");
      out.write("\t\t\t </TD>\r\n");
      out.write("\t\t\t </TR>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t  </TBODY>\r\n");
      out.write("      </TABLE>\r\n");
      out.write("       </TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t     <TR>\r\n");
      out.write("    \t   <TD align=\"right\" vAlign=top >\r\n");
      out.write("             <TABLE width=\"100%\" border=0 align=\"right\" cellPadding=3 cellSpacing=1>\r\n");
      out.write("\t\t     <TBODY>\r\n");
      out.write("\t\t     <TR align=\"right\" class=head>\r\n");
      out.write("\t\t\t <TD >\r\n");
      out.write("\t\t\t <form action=\"\" method=\"post\" name=\"form3\">\t\r\n");
      out.write("\t\t\t <input type=\"hidden\" name=\"pageCount\" value=\"");
      out.print( session.getAttribute("busPageCount").toString());
      out.write("\" /><!--//用于给上面javascript传值-->\r\n");
      out.write("\t\t\t <input type=\"hidden\" name=\"page\" value=\"");
      out.print(session.getAttribute("busPage").toString());
      out.write("\" /><!--//用于给上面javascript传值-->         \r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" onClick=\"top()\"><img src=\"");
      out.print(basePath );
      out.write("images/first.gif\" border=\"0\" /></a>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t<a href=\"#\" onClick=\"pre()\"><img src=\"");
      out.print(basePath );
      out.write("images/pre.gif\" border=\"0\" /></a>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t 共");
      out.print(session.getAttribute("busMessageCount").toString());
      out.write("条记录,共计");
      out.print(session.getAttribute("busPageCount").toString());
      out.write("页,当前第");
      out.print(session.getAttribute("busPage").toString());
      out.write("页&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t<a href=\"#\" onClick=\"next()\"><img src=\"");
      out.print(basePath );
      out.write("images/next.gif\" border=\"0\" /></a>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t<a href=\"#\" onClick=\"last()\"><img src=\"");
      out.print(basePath );
      out.write("images/last.gif\" border=\"0\" /></a>\r\n");
      out.write("\t\t\t 第<input name=\"busjump\" type=\"text\" size=\"3\" />页<a href=\"#\" onClick=\"bjump()\"><img src=\"");
      out.print(basePath );
      out.write("images/jump.gif\" border=\"0\" /></a>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t </form>\r\n");
      out.write("             </TD>\r\n");
      out.write("             </TR>\r\n");
      out.write("\t\t\t </TBODY>\r\n");
      out.write("\t\t\t </TABLE>\r\n");
      out.write("\t\t  </TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t\t<TR>\r\n");
      out.write("    \t   <TD align=\"center\" vAlign=top >\r\n");
      out.write("             <TABLE width=\"100%\" border=0 align=\"center\" cellPadding=3 cellSpacing=1>\r\n");
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
