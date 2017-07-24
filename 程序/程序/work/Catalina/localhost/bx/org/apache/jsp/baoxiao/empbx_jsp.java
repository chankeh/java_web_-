package org.apache.jsp.baoxiao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.*;
import java.sql.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public final class empbx_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

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
      response.setContentType("text/html; charset=gb2312");
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
      out.write('	');
      MyBean.dbcon dbc = null;
      synchronized (session) {
        dbc = (MyBean.dbcon) _jspx_page_context.getAttribute("dbc", PageContext.SESSION_SCOPE);
        if (dbc == null){
          dbc = new MyBean.dbcon();
          _jspx_page_context.setAttribute("dbc", dbc, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("<title>无标题文档</title>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("function  trim(str)//去掉字符串的首尾空格\r\n");
      out.write("{  var tmpStr=new String(str)\r\n");
      out.write("    return tmpStr.replace(/(^\\s*)|(\\s*$)/g, \"\");\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function check()\r\n");
      out.write("{\r\n");
      out.write("\tif(trim(form.bxname.value)==\"\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"报销内容不能为空!\");\r\n");
      out.write("\t\tform.bxname.value=\"\";\r\n");
      out.write("\t\tform.bxname.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(trim(form.rate.value)==\"\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"报销比例不能为空!\");\r\n");
      out.write("\t\tform.rate.value=\"\";\r\n");
      out.write("\t\tform.rate.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(trim(form.bxcount.value)==\"\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"数量不能为空!\");\r\n");
      out.write("\t\tform.bxcount.value=\"\";\r\n");
      out.write("\t\tform.bxcount.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(trim(form.price.value)==\"\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"单价不能为空!\");\r\n");
      out.write("\t\tform.price.value=\"\";\r\n");
      out.write("\t\tform.price.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(trim(form.invoiceno.value)==\"\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"发票号不能为空!\");\r\n");
      out.write("\t\tform.invoiceno.value=\"\";\r\n");
      out.write("\t\tform.invoiceno.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(trim(form.hospital.value)==\"\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"开票单位不能为空!\");\r\n");
      out.write("\t\tform.hospital.value=\"\";\r\n");
      out.write("\t\tform.hospital.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("body {\r\n");
      out.write("\tmargin-left: 0px;\r\n");
      out.write("\tmargin-top: 0px;\r\n");
      out.write("\tmargin-right: 0px;\r\n");
      out.write("\tmargin-bottom: 0px;\r\n");
      out.write("\tbackground-color: #CCFFFF;\r\n");
      out.write("}\r\n");
      out.write("a:link {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("a:visited {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("a:hover {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("a:active {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<link href=\"../Style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<p>\r\n");
      out.write("  ");

		request.setCharacterEncoding("gb2312");
		ResultSet rs=null;//记录集
		String sql="";
		SimpleDateFormat df=new SimpleDateFormat("yyyy/MM/dd");   
		String s=df.format(new Date());  
			
		String zgno;
		zgno=(String)session.getValue("yonghuid");
		String zgname;
		zgname=(String)session.getValue("yonghuname");
		
		String ypname="";
		String ypcname="";
		String rate="";
		String panduan="0";

      out.write("\r\n");
      out.write("</p>\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("<table width=\"790\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("<tr>\r\n");
      out.write("<td height=\"52\" align=\"center\" class=\"huanying1\">添加报销信息</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"790\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr class=\"zhengwen\">\r\n");
      out.write("    <td width=\"395\" height=\"34\">职工编号:");
      out.print(zgno);
      out.write("</td>\r\n");
      out.write("    <td width=\"395\">姓名:");
      out.print(zgname);
      out.write("</td>\r\n");
      out.write("    <td width=\"790\">&nbsp;</td>\r\n");
      out.write("    <td width=\"790\" align=\"right\">当前日期:");
      out.print(s);
      out.write("</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"790\" border=\"1\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#0066FF\" bgcolor=\"#0066FF\">\r\n");
      out.write("  ");

		sql="select * from t_bx_temp";
		rs=dbc.executeQuery(sql);
		while(rs.next()){
		panduan="1";
		String idno=rs.getString("userbxno");

      out.write("\r\n");
      out.write("  <tr align=\"center\" bordercolor=\"#FFFFFF\" bgcolor=\"#0066FF\" class=\"baise\">\r\n");
      out.write("    <td width=\"50\" height=\"30\">报销内容</td>\r\n");
      out.write("    <td width=\"130\">");
      out.print(rs.getString("bxname"));
      out.write("</td>\r\n");
      out.write("    <td width=\"50\">报销比例</td>\r\n");
      out.write("    <td width=\"60\">");
      out.print(rs.getString("rate"));
      out.write("%</td>\r\n");
      out.write("    <td width=\"26\">数量</td>\r\n");
      out.write("    <td width=\"30\">");
      out.print(rs.getString("bxcount"));
      out.write("</td>\r\n");
      out.write("    <td width=\"26\">单价</td>\r\n");
      out.write("    <td width=\"68\">");
      out.print(rs.getString("price"));
      out.write("</td>\r\n");
      out.write("    <td width=\"40\">发票号</td>\r\n");
      out.write("    <td width=\"100\">");
      out.print(rs.getString("invoiceno"));
      out.write("</td>\r\n");
      out.write("    <td width=\"54\">开票单位</td>\r\n");
      out.write("    <td width=\"130\">");
      out.print(rs.getString("hospital"));
      out.write("</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("\t<td width=\"50\" height=\"30\"></td>\r\n");
      out.write("    <td width=\"130\"></td>\r\n");
      out.write("    <td width=\"50\"></td>\r\n");
      out.write("    <td width=\"60\"></td>\r\n");
      out.write("    <td width=\"26\"></td>\r\n");
      out.write("    <td width=\"30\"></td>\r\n");
      out.write("    <td width=\"26\"></td>\r\n");
      out.write("    <td width=\"68\"><a href=\"templog.jsp?mark=3&idno=");
      out.print(idno);
      out.write("\" class=\"baise\"onclick=\"return confirm('确实要删除吗？');\"> 删除</a></td>\r\n");
      out.write("    <td width=\"40\"></td>\r\n");
      out.write("    <td width=\"100\"></td>\r\n");
      out.write("    <td width=\"54\"></td>\r\n");
      out.write("\t<td width=\"130\"></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t");
 } 
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<form name=form method=\"post\" action=\"../baoxiao/templog.jsp?mark=1&bxdate=");
      out.print(s);
      out.write("&yonghuid=");
      out.print(zgno);
      out.write("\" onsubmit=\"return check()\">\r\n");
      out.write("<table width=\"790\" border=\"1\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#0000FF\" bgcolor=\"#0066FF\">\r\n");
      out.write("  <tr align=\"center\" bordercolor=\"#FFFFFF\" bgcolor=\"#0066FF\" class=\"baise\">\r\n");
      out.write("    <td width=\"50\" height=\"30\">报销内容</td>\r\n");
      out.write("    <td width=\"130\"><select name=\"bxname\" size=\"1\" class=\"zhengwen\">\r\n");
      out.write("\t\t\t\t\t\t  ");

						  	sql="select * from t_yp";
							rs=dbc.executeQuery(sql);
						  	while(rs.next()){ 
							ypname=rs.getString("ypcname");
						   
      out.write("\r\n");
      out.write("\t\t\t\t\t\t     <option value=\"");
      out.print(ypname);
      out.write('"');
      out.write('>');
      out.print(ypname);
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t  ");
 } 
      out.write("\r\n");
      out.write("              \t\t      </select></td>\r\n");
      out.write("    <td width=\"50\">报销比例</td>\r\n");
      out.write("    <td width=\"60\"><input name=\"rate\" type=\"text\" class=\"zhengwen\" size=\"4\" maxlength=\"4\"> %</td>\r\n");
      out.write("    <td width=\"26\">数量</td>\r\n");
      out.write("    <td width=\"30\"><input name=\"bxcount\" type=\"text\" class=\"zhengwen\" size=\"3\"></td>\r\n");
      out.write("    <td width=\"26\">单价</td>\r\n");
      out.write("    <td width=\"68\"><input name=\"price\" type=\"text\" class=\"zhengwen\" size=\"10\"></td>\r\n");
      out.write("    <td width=\"40\">发票号</td>\r\n");
      out.write("    <td width=\"100\"><input name=\"invoiceno\" type=\"text\" class=\"zhengwen\" size=\"15\"></td>\r\n");
      out.write("    <td width=\"54\">开票单位</td>\r\n");
      out.write("    <td width=\"130\" height=\"30\" class=\"baise\"><input name=\"hospital\" type=\"text\" class=\"zhengwen\" id=ypid size=\"20\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"479\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"240\" height=\"30\" align=\"center\" valign=\"middle\" class=\"huanying1\"><input name=\"Submit\" type=\"submit\" class=\"zhengwen\" value=\"添加\"></td>\r\n");
      out.write("    <td width=\"239\" align=\"center\" valign=\"middle\" class=\"huanying1\"><input name=\"Submit2\" type=\"reset\" class=\"zhengwen\" value=\"重置\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("<form name=\"form1\" method=\"post\" action=\"../baoxiao/xxlog.jsp?mark=1\" onsubmit=\"return check1()\">\r\n");
      out.write("<table width=\"479\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("  ");

  		if(panduan=="1"){
  
      out.write("\r\n");
      out.write("     <td width=\"479\" align=\"center\" valign=\"middle\" class=\"huanying1\"onclick=\"return confirm('确实要报销吗？');\"><input type=\"submit\" name=\"Submit3\" value=\"开始报销\"></td>\r\n");
      out.write("  ");
 } 
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
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
