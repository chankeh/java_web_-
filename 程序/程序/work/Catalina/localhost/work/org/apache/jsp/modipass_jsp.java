package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mypackage.*;
import java.util.*;

public final class modipass_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<title>修改密码</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".STYLE1 {\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write(".STYLE4 {font-size: 14px}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("function checkform(){\r\n");
      out.write("\tvar f=document.opform;\r\n");
      out.write("\tif(f.old.value==\"\"){\r\n");
      out.write("\t\talert(\"请输入原密码\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}else if(f.newp.value==\"\"){\r\n");
      out.write("\t\talert(\"请输入新密码\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}else if(f.newp.value!=f.re.value){\r\n");
      out.write("\t\talert(\"两输入密码不一样，请重新输入\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<form name=\"opform\" action=\"zgop.jsp\" method=\"post\" onsubmit=\"javascript:return checkform();\">\r\n");
      out.write("<table width=\"456\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"1\" bgcolor=\"#9EC3F2\">\r\n");
      out.write("  <!--DWLayoutTable-->\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"25\" colspan=\"2\" align=\"left\" valign=\"middle\" background=\"img/bg_titlebarr.gif\"><span class=\"STYLE1\">&nbsp;修改密码</span></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"145\" height=\"25\" align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\" class=\"STYLE4\">原密码</td>\r\n");
      out.write("    <td width=\"308\" align=\"left\" valign=\"middle\" bgcolor=\"#F9FCFF\"><input name=\"old\" type=\"password\" id=\"old\" value=\"\" /></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"25\" align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\" class=\"STYLE4\">新密码</td>\r\n");
      out.write("    <td align=\"left\" valign=\"middle\" bgcolor=\"#F9FCFF\"><input name=\"newp\" type=\"password\" id=\"newp\" /></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"25\" align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\" class=\"STYLE4\"><p>再次输入</p></td>\r\n");
      out.write("    <td align=\"left\" valign=\"middle\" bgcolor=\"#F9FCFF\"><input name=\"re\" type=\"password\" id=\"re\" /></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<br>\r\n");
      out.write("<center><input type=\"submit\" name=\"Submit\" value=\"确认修改\" />\r\n");
      out.write("&nbsp;\r\n");
      out.write("   \r\n");
      out.write("</center>\r\n");
      out.write("<input type=\"hidden\" name=\"op\" value=\"modipass\"/>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("<iframe  width=\"0\" height=\"0\"></iframe>\r\n");
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
