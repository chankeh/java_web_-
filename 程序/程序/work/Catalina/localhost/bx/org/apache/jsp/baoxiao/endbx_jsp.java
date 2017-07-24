package org.apache.jsp.baoxiao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.*;
import java.sql.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public final class endbx_jsp extends org.apache.jasper.runtime.HttpJspBase
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
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");   
		String s=sdf.format(new Date());
		DecimalFormat df = new DecimalFormat("#.00");

      out.write("\r\n");
      out.write("</p>\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("<table width=\"790\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("<tr>\r\n");
      out.write("<td height=\"52\" align=\"center\" class=\"huanying1\">报销完成</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"790\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr class=\"zhengwen\">\r\n");
      out.write("    <td width=\"500\" height=\"34\">报销成功，以下是本次报销的详细信息</td>\r\n");
      out.write("    <td width=\"290\" align=\"right\">报销日期:");
      out.print(s);
      out.write("</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"200\" height=\"22\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"790\" border=\"1\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#0066FF\" bgcolor=\"#0066FF\">\r\n");

		float fbxmoney=0;
		float fuserbxmoney=0;
		float fschbxmoney=0;
		float fzmoney=0;
		float fxmoney=0;
		float fymoney=0;
		String bxmoney="";
		String userbxmoney="";
    	String schbxmoney="";
		String szmoney="";
		String sxmoney="";
		String symoney="";
		sql="select * from t_bx_temp";
		rs=dbc.executeQuery(sql);
		while(rs.next()){

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
      out.write("\t");

		bxmoney=rs.getString("bxmoney");
		userbxmoney=rs.getString("userbxmoney");
		schbxmoney=rs.getString("schbxmoney");
		fbxmoney=Float.valueOf(bxmoney).floatValue();
		fzmoney=fzmoney+fbxmoney;
		szmoney=df.format(fzmoney);
		fuserbxmoney=Float.valueOf(userbxmoney).floatValue();
		fxmoney=fxmoney+fuserbxmoney;
		sxmoney=df.format(fxmoney);
		fschbxmoney=Float.valueOf(schbxmoney).floatValue();
		fymoney=fymoney+fschbxmoney;
		symoney=df.format(fymoney);
	
      out.write("\r\n");
      out.write("    <td width=\"40\">发票号</td>\r\n");
      out.write("    <td width=\"100\">");
      out.print(rs.getString("invoiceno"));
      out.write("</td>\r\n");
      out.write("    <td width=\"54\">开票单位</td>\r\n");
      out.write("    <td width=\"130\">");
      out.print(rs.getString("hospital"));
      out.write("</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("\t");
 } 
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"200\" height=\"22\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"790\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"280\" height=\"30\">&nbsp;</td>\r\n");
      out.write("    <td width=\"161\" class=\"lanlianjie\">报销总额：");
      out.print(szmoney);
      out.write(" 元</td>\r\n");
      out.write("    <td width=\"165\" class=\"lanlianjie\">个人支付：");
      out.print(sxmoney);
      out.write(" 元</td>\r\n");
      out.write("    <td width=\"184\" class=\"lanlianjie\">学校支付：");
      out.print(symoney);
      out.write(" 元</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<p>&nbsp;</p>\r\n");
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
