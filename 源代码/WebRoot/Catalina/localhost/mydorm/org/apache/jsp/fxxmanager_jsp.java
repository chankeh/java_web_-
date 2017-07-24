package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mypackage.*;
import java.util.*;

public final class fxxmanager_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<form name=\"zgform\" action=\"fxxmanager.jsp\" method=\"post\" onsubmit=\"javascript:return check();\">\r\n");
      out.write("<table width=\"823\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"1\" bgcolor=\"#9EC3F2\" style=\"font-size:12px\">\r\n");
      out.write("  <!--DWLayoutTable-->\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"25\" colspan=\"6\" align=\"left\" valign=\"middle\" background=\"img/bg_titlebarr.gif\"><span class=\"STYLE1\">&nbsp;寝室房间信息管理[<a href=\"addfxx.jsp\">新增寝室</a>]&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>寝室名称：\r\n");
      out.write("      <input name=\"svalue\" type=\"text\" size=\"15\" />\r\n");
      out.write("      &nbsp;\r\n");
      out.write("    <input type=\"submit\" name=\"Submit\" value=\"查找\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"113\" align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\">寝室名称</td>\r\n");
      out.write("    <td width=\"142\" height=\"25\" align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\">楼房名称</td>\r\n");
      out.write("    <td width=\"119\" align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\"><span class=\"STYLE4\">寝室床位数量</span></td>\r\n");
      out.write("    <td width=\"115\" align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\" class=\"STYLE4\">属性</td>\r\n");
      out.write("    <td width=\"171\" align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\" class=\"STYLE4\">描述</td>\r\n");
      out.write("    <td width=\"156\" align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\"><span class=\"STYLE4\">操作</span></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");

  fxxop fxop=new fxxop();
  String op=DateFormate.toGb((String)request.getParameter("op"));
  String svalue=DateFormate.toGb((String)request.getParameter("svalue"));
  ArrayList al=new ArrayList();
  if("search".equals(op)){
	  al=fxop.getFxxBylmc(svalue); 
  }else{
	al=fxop.getFxx();
	}
 fxx fx=new fxx();
  for(int i=0;i<al.size();i++){
	  fx=(fxx)al.get(i);
	  
  
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\"><span class=\"STYLE4\">");
      out.print(fx.getFmc() );
      out.write("</span></td>\r\n");
      out.write("    <td height=\"25\" align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\"><span class=\"STYLE4\">");
      out.print(fx.getLmc() );
      out.write("</span></td>\r\n");
      out.write("    <td align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\"><span class=\"STYLE4\">");
      out.print(fx.getFrs() );
      out.write("</span></td>\r\n");
      out.write("    <td align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\" class=\"STYLE4\">");
      out.print(fx.getFxb() );
      out.write("</td>\r\n");
      out.write("    <td align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\" class=\"STYLE4\"> <span class=\"STYLE4\">");
      out.print(fx.getFbz() );
      out.write("</span></td>\r\n");
      out.write("    <td align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\"><span class=\"STYLE4\"><a href=\"modfxx.jsp?fmc=");
      out.print(fx.getFmc());
      out.write("&lmc=");
      out.print(fx.getLmc());
      out.write("\">修改</a>/<a href=\"fxxop.jsp?op=del&fmc=");
      out.print(fx.getFmc());
      out.write("&lmc=");
      out.print(fx.getLmc());
      out.write("\">删除</a>/<a href=\"fxxop.jsp?op=addall&fmc=");
      out.print(fx.getFmc());
      out.write("&lmc=");
      out.print(fx.getLmc());
      out.write("\">生成床位</a></span></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");

  }
  
  
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<input name=\"op\" type=\"hidden\" value=\"search\" />\r\n");
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
