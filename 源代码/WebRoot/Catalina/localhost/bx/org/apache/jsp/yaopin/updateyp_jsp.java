package org.apache.jsp.yaopin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.*;
import java.sql.*;

public final class updateyp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
		Connection conn = null;
		Statement stmt = null;//状态集
		ResultSet rs=null;//记录集
		String sql="";
		String id="";
		String coursename="";
		
		String ypno=request.getParameter("ypno");
		
		sql="select * from t_yp where ypid='"+ypno+"'";
		rs=dbc.executeQuery(sql);
		if(rs.next()){

      out.write("\r\n");
      out.write("</p>\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("<table width=\"790\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("<tr>\r\n");
      out.write("<td height=\"52\" align=\"center\" class=\"huanying1\">修改药品信息</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<form name=\"form1\" method=\"post\" action=\"../bxlog.jsp?mark=3&ypno=");
      out.print(ypno);
      out.write("\">\r\n");
      out.write("<table width=\"346\" border=\"1\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#0000FF\" bgcolor=\"#0066FF\">\r\n");
      out.write("  <tr align=\"center\" bordercolor=\"#FFFFFF\" bgcolor=\"#0066FF\" class=\"baise\">\r\n");
      out.write("    <td width=\"94\" height=\"30\">编号</td>\r\n");
      out.write("    <td width=\"246\" height=\"30\" class=\"baise\">");
      out.print(rs.getString("ypid"));
      out.write("</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr align=\"center\" bordercolor=\"#FFFFFF\" bgcolor=\"#0066FF\" class=\"baise\">\r\n");
      out.write("    <td height=\"30\">代码</td>\r\n");
      out.write("    <td height=\"30\"><input name=\"ypcode\" type=\"text\" class=\"zhengwen\" value=\"");
      out.print(rs.getString("ypcode"));
      out.write("\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr align=\"center\" bordercolor=\"#FFFFFF\" bgcolor=\"#0066FF\" class=\"baise\">\r\n");
      out.write("    <td height=\"30\">中文名称</td>\r\n");
      out.write("    <td height=\"30\"><input name=\"ypcname\" type=\"text\" class=\"zhengwen\" value=\"");
      out.print(rs.getString("ypcname"));
      out.write("\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr align=\"center\" bordercolor=\"#FFFFFF\" bgcolor=\"#0066FF\" class=\"baise\">\r\n");
      out.write("    <td height=\"30\">英文名称</td>\r\n");
      out.write("    <td height=\"30\"><input name=\"ypename\" type=\"text\" class=\"zhengwen\" value=\"");
      out.print(rs.getString("ypename"));
      out.write("\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr align=\"center\" bordercolor=\"#FFFFFF\" bgcolor=\"#0066FF\" class=\"baise\">\r\n");
      out.write("    <td height=\"30\">剂型</td>\r\n");
      out.write("    <td height=\"30\"><input name=\"ypjx\" type=\"text\" class=\"zhengwen\" value=\"");
      out.print(rs.getString("ypjx"));
      out.write("\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr align=\"center\" bordercolor=\"#FFFFFF\" bgcolor=\"#0066FF\" class=\"baise\">\r\n");
      out.write("    <td height=\"30\">药品类型</td>\r\n");
      out.write("    <td height=\"30\"><input name=\"yptype\" type=\"text\" class=\"zhengwen\" value=\"");
      out.print(rs.getString("yptype"));
      out.write("\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr align=\"center\" bordercolor=\"#FFFFFF\" bgcolor=\"#0066FF\" class=\"baise\">\r\n");
      out.write("    <td height=\"30\">单位</td>\r\n");
      out.write("    <td height=\"30\"><input name=\"ypunit\" type=\"text\" class=\"zhengwen\" value=\"");
      out.print(rs.getString("ypunit"));
      out.write("\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr align=\"center\" bordercolor=\"#FFFFFF\" bgcolor=\"#0066FF\" class=\"baise\">\r\n");
      out.write("    <td height=\"30\">价格</td>\r\n");
      out.write("    <td height=\"30\"><input name=\"ypprice\" type=\"text\" class=\"zhengwen\" value=\"");
      out.print(rs.getString("ypprice"));
      out.write("\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr align=\"center\" bordercolor=\"#FFFFFF\" bgcolor=\"#0066FF\" class=\"baise\">\r\n");
      out.write("    <td height=\"30\">是否医保</td>\r\n");
      out.write("    <td height=\"30\"><input name=\"canbx\" type=\"text\" class=\"zhengwen\" value=\"");
      out.print(rs.getString("canbx"));
      out.write("\" maxlength=\"2\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr align=\"center\" bordercolor=\"#FFFFFF\" bgcolor=\"#0066FF\" class=\"baise\">\r\n");
      out.write("    <td height=\"30\">特殊信息</td>\r\n");
      out.write("    <td height=\"30\"><select name=\"ypts\" size=\"1\" class=\"zhengwen\">\r\n");
      out.write("\t  <option>*</option>\r\n");
      out.write("      <option>#</option>\r\n");
      out.write("      <option>★</option>\r\n");
      out.write("      <option>★★</option>\r\n");
      out.write("      <option>★★★</option>\r\n");
      out.write("    </select></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr align=\"center\" bordercolor=\"#FFFFFF\" bgcolor=\"#0066FF\" class=\"baise\">\r\n");
      out.write("    <td height=\"30\">拼音代码</td>\r\n");
      out.write("    <td height=\"30\"><input name=\"py\" type=\"text\" class=\"zhengwen\" value=\"");
      out.print(rs.getString("py"));
      out.write("\" maxlength=\"4\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr align=\"center\" bordercolor=\"#FFFFFF\" bgcolor=\"#0066FF\" class=\"baise\">\r\n");
      out.write("    <td height=\"30\">五笔代码</td>\r\n");
      out.write("    <td height=\"30\"><input name=\"wb\" type=\"text\" class=\"zhengwen\" value=\"");
      out.print(rs.getString("wb"));
      out.write("\" maxlength=\"4\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"472\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"136\" height=\"30\" align=\"center\" class=\"huanying1\">      </td>\r\n");
      out.write("    <td width=\"100\" align=\"center\" class=\"huanying1\"><input name=\"Submit\" type=\"submit\" class=\"zhengwen\" value=\"提交\"></td>\r\n");
      out.write("    <td width=\"100\" align=\"center\" class=\"huanying1\"><input name=\"Submit2\" type=\"reset\" class=\"zhengwen\" value=\"重置\"></td>\r\n");
      out.write("    <td width=\"136\" align=\"center\" class=\"huanying1\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("</form>\r\n");
 } 
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
