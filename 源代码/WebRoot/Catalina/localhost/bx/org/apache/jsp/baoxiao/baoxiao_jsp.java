package org.apache.jsp.baoxiao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.*;
import java.sql.*;

public final class baoxiao_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>报销</title>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("function  trim(str)//去掉字符串的首尾空格\r\n");
      out.write("{  var tmpStr=new String(str)\r\n");
      out.write("    return tmpStr.replace(/(^\\s*)|(\\s*$)/g, \"\");\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function check()\r\n");
      out.write("{\r\n");
      out.write("\tif(trim(form.yonghulx.value)==\"0\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"请选择用户类型!\");\r\n");
      out.write("\t\tform.yonghulx.value=\"0\";\r\n");
      out.write("\t\tform.yonghulx.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(trim(form.yonghuid.value)==\"\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"用户编号不能为空!\");\r\n");
      out.write("\t\tform.yonghuid.value=\"\";\r\n");
      out.write("\t\tform.yonghuid.focus();\r\n");
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
      out.write("\tbackground-image: url();\r\n");
      out.write("\tbackground-color: #CCFFFF;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<link href=\"../Style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");

		request.setCharacterEncoding("gb2312");
		ResultSet rs=null;//记录集
		String sql="";
        sql="delete from t_bx_temp";
		rs=dbc.executeQuery(sql);
			

      out.write("\r\n");
      out.write("<table width=\"750\" height=\"424\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" background=\"images/bg.jpg\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"424\" align=\"center\"><form name=form method=\"post\" action=\"../baoxiao/bxlog.jsp\" onsubmit=\"return check()\"><table width=\"284\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"139\" height=\"24\"><div align=\"center\" class=\"zhengwen\">\r\n");
      out.write("          <div align=\"center\" class=\"zhengwen\">用户类型:</div>\r\n");
      out.write("        </div></td>\r\n");
      out.write("        <td width=\"139\" align=\"center\">\r\n");
      out.write("              <div align=\"center\">\r\n");
      out.write("                <select name=\"yonghulx\" size=\"1\" class=\"zhengwen\">\r\n");
      out.write("\t\t          <option value=\"0\" selected>--请选择用户类型--</option>\r\n");
      out.write("\t\t          <option value=\"1\">教职工</option>\r\n");
      out.write("\t\t          <option value=\"2\">学生</option>\r\n");
      out.write("                </select>\r\n");
      out.write("              </div></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"24\"><div align=\"center\" class=\"zhengwen\">\r\n");
      out.write("          <div align=\"center\" class=\"zhengwen\">用户编号:</div>\r\n");
      out.write("        </div></td>\r\n");
      out.write("        <td align=\"center\">\r\n");
      out.write("              <div align=\"center\">\r\n");
      out.write("                <input name=\"yonghuid\" type=\"text\" class=\"zhengwen\" size=\"20\">\r\n");
      out.write("              </div></td></tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"24\" colspan=\"2\">\r\n");
      out.write("            <div align=\"center\">\r\n");
      out.write("              <input name=\"Submit\" type=\"submit\" class=\"zhengwen\" value=\"提交\">\r\n");
      out.write("            </div></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("    </form></td>\r\n");
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
