package org.apache.jsp.AD;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class left_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      			"", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<!--\r\n");
      out.write("//-------------------------------------\r\n");
      out.write("//功能：管理员管理网站首页\r\n");
      out.write("//作者：Zpp\r\n");
      out.write("//更新日期：\r\n");
      out.write("//-------------------------------------\r\n");
      out.write("-->\r\n");
      out.write("<head>\r\n");
      out.write("<meta name=\"GENERATOR\" content=\"Microsoft FrontPage 5.0\">\r\n");
      out.write("<meta name=\"ProgId\" content=\"FrontPage.Editor.Document\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("<title>新建网页 1</title>\r\n");
      out.write("<base target=\"main\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"file:///E|/asp学习/freead8/1.CSS\">\r\n");
      out.write("<link href=\"file:///E|/asp学习/freead8/freead8.com/Style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("body {\r\n");
      out.write("\tmargin-left: 0px;\r\n");
      out.write("\tmargin-top: 0px;\r\n");
      out.write("\tmargin-right: 0px;\r\n");
      out.write("\tmargin-bottom: 0px;\r\n");
      out.write("\tbackground-color: #CCCCCC;\r\n");
      out.write("}\r\n");
      out.write(".style1 {color: #999999}\r\n");
      out.write(".STYLE2 {color: #930}\r\n");
      out.write(".STYLE6 {font-size: 13px}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("@import url(\"../ht.css\");\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<link href=\"../ht.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".STYLE7 {color: #FF0000}\r\n");
      out.write(".STYLE8 {color: #0000FF}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("  <table width=\"158\"  border=\"1\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("    <tr> \r\n");
      out.write("      <td><img src=\"image/admin_title.png\" width=\"158\" height=\"38\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr> \r\n");
      out.write("      <td height=\"25\" bgcolor=\"#D2E9FF\" class=\"STYLE2\">&nbsp;<span class=\"STYLE7\">★|<a href=\"../index.jsp\" class=\"STYLE7\">管理首页</a>|<a href=\"outAD.jsp\" target=\"_parent\" class=\"STYLE7\">安全退出|★</a></span></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr> \r\n");
      out.write("      <td height=\"25\" background=\"image/title_bg_show.gif\" class=\"STYLE2\"><img src=\"image/icon.gif\" width=\"11\" height=\"11\"> <span class=\"STYLE7\">基本信息设置</span></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr> \r\n");
      out.write("      <td valign=\"top\" bgcolor=\"#FAFAFA\" class=\"STYLE2\"><table width=\"100%\"  border=\"1\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("          <tr > \r\n");
      out.write("            <td width=\"18\" valign=\"top\" bgcolor=\"#D2E9FF\"><img src=\"image/bullet.gif\" width=\"15\" height=\"20\"></td>\r\n");
      out.write("            <td valign=\"top\" bgcolor=\"#D2E9FF\" class=\"ht\"><A href=\"wzedit.jsp\" class=\"ht\">网<span class=\"STYLE6\">站信息设</span>置</A></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr> \r\n");
      out.write("            <td bgcolor=\"#D2E9FF\"><img src=\"image/bullet.gif\" width=\"15\" height=\"20\"></td>\r\n");
      out.write("            <td bgcolor=\"#D2E9FF\" class=\"ht\"> <a href=\"/Test\" class=\"ht\">服务器环境检测</a></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("      </table></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    \r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"25\" background=\"image/title_bg_show.gif\"><span class=\"STYLE2\"><img src=\"image/icon.gif\" width=\"11\" height=\"11\"> </span><span class=\"STYLE7\">用户管理</span></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td valign=\"top\" bgcolor=\"#FAFAFA\" class=\"STYLE2\"><table width=\"100%\"  border=\"1\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"18\" bgcolor=\"#D2E9FF\"><img src=\"image/bullet.gif\" width=\"15\" height=\"20\"></td>\r\n");
      out.write("            <td bgcolor=\"#D2E9FF\" class=\"ht\"><a href=\"bzgl.jsp\" class=\"ht\"></a><a href=\"passAD.jsp\" class=\"ht\">管理员密码设置</a></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td bgcolor=\"#D2E9FF\"><img src=\"image/bullet.gif\" width=\"15\" height=\"20\"></td>\r\n");
      out.write("            <td bgcolor=\"#D2E9FF\" class=\"ht\"><a href=\"bzgl.jsp\" class=\"ht\">普通用户管理</a><a href=\"passAD.jsp\" class=\"ht\"></a></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td bgcolor=\"#D2E9FF\"><img src=\"image/bullet.gif\" width=\"15\" height=\"20\"></td>\r\n");
      out.write("            <td bgcolor=\"#D2E9FF\" class=\"ht\"><a href=\"reg.jsp\" class=\"ht\">添加普通用户</a></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("      </table></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    \r\n");
      out.write("    <tr> \r\n");
      out.write("      <td height=\"25\" background=\"image/title_bg_show.gif\" class=\"STYLE2\"><img src=\"image/icon.gif\" width=\"11\" height=\"11\"><span class=\"STYLE7\"> 网站内容管理</span></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr> \r\n");
      out.write("      <td valign=\"top\" bgcolor=\"#FAFAFA\" class=\"STYLE2\"><table width=\"100%\"  border=\"1\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("          <tr> \r\n");
      out.write("            <td width=\"18\" valign=\"top\" bgcolor=\"#D2E9FF\"><img src=\"image/bullet.gif\" width=\"15\" height=\"20\"></td>\r\n");
      out.write("            <td valign=\"top\" bgcolor=\"#D2E9FF\" class=\"ht\"><a href=\"edit.jsp\"></a><a href=\"xwgl.jsp\" class=\"ht\">新闻管理</a></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr> \r\n");
      out.write("            <td bgcolor=\"#D2E9FF\" class=\"ht\"><img src=\"image/bullet.gif\" width=\"15\" height=\"20\"></td>\r\n");
      out.write("            <td bgcolor=\"#D2E9FF\" class=\"ht\"><a href=\"edit.jsp\" class=\"ht\">添加新闻</a><a href=\"xwgl.jsp\"></a></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td bgcolor=\"#D2E9FF\" class=\"ht\"><img src=\"image/bullet.gif\" width=\"15\" height=\"20\"></td>\r\n");
      out.write("            <td bgcolor=\"#D2E9FF\" class=\"ht\"><a href=\"csjl.jsp\" class=\"ht\">网站公告管理</a></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr> \r\n");
      out.write("            <td bgcolor=\"#D2E9FF\"><img src=\"image/bullet.gif\" width=\"15\" height=\"20\"></td>\r\n");
      out.write("            <td bgcolor=\"#D2E9FF\" class=\"ht\"><a href=\"file:///E|/asp学习/freead8/freead8.com/vip.asp\"></a><a href=\"csaddedit.jsp\" class=\"ht\">添加公告记录</a></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td bgcolor=\"#D2E9FF\"><img src=\"image/bullet.gif\" width=\"15\" height=\"20\"></td>\r\n");
      out.write("            <td bgcolor=\"#D2E9FF\" class=\"ht\"><a href=\"lygl.jsp\" class=\"STYLE8\">留言管理</a></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("      </table></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    \r\n");
      out.write("    <tr> \r\n");
      out.write("      <td height=\"25\" background=\"image/title_bg_show.gif\" class=\"STYLE2\"><span class=\"STYLE7\"><img src=\"image/icon.gif\" width=\"11\" height=\"11\">&nbsp;连接管理</span></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr> \r\n");
      out.write("      <td bgcolor=\"#FFFFFF\" class=\"STYLE2\"><table width=\"100%\"  border=\"1\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("          <tr> \r\n");
      out.write("            <td width=\"18\" bgcolor=\"#D2E9FF\"><img src=\"image/bullet.gif\" width=\"15\" height=\"20\"></td>\r\n");
      out.write("            <td bgcolor=\"#D2E9FF\"><a href=\"ljadd.jsp\"><span class=\"ht\">添加友情链接</span></a><span class=\"ht\"><a href=\"file:///E|/asp学习/freead8/freead8.com/admin_database.asp?Action=Backup\"></a></span></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr> \r\n");
      out.write("            <td bgcolor=\"#D2E9FF\"><img src=\"image/bullet.gif\" width=\"15\" height=\"20\"></td>\r\n");
      out.write("            <td bgcolor=\"#D2E9FF\"><span class=\"STYLE2\"><a href=\"ljgl.jsp\" class=\"ht\">管理友情链接</a><a href=\"../DB/dataDB.mdb\"></a></span></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("      </table></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    \r\n");
      out.write("    <tr> \r\n");
      out.write("      <td height=\"25\" background=\"image/title_bg_show.gif\" class=\"STYLE2\"><img src=\"image/icon.gif\" width=\"11\" height=\"11\"> <span class=\"STYLE7\">活动介绍管理</span></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr> \r\n");
      out.write("      <td valign=\"top\" bgcolor=\"#FAFAFA\" class=\"STYLE2\"><table width=\"100%\"  border=\"1\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("          <tr> \r\n");
      out.write("            <td width=\"18\" valign=\"top\" bgcolor=\"#D2E9FF\" class=\"STYLE2\"><img src=\"image/bullet.gif\" width=\"15\" height=\"20\"></td>\r\n");
      out.write("            <td valign=\"top\" bgcolor=\"#D2E9FF\" class=\"ht\"><a href=\"ggft.html\" class=\"ht\">添加活动链接</a></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr> \r\n");
      out.write("            <td bgcolor=\"#D2E9FF\" class=\"STYLE2\"><img src=\"image/bullet.gif\" width=\"15\" height=\"20\"></td>\r\n");
      out.write("            <td bgcolor=\"#D2E9FF\" class=\"STYLE2\"><a href=\"gggl.jsp\" class=\"ht\">管理活动链接</a></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("      </table></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    \r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"25\" background=\"image/title_bg_show.gif\" class=\"STYLE2\"><p><img src=\"image/icon.gif\" width=\"11\" height=\"11\"><span class=\"STYLE7\"> 数据库管理(谨慎操作)</span></p>\r\n");
      out.write("      </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td valign=\"top\" bgcolor=\"#FAFAFA\" class=\"STYLE2\"><table width=\"100%\"  border=\"1\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"18\" valign=\"top\" bgcolor=\"#D2E9FF\"><img src=\"image/bullet.gif\" width=\"15\" height=\"20\"></td>\r\n");
      out.write("            <td valign=\"top\" bgcolor=\"#D2E9FF\"><a href=\"hft.html\" target=\"_blank\" class=\"ht\">还原全站数据</a></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("\r\n");
      out.write("      </table></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    \r\n");
      out.write("    <tr> \r\n");
      out.write("      <td height=\"25\" background=\"image/title_bg_show.gif\" class=\"STYLE2\"><img src=\"image/icon.gif\" width=\"11\" height=\"11\"><span class=\"STYLE7\"> 网站开发主要技术</span></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr> \r\n");
      out.write("      <td height=\"57\" align=\"left\" valign=\"top\" bgcolor=\"#D2E9FF\" class=\"STYLE2\"><p align=\"center\"><font color=\"#0000FF\">JSP</font></p>\r\n");
      out.write("        <p align=\"left\">&nbsp;</p>\r\n");
      out.write("      <p align=\"center\">&nbsp;</p>        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"2\" bgcolor=\"#FAFAFA\" style=\"display:none\"><script src='http://s25.cnzz.com/stat.php?id=162590&web_id=162590' language='JavaScript' charset='gb2312'></script></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      out.write(" \r\n");
      out.write("  <br>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
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
