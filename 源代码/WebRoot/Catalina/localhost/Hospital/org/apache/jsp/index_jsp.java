package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.util.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      com.bean.SiteBean siteb = null;
      synchronized (_jspx_page_context) {
        siteb = (com.bean.SiteBean) _jspx_page_context.getAttribute("siteb", PageContext.PAGE_SCOPE);
        if (siteb == null){
          siteb = new com.bean.SiteBean();
          _jspx_page_context.setAttribute("siteb", siteb, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      com.bean.FriendLinkBean fb = null;
      synchronized (_jspx_page_context) {
        fb = (com.bean.FriendLinkBean) _jspx_page_context.getAttribute("fb", PageContext.PAGE_SCOPE);
        if (fb == null){
          fb = new com.bean.FriendLinkBean();
          _jspx_page_context.setAttribute("fb", fb, PageContext.PAGE_SCOPE);
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
      com.bean.BedBean bb = null;
      synchronized (_jspx_page_context) {
        bb = (com.bean.BedBean) _jspx_page_context.getAttribute("bb", PageContext.PAGE_SCOPE);
        if (bb == null){
          bb = new com.bean.BedBean();
          _jspx_page_context.setAttribute("bb", bb, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
List sysList=sys.getSiteInfo();
List flinkList=fb.getAllShowFriendLink();
List menuList=siteb.getAllmenuIsUse();
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
      out.write("\t  <A href=\"mailto:");
      out.print(sysList.get(4).toString() );
      out.write("\">联系站长</A> \r\n");
      out.write("\t  </DIV>\r\n");
      out.write("\t</TD>\r\n");
      out.write("   </TR>\r\n");
      out.write("   </TBODY>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<TABLE id=header cellSpacing=0 cellPadding=0 width=\"100%\" align=center border=0>\r\n");
      out.write("<TBODY>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD>\r\n");
      out.write("      \r\n");
      out.write("      <DIV class=ad id=banner>\r\n");
      out.write("      <OBJECT codeBase=http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=7,0,19,0 \r\n");
      out.write("\t  height=160 width=950 classid=clsid:D27CDB6E-AE6D-11cf-96B8-444553540000>\r\n");
      out.write("\t  <PARAM NAME=\"movie\" VALUE=\"images/banner.swf\">\r\n");
      out.write("\t  <PARAM NAME=\"quality\" VALUE=\"high\">\r\n");
      out.write(" \t  <embed src=\"images/banner.swf\" quality=\"high\" pluginspage=\"http://www.macromedia.com/go/getflashplayer\" \r\n");
      out.write("      type=\"application/x-shockwave-flash\" width=\"700\" height=\"160\">\r\n");
      out.write("      </embed>      \r\n");
      out.write("      </OBJECT>\r\n");
      out.write("\t  </DIV>\r\n");
      out.write("\t</TD>\r\n");
      out.write("  </TR>\r\n");
      out.write(" </TBODY>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<TABLE id=guide cellSpacing=0 cellPadding=0 width=\"100%\" align=center border=0>\r\n");
      out.write("<TBODY>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD align=middle>\r\n");
      out.write("\t<!--****************主菜单开始****************-->\r\n");
      out.write("\t");

		if(!menuList.isEmpty()){
			for(int ab=0;ab<menuList.size();ab++){
				List abList = (List)menuList.get(ab);
	
      out.write("\r\n");
      out.write("\t<A href=\"");
      out.print(abList.get(1).toString() );
      out.write("\" target=\"\">");
      out.print(abList.get(0).toString() );
      out.write("</A> |\r\n");
      out.write("\t");

			}
		}
	
      out.write("\r\n");
      out.write("\t<!--****************主菜单结束****************-->\r\n");
      out.write("\t</TD>\r\n");
      out.write("  </TR>\r\n");
      out.write("</TBODY>\r\n");
      out.write("</TABLE>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd\">\r\n");
      out.write("<HTML xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<HEAD>\r\n");
      out.write("<LINK href=\"images/default.css\" type=text/css rel=stylesheet>\r\n");
      out.write("<LINK href=\"images/css.css\" type=text/css rel=stylesheet>\r\n");
      out.write("<META http-equiv=Content-Type content=\"text/html; charset=gb2312\">\r\n");
      out.write("<STYLE type=text/css>\r\n");
      out.write(".ycbt {\r\n");
      out.write("\tBORDER-RIGHT: #fff 1px solid; BORDER-TOP: #fff 1px solid; PADDING-LEFT: 1.8em; BACKGROUND-COLOR: #EAF2EF; BORDER-LEFT: #fff 1px solid; PADDING-TOP: 7px; BORDER-BOTTOM: #fff 1px solid; HEIGHT: 20px\r\n");
      out.write("}\r\n");
      out.write(".xsbt {\r\n");
      out.write("\tBORDER-RIGHT: #fff 1px solid; BORDER-TOP: #fff 1px solid; PADDING-LEFT: 1.8em; BACKGROUND-IMAGE: url(images/head1.gif); BORDER-LEFT: #fff 1px solid; PADDING-TOP: 7px; BORDER-BOTTOM: #fff 1px solid; HEIGHT: 20px\r\n");
      out.write("}\r\n");
      out.write(".xsnr {\r\n");
      out.write("\tDISPLAY: block\r\n");
      out.write("}\r\n");
      out.write(".ycnr {\r\n");
      out.write("\tDISPLAY: none\r\n");
      out.write("}\r\n");
      out.write("</STYLE>\r\n");
      out.write("<SCRIPT type=text/javascript>\r\n");
      out.write("function tb_xs(t,m,n){\r\n");
      out.write("for(var i=1;i<=m;i++){\r\n");
      out.write("if (i != n){\r\n");
      out.write("document.getElementById(\"tb\"+t+ \"_bt\" + i).className= \"ycbt\";\r\n");
      out.write("document.getElementById(\"tb\"+t+ \"_nr\" + i).className= \"ycnr\";}\r\n");
      out.write("else{\r\n");
      out.write("document.getElementById(\"tb\"+t+ \"_bt\" + i).className= \"xsbt\";\r\n");
      out.write("document.getElementById(\"tb\"+t+ \"_nr\" + i).className= \"xsnr\";}}}\r\n");
      out.write("</SCRIPT>\r\n");
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
      out.write("<META content=\"MSHTML 6.00.2900.3268\" name=GENERATOR>\r\n");
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
	System.out.println(System.currentTimeMillis());
	

      out.write("\r\n");
      out.write("<BODY text=#000000 bgColor=#ffffff leftMargin=0 topMargin=0>\r\n");
      out.write("<SCRIPT language=JavaScript>\r\n");
      out.write("<!--//目的是为了做风格方便\r\n");
      out.write("document.write('<div class=\"wrap\">');\r\n");
      out.write("//-->\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("<TABLE class=MainTable cellSpacing=0 cellPadding=0 width=\"100%\" align=center border=0>\r\n");
      out.write("  <TBODY>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD vAlign=top width=\"35%\" height=200>\r\n");
      out.write("<!--*******************************幻灯开始*******************************-->\r\n");
      out.write("<TABLE  class=dragTable cellSpacing=0 cellPadding=0 width=\"100%\" align=center border=0>\r\n");
      out.write(" <TBODY>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD class=head>\r\n");
      out.write("            <SPAN class=TAG>图片资讯</SPAN>\r\n");
      out.write("            </TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("        <TR>\r\n");
      out.write("\t\t<TD align=\"center\">\r\n");
      out.write("<SCRIPT type=text/javascript>\r\n");
      out.write("var imgUrl = new Array();\r\n");
      out.write("var imgtext = new Array();\r\n");
      out.write("var imgLink = new Array();\r\n");
      out.write("\r\n");
      out.write("imgUrl[0]='images/1.jpg';\r\n");
      out.write("imgLink[0]='http://www.163.com';\r\n");
      out.write("imgtext[0]='春节快乐';\r\n");
      out.write("\r\n");
      out.write("imgUrl[1]='images/2.jpg';\r\n");
      out.write("imgLink[1]='http://www.baidu.com';\r\n");
      out.write("imgtext[1]='浑河留守断桥';\r\n");
      out.write("\r\n");
      out.write("imgUrl[2]='images/3.jpg';\r\n");
      out.write("imgLink[2]='http://www.sina.com';\r\n");
      out.write("imgtext[2]='本院召开院风整治工作总结大会';\r\n");
      out.write("\r\n");
      out.write("imgUrl[3]='images/4.jpg';\r\n");
      out.write("imgLink[3]='http://www.yahoo.com.cn';\r\n");
      out.write("imgtext[3]='老城下的小狗';\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("var pics=imgUrl[0];\r\n");
      out.write("var links=imgLink[0];\r\n");
      out.write("var texts=imgtext[0];\r\n");
      out.write("for(var i=1;i<imgUrl.length;i++){\r\n");
      out.write("\tpics+='|'+imgUrl[i];\r\n");
      out.write("\tlinks+='|'+imgLink[i];\r\n");
      out.write("\ttexts+='|'+imgtext[i];\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("var focus_width=330\r\n");
      out.write("var focus_height=188\r\n");
      out.write("var text_height=22\r\n");
      out.write("var swf_height = focus_height+text_height\r\n");
      out.write("\r\n");
      out.write("document.write('<object classid=\"clsid:d27cdb6e-ae6d-11cf-96b8-444553540000\" codebase=\"http://fpdownload.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=6,0,0,0\" width=\"'+ focus_width +'\" height=\"'+ swf_height +'\">');\r\n");
      out.write("document.write('<param name=\"allowScriptAccess\" value=\"sameDomain\" /><param name=\"movie\" value=\"");
      out.print(basePath);
      out.write("images/rollpic.swf\" /><param name=\"quality\" value=\"high\" /><param name=\"bgcolor\" value=\"#F0F0F0\">');\r\n");
      out.write("document.write('<param name=\"menu\" value=\"false\"><param name=wmode value=\"opaque\">');\r\n");
      out.write("document.write('<param name=\"FlashVars\" value=\"pics='+pics+'&links='+links+'&texts='+texts+'&borderwidth='+focus_width+'&borderheight='+focus_height+'&textheight='+text_height+'\">');\r\n");
      out.write("document.write('<embed src=\"");
      out.print(basePath);
      out.write("images/rollpic.swf\" wmode=\"opaque\" FlashVars=\"pics='+pics+'&links='+links+'&texts='+texts+'&borderwidth='+focus_width+'&borderheight='+focus_height+'&textheight='+text_height+'\" menu=\"false\" bgcolor=\"#F0F0F0\" quality=\"high\" width=\"'+ focus_width +'\" height=\"'+ focus_height +'\" allowScriptAccess=\"sameDomain\" type=\"application/x-shockwave-flash\" pluginspage=\"http://www.macromedia.com/go/getflashplayer\" />');\r\n");
      out.write("document.write('</object>');\r\n");
      out.write("\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t</TBODY>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<!--*******************************幻灯结束*******************************-->\r\n");
      out.write("\t</TD>\r\n");
      out.write("     <TD class=Side vAlign=top align=left width=\"40%\" height=200>\r\n");
      out.write("<!--*******************************新闻资讯开始*******************************-->\r\n");
      out.write(" <TABLE  class=dragTable cellSpacing=0 cellPadding=0 width=\"100%\" align=center border=0>\r\n");
      out.write(" <TBODY>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD class=head id=tb1_bt1 onmouseover=tb_xs(1,2,1) width=\"100%\" height=\"30\">\r\n");
      out.write("            <SPAN class=TAG>新闻资讯</SPAN>\r\n");
      out.write("\t\t  </TD>\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t</TR>\r\n");
      out.write("        <TR>\r\n");
      out.write("\t\t<TD class=middle  align=\"left\" colspan=\"2\">\r\n");
      out.write("<!--*******************************新闻资讯**********************************-->\r\n");
      out.write("               <TABLE class=xsnr id=tb1_nr1  cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("                    <TBODY>\r\n");
      out.write("                    \r\n");
      out.write("                    ");
if(!newsList.isEmpty()){
					for(int news11=0;news11<newsList.size();news11++){
						List newsList2=(List)newsList.get(news11);
			
      out.write("\r\n");
      out.write("\t\t\t\t\t<TR>\r\n");
      out.write("                      <TD align=\"left\">\r\n");
      out.write("\t\t\t\t\t  <A href=");
      out.print(basePath );
      out.write("newsinfo.jsp?id=");
      out.print(newsList2.get(0).toString());
      out.write(" target=_blank>");
      out.print(newsList2.get(1).toString());
      out.write("</A> <BR>\r\n");
      out.write("\t\t\t\t\t  </TD>\r\n");
      out.write("\t\t\t\t\t  <TD align=\"right\">\r\n");
      out.write("\t\t\t\t\t  ");
      out.print(newsList2.get(2).toString());
      out.write("<BR>\r\n");
      out.write("\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t  </TD>\r\n");
      out.write("\t\t\t\t\t  </TR>\r\n");
      out.write("\t\t\t\t\t  ");
}} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</TBODY>\r\n");
      out.write("\t\t\t</TABLE>\t\t\t\r\n");
      out.write("\t\t\t</TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t\t</TBODY>\r\n");
      out.write("\t</TABLE>\r\n");
      out.write("<!--*******************************新闻资讯结束*******************************-->\r\n");
      out.write("\t</TD>\r\n");
      out.write("     <TD class=Side vAlign=top align=right width=\"25%\">\r\n");
      out.write("<!--*******************************滚动公告开始*******************************-->\r\n");
      out.write("      <TABLE width=\"100%\" height=\"240\" border=0 cellPadding=0 cellSpacing=0 class=dragTable>\r\n");
      out.write("\t  <TBODY>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD class=head>\r\n");
      out.write("            <SPAN class=TAG>\r\n");
      out.write("            <P>站内公告</P>\r\n");
      out.write("            </SPAN>\r\n");
      out.write("\t\t  </TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD class=middle align=left>\r\n");
      out.write("        <MARQUEE onmouseover=if(document.all!=null){this.stop()} onmouseout=if(document.all!=null){this.start()} scrollAmount=1 scrollDelay=1 direction=up height=180>\r\n");
      out.write("            <TABLE cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("              <TBODY>\r\n");
      out.write("              ");
if(!affList.isEmpty()){
					for(int aff=0;aff<affList.size();aff++){
						List affList2=(List)affList.get(aff);
			
      out.write("\r\n");
      out.write("\t\t\t<TR>\r\n");
      out.write("                <TD width=\"100%\">\r\n");
      out.write("\t\t\t\t");
      out.print(affList2.get(1).toString() );
      out.write('-');
      out.write('-');
      out.write('-');
      out.print(affList2.get(2).toString() );
      out.write("<BR>\r\n");
      out.write("\t\t\t\t</TD>\r\n");
      out.write("\t\t\t  </TR>\r\n");
      out.write("\t\t\t");

					}
				}
			  
      out.write("\r\n");
      out.write("     \r\n");
      out.write("\t\t\t  </TBODY>\r\n");
      out.write("\t\t\t </TABLE>\r\n");
      out.write("\t\t\t </MARQUEE>\r\n");
      out.write("\t\t  </TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t</TBODY>\r\n");
      out.write("<!--*******************************滚动公告结束*******************************-->\r\n");
      out.write("\t</TABLE>\r\n");
      out.write("</TD>\r\n");
      out.write("   </TR>\r\n");
      out.write("  </TBODY>\r\n");
      out.write("</TABLE>\r\n");
      out.write("\r\n");
      out.write("<!--*******************************2个信息分类开始*******************************-->\r\n");
      out.write("      <TABLE class=dragTable cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("\t\t<TBODY>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD class=head >\r\n");
      out.write("\t\t\t<SPAN class=TAG>医院简介</SPAN> \r\n");
      out.write("\t\t\t<SPAN class=more style=\"FLOAT: right\"></SPAN> \r\n");
      out.write("\t\t  </TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t\t<TR>\r\n");
      out.write("\t\t<TD  class=middle align=\"left\" >\r\n");
      out.write("               <TABLE class=xsnr id=tb1_nr1  cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("                    <TBODY>\r\n");
      out.write("                    \r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD  align=left>\r\n");
      out.write("\t\t  <p>&nbsp;&nbsp;&nbsp;&nbsp;北京医院的前身是德国医院，始建于1905年。现为卫生部直属的三级甲等医院，是中央的干部保健基地。北京医院是一所以高干医疗保健为中心、老年医学研究为重点 、向社会全面开放的融医疗、教学、科研、预防为一体的现代化大型综合性医院。\r\n");
      out.write("　　<p>&nbsp;&nbsp;&nbsp;&nbsp;北京医院位于北京市中心，毗邻长安街、崇文门、台基厂、东交民巷。占地面53000多平方米，建筑面积220000多平方米，现有床位1100张，职工2300多人。具有正副主任医师、正副教授、研究员及相应职称的高级技术人员近399人；博士后、博士、硕士287人。设有专业科室36个、重点科室6个。长期承担着中央领导干部的医疗保健任务及14000名司局级以上干部医疗保健任务和八十余万参保人员的医疗保险工作。并接待大量京外各地转诊的疑难危重病人。有承担多次国家大型活动、重要会议的医疗保健工作的经验和能力，曾出色地完成了近20次外国元首的医疗保健任务。\r\n");
      out.write("　　<p>&nbsp;&nbsp;&nbsp;&nbsp;医院有价值10亿多人民币的医疗设备和精密仪器，10万以上的医疗设备1175台，100万以上医疗设备146 台，MRI(3.0T/1.5T)、64排多螺旋CT 、PET/CT、双探头符合线路SPECT、双C臂血管造影机、具有呼吸门控装置的电子直线加速器、立体模拟定位系统、X-刀、超声聚焦刀、快速细菌分析仪、亚洲首台全自动血库系统、流式细胞仪以及先进的监护系统等。\r\n");
      out.write("　　<p>&nbsp;&nbsp;&nbsp;&nbsp;北京医院在老年病的医疗、护理、康复、保健方面成绩显著并已形成了自己的特色。心脏内科、呼吸内科、神经内科、心胸外科、神经外科、骨科为我院重点科室。在以老年病为重点的相关疾病的诊治如糖尿病、帕金森氏病、老年痴呆、前列腺肥大、骨关节病、肺部感染、重症肌无力等方面处于国内领先水平。近年来，成功地进行70岁以上高龄手术4600余例，其中最高手术年龄为102岁；冠心病介入治疗最高年龄为91岁；非体外循环下冠状动脉搭桥手术占搭桥手术病人的98%；并将成熟的诊断和治疗技术用于高干医疗保健，在高龄患者的疾病诊断和治疗方面积累了丰富的经验。\r\n");
      out.write("　　<p>&nbsp;&nbsp;&nbsp;&nbsp;医院拥有一批老一辈著名学术专家和保健专家：普外科专家吴蔚然教授（名誉院长）、心血管病专家钱贻简教授（名誉院长）、中医名家李辅仁教授、神经内科专家王新德教授、许贤豪教授、蒋景文教授、口腔医学专家韩宗琦教授、栾文民教授、骨科专家黄公怡教授、放射学专家李果珍教授、核医学专家屈婉莹教授等。还拥有一批中青年学术带头人和技术骨干，在医院的学科建设中发挥着重要作用。\r\n");
      out.write("　　<p>&nbsp;&nbsp;&nbsp;&nbsp;为了更好地发挥北京医院专家优势和专科特色，医院先后成立了特需医疗部，成立了多个研究治疗中心，有高血压心血管病诊疗中心、帕金森病椎体外系诊疗中心、神经免疫疾病和肌病诊疗中心、脑认知研究中心、关节外科诊疗中心、瑞东糖尿病中西医结合研治中心、乳腺疾病诊疗中心、肿瘤治疗中心、疑难病诊疗和会诊中心、疼痛治疗中心等。中心由著名专家出诊，为患者进行诊断并提供周全的治疗方案。北京医院与意大利政府合作建设的急救部，具有先进的医疗设备和设置，建立了急诊“绿色通道”。\r\n");
      out.write("　　<p>&nbsp;&nbsp;&nbsp;&nbsp;医院积极开展国际交流与合作，与20多个国家、地区和国际组织的约70个单位保持着友好交往关系，每年有250余人次的专业技术和管理人员赴海外留学、进修、参加学术会议、开展合作研究、进行访问考察。医院每年接待海外来访人员约200人次。医院设立了出国培养人才专项基金，取得科研成果161项，主持或参与国家级科研课题39项，发表论文2009篇； 获得国家级科研成果3项，省部级科研成果50余项；主持或参与国家科技攻关课题、“973”、“863”、国家自然科学基金等国家级科研课题100余项，省部级科研课题160余项；发表论文5900余篇。医院常年担任近千名研究生、本科生、大专生和进修生的临床教学任务。北京医院主办医学专业期刊5种,其中《中华老年医学杂志》、《中国神经免疫学和神经病学杂志》为国家统计源期刊。\r\n");
      out.write("　　<p>&nbsp;&nbsp;&nbsp;&nbsp;北京医院具有高效的行政管理机构和完善的后勤保障系统。有容量为600多个车位的地下车库和国内最先进的洗衣中心以及水、电、气供应系统，并设有消防中心和安全监控系统。近几年逐步进行了门诊、急诊、病房的改造，病人就医环境得到了明显改善。\r\n");
      out.write("　　<p>&nbsp;&nbsp;&nbsp;&nbsp;1950年2月，毛泽东主席亲笔写下“北京医院”四个大字，周恩来总理生前来北京医院近200次，并嘱咐：“一定要办好北京医院”。1992年当医院新南楼正式启用时，党和国家领导人欣然为医院题词，江总书记的题词是“优质服务，精益求精”，李鹏总理的题词是：“前进中的北京医院”。老一辈无产阶级革命家和中央领导同志的亲切关怀给北京医院全体员工以巨大的鼓舞和鞭策。我们将继续努力，以病人为中心，建设好中央保健基地，全面实现医院的总体规划，为实现“五个一流”：一流管理、一流人才、一流技术、一流设备、一流服务的目标而努力奋斗。\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  </TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t</TBODY>\r\n");
      out.write("\t\t\t</TABLE>\t\t\t\r\n");
      out.write("\t\t\t</TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("        </TBODY>\r\n");
      out.write("\t  </TABLE>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--*******************************最新开始*******************************-->\r\n");
      out.write("<TABLE class=MainTable style=\"MARGIN-TOP: 0px\" cellSpacing=0 cellPadding=0 width=\"100%\" align=center border=0>\r\n");
      out.write("  <TBODY>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD class=Main vAlign=top height=100>\r\n");
      out.write("      <TABLE class=dragTable cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("\t  <TBODY>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD class=head>\r\n");
      out.write("            <SPAN class=TAG>主治医师</SPAN> \r\n");
      out.write("            \r\n");
      out.write("\t\t  </TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD class=middle>\r\n");
      out.write("          <MARQUEE onmouseover=if(document.all!=null){this.stop()} onmouseout=if(document.all!=null){this.start()} scrollAmount=1 scrollDelay=1 direction=left height=100>\r\n");
      out.write("            \r\n");
      out.write("            <TABLE cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("              <TBODY>\r\n");
      out.write("              <TR>\r\n");
      out.write("              ");

              	List resList=bb.getAllDoctor();
              	if(!resList.isEmpty()){
              		for(int res=0;res<resList.size();res++)
              		{
              			List resList2=(List)resList.get(res);
              
      out.write("\r\n");
      out.write("               <TD width=\"14%\">\r\n");
      out.write("                  <DIV class=listpic>\r\n");
      out.write("                  <P class=img>\r\n");
      out.write("\t\t\t\t  <a href=\"");
      out.print(basePath);
      out.write("dinfo.jsp?id=");
      out.print(resList2.get(0).toString());
      out.write("\"><IMG height=90 src=\"");
      out.print(basePath+resList2.get(1).toString());
      out.write("\" width=120 onload=makesmallpic(this,120,90); border=0></a>\r\n");
      out.write("\t\t\t\t  </P>\r\n");
      out.write("                  <P class=title style=\"TEXT-ALIGN: center\">\r\n");
      out.write("\t\t\t\t  <a href=\"");
      out.print(basePath);
      out.write("dinfo.jsp?id=");
      out.print(resList2.get(0).toString());
      out.write('"');
      out.write('>');
      out.print(resList2.get(2).toString());
      out.write("</a>\r\n");
      out.write("\t\t\t\t  </P>\r\n");
      out.write("\t\t\t\t  </DIV>\r\n");
      out.write("\t\t\t\t</TD>\r\n");
      out.write("              ");

              		}
              	}
               
      out.write("\r\n");
      out.write("              \r\n");
      out.write("\t\t\t</TR>\r\n");
      out.write("\t\t</TBODY>\r\n");
      out.write("\t</TABLE>\r\n");
      out.write("\t</MARQUEE>\r\n");
      out.write("\t</TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("   </TBODY>\r\n");
      out.write("   </TABLE>\r\n");
      out.write("   </TD>\r\n");
      out.write("  </TR>\r\n");
      out.write("  </TBODY>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<!--*******************************最新人才结束*******************************-->\r\n");
      out.write("<!--*******************************信息栏目下通栏广告开始AF01*******************************-->\r\n");
      out.write("<TABLE class=dragTable cellSpacing=0 cellPadding=0 width=\"100%\" align=center border=0>\r\n");
      out.write("  <TBODY>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD>\r\n");
      out.write("      <img src=\"images/ad2.jpg\" width=\"948\" height=\"90\" border=\"0\">\r\n");
      out.write("\t</TD>\r\n");
      out.write("   </TR>\r\n");
      out.write("  </TBODY>\r\n");
      out.write("</TABLE>\r\n");
      out.write("\r\n");
      out.write("<SCRIPT language=JavaScript>\r\n");
      out.write("<!--//目的是为了做风格方便\r\n");
      out.write("document.write('</div>');\r\n");
      out.write("//-->\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("<SCRIPT language=JavaScript>\r\n");
      out.write("<!--\r\n");
      out.write("clickEdit.init();\r\n");
      out.write("//-->\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<TABLE class=MainTable style=\"MARGIN-TOP: 0px\" cellSpacing=0 cellPadding=0 width=\"100%\" align=center border=0>\r\n");
      out.write("  <TBODY>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD class=Main vAlign=top height=40>\r\n");
      out.write("      <TABLE class=dragTable id=friendlink cellSpacing=0 cellPadding=0 width=\"100%\" align=center border=0>\r\n");
      out.write("        <TBODY>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD class=head>\r\n");
      out.write("            <H3 class=L></H3><SPAN class=TAGLINK>友情链接</SPAN> \r\n");
      out.write("            <H3 class=R></H3></TD></TR>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD class=middle>\r\n");
      out.write("            <DIV class=imgfriendlink>\r\n");
if(!flinkList.isEmpty()){for(int flink=0;flink<flinkList.size();flink++){List flikn2=(List)flinkList.get(flink);
      out.write("\r\n");
      out.write(" <A href=\"");
      out.print(flikn2.get(1).toString() );
      out.write("\" target=\"_blank\">\r\n");
      out.write(" <IMG height=31 alt=\"名称:");
      out.print(flikn2.get(0).toString() );
      out.write("&#13;&#10;描述:");
      out.print(flikn2.get(3).toString() );
      out.write("\" src=\"");
      out.print(flikn2.get(2).toString() );
      out.write("\" width=88 border=0>\r\n");
      out.write(" </A> \r\n");
}} 
      out.write("\r\n");
      out.write("            </DIV>\r\n");
      out.write("            <DIV class=wordfriendlink></DIV>\r\n");
      out.write("\t\t  </TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD class=foot>\r\n");
      out.write("            <H3 class=L></H3>\r\n");
      out.write("            <H3 class=R></H3>\r\n");
      out.write("\t\t  </TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t\t</TBODY>\r\n");
      out.write("\t</TABLE>\r\n");
      out.write("  </TD>\r\n");
      out.write(" </TR>\r\n");
      out.write(" </TBODY>\r\n");
      out.write("</TABLE>\r\n");
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
