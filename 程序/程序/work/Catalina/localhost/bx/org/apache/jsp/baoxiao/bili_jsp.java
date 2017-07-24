package org.apache.jsp.baoxiao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.*;
import java.sql.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public final class bili_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\tif(trim(form.bxbl.value)==\"\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"报销比例不能为空!\");\r\n");
      out.write("\t\tform.bxbl.focus();\r\n");
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
      out.write("  ");

		request.setCharacterEncoding("gb2312");
		ResultSet rs=null;//记录集
		String sql="";
		String ypname="";
		String ypcname="";
		String bxbl="";
		sql="select * from t_yp";
		ypname=request.getParameter("name");
		if(ypname!=null&&!ypname.equals("")){
			sql=sql+" where ypcname like '%"+ypname+"%' " ;
			rs=dbc.executeQuery(sql);
			if(rs.next()){
			ypcname=rs.getString("ypcname");
			bxbl=rs.getString("bxbl");
			}
		}
		else{
		sql="select * from t_yp";
		rs=dbc.executeQuery(sql);
		}

      out.write("\r\n");
      out.write("</p>\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("<table width=\"790\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("<tr>\r\n");
      out.write("<td height=\"99\" align=\"center\" class=\"huanying1\">报销比例信息</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"790\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\"><form name=\"form1\" method=\"post\" action=\"bili.jsp\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"200\" height=\"42\" class=\"huanying1\">&nbsp;</td>\r\n");
      out.write("    <td width=\"100\" align=\"center\" class=\"lanse\">药品名称</td>\r\n");
      out.write("    <td width=\"190\" align=\"center\" class=\"huanying1\">\r\n");
      out.write("      <select name=\"name\" size=\"1\" class=\"zhengwen\">\r\n");
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
      out.write("    <td width=\"100\" align=\"center\" class=\"huanying1\"><input name=\"Submit\" type=\"submit\" class=\"lanse\" value=\"选择\"></td>\r\n");
      out.write("    <td width=\"208\" class=\"huanying1\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</form></table>\r\n");
      out.write("<form name=form method=\"post\" action=\"../baoxiao/xxlog.jsp?mark=3\" onsubmit=\"return check()\">\r\n");
      out.write("<table width=\"410\" border=\"1\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#0000FF\" bgcolor=\"#0066FF\">\r\n");
      out.write("  <tr align=\"center\" bordercolor=\"#FFFFFF\" bgcolor=\"#0066FF\" class=\"baise\">\r\n");
      out.write("    <td width=\"100\" height=\"30\">药品名称</td>\r\n");
      out.write("    <td width=\"100\"><input name=\"ypcname\" type=\"text\" class=\"zhengwen\" value=\"");
      out.print(ypcname);
      out.write("\" size=\"16\"></td>\r\n");
      out.write("    <td width=\"100\">报销比例</td>\r\n");
      out.write("    <td width=\"100\"> <input name=\"bxbl\" type=\"text\" class=\"zhengwen\" value=\"");
      out.print(bxbl);
      out.write("\" size=\"4\" maxlength=\"4\">\r\n");
      out.write("      %</td>  \r\n");
      out.write("  </tr>\r\n");
      out.write("\t<tr align=\"center\" bordercolor=\"#FFFFFF\" bgcolor=\"#0066FF\" class=\"baise\">\r\n");
      out.write("    <td width=\"100\" height=\"30\" align=\"center\">&nbsp;</td>\r\n");
      out.write("    <td width=\"100\" align=\"center\"><input name=\"Submit\" type=\"submit\" class=\"zhengwen\" value=\"修改\"></td>\r\n");
      out.write("    <td width=\"100\" align=\"center\"><input name=\"Submit2\" type=\"reset\" class=\"zhengwen\" value=\"重置\"></td>\r\n");
      out.write("    <td width=\"100\" align=\"center\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
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
