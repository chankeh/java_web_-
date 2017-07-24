package org.apache.jsp.xinxi;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.*;
import java.sql.*;

public final class newyh_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\tif(trim(form.userid.value)==\"\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"编号不能为空!\");\r\n");
      out.write("\t\tform.userid.value=\"\";\r\n");
      out.write("\t\tform.userid.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(trim(form.pass.value)==\"\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"密码不能为空!\");\r\n");
      out.write("\t\tform.pass.value=\"\";\r\n");
      out.write("\t\tform.pass.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(trim(form.name.value)==\"\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"姓名不能为空!\");\r\n");
      out.write("\t\tform.name.value=\"\";\r\n");
      out.write("\t\tform.name.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(trim(form.age.value)==\"\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"年龄不能为空!\");\r\n");
      out.write("\t\tform.age.value=\"\";\r\n");
      out.write("\t\tform.age.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(trim(form.depart.value)==\"\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"部门不能为空!\");\r\n");
      out.write("\t\tform.depart.value=\"\";\r\n");
      out.write("\t\tform.depart.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(trim(form.type.value)==\"\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"类别不能为空!\");\r\n");
      out.write("\t\tform.type.value=\"\";\r\n");
      out.write("\t\tform.type.focus();\r\n");
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

      out.write("\r\n");
      out.write("</p>\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("<table width=\"790\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("<tr>\r\n");
      out.write("<td height=\"71\" align=\"center\" class=\"huanying1\">添加新用户</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<form name=form method=\"post\" action=\"../yhlog.jsp?mark=1\" onsubmit=\"return check()\">\r\n");
      out.write("<table width=\"346\" border=\"1\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#0000FF\" bgcolor=\"#0066FF\">\r\n");
      out.write("  <tr align=\"center\" bordercolor=\"#FFFFFF\" bgcolor=\"#0066FF\" class=\"baise\">\r\n");
      out.write("    <td width=\"94\" height=\"30\">编号</td>\r\n");
      out.write("    <td width=\"246\" height=\"30\" class=\"baise\"><input name=\"userid\" type=\"text\" class=\"zhengwen\" id=userid></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr align=\"center\" bordercolor=\"#FFFFFF\" bgcolor=\"#0066FF\" class=\"baise\">\r\n");
      out.write("    <td height=\"30\">姓名</td>\r\n");
      out.write("    <td height=\"30\"><input name=\"name\" type=\"text\" class=\"zhengwen\" value=\"\" id=name></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr align=\"center\" bordercolor=\"#FFFFFF\" bgcolor=\"#0066FF\" class=\"baise\">\r\n");
      out.write("    <td height=\"30\">密码</td>\r\n");
      out.write("    <td height=\"30\"><input name=\"pass\" type=\"text\" class=\"zhengwen\" id=pass></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr align=\"center\" bordercolor=\"#FFFFFF\" bgcolor=\"#0066FF\" class=\"baise\">\r\n");
      out.write("    <td height=\"30\">性别</td>\r\n");
      out.write("    <td height=\"30\"><select name=\"sex\" size=\"1\">\r\n");
      out.write("      <option selected>男</option>\r\n");
      out.write("      <option>女</option>\r\n");
      out.write("    </select></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr align=\"center\" bordercolor=\"#FFFFFF\" bgcolor=\"#0066FF\" class=\"baise\">\r\n");
      out.write("    <td height=\"30\">年龄</td>\r\n");
      out.write("    <td height=\"30\"><input name=\"age\" type=\"text\" class=\"zhengwen\" id=age></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr align=\"center\" bordercolor=\"#FFFFFF\" bgcolor=\"#0066FF\" class=\"baise\">\r\n");
      out.write("    <td height=\"30\">部门</td>\r\n");
      out.write("    <td height=\"30\"><input name=\"depart\" type=\"text\" class=\"zhengwen\" id=depart></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr align=\"center\" bordercolor=\"#FFFFFF\" bgcolor=\"#0066FF\" class=\"baise\">\r\n");
      out.write("    <td height=\"30\">类别</td>\r\n");
      out.write("    <td height=\"30\"><input name=\"type\" type=\"text\" class=\"zhengwen\" id=type></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr align=\"center\" bordercolor=\"#FFFFFF\" bgcolor=\"#0066FF\" class=\"baise\">\r\n");
      out.write("    <td height=\"30\">类型</td>\r\n");
      out.write("    <td><p>\r\n");
      out.write("      <label>\r\n");
      out.write("      <input name=\"lx\" type=\"radio\" value=\"0\" checked>\r\n");
      out.write("  职工</label>\r\n");
      out.write("      <label>\r\n");
      out.write("      <input type=\"radio\" name=\"lx\" value=\"1\">\r\n");
      out.write("  学生</label>\r\n");
      out.write("      <br>\r\n");
      out.write("    </p></td>\r\n");
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
