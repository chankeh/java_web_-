package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.*;
import java.sql.*;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>修改车次</title>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("function  trim(str)//去掉字符串的首尾空格\r\n");
      out.write("{  var tmpStr=new String(str)\r\n");
      out.write("    return tmpStr.replace(/(^\\s*)|(\\s*$)/g, \"\");\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function check()\r\n");
      out.write("{\r\n");
      out.write("\tif(trim(form.cz.value)==\"\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"车站不能为空!\");\r\n");
      out.write("\t\tform.cz.value=\"\";\r\n");
      out.write("\t\tform.cz.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
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
      out.write("\r\n");
      out.write("  ");

		request.setCharacterEncoding("gb2312");
		ResultSet rs=null;//记录集
		String sql="";
		String cz="";
		
		String id=request.getParameter("idno");
		
		sql="select * from cc where cci='"+id+"'";
		rs=dbc.executeQuery(sql);
		if(rs.next()){
		cz=rs.getString("czan");
		}

      out.write("\r\n");
      out.write("</p>\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("<table width=\"790\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"769\" height=\"22\" valign=\"middle\"> <a href=\"list.jsp\" class=\"lanlianjie\">&gt;&gt;返回</a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"790\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("<tr>\r\n");
      out.write("<td height=\"71\" align=\"center\" class=\"huanying1\">修改车次</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<form name=form method=\"post\" action=\"log.jsp?mark=2&idno=");
      out.print(id);
      out.write("\" onsubmit=\"return check()\">\r\n");
      out.write("<table width=\"500\" border=\"1\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#0000FF\" bgcolor=\"#0066FF\">\r\n");
      out.write("  <tr align=\"center\" bordercolor=\"#FFFFFF\" bgcolor=\"#0066FF\" class=\"baise\">\r\n");
      out.write("    <td width=\"70\" height=\"45\">车次</td>\r\n");
      out.write("    <td width=\"405\" height=\"45\" class=\"baise\">");
      out.print(id);
      out.write("路</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr align=\"center\" bordercolor=\"#FFFFFF\" bgcolor=\"#0066FF\" class=\"baise\">\r\n");
      out.write("    <td height=\"312\">车站</td>\r\n");
      out.write("    <td height=\"312\"><textarea name=\"cz\" cols=\"50\" rows=\"20\" class=\"zhengwen\">");
      out.print(cz);
      out.write("</textarea></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"472\" height=\"100\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"136\" height=\"30\" align=\"center\" class=\"huanying1\">      </td>\r\n");
      out.write("    <td width=\"100\" align=\"center\" class=\"huanying1\"><input name=\"Submit\" type=\"submit\" class=\"zhengwen\" value=\"提交\"></td>\r\n");
      out.write("    <td width=\"100\" align=\"center\" class=\"huanying1\"><input name=\"Submit2\" type=\"reset\" class=\"zhengwen\" value=\"重置\"></td>\r\n");
      out.write("    <td width=\"136\" align=\"center\" class=\"huanying1\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
