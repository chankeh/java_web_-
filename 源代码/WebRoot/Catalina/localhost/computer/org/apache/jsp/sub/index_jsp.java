package org.apache.jsp.sub;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.bwm.db.Condb;
import java.util.Date;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/sub/../top.jsp");
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("<title>填写订单</title>\r\n");
      out.write("</head>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("<!--\r\n");
      out.write("\tfunction check(){\r\n");
      out.write("\t\tif(form1.name.value==\"\"){\r\n");
      out.write("\t\t\talert(\"请输入你的真实姓名\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t\thistory.back();\r\n");
      out.write("\t\t\tform1.name.focus();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(form1.post.value==\"\"){\r\n");
      out.write("\t\t\talert(\"请输入你邮政编码\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t\thistory.back()\r\n");
      out.write("\t\t\tform1.post.focus();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("-->\r\n");
      out.write("</script>\r\n");
      out.write("<link href=\"../css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("<body>\r\n");
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
      out.write('\r');
      out.write('\n');

	Date date=new Date();
	Condb con=new Condb();
	int year=date.getYear()+1900;
	int month=date.getMonth()+1;
	int dat=date.getDate();
	int hour=date.getHours();
	int min=date.getMinutes();
	int second=date.getSeconds();
	long time=date.getTime()/600000000;
	String yea=String.valueOf(year);
	String mon=String.valueOf(month);
	String da=String.valueOf(dat);
	String hou=String.valueOf(hour);
	String mi=String.valueOf(min);
	String sec=String.valueOf(second);
	String tim=String.valueOf(time);
	String sub=yea+mon+da+hou+mi+sec+tim;
	if(session.getAttribute("username")==null||session.getAttribute("username").equals("")){

      out.write("\r\n");
      out.write("\t<script language=\"javascript\">\r\n");
      out.write("\talert(\"请您先登录再订购商品\");\r\n");
      out.write("\twindow.location.href=\"../index.jsp\";\r\n");
      out.write("\t</script>\r\n");

	}else{
		String sql="select * from tb_User where Username='"+session.getAttribute("username")+"'";
		ResultSet rs=con.executeQuery(sql);
		if(rs.next()){
			String str=rs.getString(2);
			String Rname=rs.getString(3);
			String email=rs.getString(5);
			String address=rs.getString(6);
			String teleph=rs.getString(7);

      out.write("\r\n");
      out.write("<center>\r\n");
      out.write("\r\n");
      out.write("<DIV class=flink style=\"margin-left: 0px;\" align=\"left\">\r\n");
      out.write("<DIV class=title align=\"left\">\r\n");
      out.write("<DL>\r\n");
      out.write("  <DT>订单 </DT>\r\n");
      out.write("  <DD><!-- FriendLink --></DD>\r\n");
      out.write("</DL>\r\n");
      out.write("</DIV>\r\n");
      out.write("<DIV class=flinkcon align=\"left\"  style=\"margin-left:0px;padding-left: 0px\">\r\n");
      out.write("<table width=\"800\" height=\"428\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("  <form action=\"manage.jsp\" method=\"post\" name=\"form1\">\r\n");
      out.write("  <tr align=\"center\">\r\n");
      out.write("    <td height=\"37\" colspan=\"3\" class=\"bgcolor\"><marquee direction=\"left\" scrollamount=\"1\">各位会员朋友，请您不要恶意或非法提交订单以免造成不必要的麻烦</marquee></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr align=\"center\">\r\n");
      out.write("    <td height=\"25\" colspan=\"3\"  class=\"head\">填写订单</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"274\" rowspan=\"10\" align=\"center\" valign=\"middle\"><img src=\"../images/images/looksub_2.gif\" width=\"251\" height=\"292\"></td>\r\n");
      out.write("    <td height=\"24\" class=\"bgcolor\">订单号</td>\r\n");
      out.write("    <td height=\"24\"><input name=\"subid\" type=\"text\" class=\"txt_grey\" size=\"40\" value=\"");
      out.print(sub);
      out.write("\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"112\" height=\"24\" class=\"bgcolor\">用户名</td>\r\n");
      out.write("    <td width=\"412\" height=\"24\"><input name=\"username\" type=\"text\" class=\"txt_grey\" size=\"40\" value=\"");
      out.print(str);
      out.write("\" readonly=\"yes\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"24\" class=\"bgcolor\">真实姓名</td>\r\n");
      out.write("    <td height=\"24\"><input name=\"name\" type=\"text\" class=\"txt_grey\" size=\"40\" value=\"");
      out.print(Rname);
      out.write("\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"24\" class=\"bgcolor\">Email</td>\r\n");
      out.write("    <td height=\"24\"><input name=\"email\" type=\"text\" class=\"txt_grey\" size=\"40\" value=\"");
      out.print(email);
      out.write("\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"24\" class=\"bgcolor\">用户地址</td>\r\n");
      out.write("    <td height=\"24\"><input name=\"address\" type=\"text\" class=\"txt_grey\" size=\"40\" value=\"");
      out.print(address);
      out.write("\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"24\" class=\"bgcolor\">邮编</td>\r\n");
      out.write("    <td height=\"24\"><input name=\"post\" type=\"text\" class=\"txt_grey\" size=\"40\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"24\" class=\"bgcolor\">付款方式</td>\r\n");
      out.write("    <td height=\"24\"><select name=\"pay\" class=\"wenbenkuang\">\r\n");
      out.write("      <option>银行付款</option>\r\n");
      out.write("      <option>邮政付款</option>\r\n");
      out.write("      <option>现金支付</option>\r\n");
      out.write("    </select></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"24\" class=\"bgcolor\">运送方式</td>\r\n");
      out.write("    <td height=\"24\"><select name=\"carry\" class=\"wenbenkuang\">\r\n");
      out.write("      <option>普通邮寄</option>\r\n");
      out.write("      <option>特快专递</option>\r\n");
      out.write("      <option>EMS专递方式</option>\r\n");
      out.write("    </select></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"24\" class=\"bgcolor\">联系电话</td>\r\n");
      out.write("    <td height=\"24\"><input name=\"teleph\" type=\"text\" class=\"txt_grey\" size=\"40\" value=\"");
      out.print(teleph);
      out.write("\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr align=\"center\">\r\n");
      out.write("    <td height=\"75\" align=\"left\" class=\"bgcolor\">备注</td>\r\n");
      out.write("    <td height=\"75\" align=\"left\"><textarea name=\"demo\" cols=\"39\" rows=\"5\" class=\"txt_grey\"></textarea></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr align=\"center\" valign=\"middle\">\r\n");
      out.write("    <td height=\"25\" colspan=\"3\" >\r\n");
      out.write("        <input name=\"Submit\" type=\"submit\" class=\"btn_grey\" value=\"提交\" onClick=\"return check()\">\r\n");
      out.write("      <input name=\"Submit2\" type=\"reset\" class=\"btn_grey\" value=\"重置\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr align=\"left\" valign=\"top\">\r\n");
      out.write("    <td height=\"48\" colspan=\"3\" background=\"../images/top1.gif\"><font color=\"#0000cc\" class=\"bgcolor\">注意:<br>\r\n");
      out.write("\t1.请您按正确方式认真填写，不要填写一些非法字符，认真核对你所填写的订单准确无误后按提交按钮.<br>\t\r\n");
      out.write("    2.请您牢记你的订单号码,以便查询订单的执行状态.<br>\r\n");
      out.write("\t3.当您的款项汇到我们的帐号请您尽快与我们取得联系.</font>\t</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </form>\r\n");
      out.write("</table>\r\n");


		}
	}
	

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
