package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.*;
import java.sql.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("<title>无标题文档</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".style19 {color: #FFFFFF}\r\n");
      out.write("body {\r\n");
      out.write("\tmargin-left: 0px;\r\n");
      out.write("\tmargin-top: 0px;\r\n");
      out.write("\tmargin-right: 0px;\r\n");
      out.write("\tmargin-bottom: 0px;\r\n");
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
      out.write("<script language=\"javascript\">\r\n");
      out.write("function  trim(str)//去掉字符串的首尾空格\r\n");
      out.write("{  var tmpStr=new String(str)\r\n");
      out.write("    return tmpStr.replace(/(^\\s*)|(\\s*$)/g, \"\");\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function check()\r\n");
      out.write("{\r\n");
      out.write("\tif(trim(form.id.value)==\"\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"用户名不能为空!\");\r\n");
      out.write("\t\tform.id.value=\"\";\r\n");
      out.write("\t\tform.id.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(trim(form.pass.value)==\"\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"用户密码不能为空!\");\r\n");
      out.write("\t\tform.pass.value=\"\";\r\n");
      out.write("\t\tform.pass.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<link href=\"Style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<form name=form method=\"post\" action=\"chklog.jsp\" onsubmit=\"return check()\">\r\n");
      out.write("<table width=\"224\" height=\"334\" border=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"178\" height=\"36\" bordercolor=\"#000000\" bgcolor=\"#0D81CA\"><div align=\"center\" class=\"css style11 style9\">\r\n");
      out.write("        <div align=\"center\" class=\"baise\">管理员登录</div>\r\n");
      out.write("    </div></td>\r\n");
      out.write("    <td width=\"36\" rowspan=\"5\"><img src=\"images/layout_20.gif\" width=\"36\" height=\"292\" align=\"middle\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"32\" bordercolor=\"#000000\" bgcolor=\"#CC9900\"> <span class=\"css\">\r\n");
      out.write("      <input name=\"id\" type=\"text\" size=\"15\">\r\n");
      out.write("      <span class=\"baise\">USERNAME</span></span> </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"32\" bordercolor=\"#000000\" bgcolor=\"#CC9900\">\r\n");
      out.write("      <input name=\"pass\" type=\"password\" size=\"15\">\r\n");
      out.write("      <span class=\"baise\">PASSWORD </span> </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"37\" bordercolor=\"#CCCCCC\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("        <div align=\"right\">\r\n");
      out.write("          <input name=\"imageField\" type=\"image\" src=\"images/login_btn.jpg\" width=\"82\" height=\"55\" border=\"0\">\r\n");
      out.write("        </div></td></tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"165\"><p align=\"right\"><img src=\"images/dyxlogo.gif\" width=\"116\" height=\"36\"></p>\r\n");
      out.write("      <p align=\"right\"><img src=\"images/dl.gif\" width=\"116\" height=\"40\"></p>\r\n");
      out.write("      <p align=\"right\"><img src=\"images/cuptalogo.gif\" width=\"114\" height=\"40\">      </p></td>\r\n");
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
