package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mypackage.*;
import java.util.*;

public final class gg_jsp extends org.apache.jasper.runtime.HttpJspBase
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

String op=DateFormate.toGb((String)request.getParameter("op"));
if("save".equals(op)){
	GgManager gm=new GgManager();
	String ggnr=DateFormate.toGb((String)request.getParameter("ggnr"));
	String fbsj=DateFormate.toGb((String)request.getParameter("fbsj"));
	gm.setGg(ggnr,fbsj);
	
      out.write("\r\n");
      out.write("\t<script language=\"javascript\">\r\n");
      out.write("\talert(\"公告更新成功！\");\r\n");
      out.write("\t</script>\r\n");
      out.write("\t");

}

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<title>中国玉器信息网</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".STYLE7 {\r\n");
      out.write("\tcolor: #FFFFFF;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("}\r\n");
      out.write(".STYLE8 {\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write(".STYLE9 {font-size: 12px}\r\n");
      out.write("a.top:link {\r\n");
      out.write("\tcolor: #FFFFFF;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("a.top:visited {\r\n");
      out.write("\tcolor: #FFFFFF;font-size: 12px;\r\n");
      out.write("}\r\n");
      out.write("a.top:active {\r\n");
      out.write("\tcolor: #FFFFFF;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("a.top:hover {\r\n");
      out.write("\tcolor: #FFFFFF;font-size: 12px;\r\n");
      out.write("\ttext-decoration: underline;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body leftmargin=\"0\" topmargin=\"0\">\r\n");
      out.write("<center>\r\n");
      out.write("<form name=\"ggform\" action=\"gg.jsp\" method=\"post\">\r\n");
      out.write("  <table width=\"600\" height=\"280\" border=\"0\" align=\"left\" cellpadding=\"0\" cellspacing=\"0\" style=\"border:1px solid #CCCCCC\">\r\n");
      out.write("      <!--DWLayoutTable-->\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"583\" height=\"30\" align=\"left\" valign=\"middle\" background=\"img/top2.gif\" bgcolor=\"#F1EAD8\"><span class=\"STYLE8\">&nbsp;近期会议通知信息</span></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("\t\t        ");

      GgManager gm=new GgManager();
		Gg gg=gm.getGgInfo();
		
      out.write("\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"111\" align=\"center\" valign=\"middle\"><textarea name=\"ggnr\" cols=\"80\" rows=\"18\">");
      out.print(gg.getGgnr());
      out.write("</textarea><input name=\"fbsj\" type=\"hidden\" value=\"");
      out.print(DateFormate.getDateTime() );
      out.write("\" /><input name=\"op\" type=\"hidden\" value=\"save\" /></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      \r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"30\" align=\"center\" valign=\"middle\"><input type=\"submit\" name=\"Submit\" value=\"更新公告信息\" /></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("    </table>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("</center>\r\n");
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
