package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class editsj_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/conn.jsp");
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

      out.write(' ');
      out.write('\r');
      out.write('\n');
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("\r\n");

		Connection conn_tk= null; 
		Connection conn_jd= null; 
		Connection conn_tkt= null; 
		Connection conn_xzt= null; 
		Connection conn_js = null;
		try{
			Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver").newInstance();
			String tk = "tk";
			String jd = "tk_jd";
			String tkt = "tk_tkt";
			String xzt = "tk_xzt";
			String js = "tk_js";
			String url="jdbc:microsoft:sqlserver://127.0.0.1:1433;DatabaseName="; 
			//pubs为你的数据库的 
			String user="sa"; 
			String password=""; 
			conn_tk= DriverManager.getConnection(url + tk,user,password); 
			conn_jd= DriverManager.getConnection(url + jd,user,password); 
			conn_tkt= DriverManager.getConnection(url + tkt,user,password); 
			conn_xzt= DriverManager.getConnection(url + xzt,user,password); 
			conn_js= DriverManager.getConnection(url + js,user,password); 
			//Connection conn = //DriverManager.getConnection("jdbc:sqlserver:thin:@127.0.0.1:1433:scott","sa","");
		}
    	catch(Exception ex)
    	{
      		System.out.println("error:" + ex.getMessage());
    	}

request.setCharacterEncoding("GB2312");
String boardid;

      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<TITLE>题库管理系统</TITLE>\r\n");
      out.write("<META http-equiv=Content-Type content=\"text/html; charset=gb2312\">\r\n");
      out.write("<LINK href=\"images/style.css\" type=text/css rel=stylesheet>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<SCRIPT>\r\n");
      out.write("<!--\r\n");
      out.write("function Del(id){\r\n");
      out.write("\tif(confirm(\"是否删除此记录？\")){\r\n");
      out.write("\t\tdocument.editform.action = \"delsj.jsp?sjid=\"+id;\r\n");
      out.write("\t\tdocument.editform.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\telse return false;\r\n");
      out.write("}\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("<BODY bottomMargin=0 bgColor=#ffffff leftMargin=0 topMargin=0 rightMargin=0>\r\n");
      out.write("<FORM METHOD=POST ACTION=\"addsj.jsp\" name=\"editform\">\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellpadding=\"2\" cellspacing=\"2\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t  <td width=\"100%\" height=\"20\" class=\"a01\"><strong><font color=\"#FF0000\"><strong><font color=\"#FF0000\">::</font></strong>试卷编辑<strong><font color=\"#FF0000\">::</font></strong></font></strong></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t  <td height=\"44\" colspan=\"3\" valign=\"top\">\r\n");
      out.write("\t  <table width=\"100%\"  border=\"1\" cellpadding=\"1\" cellspacing=\"3\" bordercolor=\"#FFFFFF\">\r\n");
      out.write("\t  ");

		String sql = "select * from tk_sj ORDER BY sj_ctsj ASC";
		ResultSet rst = null;
		rst= conn_tk.createStatement().executeQuery(sql);
		while(rst.next()){
			
      out.write("\r\n");
      out.write("\t\t\t\t<tr align=\"center\" bordercolor=\"#dddddd\">\r\n");
      out.write("\t\t\t\t\t<td height=\"25\" align=\"left\"><font color=\"#666666\"><A target=\"_blank\" href=\"viewsj.jsp?sjid=");
      out.print(rst.getString("sj_id"));
      out.write('"');
      out.write('>');
      out.print(rst.getString("sj_name"));
      out.write("</A></font></td>\r\n");
      out.write("\t\t\t\t\t<td width=\"40\" height=\"25\">\r\n");
      out.write("\t\t\t\t\t\t<A target=\"_blank\" href=\"viewsjda.jsp?sjid=");
      out.print(rst.getString("sj_id"));
      out.write("\"><IMG height=14 \r\n");
      out.write("\t\t\t\t\t\t\talt=查看答案 src=\"images/edit.gif\" width=14 border=0></A>\r\n");
      out.write("\t\t\t\t\t\t<A  onclick=\"Del('");
      out.print(rst.getString("sj_id"));
      out.write("');return false;\" href=\"editsj.jsp/Del#\"> <IMG height=14 alt=删除 \r\n");
      out.write("\t\t\t\t\t\tsrc=\"images/trash.gif\" width=14 border=0></A>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t");

		}
	  
      out.write("\r\n");
      out.write("\t  </table>\r\n");
      out.write("\t  </td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</FORM>\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>");
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
