package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.bwm.db.Condb;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/top.jsp");
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("<title>首页</title>\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("<LINK href=\"");
      out.print(request.getContextPath() );
      out.write("/other/styleNew.css\" type=text/css rel=stylesheet>\r\n");
      out.write("<LINK href=\"");
      out.print(request.getContextPath() );
      out.write("/other/index.css\" type=text/css rel=stylesheet>\r\n");
      out.write("</head>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("<!--\r\n");
      out.write("\tfunction check(){\r\n");
      out.write("\t\tif(form3.shop.value==\"\"){\r\n");
      out.write("\t\t\talert(\"请输入搜索的商品名称\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t\tform2.shop.focus();\r\n");
      out.write("\t\t\thistory.back();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("-->\r\n");
      out.write("</script>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("<!--\r\n");
      out.write("\tfunction check1(){\r\n");
      out.write("\t\tif(form1.ware.value==\"\"){\r\n");
      out.write("\t\t\talert(\"请输入搜索的商品名称\");\r\n");
      out.write("\t\t\tform1.ware.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t\thistory.back();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("-->\r\n");
      out.write("</script>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("<!--\r\n");
      out.write("\tfunction checked1(){\r\n");
      out.write("\t\tif(form2.username.value==\"\"){\r\n");
      out.write("\t\t\talert(\"请输入你的的用户名\");\r\n");
      out.write("\t\t\tform2.username.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t\thistory.back();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(form2.password.value==\"\"){\r\n");
      out.write("\t\t\talert(\"请输入你的密码\");\r\n");
      out.write("\t\t\tform2.password.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t\thistory.back();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("-->\r\n");
      out.write("</script>\r\n");
      out.write("<script src=\"js/DateTime2.js\" language=\"javascript\">\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
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
      out.write(" \r\n");
      out.write("<center>\r\n");
      out.write("<DIV class=\"main cbody margintop\"  align=\"left\">\r\n");
      out.write("<DIV class=ileft  align=\"left\">\r\n");
      out.write("\r\n");
      out.write("<DIV class=\"newsbox margintop\"  align=\"left\">\r\n");
      out.write("<DIV class=newlist  align=\"left\">\r\n");
      out.write("\t<DIV class=new_menu \" align=\"left\">\r\n");
      out.write("\t\t<A href=\"");
      out.print(request.getContextPath());
      out.write("/viewgonggaolist.jsp\" target=\"_blank\">网站公告</A>\r\n");
      out.write("\t</DIV>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<DIV class=newscont align=\"left\" style=\"padding-left:0px\"  style=\"height:220px\">\r\n");
      out.write("\t\t<UL  style=\"margin-left: 0px\">\r\n");
      out.write("\t\t");

		 	Condb con2=new Condb();
		
		
		  	String ssss="select  id,title,Dattime from tb_Affiche order by Dattime Desc";
			ResultSet rrsss=con2.executeQuery(ssss);
			int numsss=0;
			String affichess="";
			while(rrsss.next()){
				numsss++;
				if(numsss==6){
					break;
				}
				String idss = rrsss.getString(1);
				affichess=rrsss.getString(2);
		
      out.write("\r\n");
      out.write("\t\t  <LI>\r\n");
      out.write("\t\t  \t<a href=\"viewgonggao.jsp?id=");
      out.print(idss );
      out.write("\" target=\"_blank\">");
      out.print(affichess );
      out.write(" </a>\r\n");
      out.write("\t\t  </LI>\r\n");
      out.write("\t\t");
}
      out.write("  \t \r\n");
      out.write("\t\t</UL>\r\n");
      out.write("\t\t<DIV align=\"right\" style=\"height:18px;padding-bottom: 0px;margin-bottom: 0px;vertical-align: bottom\">\r\n");
      out.write("\t\t<A href=\"");
      out.print(request.getContextPath());
      out.write("/viewgonggaolist.jsp\" target=\"_blank\">更多>></A>\r\n");
      out.write("\t\t</DIV>\r\n");
      out.write("\t</DIV>\r\n");
      out.write("\t\r\n");
      out.write("</DIV>\r\n");
      out.write("<DIV class=newlist>\r\n");
      out.write("\t<DIV class=new_menu  align=\"left\">\r\n");
      out.write("\t\t<A href=\"javascript:void(0)\">销售排行</A>\r\n");
      out.write("\t</DIV>\r\n");
      out.write("\t\r\n");
      out.write("\t<DIV class=newscont align=\"left\" style=\"padding-left:0px\" style=\"height:220px\">\r\n");
      out.write("\t\t<UL  style=\"margin-left: 0px\">\r\n");
      out.write("\t\t");

			String sqsss="select Warename,sum(Wsum)as num from tb_Shop group by all Warename order by num desc";
			ResultSet rstsss=con2.executeQuery(sqsss);
			int sumsss=0;
			while(rstsss.next()){
				String wn=rstsss.getString(1);
				sumsss++;
				if(sumsss==9){
					break;
				}
		
      out.write("\r\n");
      out.write("\t\t  <LI>\r\n");
      out.write("\t\t  \t<font color=\"#0000CC\"><a href=\"user/look.jsp?buy1=");
      out.print(wn);
      out.write('"');
      out.write('>');
      out.print(wn);
      out.write("</a>\r\n");
      out.write("          </font>\r\n");
      out.write("\t\t  </LI>\r\n");
      out.write("\t\t ");
} 
      out.write("\r\n");
      out.write("\t\t</UL>\r\n");
      out.write("\t</DIV>\r\n");
      out.write("</DIV>\r\n");
      out.write("<DIV class=flink style=\"margin-left: 0px;width:720px\">\r\n");
      out.write("<DIV class=title>\r\n");
      out.write("<DL>\r\n");
      out.write("  <DT>商品信息 </DT>\r\n");
      out.write("  <DD><!-- FriendLink --></DD>\r\n");
      out.write("</DL>\r\n");
      out.write("</DIV>\r\n");
      out.write("<DIV class=flinkcon align=\"left\"  style=\"margin-left:0px;padding-left: 0px\">\r\n");
      out.write("<table width=\"100%\" height=\"431\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\"\r\n");
      out.write(" bordercolor=\"#FCBE3F\" bordercolordark=\"#FCBE3F\" bordercolorlight=\"#FFFFFF\" align=\"left\"  style=\"margin-left:0px;\"> \r\n");
      out.write("  <tr> \r\n");
      out.write("    \r\n");
      out.write("    <td width=\"720\" valign=\"top\" align=\"left\" style=\"margin-left:0px;\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <table width=\"100%\"  border=\"0\" cellpadding=\"0\" cellspacing=\"0\" align=\"left\"> \r\n");
      out.write("        ");

       
		String sql2="select * from tb_Ware order by Dattime";
		ResultSet rs2=con2.executeQuery(sql2);
		int num2=0;
		int count2=0;
		int i2=1;
		while(rs2.next()){
		count2++;
		if(count2==9){
			break;
		}
		String warename=rs2.getString(2);
		String wareprice=rs2.getString(3);
		String wareintro=rs2.getString(5);
		String img=rs2.getString(6);
		if(i2%2!=0){
					
      out.write(" \r\n");
      out.write("        <tr> \r\n");
      out.write("          <td width=\"164\" height=\"141\" valign=\"top\"  style=\"\"><img src=\"");
      out.print(img);
      out.write("\" width=\"102\" height=\"140\" border=\"1\"></td> \r\n");
      out.write("          <td width=\"148\" align=\"center\" valign=\"top\" style=\"padding-left:10px\"> <table width=\"100%\" height=\"132\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" > \r\n");
      out.write("        <tr> \r\n");
      out.write("          <td width=\"49\" height=\"32\" align=\"left\">&nbsp;名称:</td> \r\n");
      out.write("          <td width=\"95\" align=\"left\">");
      out.print(warename);
      out.write("</td>\r\n");
      out.write("        </tr> \r\n");
      out.write("        <tr> \r\n");
      out.write("          <td height=\"32\">&nbsp;价格:</td>\r\n");
      out.write("          <td height=\"32\">");
      out.print(wareprice);
      out.write("</td>\r\n");
      out.write("        </tr> \r\n");
      out.write("\t\t <tr> \r\n");
      out.write("           <td height=\"32\"> &nbsp;介绍:\r\n");
      out.write("            </td>\r\n");
      out.write("\t\t   <td height=\"32\">");
      out.print(wareintro);
      out.write("</td>\r\n");
      out.write("\t\t </tr>\r\n");
      out.write("\t\t <tr> \r\n");
      out.write("          <td height=\"32\" colspan=\"2\"><center> \r\n");
      out.write("              <a href=\"user/look.jsp?buy1=");
      out.print(warename);
      out.write("\"><img src=\"images/buy.GIF\" width=\"45\" height=\"20\" class=\"btn_grey\"></a>\r\n");
      out.write("          </center></td> \r\n");
      out.write("        </tr>  \r\n");
      out.write("      </table>\r\n");
      out.write("\t \t</td>\r\n");
      out.write("          ");

		}else{
		
      out.write(" \r\n");
      out.write("    <td width=\"164\" align=\"center\" valign=\"top\" style=\"border-left:1px dashed #cccccc\"><img src=\"");
      out.print(img);
      out.write("\" width=\"102\" height=\"140\" border=\"1\"></td> \r\n");
      out.write("    <td width=\"149\" align=\"center\" valign=\"top\"><table width=\"105%\" height=\"132\" cellpadding=\"0\" cellspacing=\"0\" > \r\n");
      out.write("        <tr> \r\n");
      out.write("            <td width=\"47\" height=\"36\">&nbsp;名称:</td>\r\n");
      out.write("            <td width=\"91\">");
      out.print(warename);
      out.write("</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("    <tr> \r\n");
      out.write("            <td height=\"29\"> &nbsp;价格:</td>\r\n");
      out.write("            <td height=\"29\">");
      out.print(wareprice);
      out.write("</td>\r\n");
      out.write("         </tr> \r\n");
      out.write("\t\t <tr> \r\n");
      out.write("             <td height=\"28\">&nbsp;介绍:</td>\r\n");
      out.write("\t\t     <td height=\"28\">");
      out.print(wareintro);
      out.write("</td>\r\n");
      out.write("\t\t   </tr>\r\n");
      out.write("\t\t <tr> \r\n");
      out.write("            <td height=\"36\" colspan=\"2\" class=\"style2\"><center> \r\n");
      out.write("                <a href=\"user/look.jsp?buy1=");
      out.print(warename);
      out.write("\"><img src=\"images/buy.GIF\" width=\"45\" height=\"20\" class=\"btn_grey\"></a>\r\n");
      out.write("            </center></td> \r\n");
      out.write("         </tr>  \r\n");
      out.write("    </table></td> \r\n");
      out.write("  </tr>\r\n");
      out.write("   ");

		}
		i2++;
		}con2.close();

      out.write(" \r\n");
      out.write("\t<tr align=\"right\">\r\n");
      out.write("      <td colspan=\"4\"><a href=\"middle.jsp\">更多....</a></td>\r\n");
      out.write("   </tr> \r\n");
      out.write("</table>\r\n");
      out.write("</td> \r\n");
      out.write("<td width=\"174\" height=\"429\" valign=\"top\" background=\"images/images/top_12.gif\">\r\n");
      out.write("\t\r\n");
      out.write("</tr> \r\n");
      out.write("</table> \r\n");
      out.write("</DIV></DIV>\r\n");
      out.write("\r\n");
      out.write("<DIV class=ali718X60>\r\n");
      out.write("<TABLE width=700 border=0>\r\n");
      out.write("  <TBODY>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD width=460>\r\n");
      out.write("     \r\n");
      out.write("    </TD>\r\n");
      out.write("    <TD width=240>\r\n");
      out.write("     \r\n");
      out.write("</SCRIPT>\r\n");
      out.write("    </TD></TR></TBODY></TABLE></DIV></DIV></DIV>\r\n");
      out.write("<DIV class=iright>\r\n");
      out.write("<DIV class=rlist>\r\n");
      out.write("<DIV class=title>\r\n");
      out.write("<LI>用户登录 </LI>\r\n");
      out.write("<LI></LI></DIV>\r\n");
      out.write("<DIV class=\"rbox userlogin\">\r\n");
      out.write("\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#FFCC00\">\r\n");
      out.write("    ");

		//Condb con=new Condb();
    	//if(con==null)
    	//	con = new Condb();
		//String str=session.getAttribute(username);
		if(session.getAttribute("username")==null){
	
      out.write("\r\n");
      out.write("      <form action=\"user/ucon.jsp\" name=\"form2\" method=\"post\">\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td width=\"13\" align=\"center\" valign=\"middle\">&nbsp;</td>\r\n");
      out.write("          <td width=\"46\" height=\"24\" align=\"left\" valign=\"middle\">用户名:</td>\r\n");
      out.write("          <td width=\"118\"><input name=\"username\" type=\"text\" class=\"wenbenkuang\" size=\"16\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td align=\"center\">&nbsp;</td>\r\n");
      out.write("          <td height=\"24\" align=\"left\">密码:</td>\r\n");
      out.write("          <td><input name=\"password\" type=\"password\" class=\"wenbenkuang\" size=\"16\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr align=\"center\">\r\n");
      out.write("          <td height=\"24\" colspan=\"3\">\r\n");
      out.write("\t\t  <input name=\"login\" type=\"submit\" class=\"btn_grey\" value=\"登录\" onClick=\"return checked1()\">\r\n");
      out.write("          <input name=\"login\" type=\"submit\" class=\"btn_grey\" value=\"注册\">\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </form>\r\n");
      out.write("      <tr align=\"center\">\r\n");
      out.write("        <td height=\"32\" colspan=\"3\"><a href=\"user/pass.jsp\">从这里找回密码</a></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("\t  ");

		}else{
		
      out.write("\r\n");
      out.write("      <table width=\"100%\" height=\"auto\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("        <tr>\r\n");
      out.write("          \r\n");
      out.write("          <td width=\"100%\" height=\"24\" align=\"left\" valign=\"middle\">\r\n");
      out.write("          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;欢迎您，");
      out.print(session.getAttribute("username"));
      out.write("</td>\r\n");
      out.write("          \r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          \r\n");
      out.write("          <td width=\"100%\" height=\"24\" align=\"left\" valign=\"middle\">\r\n");
      out.write("          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"user/Uedit.jsp\">修改资料</a>\r\n");
      out.write("          &nbsp;<a href=\"user/logout.jsp\">退出登录</a>          \r\n");
      out.write("          </td>          \r\n");
      out.write("        </tr>\r\n");
      out.write("        \r\n");
      out.write("      </table>\r\n");
      out.write("\t  ");

		}
	
      out.write(" \r\n");
      out.write("</DIV></DIV>\r\n");
      out.write("\r\n");
      out.write("<DIV class=\"rlist margintop\">\r\n");
      out.write("\t<DIV class=title>\r\n");
      out.write("\t\t<LI>友情连接</LI>\r\n");
      out.write("\t</DIV>\r\n");
      out.write("\t<DIV class=rbox style=\"padding-left: 0px\" align=\"left\">\r\n");
      out.write("\t\t<UL style=\"margin-left: 0px\">\r\n");
      out.write("\t\t ");

		String strqq="select * from tb_link";
		int counqq=0;
		ResultSet rssqq=con2.executeQuery(strqq);
		while(rssqq.next()){
			counqq++;
			if(counqq==8){
				//break;
			}
			String linkname=rssqq.getString(1);
			String linkdress=rssqq.getString(2);
		
      out.write("       \r\n");
      out.write("\t\t  <LI>\r\n");
      out.write("\t\t \t<a href=\"");
      out.print(linkdress);
      out.write('"');
      out.write('>');
      out.print(linkname);
      out.write("</a>\r\n");
      out.write("\t\t  </LI>\r\n");
      out.write("\t\t");

		}
		
      out.write("\r\n");
      out.write("\t\t</UL>\r\n");
      out.write("\t</DIV>\r\n");
      out.write("</DIV>\r\n");
      out.write("<DIV class=floatclear></DIV></DIV>\r\n");
      out.write("</DIV></center>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(' ');
      out.write('\r');
      out.write('\n');
con2.close(); 
      out.write("\r\n");
      out.write("<center>\r\n");
      out.write("<DIV class=flink align=\"left\">\r\n");
      out.write("<DIV class=title align=\"left\">\r\n");
      out.write("<DL>\r\n");
      out.write("  <DT>&nbsp;其它 </DT>\r\n");
      out.write("  <DD><!-- FriendLink --></DD></DL></DIV>\r\n");
      out.write("  \r\n");
      out.write("<DIV class=flinkcon><br>\r\n");
      out.write("&nbsp;&nbsp;<a target=\"_self\" href=\"admin/login.htm\">管理员入口</a>\r\n");
      out.write("</DIV></DIV>\r\n");
      out.write("</center>\r\n");
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
