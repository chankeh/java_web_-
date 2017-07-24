package org.apache.jsp.baoxiao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.*;
import java.sql.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public final class count_jsp extends org.apache.jasper.runtime.HttpJspBase
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
		DecimalFormat df = new DecimalFormat("#.00");
		
		//职工报销总额
		String zbxmoney="";
		String szmoney="";
		float fzbxmoney=0;
		float fzmoney=0;
		
		sql="select * from t_bx_employee";
		rs=dbc.executeQuery(sql);
		while(rs.next()){
		zbxmoney=rs.getString("bxmoney");
		fzbxmoney=Float.valueOf(zbxmoney).floatValue();
		fzmoney=fzmoney+fzbxmoney;
		szmoney=df.format(fzmoney);
		}
		
		//学生报销总额
		String xbxmoney="";
		String sxmoney="";
		float fxbxmoney=0;
		float fxmoney=0;
		
		sql="select * from t_bx_student";
		rs=dbc.executeQuery(sql);
		while(rs.next()){
		xbxmoney=rs.getString("bxmoney");
		fxbxmoney=Float.valueOf(xbxmoney).floatValue();
		fxmoney=fxmoney+fxbxmoney;
		sxmoney=df.format(fxmoney);
		}

      out.write("\r\n");
      out.write("</p>\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("<table width=\"790\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("<tr>\r\n");
      out.write("<td height=\"99\" align=\"center\" class=\"huanying1\">报销统计</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"530\" border=\"1\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#0000FF\" bgcolor=\"#0066FF\">\r\n");
      out.write("  <tr align=\"center\" bordercolor=\"#FFFFFF\" bgcolor=\"#0066FF\" class=\"baise\">\r\n");
      out.write("    <td width=\"130\" height=\"52\">职工报销总额</td>\r\n");
      out.write("    <td width=\"130\">");
      out.print(szmoney);
      out.write("元</td>\r\n");
      out.write("    <td width=\"130\">学生报销总额</td>\r\n");
      out.write("    <td width=\"130\">");
      out.print(sxmoney);
      out.write("元</td>  \r\n");
      out.write("  </tr>\r\n");
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
