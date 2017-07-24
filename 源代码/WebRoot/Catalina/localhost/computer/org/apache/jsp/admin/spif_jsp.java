package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.bwm.db.Condb;

public final class spif_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

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
      out.write("<title>订单处理</title>\r\n");
      out.write("</head>\r\n");
      out.write("<link href=\"../css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("<body>\r\n");
      out.write("<br>\r\n");
      out.write("<table width=\"783\" border=\"1\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#42CF39\" bordercolordark=\"#42CF39\" bordercolorlight=\"#FFCC00\">\r\n");
      out.write("  <form action=\"spif.jsp\">\r\n");
      out.write("    <tr align=\"center\" bgcolor=\"#42CF39\">\r\n");
      out.write("      <td height=\"38\" colspan=\"12\" class=\"head\">用户订单处理</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td width=\"105\" height=\"24\" align=\"center\" class=\"bgcolor\">订单号</td>\r\n");
      out.write("      <td width=\"109\" height=\"24\" align=\"center\" class=\"bgcolor\">用户名</td>\r\n");
      out.write("      <td width=\"90\" height=\"24\" align=\"center\" class=\"bgcolor\">真实姓名</td>\r\n");
      out.write("      <td width=\"95\" align=\"center\" class=\"bgcolor\">订购日期</td>\r\n");
      out.write("      <td width=\"119\" height=\"24\" align=\"center\" class=\"bgcolor\">付款方式</td>\r\n");
      out.write("      <td width=\"92\" height=\"24\" align=\"center\" class=\"bgcolor\">运送方式</td>\r\n");
      out.write("      <td width=\"74\" align=\"center\" class=\"bgcolor\">其它</td>\r\n");
      out.write("      <td width=\"81\" height=\"24\" align=\"center\" class=\"bgcolor\">是否删除</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    ");

  	Condb con=new Condb();
	int pagesize=4; 
  	int rowcount=0;
	int pagecount=0;
	String sql="select * from tb_Sub where Spif='"+0+"'";
	ResultSet rs=con.executeQuery(sql); 
	if(!rs.next()){

      out.write("\r\n");
      out.write("    <script language=\"javascript\">\r\n");
      out.write("\talert(\"没有未执行订单\");\r\n");
      out.write("\twindow.location.href=\"center.jsp\"\r\n");
      out.write("</script>\r\n");
      out.write("    ");

	}else{
	rs.last();
	rowcount=rs.getRow();
	int showpage=1;
  	pagecount=((rowcount%pagesize)==0?(rowcount/pagesize):(rowcount/pagesize)+1);
  	String topage=request.getParameter("topage");
	 if(topage!=null){
  	showpage=Integer.parseInt(topage);
	if(showpage>pagecount){
		showpage=pagecount;
	}else if(showpage<=0){
		showpage=1;
	}
  }
  rs.absolute((showpage-1)*pagesize+1);
  
      out.write("\r\n");
      out.write("    <font size=\"3\" color=\"#FF0000\">\r\n");
      out.write("    <center>\r\n");
      out.write("      目前在第");
      out.print(showpage);
      out.write("页，共有");
      out.print(pagecount);
      out.write("页\r\n");
      out.write("    </center>\r\n");
      out.write("    </font>\r\n");
      out.write("    ");

		 for(int i=1;i<=pagesize;i++){
  
      out.write("\r\n");
      out.write("    <tr align=\"center\">\r\n");
      out.write("      <td height=\"24\"><a href=\"shop.jsp?sub=");
String subid=rs.getString(1);out.println(subid);
      out.write('"');
      out.write('>');
      out.print(subid);
      out.write("</a></td>\r\n");
      out.write("      <td height=\"24\" class=\"bgcolor\">");
      out.print(rs.getString(2));
      out.write("</td>\r\n");
      out.write("      <td height=\"24\" class=\"bgcolor\">");
      out.print(rs.getString(3));
      out.write("</td>\r\n");
      out.write("      <td height=\"24\" class=\"bgcolor\">");
      out.print(rs.getDate(4));
      out.write("</td>\r\n");
      out.write("      <td height=\"24\" class=\"bgcolor\">");
      out.print(rs.getString(8));
      out.write("</td>\r\n");
      out.write("      <td height=\"24\" class=\"bgcolor\">");
      out.print(rs.getString(10));
      out.write("</td>\r\n");
      out.write("      <td class=\"bgcolor\">");
      out.print(rs.getString(12));
      out.write("</td>\r\n");
      out.write("      <td height=\"24\" class=\"bgcolor\"><a href=\"delsub.jsp?sub=");
      out.print(subid);
      out.write("\">删除</a></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("   \r\n");
      out.write("    ");

  	if(!rs.next())
		break;
  	} 

      out.write("\r\n");
      out.write(" <tr align=\"center\">\r\n");
      out.write("    <td height=\"24\" colspan=\"8\">\r\n");
      out.write("\t<a href=\"spif.jsp?topage=");
      out.print(1);
      out.write("\">第一页</a>\r\n");
      out.write("\t<a href=\"spif.jsp?topage=");
      out.print(showpage-1);
      out.write("\">上一页</a>\r\n");
      out.write("\t<a href=\"spif.jsp?topage=");
      out.print(showpage+1);
      out.write("\">下一页</a>\r\n");
      out.write("\t<a href=\"spif.jsp?topage=");
      out.print(pagecount);
      out.write("\">最后一页</a>\r\n");
      out.write("    <input name=\"topage\" type=\"text\" class=\"txt_grey\" size=\"5\" value=\"");
      out.print(showpage);
      out.write("\">\r\n");
      out.write("     页\r\n");

  }
	con.close();

      out.write("\r\n");
      out.write("\t</td>\r\n");
      out.write("    </tr>\r\n");
      out.write(" \t\r\n");
      out.write("  </form>\r\n");
      out.write("</table>\r\n");
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
