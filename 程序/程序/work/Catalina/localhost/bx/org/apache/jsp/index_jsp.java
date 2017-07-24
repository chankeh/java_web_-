package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.*;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>医疗报销系统</title>\r\n");
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
      out.write("\t\talert(\"用户ID不能为空!\");\r\n");
      out.write("\t\tform.id.value=\"\";\r\n");
      out.write("\t\tform.id.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(trim(form.pwd.value)==\"\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"密码不能为空!\");\r\n");
      out.write("\t\tform.pwd.value=\"\";\r\n");
      out.write("\t\tform.pwd.focus();\r\n");
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
      out.write("\tbackground-color: #000066;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<link href=\"Style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
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
      out.write("</style></head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<table width=\"1000\" height=\"504\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("<FORM name=form action=\"chklog.jsp\" method=post target=\"_parent\" onsubmit=\"return check()\">\r\n");
      out.write("  <tr bgcolor=\"#000066\">\r\n");
      out.write("    <td height=\"79\" colspan=\"2\"><img src=\"images/index1.jpg\" width=\"379\" height=\"76\"></td>\r\n");
      out.write("    <td height=\"79\" colspan=\"3\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr bgcolor=\"#000066\">\r\n");
      out.write("    <td height=\"34\">&nbsp;</td>\r\n");
      out.write("    <td height=\"34\"><img src=\"images/index5.jpg\" width=\"103\" height=\"35\"></td>\r\n");
      out.write("    <td height=\"34\">&nbsp;</td>\r\n");
      out.write("    <td height=\"34\" class=\"lianjie\">&nbsp;</td>\r\n");
      out.write("    <td height=\"34\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr bgcolor=\"#000066\">\r\n");
      out.write("    <td height=\"59\">&nbsp;</td>\r\n");
      out.write("    <td height=\"59\" colspan=\"4\" background=\"images/index2.jpg\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"254\" height=\"344\" rowspan=\"8\" background=\"images/index3.jpg\">&nbsp;</td>\r\n");
      out.write("    <td width=\"164\" rowspan=\"6\" valign=\"top\"><img src=\"images/index4.jpg\" width=\"164\" height=\"175\"></td>\r\n");
      out.write("    <td height=\"138\" colspan=\"3\" valign=\"bottom\"><span class=\"huanying1\">欢迎访问　医疗报销系统</span></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"18\" colspan=\"3\" class=\"zhengwen\">输入您的用户名、密码与用户类型登录</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"13\" colspan=\"3\" class=\"zhengwen\"><hr size=\"1\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"58\" height=\"18\" class=\"lanse\">用户名:</td>\r\n");
      out.write("    <td colspan=\"2\"><INPUT name=id class=\"zhengwen\" id=id size=16></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"18\" class=\"lanse\">密　码:</td>\r\n");
      out.write("    <td height=\"18\" colspan=\"2\"><INPUT name=pwd type=password class=\"zhengwen\" id=pwd size=16></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"20\" class=\"lanse\">类　型:</td>\r\n");
      out.write("    <td width=\"73\" height=\"20\"><select name=\"sect\" size=\"1\" class=\"lanse\">\r\n");
      out.write("\t\t\t\t\t  <option value=\"4\">学生</option>\r\n");
      out.write("\t\t\t\t\t  <option value=\"3\">教职工</option>\r\n");
      out.write("\t\t\t\t\t  <option value=\"0\" selected>管理员</option>\r\n");
      out.write("      </select></td>\r\n");
      out.write("    <td width=\"451\"><input name=\"Submit\" type=\"submit\" class=\"lanse\" value=\"登录\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"25\" colspan=\"4\"><hr size=\"1\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"81\" colspan=\"4\">&nbsp;</td>\r\n");
      out.write("  </tr></FORM>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"1000\" height=\"82\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"82\" align=\"center\" bgcolor=\"#000066\" class=\"baise\">Copyright 2007&copy; ZYJ All Rights Reserved<br>\r\n");
      out.write("未经授权禁止转载、摘编、复制或建立镜像。如有违反，追究法律责任<br>\r\n");
      out.write("版权所有 沈阳航空工业学院 朱英杰 </td>\r\n");
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
