package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.util.*;
import java.util.*;

public final class guestbook_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(2);
    _jspx_dependants.add("/iframe/head.jsp");
    _jspx_dependants.add("/iframe/foot.jsp");
  }

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
      out.write('\r');
      out.write('\n');
      com.bean.SystemBean sys = null;
      synchronized (_jspx_page_context) {
        sys = (com.bean.SystemBean) _jspx_page_context.getAttribute("sys", PageContext.PAGE_SCOPE);
        if (sys == null){
          sys = new com.bean.SystemBean();
          _jspx_page_context.setAttribute("sys", sys, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      com.bean.AfficheBean abc = null;
      synchronized (_jspx_page_context) {
        abc = (com.bean.AfficheBean) _jspx_page_context.getAttribute("abc", PageContext.PAGE_SCOPE);
        if (abc == null){
          abc = new com.bean.AfficheBean();
          _jspx_page_context.setAttribute("abc", abc, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      com.bean.NewsBean news = null;
      synchronized (_jspx_page_context) {
        news = (com.bean.NewsBean) _jspx_page_context.getAttribute("news", PageContext.PAGE_SCOPE);
        if (news == null){
          news = new com.bean.NewsBean();
          _jspx_page_context.setAttribute("news", news, PageContext.PAGE_SCOPE);
        }
      }
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

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
List sysList=sys.getSiteInfo();
List affList=abc.getAllAffiche();
List newsList=news.getIndexNews();
List AllnewsList=news.getAllNews();

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd\">\r\n");
      out.write("<HTML xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<HEAD>\r\n");
      out.write("<TITLE>");
      out.print(sysList.get(0).toString() );
      out.write("</TITLE>\r\n");
      out.write("<META http-equiv=Content-Language content=zh-cn>\r\n");
      out.write("<META http-equiv=Content-Type content=\"text/html; charset=gb2312\">\r\n");
      out.write("<META name=\"keywords\" content=\"");
      out.print(sysList.get(2).toString() );
      out.write("\" />\r\n");
      out.write("<META name=\"description\" content=\"");
      out.print(sysList.get(3).toString() );
      out.write("\" />\r\n");
      out.write("\r\n");
      out.write("<META content=\"MSHTML 6.00.2900.3243\" name=GENERATOR>\r\n");
      out.write("<LINK href=\"");
      out.print(basePath );
      out.write("images/css.css\" type=text/css rel=stylesheet>\r\n");
      out.write("<LINK href=\"");
      out.print(basePath );
      out.write("images/default.css\" type=text/css rel=stylesheet>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<SCRIPT language=JavaScript src=\"");
      out.print(basePath );
      out.write("images/Common.js\"></SCRIPT>\r\n");
      out.write("<SCRIPT language=JavaScript src=\"");
      out.print(basePath );
      out.write("images/index.js\"></SCRIPT>\r\n");
      out.write("<SCRIPT language=JavaScript src=\"");
      out.print(basePath );
      out.write("images/calendar.js\"></SCRIPT>\r\n");
if(sysList.get(5).toString().trim().equals("open")){ 
      out.write("\r\n");
      out.write("<SCRIPT language=JavaScript>\r\n");
      out.write("<!--//屏蔽出错代码\r\n");
      out.write("function killErr(){\r\n");
      out.write("\treturn true;\r\n");
      out.write("}\r\n");
      out.write("window.onerror=killErr;\r\n");
      out.write("//-->\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("<SCRIPT language=JavaScript>\r\n");
      out.write("<!--//处理大分类一行两个小分类\r\n");
      out.write("function autoTable(div){\r\n");
      out.write("\tfs=document.getElementById(div).getElementsByTagName(\"TABLE\");\r\n");
      out.write("\tfor(var i=0;i<fs.length;i++){\r\n");
      out.write("\t\tfs[i].style.width='49.5%';\r\n");
      out.write("\t\tif(i%2==1){\r\n");
      out.write("\t\t\tif (document.all) {\r\n");
      out.write("\t\t\t\tfs[i].style.styleFloat=\"right\";\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tfs[i].style.cssFloat=\"right;\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tif (document.all) {\r\n");
      out.write("\t\t\t\tfs[i].style.styleFloat=\"left\";\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tfs[i].style.cssFloat=\"left;\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("//-->\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("<SCRIPT language=JavaScript src=\"images/inc.js\"></SCRIPT>\r\n");
      out.write("<SCRIPT language=JavaScript src=\"images/default.js\"></SCRIPT>\r\n");
      out.write("<SCRIPT language=JavaScript src=\"images/swfobject.js\"></SCRIPT>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY text=#000000 bgColor=#ffffff leftMargin=0 topMargin=0>\r\n");
      out.write("<SCRIPT language=JavaScript>\r\n");
      out.write("<!--//目的是为了做风格方便\r\n");
      out.write("document.write('<div class=\"wrap\">');\r\n");
      out.write("//-->\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("<TABLE id=toplogin cellSpacing=0 cellPadding=0 width=\"100%\" align=center border=0>\r\n");
      out.write("  <TBODY>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD vAlign=center align=left>\r\n");
      out.write("      <DIV class=jstime style=\"FLOAT: left; WIDTH: 25%\">\r\n");
      out.write("      【<a href=\"login.jsp\">会员登录</a>】【<a href=\"reg.jsp\">免费注册</a>】【<a href=\"lost.jsp\">忘记密码</a>】\r\n");
      out.write("      </DIV>\r\n");
      out.write("      <DIV class=jstime style=\"FLOAT: right; WIDTH: 45%; TEXT-ALIGN: right\">\r\n");
      out.write("\t  <!--****************时间日历开始****************-->\r\n");
      out.write("      <SCRIPT>setInterval(\"clock.innerHTML=new Date().toLocaleString()+'&nbsp;&nbsp;星期'+'日一二三四五六'.charAt(new Date().getDay());\",1000)</SCRIPT>\r\n");
      out.write("      <SPAN id=clock></SPAN>\r\n");
      out.write("\t  <!--****************时间日历结束****************-->&nbsp;&nbsp; \r\n");
      out.write("      <A href=\"javascript:javascript:window.external.AddFavorite('");
      out.print(basePath );
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.print(sysList.get(0).toString() );
      out.write("');\">加入收藏</A> \r\n");
      out.write("      <A onclick=\"this.style.behavior='url(#default#homepage)';this.setHomePage('");
      out.print(basePath );
      out.write("');\" href=\"http://localhost/#\">设为首页</A> \r\n");
      out.write("\t  <A href=\"");
      out.print(basePath );
      out.write("admin/login.jsp\">管理登录</A> \r\n");
      out.write("\t  </DIV>\r\n");
      out.write("\t</TD>\r\n");
      out.write("   </TR>\r\n");
      out.write("   </TBODY>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<TABLE id=header cellSpacing=0 cellPadding=0 width=\"100%\" align=center border=0>\r\n");
      out.write("<TBODY>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD>\r\n");
      out.write("      <DIV class=logo>\r\n");
      out.write("\t <img src=");
      out.print(basePath );
      out.write("images/ad.jpg width=950 height=90>\r\n");
      out.write("\t  </DIV>\r\n");
      out.write("\t</TD>\r\n");
      out.write("  </TR>\r\n");
      out.write(" </TBODY>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<TABLE id=guide cellSpacing=0 cellPadding=0 width=\"100%\" align=center border=0>\r\n");
      out.write("<TBODY>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD align=middle>\r\n");
      out.write("\t<A href=\"index.jsp\" target=\"\">首    页</A> |\r\n");
      out.write("\t\r\n");
      out.write("\t<A href=\"news.jsp\" target=\"\">新闻中心</A> |\r\n");
      out.write("\t\r\n");
      out.write("\t<A href=\"out.jsp\" target=\"\">出租信息</A> |\r\n");
      out.write("\t\r\n");
      out.write("\t<A href=\"in.jsp\" target=\"\">求租信息</A> |\r\n");
      out.write("\t\r\n");
      out.write("\t<A href=\"sale.jsp\" target=\"\">出售信息</A> |\r\n");
      out.write("\t\r\n");
      out.write("\t<A href=\"buy.jsp\" target=\"\">求购信息</A> |\r\n");
      out.write("\t\r\n");
      out.write("\t<A href=\"search.jsp\" target=\"\">信息检索</A> |\r\n");
      out.write("\t\r\n");
      out.write("\t<A href=\"login.jsp\" target=\"\">会员中心</A> |\r\n");
      out.write("\t\r\n");
      out.write("\t<A href=\"guestbook.jsp\" target=\"\">留言板</A> \r\n");
      out.write("\t</TD>\r\n");
      out.write("  </TR>\r\n");
      out.write("</TBODY>\r\n");
      out.write("</TABLE>\r\n");
      out.write('\r');
      out.write('\n');
      com.bean.GuestBookBean guestbean = null;
      synchronized (_jspx_page_context) {
        guestbean = (com.bean.GuestBookBean) _jspx_page_context.getAttribute("guestbean", PageContext.PAGE_SCOPE);
        if (guestbean == null){
          guestbean = new com.bean.GuestBookBean();
          _jspx_page_context.setAttribute("guestbean", guestbean, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script  language=\"javascript\" >\r\n");
      out.write("function top(){\r\n");
      out.write("   \tform3.action=\"");
      out.print(basePath);
      out.write("guestbook.jsp?page=1\";\r\n");
      out.write("    form3.submit();\r\n");
      out.write("}\r\n");
      out.write("function last(){\r\n");
      out.write("    if(form3.pageCount.value==0){//如果总页数为0，那么最后一页为1，也就是第一页，而不是第0页\r\n");
      out.write("    form3.action=\"");
      out.print(basePath);
      out.write("guestbook.jsp?page=1\";\r\n");
      out.write("    form3.submit();\r\n");
      out.write("\t}else{\r\n");
      out.write("\tform3.action=\"");
      out.print(basePath);
      out.write("guestbook.jsp?page=\"+form3.pageCount.value;\r\n");
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
      out.write("guestbook.jsp?page=\"+(page-1);\r\n");
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
      out.write("guestbook.jsp?page=\"+(page+1);\r\n");
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
      out.write("guestbook.jsp?page=1\";\r\n");
      out.write("\t  form3.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\telse{\r\n");
      out.write("\t\tform3.action=\"");
      out.print(basePath);
      out.write("guestbook.jsp?page=\"+pageCount;\r\n");
      out.write("\t\tform3.submit();\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("else if(form3.busjump.value<=pageCount){\r\n");
      out.write("var page=parseInt(form3.busjump.value);\r\n");
      out.write("   if(page==0){\r\n");
      out.write("      page=1;//如果你输入的是0，那么就让它等于1\r\n");
      out.write("      form3.action=\"");
      out.print(basePath);
      out.write("guestbook.jsp?page=\"+page;\r\n");
      out.write("      form3.submit();\r\n");
      out.write("   }else{\r\n");
      out.write("      form3.action=\"");
      out.print(basePath);
      out.write("guestbook.jsp?page=\"+page;\r\n");
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
      out.write("</script>\r\n");
      out.write("<SCRIPT language=JavaScript src=\"");
      out.print(basePath );
      out.write("images/css/Common.js\"></SCRIPT>\r\n");

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

      out.write("\r\n");
      out.write("<DIV align=center>\r\n");
      out.write("<TABLE cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("        <TBODY>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD >\r\n");
      out.write("<TABLE class=dragTable height=28 cellSpacing=0 cellPadding=0 width=100% align=center background=");
      out.print(basePath );
      out.write("images/head1.gif border=0>\r\n");
      out.write("  <TBODY>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD align=left class=head><FONT color=#000000>您现在的位置：<SPAN \r\n");
      out.write("                        style=\"TEXT-DECORATION: none\">");
      out.print(sysList.get(0).toString() );
      out.write("</SPAN>&gt;&gt; 访客留言</FONT>\r\n");
      out.write("\t</TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("  </TBODY>\r\n");
      out.write("</TABLE></TD></TR>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD class=middle><br>\r\n");
      out.write("\t<!--循环开始==============================================================-->\r\n");
      out.write("\t");

	String member=(String)session.getAttribute("member");
	if(member==null)member="游客";
		guestbean.setEVERYPAGENUM(6);
		int cou = guestbean.getMessageCount();//得到信息总数			        
		String page1=request.getParameter("page");
		if(page1==null){
			page1="1";
		}
		session.setAttribute("busMessageCount", cou + "");
		session.setAttribute("busPage", page1);
		List pagelist1 = guestbean.getMessage(Integer.parseInt(page1)); //带进一个页数，并返回该页所要显示的信息 
		session.setAttribute("qqq", pagelist1);
		int pageCount = guestbean.getPageCount(); //得到页数  
		session.setAttribute("busPageCount", pageCount + ""); 
		List pagelist3=(ArrayList)session.getAttribute("qqq");
		if(!pagelist3.isEmpty()){
			for(int i=0;i<pagelist3.size();i++){
				List pagelist2 =(ArrayList)pagelist3.get(i);
				List replay=guestbean.getReplayInfo(Integer.parseInt(pagelist2.get(0).toString()));
	
      out.write("\r\n");
      out.write("\t<TABLE class=guestbook cellSpacing=0 cellPadding=0 width=\"100%\" \r\n");
      out.write("            border=0>\r\n");
      out.write("              <TBODY>\r\n");
      out.write("              <TR>\r\n");
      out.write("                <TD class=Ftd align=middle width=\"18%\" rowSpan=2>\r\n");
      out.write("                  <DIV class=icon><IMG height=80  src=\"");
      out.print(basePath+pagelist2.get(2).toString() );
      out.write("\" width=80 border=0></DIV>\r\n");
      out.write("                  <DIV class=name>");
      out.print(pagelist2.get(1).toString() );
      out.write("</DIV></TD>\r\n");
      out.write("                <TD class=Ctd vAlign=top width=\"82%\" height=75>\r\n");
      out.write("                  <TABLE style=\"TABLE-LAYOUT: fixed; WORD-WRAP: break-word\" cellSpacing=0 cellPadding=0 width=\"80%\" border=0>\r\n");
      out.write("                    <TBODY>\r\n");
      out.write("                    <TR>\r\n");
      out.write("                      <TD class=content align=left>\r\n");
      out.write("\t\t\t\t\t  <IMG height=20 src=\"");
      out.print(basePath+pagelist2.get(7).toString() );
      out.write("\" width=20> \r\n");
      out.write("                        ");
      out.print(pagelist2.get(8).toString() );
      out.write("\r\n");
      out.write("                        ");

                        if(!replay.isEmpty()){	
                        
      out.write("\r\n");
      out.write("                        <FIELDSET>\r\n");
      out.write("\t\t\t\t\t\t<LEGEND>留言回复 </LEGEND>");
      out.print(replay.get(0).toString() );
      out.write(" \r\n");
      out.write("                        (署名: ");
      out.print(replay.get(1).toString() );
      out.write("/日期:");
      out.print(replay.get(2).toString() );
      out.write(")\r\n");
      out.write("\t\t\t\t\t\t</FIELDSET>\r\n");
      out.write("\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t  </TD>\r\n");
      out.write("\t\t\t\t\t </TR>\r\n");
      out.write("\t\t\t\t\t</TBODY>\r\n");
      out.write("\t\t\t\t</TABLE>\r\n");
      out.write("\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t</TR>\r\n");
      out.write("              <TR>\r\n");
      out.write("                <TD class=Atd width=\"82%\">\r\n");
      out.write("                时间： ");
      out.print(pagelist2.get(9).toString());
      out.write("&nbsp;\r\n");
      out.write("\t\t\t\t<A title=\"QQ:");
      out.print(pagelist2.get(4).toString());
      out.write("\"  href=\"tencent://message/?uin=");
      out.print(pagelist2.get(4).toString());
      out.write("&Site=网站名称&Menu=yes\"><IMG height=16 src=\"");
      out.print(basePath );
      out.write("images/face/qq.gif\" width=16 border=0></A>&nbsp;\r\n");
      out.write("\t\t\t\t<A title=\"E_mail\" href=\"mailto:");
      out.print(pagelist2.get(3).toString());
      out.write("\"><IMG height=16 src=\"");
      out.print(basePath );
      out.write("images/face/email.gif\" width=16 border=0></A>&nbsp; \r\n");
      out.write("\t\t\t\t<A title=网址   href=\"");
      out.print(pagelist2.get(5).toString());
      out.write("\" target=\"_blank\" ><IMG height=16 src=\"");
      out.print(basePath );
      out.write("images/face/ie.gif\" width=16 border=0></A>&nbsp;  \t\t\t\t\r\n");
      out.write("\t\t\t\t<A title=博客地址   href=\"");
      out.print(pagelist2.get(6).toString());
      out.write("\" target=\"_blank\" ><IMG height=16 src=\"");
      out.print(basePath );
      out.write("images/face/home.gif\" width=16 border=0></A>&nbsp; \r\n");
      out.write("\t\t\t\t<A title=\"");
      out.print(pagelist2.get(10).toString());
      out.write("\"  href=\"javascript:\"><IMG height=16 src=\"");
      out.print(basePath );
      out.write("images/face/ip.gif\" width=16 border=0></A> \r\n");
      out.write("\t\t\t\t</TD>\r\n");
      out.write("\t\t\t  </TR>\r\n");
      out.write("\t\t\t  </TBODY>\r\n");
      out.write("\t\t\t  </TABLE>\r\n");
      out.write("\t");
}}
      out.write("\r\n");
      out.write("\t<!--循环结束==================================================================-->        \r\n");
      out.write("          <br>\r\n");
      out.write("            <TABLE cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("              <TBODY>\r\n");
      out.write("              <TR>\r\n");
      out.write("                <TD align=right>\r\n");
      out.write("                <form action=\"\" method=\"post\" name=\"form3\">\t\r\n");
      out.write("\t\t\t <input type=\"hidden\" name=\"pageCount\" value=\"");
      out.print( session.getAttribute("busPageCount").toString());
      out.write("\" /><!--//用于给上面javascript传值-->\r\n");
      out.write("\t\t\t <input type=\"hidden\" name=\"page\" value=\"");
      out.print(session.getAttribute("busPage").toString());
      out.write("\" /><!--//用于给上面javascript传值-->         \r\n");
      out.write("\t\t\t<a href=\"#\" onClick=\"top()\"><img src=\"");
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
      out.write("                </TD>\r\n");
      out.write("                </TR>\r\n");
      out.write("                </TBODY>\r\n");
      out.write("                </TABLE></TD></TR>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD class=foot>\r\n");
      out.write("            <H3 class=L></H3>\r\n");
      out.write("            <H3 class=R></H3></TD></TR></TBODY></TABLE>\r\n");
      out.write("<TABLE class=dragTable height=28 cellSpacing=0 cellPadding=0 width=100% align=center border=0>\r\n");
      out.write("        <TBODY>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD align=left class=head>&nbsp;我要留言</TD></TR>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD class=middle>\r\n");
      out.write("<STYLE type=text/css>.selected {\r\n");
      out.write("\tBORDER-RIGHT: #ff9900 1px solid; BORDER-TOP: #ff9900 1px solid; FILTER: Alpha(opacity=100); BORDER-LEFT: #ff9900 1px solid; BORDER-BOTTOM: #ff9900 1px solid\r\n");
      out.write("}\r\n");
      out.write(".unselected {\r\n");
      out.write("\tBORDER-RIGHT: #edf8dd 1px solid; BORDER-TOP: #edf8dd 1px solid; FILTER: Alpha(opacity=50); BORDER-LEFT: #edf8dd 1px solid; BORDER-BOTTOM: #edf8dd 1px solid\r\n");
      out.write("}\r\n");
      out.write("</STYLE>\r\n");
      out.write("\r\n");
      out.write("<SCRIPT>\r\n");
      out.write("var prevIcon;\r\n");
      out.write("function icon(num){\r\n");
      out.write("num.className=\"selected\";\r\n");
      out.write("if(typeof(prevIcon)!=\"undefined\"){\r\n");
      out.write("prevIcon.className=\"unselected\";\r\n");
      out.write("}else{\r\n");
      out.write("document.all.firstface.className=\"unselected\";\r\n");
      out.write("}\r\n");
      out.write("if(num.className==\"unselected\"){\r\n");
      out.write("num.className=\"selected\";\r\n");
      out.write("}\r\n");
      out.write("prevIcon=num;\r\n");
      out.write("document.all.face.value=num.childNodes(0).id ;\r\n");
      out.write("}\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("\r\n");
      out.write("            <TABLE cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("              <FORM name=\"form1\" action=\"");
      out.print(basePath);
      out.write("GuestBook.shtml?method=add\" method=\"post\" onSubmit=\"return checkGUEST()\" >\r\n");
      out.write("              <TBODY>\r\n");
      out.write("              <TR>\r\n");
      out.write("                <TD width=\"24%\" align=\"right\">昵&nbsp;&nbsp;&nbsp;&nbsp;称: </TD>\r\n");
      out.write("                <TD align=left><INPUT name=nikename maxlength=20 value=\"");
      out.print(member );
      out.write("\" readonly> 联系Email: \r\n");
      out.write("                <INPUT name=email maxlength=20> QQ: <INPUT size=11 name=qq maxlength=11> \r\n");
      out.write("              </TD></TR>\r\n");
      out.write("              <TR>\r\n");
      out.write("                <TD width=\"24%\" align=\"right\">网站网址:</TD>\r\n");
      out.write("                <TD align=left><INPUT size=35 name=weburl  maxlength=100>  个人BLOG网址: \r\n");
      out.write("                  <INPUT size=35 name=blogurl  maxlength=100> </TD></TR>\r\n");
      out.write("              <TR>\r\n");
      out.write("                <TD width=\"24%\" align=\"right\">表&nbsp;&nbsp;&nbsp;&nbsp;情:</TD>\r\n");
      out.write("                <TD align=left>\r\n");
      out.write("                  <TABLE cellSpacing=0 cellPadding=0 border=0>\r\n");
      out.write("                    <TBODY>\r\n");
      out.write("                    <TR>\r\n");
      out.write("                      <TD class=selected id=firstface style=\"CURSOR: hand\" onclick=icon(this)>\r\n");
      out.write("                      <IMG id=1 height=20  src=\"");
      out.print(basePath );
      out.write("images/face/1.gif\" width=20></TD>\r\n");
      out.write("                      <TD class=unselected style=\"CURSOR: hand\" onclick=icon(this)>\r\n");
      out.write("                      <IMG id=2 height=20 src=\"");
      out.print(basePath );
      out.write("images/face/2.gif\" width=20></TD>\r\n");
      out.write("                      <TD class=unselected style=\"CURSOR: hand\" onclick=icon(this)>\r\n");
      out.write("                      <IMG id=3 height=20 src=\"");
      out.print(basePath );
      out.write("images/face/3.gif\" width=20></TD>\r\n");
      out.write("                      <TD class=unselected style=\"CURSOR: hand\" onclick=icon(this)>\r\n");
      out.write("                      <IMG id=4 height=20 src=\"");
      out.print(basePath );
      out.write("images/face/4.gif\" width=20></TD>\r\n");
      out.write("                      <TD class=unselected style=\"CURSOR: hand\" onclick=icon(this)>\r\n");
      out.write("                      <IMG id=5 height=20 src=\"");
      out.print(basePath );
      out.write("images/face/5.gif\" width=20></TD>\r\n");
      out.write("                      <TD class=unselected style=\"CURSOR: hand\" onclick=icon(this)>\r\n");
      out.write("                      <IMG id=6 height=20 src=\"");
      out.print(basePath );
      out.write("images/face/6.gif\" width=20></TD>\r\n");
      out.write("                      <TD class=unselected style=\"CURSOR: hand\" onclick=icon(this)>\r\n");
      out.write("                      <IMG id=7 height=20 src=\"");
      out.print(basePath );
      out.write("images/face/7.gif\" width=20></TD>\r\n");
      out.write("                      <TD class=unselected style=\"CURSOR: hand\" onclick=icon(this)>\r\n");
      out.write("                      <IMG id=8 height=20 src=\"");
      out.print(basePath );
      out.write("images/face/8.gif\" width=20></TD>\r\n");
      out.write("                      <TD class=unselected style=\"CURSOR: hand\" onclick=icon(this)>\r\n");
      out.write("                      <IMG id=9 height=20 src=\"");
      out.print(basePath );
      out.write("images/face/9.gif\" width=20></TD>\r\n");
      out.write("                      <TD class=unselected style=\"CURSOR: hand\" onclick=icon(this)>\r\n");
      out.write("                      <IMG id=10 height=20 src=\"");
      out.print(basePath );
      out.write("images/face/10.gif\" width=20></TD>\r\n");
      out.write("                      <TD class=unselected style=\"CURSOR: hand\" onclick=icon(this)>\r\n");
      out.write("                      <IMG id=11 height=20 src=\"");
      out.print(basePath );
      out.write("images/face/11.gif\" width=20></TD>\r\n");
      out.write("                      <TD class=unselected style=\"CURSOR: hand\" onclick=icon(this)>\r\n");
      out.write("                      <IMG id=12 height=20 src=\"");
      out.print(basePath );
      out.write("images/face/12.gif\" width=20></TD>\r\n");
      out.write("                      <TD class=unselected style=\"CURSOR: hand\" onclick=icon(this)>\r\n");
      out.write("                      <IMG id=13 height=20 src=\"");
      out.print(basePath );
      out.write("images/face/13.gif\" width=20></TD>\r\n");
      out.write("                      <TD class=unselected style=\"CURSOR: hand\" onclick=icon(this)>\r\n");
      out.write("                      <IMG id=14 height=20 src=\"");
      out.print(basePath );
      out.write("images/face/14.gif\" width=20></TD>\r\n");
      out.write("                      <TD vAlign=top align=middle><INPUT type=hidden value=1 name=face> </TD>\r\n");
      out.write("                      </TR>\r\n");
      out.write("                      </TBODY>\r\n");
      out.write("                      </TABLE>\r\n");
      out.write("                      </TD>\r\n");
      out.write("                      </TR>\r\n");
      out.write("              <TR>\r\n");
      out.write("                <TD width=\"24%\" align=\"right\">留言内容:</TD>\r\n");
      out.write("                <TD align=left><TEXTAREA name=content rows=7 cols=80></TEXTAREA> \r\n");
      out.write("                </TD></TR>\r\n");
      out.write("              <TR>\r\n");
      out.write("                <TD width=\"24%\">&nbsp;</TD>\r\n");
      out.write("                <TD align=left><INPUT type=submit value=\"提 交\" name=Submit> \r\n");
      out.write("            </TD></TR></FORM></TBODY></TABLE></TD></TR>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD >\r\n");
      out.write("            <H3></H3>\r\n");
      out.write("            <H3></H3></TD></TR></TBODY></TABLE>\r\n");
      out.write("</DIV>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<TABLE id=footer cellSpacing=0 cellPadding=0 width=\"100%\" align=center border=0>\r\n");
      out.write("<TBODY>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD align=middle>\r\n");
      out.write("\t<DIV align=center>\r\n");
      out.write("\t  建议使用IE6.0或以上版本浏览 <br>\r\n");
      out.write("\t  ");
      out.print(sysList.get(8).toString() );
      out.write("&nbsp;&nbsp;&nbsp;</DIV>\r\n");
      out.write("    </TD>\r\n");
      out.write(" </TR>\r\n");
      out.write("</TBODY>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<SCRIPT language=JavaScript>\r\n");
      out.write("<!--//目的是为了做风格方便\r\n");
      out.write("document.write('</div>');\r\n");
      out.write("//-->\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("\r\n");
      out.write("<SCRIPT language=JavaScript>\r\n");
      out.write("<!--\r\n");
      out.write("clickEdit.init();\r\n");
      out.write("//-->\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("</BODY>\r\n");
}else{ 
      out.write("\r\n");
      out.write("<br><br><p align=center>");
      out.print(sysList.get(6).toString() );
      out.write('\r');
      out.write('\n');
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
