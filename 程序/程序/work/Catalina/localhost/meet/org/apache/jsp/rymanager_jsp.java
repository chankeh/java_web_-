package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mypackage.*;
import java.util.*;

public final class rymanager_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<title>员工信息管理</title>\r\n");
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
      out.write("\tfunction del(id){\r\n");
      out.write("\t\tif(confirm(\"您真的要删除选择的记录吗？\")){\r\n");
      out.write("\t\t\t\tdocument.location.href=\"lxxop.jsp?op=del&id=\"+id;\r\n");
      out.write("\t\t}\t\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction check(){\r\n");
      out.write("\t\tif(document.zgform.svalue.value==\"\"){\r\n");
      out.write("\t\t\talert(\"请输入查询内容\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<form name=\"zgform\" action=\"lxxmanager.jsp\" method=\"post\" onsubmit=\"javascript:return check();\">\r\n");
      out.write("<table width=\"898\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"1\" bgcolor=\"#9EC3F2\" style=\"font-size:12px\">\r\n");
      out.write("  <!--DWLayoutTable-->\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"25\" colspan=\"7\" align=\"left\" valign=\"middle\" background=\"img/bg_titlebarr.gif\"><span class=\"STYLE1\">普通操作员列表&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span> </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"166\" height=\"25\" align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\">用户名</td>\r\n");
      out.write("    <td width=\"166\" align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\">密码</td>\r\n");
      out.write("    <td width=\"133\" align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\">邮箱</td>\r\n");
      out.write("    <td width=\"143\" align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\">所在单位</td>\r\n");
      out.write("    <td width=\"94\" align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\">电话</td>\r\n");
      out.write("    <td width=\"138\" align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\">地址</td>\r\n");
      out.write("    <td width=\"50\" align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\"><span class=\"STYLE4\">操作</span></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");

  ptuserop lxop=new ptuserop();
  String op=DateFormate.toGb((String)request.getParameter("op"));
  String svalue=DateFormate.toGb((String)request.getParameter("svalue"));
  ArrayList al=new ArrayList();
  
	al=lxop.getlingdao();
 
 ptuser pt=new ptuser();
  for(int i=0;i<al.size();i++){
	  pt=(ptuser)al.get(i);
	  
  
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"25\" align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\"><span class=\"STYLE4\">");
      out.print(pt.getUsername() );
      out.write("</span></td>\r\n");
      out.write("    <td align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\"><span class=\"STYLE4\">");
      out.print(pt.getPassword() );
      out.write("</span></td>\r\n");
      out.write("    <td align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\">");
      out.print(pt.getNl() );
      out.write("</td>\r\n");
      out.write("    <td align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\">");
      out.print(pt.getDw() );
      out.write("</td>\r\n");
      out.write("    <td align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\">");
      out.print(pt.getDh() );
      out.write("</td>\r\n");
      out.write("    <td align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\">");
      out.print(pt.getDz() );
      out.write("</td>\r\n");
      out.write("    <td align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\"><span class=\"STYLE4\"><a href=\"ryop.jsp?op=del&username=");
      out.print(pt.getUsername());
      out.write("\">删除</a></span></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");

  }
  
  
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<input name=\"op\" type=\"hidden\" value=\"search\" />\r\n");
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
