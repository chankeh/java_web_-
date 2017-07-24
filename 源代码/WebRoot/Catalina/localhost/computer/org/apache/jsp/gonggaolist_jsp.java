package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.bwm.db.Condb;

public final class gonggaolist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("<body>\r\n");
      out.write("<br>\r\n");
      out.write("<table width=\"783\" border=\"1\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#42CF39\" bordercolordark=\"#42CF39\" bordercolorlight=\"#FFCC00\">\r\n");
      out.write("  <form action=\"gonggaolist.jsp\">\r\n");
      out.write("    <tr align=\"center\" bgcolor=\"#42CF39\">\r\n");
      out.write("      <td height=\"38\" colspan=\"11\" class=\"head\">公告信息处理</td>       \r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("    <td width=\"105\" height=\"24\" align=\"center\" class=\"bgcolor\">序号</td>\r\n");
      out.write("      <td width=\"105\" height=\"24\" align=\"center\" class=\"bgcolor\" valign=\"middle\">公告标题</td>\r\n");
      out.write("      <td width=\"109\" height=\"24\" align=\"center\" class=\"bgcolor\"  valign=\"middle\">发布时间</td> \r\n");
      out.write("      \r\n");
      out.write("      <td width=\"81\" height=\"24\" align=\"center\" class=\"bgcolor\">是否删除</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    ");

  	Condb con=new Condb();
	int pagesize=10; 
  	int rowcount=0;
	int pagecount=0;
	String sql="select  id,title,CONVERT(varchar(100), Dattime, 20) Dattime from tb_Affiche order by Dattime desc";
	ResultSet rs=con.executeQuery(sql); 
	
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
      out.write("页&nbsp;<a href=\"affiche.htm\">添加公告</a>\r\n");
      out.write("    </center>\r\n");
      out.write("    </font>\r\n");
      out.write("    ");

		 for(int i=1;i<=pagesize;i++){
			 String id = rs.getString("id");
  
      out.write("\r\n");
      out.write("    <tr align=\"center\">      \r\n");
      out.write("    <td height=\"24\" class=\"bgcolor\">");
      out.print(id);
      out.write("</td>\r\n");
      out.write("      <td height=\"24\" class=\"bgcolor\">");
      out.print(rs.getString("title"));
      out.write("</td>\r\n");
      out.write("      <td height=\"24\" class=\"bgcolor\">");
      out.print(rs.getString("Dattime"));
      out.write("</td>  \r\n");
      out.write("      <td height=\"24\" class=\"bgcolor\"><a href=\"delgg.jsp?id=");
      out.print(id);
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
      out.write("\t<a href=\"gonggaolist.jsp?topage=");
      out.print(1);
      out.write("\">第一页</a>\r\n");
      out.write("\t<a href=\"gonggaolist.jsp?topage=");
      out.print(showpage-1);
      out.write("\">上一页</a>\r\n");
      out.write("\t<a href=\"gonggaolist.jsp?topage=");
      out.print(showpage+1);
      out.write("\">下一页</a>\r\n");
      out.write("\t<a href=\"gonggaolist.jsp?topage=");
      out.print(pagecount);
      out.write("\">最后一页</a>\r\n");
      out.write("    <input name=\"topage\" type=\"text\" class=\"txt_grey\" size=\"5\" value=\"");
      out.print(showpage);
      out.write("\">\r\n");
      out.write("     页\r\n");

  
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
