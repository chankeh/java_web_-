package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.*;
import java.lang.*;;

public final class view_005fworker_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      			"../errorPage.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\t\t\r\n");
      MyBean.dbcon dbc = null;
      synchronized (session) {
        dbc = (MyBean.dbcon) _jspx_page_context.getAttribute("dbc", PageContext.SESSION_SCOPE);
        if (dbc == null){
          dbc = new MyBean.dbcon();
          _jspx_page_context.setAttribute("dbc", dbc, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("<title>无标题文档</title>\r\n");
      out.write("<link href=\"Style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script language=\"JavaScript\">\r\n");
      out.write("function clickMenu(ID)\r\n");
      out.write("{    var targetelement=document.all(ID);\r\n");
      out.write("    if (targetelement.style.display==\"none\")\r\n");
      out.write("        targetelement.style.display='';\r\n");
      out.write("    else\r\n");
      out.write("        targetelement.style.display=\"none\";}\r\n");
      out.write("</script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("body {\r\n");
      out.write("\tmargin-left: 0px;\r\n");
      out.write("\tmargin-top: 0px;\r\n");
      out.write("\tmargin-right: 0px;\r\n");
      out.write("\tmargin-bottom: 0px;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style></head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<p>\r\n");
      out.write("  ");

  		request.setCharacterEncoding("gb2312");
		String adminno="";
		adminno=(String)session.getValue("myid");
		if (session.getValue("myselect").equals("0")){//系统管理员能看到的内容

      out.write("\r\n");
      out.write("</p>\r\n");
      out.write("<table width=\"180\" height=\"106\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#0066FF\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"50\" align=\"center\" valign=\"middle\"><p class=\"biaoti\">医疗报销系统</p>    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"24\" align=\"center\" valign=\"middle\"><span class=\"baise\">您的ID:");
      out.print(adminno);
      out.write("</span></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"24\" align=\"center\" valign=\"middle\"><span class=\"baise\">您的身份:管理员</span></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"180\" border=\"1\" cellpadding=\"3\" cellspacing=\"1\" bordercolor=\"#FFFFFF\" bgcolor=\"#0066FF\" class=\"lanse\">\r\n");
      out.write("<tr class=\"lanse\" onclick=\"clickMenu('user_1')\" style=\"cursor:hand\">\r\n");
      out.write("<td nowrap colspan=\"5\" align=\"center\" title=\"\"><b class=\"baise\">药品信息管理</b></td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<div id=user_1 style=\"display:none\">\r\n");
      out.write("<table border=\"0\" cellspacing=\"1\" width=\"180\" class=\"lanse\" bgcolor=\"#000000\" cellpadding=\"3\">\r\n");
      out.write("<tr bgcolor=#ffffff>\r\n");
      out.write("<td align=center style=cursor:hand onmouseover=this.bgColor='#B3D1FF' onmouseout=this.bgColor='#ffffff'><a href=\"yaopin/xiangxi.jsp\" target=\"right\" class=\"lanse\">药品详细信息</a></font></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr bgcolor=#ffffff>\r\n");
      out.write("<td align=center style=cursor:hand onmouseover=this.bgColor='#B3D1FF' onmouseout=this.bgColor='#ffffff'><a href=\"yaopin/glchaxun.jsp\" target=\"right\" class=\"lanse\">药品信息查询</a></font></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr bgcolor=#ffffff>\r\n");
      out.write("<td align=center style=cursor:hand onmouseover=this.bgColor='#B3D1FF' onmouseout=this.bgColor='#ffffff'><a href=\"yaopin/teshu.jsp\" target=\"right\" class=\"lanse\">药品特殊信息</a></font></td></tr>\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("<table width=\"180\" border=\"1\" cellpadding=\"3\" cellspacing=\"1\" bordercolor=\"#FFFFFF\" bgcolor=\"#0066FF\" class=\"lanse\">\r\n");
      out.write("<tr class=\"lanse\" onclick=\"clickMenu('user_2')\" style=\"cursor:hand\">\r\n");
      out.write("<td nowrap colspan=\"5\" align=\"center\" title=\"\"><b class=\"baise\">报销</b></td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<div id=user_2 style=\"display:none\">\r\n");
      out.write("<table border=\"0\" cellspacing=\"1\" width=\"180\" class=\"lanse\" bgcolor=\"#000000\" cellpadding=\"3\">\r\n");
      out.write("<tr bgcolor=#ffffff>\r\n");
      out.write("<td align=center style=cursor:hand onmouseover=this.bgColor='#B3D1FF' onmouseout=this.bgColor='#ffffff'><a href=\"baoxiao/baoxiao.jsp\" target=\"right\" class=\"lanse\">进入报销页面</a></font></td>\r\n");
      out.write("<tr bgcolor=#ffffff>\r\n");
      out.write("<td align=center style=cursor:hand onmouseover=this.bgColor='#B3D1FF' onmouseout=this.bgColor='#ffffff'><a href=\"baoxiao/zgxiangxi.jsp\" target=\"right\" class=\"lanse\">报销详细查询</a></font></td></tr>\r\n");
      out.write("<tr bgcolor=#ffffff>\r\n");
      out.write("<td align=center style=cursor:hand onmouseover=this.bgColor='#B3D1FF' onmouseout=this.bgColor='#ffffff'><a href=\"baoxiao/count.jsp\" target=\"right\" class=\"lanse\">报销统计查询</a></font></td></tr>\r\n");
      out.write("<tr bgcolor=#ffffff>\r\n");
      out.write("<td align=center style=cursor:hand onmouseover=this.bgColor='#B3D1FF' onmouseout=this.bgColor='#ffffff'><a href=\"baoxiao/bili.jsp\" target=\"right\" class=\"lanse\">报销比例信息</a></font></td></tr>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("<table width=\"180\" border=\"1\" cellpadding=\"3\" cellspacing=\"1\" bordercolor=\"#FFFFFF\" bgcolor=\"#0066FF\" class=\"lanse\">\r\n");
      out.write("<tr class=\"lanse\" onclick=\"clickMenu('user_3')\" style=\"cursor:hand\">\r\n");
      out.write("<td nowrap colspan=\"5\" align=\"center\" title=\"\"><b class=\"baise\">用户信息管理</b></td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<div id=user_3 style=\"display:none\">\r\n");
      out.write("<table border=\"0\" cellspacing=\"1\" width=\"180\" class=\"lanse\" bgcolor=\"#000000\" cellpadding=\"3\">\r\n");
      out.write("<tr bgcolor=#ffffff>\r\n");
      out.write("<td align=center style=cursor:hand onmouseover=this.bgColor='#B3D1FF' onmouseout=this.bgColor='#ffffff'><a href=\"xinxi/zhigong.jsp\" target=\"right\" class=\"lanse\">用户详细信息</a></font></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr bgcolor=#ffffff>\r\n");
      out.write("<td align=center style=cursor:hand onmouseover=this.bgColor='#B3D1FF' onmouseout=this.bgColor='#ffffff'><a href=\"baoxiao/zgchaxun.jsp\" target=\"right\" class=\"lanse\">用户报销查询</a></font></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr bgcolor=#ffffff>\r\n");
      out.write("<td align=center style=cursor:hand onmouseover=this.bgColor='#B3D1FF' onmouseout=this.bgColor='#ffffff'><a href=\"xinxi/newyh.jsp\" target=\"right\" class=\"lanse\">添加新用户</a></font></td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("<table width=\"180\" border=\"1\" cellpadding=\"3\" cellspacing=\"1\" bordercolor=\"#FFFFFF\" bgcolor=\"#0066FF\" class=\"lanse\">\r\n");
      out.write("  <tr>\r\n");
      out.write("  <td nowrap colspan=\"5\" align=\"center\" title=\"\"><b class=\"baise\"><a href=\"logout.jsp\" class=\"baise\">注销</a></b></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
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
