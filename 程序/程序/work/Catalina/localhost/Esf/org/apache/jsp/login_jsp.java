package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.util.*;
import java.util.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(2);
    _jspx_dependants.add("/../../iframe/head.jsp");
    _jspx_dependants.add("/../../iframe/foot.jsp");
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
      com.util.CheckCode code = null;
      synchronized (_jspx_page_context) {
        code = (com.util.CheckCode) _jspx_page_context.getAttribute("code", PageContext.PAGE_SCOPE);
        if (code == null){
          code = new com.util.CheckCode();
          _jspx_page_context.setAttribute("code", code, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("<SCRIPT language=javascript>\r\n");
      out.write("//检验表单的合法性\r\n");
      out.write("function checklogin() {\r\n");
      out.write("\tif (document.form1.username.value.replace(/\\s+$|^\\s+/g,\"\").length<=0) {\r\n");
      out.write("\t\talert(\"\\请输入您的用户名！\");\r\n");
      out.write("\t\tdocument.form1.username.focus();\r\n");
      out.write("\t}\r\n");
      out.write("\telse if (document.form1.password.value.replace(/\\s+$|^\\s+/g,\"\").length<=0) {\r\n");
      out.write("\t\talert(\"\\请输入您的密码！\");\r\n");
      out.write("\t\tdocument.form1.password.focus();\r\n");
      out.write("\t}\r\n");
      out.write("\telse if(document.form1.checkcode.value.replace(/\\s+$|^\\s+/g,\"\").length<=0) {\r\n");
      out.write("\t\talert(\"\\请输入验证码！\");\r\n");
      out.write("\t\tdocument.form1.checkcode.focus();\r\n");
      out.write("\t} \r\n");
      out.write("\telse if (document.form1.checkcode.value != document.form1.yzm.value) {\r\n");
      out.write("\t\talert(\"\\验证码错误！\");\r\n");
      out.write("\t\tdocument.form1.checkcode.focus();\r\n");
      out.write("\t}\r\n");
      out.write("\telse{\r\n");
      out.write("\t     form1.submit();\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("</SCRIPT>\r\n");

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
	String yzm=code.getCheckCode();

      out.write("\r\n");
      out.write("<DIV id=body-width>\r\n");
      out.write("  <TABLE height=3 cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("    <TBODY>\r\n");
      out.write("      <TR>\r\n");
      out.write("        <TD></TD></TR></TBODY></TABLE>\r\n");
      out.write("  <TABLE cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("    <TBODY>\r\n");
      out.write("      <TR>\r\n");
      out.write("        <TD class=index-tableTxt vAlign=center>\r\n");
      out.write("          <TABLE cellSpacing=0 cellPadding=2 width=\"100%\" bgColor=#ffffff border=0><TBODY>\r\n");
      out.write("            <TR>\r\n");
      out.write("              <TD style=\"LINE-HEIGHT: 200%\" vAlign=center>\r\n");
      out.write("                <TABLE cellSpacing=1 cellPadding=5 width=\"100%\" border=0>\r\n");
      out.write("                  <TBODY>\r\n");
      out.write("                    <TR>\r\n");
      out.write("                      <TD align=middle bgColor=#ebebeb>\r\n");
      out.write("                        <TABLE cellSpacing=0 cellPadding=6 width=\"90%\" border=0>\r\n");
      out.write("                          <TBODY>\r\n");
      out.write("                            <TR>\r\n");
      out.write("                              <TD width=\"106%\" height=10></TD></TR>\r\n");
      out.write("                            <TR>\r\n");
      out.write("                              <TD style=\"LINE-HEIGHT: 180%\" align=left height=250><BR>\r\n");
      out.write("                                <TABLE class=b1 cellSpacing=1 cellPadding=0 width=900 align=center border=0>\r\n");
      out.write("                                  <TBODY>\r\n");
      out.write("                                    <TR>\r\n");
      out.write("                                      <TD align=middle bgColor=#fffff7>\r\n");
      out.write("                                        <TABLE cellSpacing=0 cellPadding=0 width=\"98%\" border=0>\r\n");
      out.write("                                          <TBODY>\r\n");
      out.write("                                            <TR>\r\n");
      out.write("                                              <TD vAlign=center align=middle height=20>&nbsp;</TD></TR>\r\n");
      out.write("                                            <TR>\r\n");
      out.write("                                              <TD class=menu_txt vAlign=top align=middle width=\"100%\" height=320>\r\n");
      out.write("                                                <TABLE cellSpacing=0 cellPadding=0 width=\"96%\" border=0>\r\n");
      out.write("                                                  <TBODY>\r\n");
      out.write("                                                    <TR>\r\n");
      out.write("                                                      <TD vAlign=top align=left width=\"52%\" height=280>\r\n");
      out.write("                                                        <TABLE borderColor=#e4e4e4 cellSpacing=5 cellPadding=5 width=\"96%\" bgColor=#f2f2f2 border=1>\r\n");
      out.write("                                                          <TBODY>\r\n");
      out.write("                                                            <TR>\r\n");
      out.write("                                                              <TD vAlign=top align=middle bgColor=#ffffff height=257>\r\n");
      out.write("                                                                <TABLE cellSpacing=0 cellPadding=0 width=\"98%\" border=0>\r\n");
      out.write("                                                                  <TBODY>\r\n");
      out.write("                                                                    <TR>\r\n");
      out.write("                                                                      <TD height=230>\r\n");
      out.write("                           <FORM id=form1 name=form1 action=");
      out.print(basePath );
      out.write("Login.shtml?method=PAGEUSERLOGIN method=post >\r\n");
      out.write("                                                                          <TABLE id=Table7 width=400 border=0>\r\n");
      out.write("                                                                            <TBODY>\r\n");
      out.write("                                                                              <TR height=40>\r\n");
      out.write("                                                                                <TD vAlign=center align=middle colSpan=3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<FONT face=宋体></FONT><BR><FONT color=#ff7700><STRONG>欢迎登陆");
      out.print(sysList.get(0).toString() );
      out.write("</STRONG></FONT>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</TD></TR>\r\n");
      out.write("                                                                              <TR>\r\n");
      out.write("                                                                                <TD colSpan=3>\r\n");
      out.write("                                                                                  <HR class=hui align=center width=\"98%\" SIZE=1>\r\n");
      out.write("                                                                                  </TD></TR>\r\n");
      out.write("                                                                              <TR height=60>\r\n");
      out.write("                                                                                <TD align=right width=84 height=110>\r\n");
      out.write("\t\t\t\t\t\t\t\t<IMG  height=52 src=\"");
      out.print(basePath );
      out.write("images/Key.gif\" width=49>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("                                  <TD noWrap align=middle width=171>\r\n");
      out.write("                                    <TABLE width=\"100%\" border=0>\r\n");
      out.write("                                      <TBODY>\r\n");
      out.write("                                    <TR>\r\n");
      out.write("                                  <TD width=\"35%\" height=24>用户名：</TD>\r\n");
      out.write("                                  <TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t  <INPUT class=input_new id=username style=\"WIDTH: 110px\" size=15 maxLength=10 name=username onbeforepaste=\"clipboardData.setData('text',clipboardData.getData('text').replace(/[^\\d]/g,''))\" \r\n");
      out.write("                              onkeyup=\"value=value.replace(/[\\W]/g,'')\"  value=");
      out.print(request.getAttribute("reg_user")==null?"":request.getAttribute("reg_user") );
      out.write(">\r\n");
      out.write("\t\t\t\t\t\t\t\t  </TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t  </TR>\r\n");
      out.write("                                  <TR>\r\n");
      out.write("                                  <TD height=25>密　码：<input type=hidden name=reg_type value=person></TD>\r\n");
      out.write("                                  <TD height=25>\r\n");
      out.write("\t\t\t\t\t\t\t\t  <INPUT class=input_new id=password style=\"WIDTH: 110px\" type=password size=15  maxLength=16 name=password onbeforepaste=\"clipboardData.setData('text',clipboardData.getData('text').replace(/[^\\d]/g,''))\" \r\n");
      out.write("                              onkeyup=\"value=value.replace(/[\\W]/g,'')\">\r\n");
      out.write("\t\t\t\t\t\t\t\t  </TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t  </TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t  \r\n");
      out.write("                                  <TR>\r\n");
      out.write("                                  <TD height=25>验证码：</TD>\r\n");
      out.write("                                  <TD height=25><input type=\"hidden\" name=\"yzm\" value=\"");
      out.print(yzm );
      out.write("\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t  <INPUT class=input_new id=checkcode size=5 maxlength=\"4\" name=checkcode onKeyUp=\"this.value=this.value.replace(/\\D/gi,'')\"> ");
      out.print(yzm );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t  </TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t  </TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t  </TBODY>\r\n");
      out.write("\t\t\t\t\t\t\t\t  </TABLE>\r\n");
      out.write("\t\t\t\t\t\t\t\t  </TD>\r\n");
      out.write("                                  <TD width=81>\r\n");
      out.write("\t\t\t\t\t\t\t\t  <LABEL>\r\n");
      out.write("\t\t\t\t\t\t\t\t  <img src=\"");
      out.print(basePath );
      out.write("images/button.gif\" border=\"0\" onClick=\"checklogin()\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t  </LABEL>\r\n");
      out.write("\t\t\t\t\t\t\t\t  </TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t  </TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t  <TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD vAlign=center height=20>\r\n");
      out.write("\t\t\t\t\t\t\t\t<DIV id=Login1_ValidationSummary2 style=\"DISPLAY: none; COLOR: red\" showmessagebox=\"True\" showsummary=\"False\"></DIV></TD>\r\n");
      out.write("                                  <TD class=red1 vAlign=center>\r\n");
      out.write("\t\t\t\t\t\t\t\t  <A class=dhx12 href=\"\"></A>\r\n");
      out.write("\t\t\t\t\t\t\t\t  </TD>\r\n");
      out.write("                                  <TD vAlign=center>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<A href=\"lost.jsp\">找回密码</A>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t  <TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD vAlign=center colSpan=3 height=22>\r\n");
      out.write("\t\t\t\t\t\t\t\t  <HR class=hui align=center width=\"98%\" SIZE=1>\r\n");
      out.write("\t\t\t\t\t\t\t\t  </TD></TR>\r\n");
      out.write("\t\t\t\t\t\t\t  <TR height=40>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD class=buttomtxt align=middle colSpan=3 height=21>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.print(sysList.get(0).toString() );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TBODY>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TABLE>\r\n");
      out.write("\t\t\t\t\t\t\t\t</FORM>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TD></TR></TBODY></TABLE></TD></TR></TBODY></TABLE></TD>\r\n");
      out.write("                                  <TD vAlign=top align=middle width=\"48%\">\r\n");
      out.write("                                    <TABLE borderColor=#e4e4e4 height=290 cellSpacing=5 cellPadding=5 width=\"98%\"  bgColor=#f2f2f2 border=1>\r\n");
      out.write("                                      <TBODY>\r\n");
      out.write("                                        <TR>\r\n");
      out.write("                                          <TD vAlign=top align=middle bgColor=#ffffff height=260>\r\n");
      out.write("                                            <TABLE height=19 cellSpacing=0 cellPadding=0 width=\"98%\" border=0>\r\n");
      out.write("                                              <TBODY>\r\n");
      out.write("                                                <TR>\r\n");
      out.write("                                                  <TD class=STYLE16 height=22><br><br><br><br><br>・注册会员</TD></TR></TBODY></TABLE>\r\n");
      out.write("                                  <TABLE cellSpacing=0 cellPadding=0 width=\"98%\" border=0>\r\n");
      out.write("                                    <TBODY>\r\n");
      out.write("                                      <TR>\r\n");
      out.write("                                        <TD class=menu_txt style=\"LINE-HEIGHT: 20px\"  colSpan=2 height=27>&nbsp;&nbsp;&nbsp; \r\n");
      out.write("                                          会员将有机会获得各种形式的全部免费的推荐机会！还有全部免费的广告服务机会！机不可失！</TD></TR>\r\n");
      out.write("                                      <TR>\r\n");
      out.write("                                        <TD class=menu_txt width=\"77%\" height=32>&nbsp;</TD>\r\n");
      out.write("                                  <TD class=menu_txt width=\"23%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t  <A href=\"");
      out.print(basePath );
      out.write("reg.jsp\">\r\n");
      out.write("\t\t\t\t\t\t\t\t  <IMG src=\"");
      out.print(basePath );
      out.write("images/zhuce.gif\" border=0>\r\n");
      out.write("\t\t\t\t\t\t\t\t  </A>\r\n");
      out.write("\t\t\t\t\t\t\t\t  </TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t  </TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t  </TBODY>\r\n");
      out.write("\t\t\t\t\t\t\t\t  </TABLE>\r\n");
      out.write("                                  <TABLE cellSpacing=0 cellPadding=0 width=\"98%\" border=0>\r\n");
      out.write("                                    <TBODY>\r\n");
      out.write("                                      <TR>\r\n");
      out.write("                                        <TD background=\"\" height=1></TD></TR></TBODY></TABLE>\r\n");
      out.write("                                  <TABLE cellSpacing=0 cellPadding=0 width=\"98%\" border=0>\r\n");
      out.write("                                    <TBODY>\r\n");
      out.write("                                      <TR>\r\n");
      out.write("                                        <TD class=menu_txt height=20>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<SPAN class=STYLE16></SPAN>　　</TD></TR>\r\n");
      out.write("                                      <TR>\r\n");
      out.write("                                        <TD class=menu_txt \r\n");
      out.write("                                style=\"LINE-HEIGHT: 20px\">&nbsp;&nbsp;&nbsp; \r\n");
      out.write("                                         </TD></TR></TBODY></TABLE></TD></TR></TBODY></TABLE></TD></TR></TBODY></TABLE></TD></TR></TBODY></TABLE></TD></TR></TBODY></TABLE></TD></TR></TBODY></TABLE></TD></TR></TBODY></TABLE></TD></TR></TBODY></TABLE></TD></TR></TBODY></TABLE>\r\n");
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
      out.write('\r');
      out.write('\n');
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
