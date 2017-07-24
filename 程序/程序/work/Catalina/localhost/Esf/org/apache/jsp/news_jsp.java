package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.util.*;
import java.util.*;

public final class news_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<BODY text=#000000 bgColor=#ffffff leftMargin=0 topMargin=0>\r\n");
      out.write("<SCRIPT language=JavaScript>\r\n");
      out.write("<!--//目的是为了做风格方便\r\n");
      out.write("document.write('<div class=\"wrap\">');\r\n");
      out.write("//-->\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("     <TABLE class=dragTable cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("\t\t<TBODY>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD class=head colspan=\"2\">\r\n");
      out.write("\t\t\t<SPAN class=TAG>新闻资讯</SPAN> \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t  </TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t\t<TR>\r\n");
      out.write("\t\t<TD  class=middle align=\"left\" >\r\n");
      out.write("               <TABLE class=xsnr id=tb1_nr1  cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("                    <TBODY>\r\n");
      out.write("                    ");
if(!AllnewsList.isEmpty()){
					for(int alln1=0;alln1<AllnewsList.size();alln1++){
						List allnew=(List)AllnewsList.get(alln1);
			
      out.write("\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD  align=left>\r\n");
      out.write("\t\t  <A href=\"");
      out.print(basePath);
      out.write("newsinfo.jsp?id=");
      out.print(allnew.get(0).toString());
      out.write('"');
      out.write(' ');
      out.write('>');
      out.print(allnew.get(1).toString());
      out.write("</A>\r\n");
      out.write("\t\t   </TD>\r\n");
      out.write("\t\t  <TD align=right>\r\n");
      out.write("\t\t  ");
      out.print(allnew.get(2).toString());
      out.write("\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  </TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t\t");
}} 
      out.write("\r\n");
      out.write("\t\t\t\t</TBODY>\r\n");
      out.write("\t\t\t</TABLE>\t\t\t\r\n");
      out.write("\t\t\t</TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("        </TBODY>\r\n");
      out.write("\t  </TABLE>\r\n");
      out.write("\r\n");
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
