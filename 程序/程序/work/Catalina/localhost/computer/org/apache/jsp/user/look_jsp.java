package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.bwm.db.Condb;
import com.bwm.string.Str;

public final class look_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("<title>查看</title>\r\n");
      out.write("</head>\r\n");
      out.write("<link href=\"../css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("  ");

	Condb con=new Condb();
	Str chr=new Str();
	String temp=chr.toChinese(request.getParameter("buy1"));
	String sql="select * from tb_Ware where Warename='"+temp+"'";
	ResultSet rs=con.executeQuery(sql);
	if(rs.next()){
		String pn=rs.getString(2);
		int price=rs.getInt(3);
		String wtype=rs.getString(4);
		String intro=rs.getString(5);
		String img=rs.getString(6);

      out.write("\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("<table width=\"442\" height=\"272\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"54\" colspan=\"5\" align=\"center\" valign=\"middle\" class=\"head\" background=\"../images/images/lookware_1.gif\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr align=\"center\" valign=\"middle\">\r\n");
      out.write("    <td width=\"9\" rowspan=\"4\" background=\"../images/images/lookware_2.gif\" class=\"bgcolor\">&nbsp;</td>\r\n");
      out.write("    <td width=\"179\" rowspan=\"3\" class=\"bgcolor\"><img src=\"../");
      out.print(img);
      out.write("\" width=\"162\" height=\"132\" border=\"1\"></td>\r\n");
      out.write("    <td width=\"84\" height=\"45\" class=\"bgcolor\" >货物名称</td>\r\n");
      out.write("    <td width=\"156\" height=\"45\" align=\"left\">");
      out.print(pn);
      out.write("</td>\r\n");
      out.write("    <td width=\"14\" rowspan=\"4\" align=\"left\" background=\"../images/images/lookware_4.gif\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr align=\"center\" valign=\"middle\">\r\n");
      out.write("    <td height=\"45\" class=\"bgcolor\">货物价格</td>\r\n");
      out.write("    <td height=\"45\" align=\"left\">");
      out.print(price);
      out.write("</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr align=\"center\" valign=\"middle\">\r\n");
      out.write("    <td height=\"45\" class=\"bgcolor\">货物类型</td>\r\n");
      out.write("    <td height=\"45\" align=\"left\">");
      out.print(wtype);
      out.write("</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr align=\"center\" valign=\"middle\">\r\n");
      out.write("    <td height=\"29\" class=\"bgcolor\">&nbsp;</td>\r\n");
      out.write("    <td height=\"29\" class=\"bgcolor\">货物介绍</td>\r\n");
      out.write("    <td align=\"left\" valign=\"middle\" class=\"bgcolor\">");
      out.print(intro);
      out.write(" </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr align=\"center\" valign=\"middle\">\r\n");
      out.write("    <td height=\"54\" colspan=\"5\" background=\"../images/images/lookware_5.gif\"><a href=\"../index.jsp\">[关闭窗口]</a>&nbsp;&nbsp;<a href=\"add.jsp?pname=");
out.println(pn);
      out.write("\">[放入购物车]</a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");

}else{

      out.write("\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("\talert(\"没有此商品\");\r\n");
      out.write("\thistory.back();\r\n");
      out.write("</script>\r\n");

}
con.close();

      out.write("\r\n");
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
