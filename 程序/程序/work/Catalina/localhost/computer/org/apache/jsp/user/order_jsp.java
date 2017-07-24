package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.bwm.db.Condb;
import com.bwm.cart.buyList;
import java.util.Vector;

public final class order_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/user/../top.jsp");
  }

  public Object getDependants() {
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
      response.setContentType("text/html; charset=gb2312");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("<title>订单添加页</title>\r\n");
      out.write("</head>\r\n");
      out.write("<link href=\"../css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("<body> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<LINK href=\"");
      out.print(request.getContextPath() );
      out.write("/other/index.css\" type=text/css rel=stylesheet>\r\n");
      out.write("<LINK href=\"");
      out.print(request.getContextPath() );
      out.write("/other/styleNew.css\" type=text/css rel=stylesheet>\r\n");
      out.write("<center>\r\n");
      out.write("<DIV class=\"top cbody\">\r\n");
      out.write("\t<DIV class=toplogo>\r\n");
      out.write("\t\t<A href=\"");
      out.print(request.getContextPath() );
      out.write("\">\r\n");
      out.write("\t\t<IMG height=82 src=\"");
      out.print(request.getContextPath() );
      out.write("/other/toplogo.gif\" width=177></A>\r\n");
      out.write("\t</DIV>\r\n");
      out.write("\t<DIV class=topbanner>\r\n");
      out.write("\t</DIV>\r\n");
      out.write("\t<DIV class=toplink id=toplink>\r\n");
      out.write("\t\t<BR>\t\t\r\n");
      out.write("\t\t<A onclick=\"javascript:window.external.AddFavorite('/','社区网');\" href=\"#\">收藏本站</A> \r\n");
      out.write("\t\t\r\n");
      out.write("\t</DIV>\r\n");
      out.write("</DIV>\r\n");
      out.write("<DIV class=\"topmenu cbody\" id=topmenu>\r\n");
      out.write("<UL><LI>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</LI>\r\n");
      out.write("  <LI><A href=\"");
      out.print(request.getContextPath() );
      out.write("\">首页</A> </LI>\r\n");
      out.write("  <LI><A href=\"");
      out.print(request.getContextPath() );
      out.write("/sub/input.jsp\">订单查询</A></LI>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("  <LI><A href=\"");
      out.print(request.getContextPath() );
      out.write("/user/order.jsp\">购物车</A> </LI>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("  <LI><A href=\"");
      out.print(request.getContextPath() );
      out.write("/user/Uedit.jsp\">修改资料</A> </LI>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("</UL>\r\n");
      out.write("</DIV>\r\n");
      out.write("<DIV class=\"topsearch cbody\" id=topsearch>\r\n");
      out.write("\t<DIV class=title></DIV>\r\n");
      out.write("\t<DIV class=inpbox align=\"left\">\r\n");
      out.write("\t\t<form name=\"form3\" method=\"post\" action=\"forward.jsp\">   \r\n");
      out.write("\t\t\t商品搜索:\r\n");
      out.write("\t\t\t<select name=\"wtype\" class=\"wenbenkuang\">\r\n");
      out.write("              <option>联想</option>\r\n");
      out.write("              <option>惠普</option>\r\n");
      out.write("              <option>索尼</option>\r\n");
      out.write("              <option>IBM</option>\r\n");
      out.write("              <option>其它</option>\r\n");
      out.write("            </select>\r\n");
      out.write("             <input name=\"shop\" type=\"text\" class=\"txt_grey\">\r\n");
      out.write("\t          <input name=\"Submit\" type=\"submit\" class=\"btn_grey\" value=\"搜索\" onClick=\"return check()\">\r\n");
      out.write("\t          <input name=\"Submit2\" type=\"reset\" class=\"btn_grey\" value=\"重置\">\t\r\n");
      out.write("\t\t</FORM>\r\n");
      out.write("\t</DIV>\r\n");
      out.write("\r\n");
      out.write("</DIV>\r\n");
      out.write("</center>");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("<center>\r\n");
      out.write("\r\n");
      out.write("<DIV class=flink style=\"margin-left: 0px;\" align=\"left\">\r\n");
      out.write("<DIV class=title align=\"left\">\r\n");
      out.write("<DL>\r\n");
      out.write("  <DT>购物信息 </DT>\r\n");
      out.write("  <DD><!-- FriendLink --></DD>\r\n");
      out.write("</DL>\r\n");
      out.write("</DIV>\r\n");
      out.write("<DIV class=flinkcon align=\"left\"  style=\"margin-left:0px;padding-left: 0px\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table width=\"800\" height=\"488\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" > \r\n");
      out.write("  <form action=\"clear.jsp\" method=\"post\" name=\"form1\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"429\" valign=\"top\"> \r\n");
      out.write("      <table width=\"800\" height=\"178\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"00\"> \r\n");
      out.write("      <tr align=\"center\" valign=\"middle\"> \r\n");
      out.write("        <td height=\"27\" colspan=\"6\" nowrapclass=\"bgcolor\"><font color=\"#FF0000\">\r\n");
      out.write("          ");
if(session.getAttribute("username")==null){out.println("您还没有登录");}else{out.println(session.getAttribute("username"));}
      out.write("\r\n");
      out.write("          </font>,您的购物情况如下所示:(注:如果想删除商品，请将数量置零后点击修改按钮。)\t\t</td> \r\n");
      out.write("      </tr> \r\n");
      out.write("     \r\n");
      out.write("\t");

	Vector shop=(Vector)session.getAttribute("shop");
	int num=0;
	int pric=0;
	if(shop==null||shop.size()==0){
	
      out.write(" \r\n");
      out.write("\t<script language=\"javascript\">\r\n");
      out.write("\t\talert(\"购物车中没有物品\");\r\n");
      out.write("\t\twindow.location.href=(\"../index.jsp\");\r\n");
      out.write("\t</script> \r\n");
      out.write("\t");

	}else{
		for(int i=0;i<shop.size();i++){
			buyList mylist=(buyList)shop.elementAt(i);
			num=num+mylist.number*mylist.price;
	
      out.write(" \r\n");
      out.write("      <tr align=\"left\" valign=\"middle\" class=\"bgcolor\" style=\"border-bottom: 1px solid #cccccc\"> \r\n");
      out.write("        <td width=\"45\" height=\"21\"  style=\"border-bottom: 1px solid #cccccc\">&nbsp;</td> \r\n");
      out.write("        <td width=\"98\" height=\"21\"  style=\"border-bottom: 1px solid #cccccc\">");
      out.print(i+1);
      out.write("</td>\r\n");
      out.write("        <td width=\"204\" height=\"21\" style=\"border-bottom: 1px solid #cccccc\">");
      out.print(mylist.warename);
      out.write("</td> \r\n");
      out.write("        <td width=\"138\" height=\"21\" style=\"border-bottom: 1px solid #cccccc\">￥");
      out.print(mylist.price);
      out.write("</td> \r\n");
      out.write("        <td width=\"147\" height=\"21\" style=\"border-bottom: 1px solid #cccccc\">\r\n");
      out.write("          <input name=\"num");
      out.print(i);
      out.write("\" size=\"7\" type=\"text\" class=\"txt_grey\" value=\"");
      out.print(mylist.number);
      out.write("\"></td> \r\n");
      out.write("        <td width=\"168\" height=\"21\" style=\"border-bottom: 1px solid #cccccc\">￥");
      out.print((mylist.price*mylist.number));
      out.write("</td> \r\n");
      out.write("        <script language=\"javascript\">\r\n");
      out.write("\t\t\t<!--\r\n");
      out.write("\t\t\tfunction check(){\r\n");
      out.write("\t\t\t\tif(isNaN(form1.num");
      out.print(i);
      out.write(".value)){\r\n");
      out.write("\t\t\t\t\talert(\"请不要输入非法字符\");\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\thistory.back();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(form1.num");
      out.print(i);
      out.write(".value==\"\"){\r\n");
      out.write("\t\t\t\t\talert(\"请输入修改的数量\");\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\thistory.back();\r\n");
      out.write("\t\t\t\t}\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t-->\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t");

		}
	}
	
      out.write(" \r\n");
      out.write("      <tr align=\"center\" valign=\"middle\" class=\"bgcolor\">\r\n");
      out.write("\t\t<td height=\"21\" colspan=\"5\">\r\n");
      out.write("\t\t</hr>\t\t</td>\r\n");
      out.write("        <td height=\"21\" align=\"left\">总合计金额:￥");
      out.print(num);
      out.write("</td>\r\n");
      out.write("      </table></td> \r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"59\" align=\"center\" valign=\"top\" ><a href=\"../index.jsp\">\r\n");
      out.write("      </a><a href=\"../index.jsp\">\r\n");
      out.write("      <input name=\"Submit\" type=\"submit\" class=\"btn_grey\" value=\"修改\" onClick=\"return check()\">\r\n");
      out.write("继续购物</a>|<a href=\"putin.jsp\">清空购物车</a>|<a href=\"../sub/index.jsp\">去收银台</a></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </form>\r\n");
      out.write("</table> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</DIV></DIV></center>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
