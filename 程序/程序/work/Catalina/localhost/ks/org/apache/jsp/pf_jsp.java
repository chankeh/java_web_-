package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mypackage.*;
import java.util.*;

public final class pf_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>增加楼房</title>\r\n");
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
      out.write(" \tfunction check(){\r\n");
      out.write("\t\tvar myReg=new RegExp(\"^[0-9]+(\\.[0-9]{1,4})?$\");\r\n");
      out.write("\t\tvar identityCard = /^(\\d{15}|\\d{18})$/;\r\n");
      out.write("\t\tvar agetest=/^(\\d{1,3})$/;\r\n");
      out.write("\t\tif(document.opform.question.value==\"\"){\r\n");
      out.write("\t\t\talert(\"请输入考题信息！\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(document.opform.dn.value==\"\"){\r\n");
      out.write("\t\t\talert(\"请输入答案信息！\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(document.opform.nd.value==\"\"){\r\n");
      out.write("\t\t\talert(\"请输入难度信息！\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(document.opform.fs.value==\"\"){\r\n");
      out.write("\t\t\talert(\"请输入分数信息！\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t \t\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");

  String id=DateFormate.toGb((String)request.getParameter("id"));
  String sid=DateFormate.toGb((String)request.getParameter("sid"));
 
  
  answerop aop=new answerop();
  
  answer   an=new answer();
  
  an=aop.getanswerbyid(sid,java.lang.Integer.parseInt(id));
  
 
  
  
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<form name=\"opform\" method=\"post\" action=\"pfop.jsp\" onsubmit=\"javascript:return check();\">\r\n");
      out.write("<table width=\"750\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"1\" bordercolor=\"1\" bgcolor=\"#9EC3F2\" style=\"font-size:12px\">\r\n");
      out.write("  <!--DWLayoutTable-->\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"25\" colspan=\"2\" align=\"left\" valign=\"middle\" background=\"img/bg_titlebarr.gif\"><span class=\"STYLE1\">&nbsp;考题信息&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"sxxkt.jsp?sid=");
      out.print(sid);
      out.write("\">返回</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"115\" height=\"25\" align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\">问题</td>\r\n");
      out.write("    <td width=\"632\" align=\"left\" valign=\"middle\" bgcolor=\"#F9FCFF\"><textarea name=\"question\" cols=\"60\" rows=\"15\" id=\"question\">");
      out.print(an.getQuestion());
      out.write("</textarea></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  \r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"25\" align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\">正确答案</td>\r\n");
      out.write("    <td align=\"left\" valign=\"middle\" bgcolor=\"#F9FCFF\"><textarea name=\"dn\" cols=\"60\" rows=\"10\" id=\"dn\">");
      out.print(an.getDn());
      out.write("</textarea></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"25\" align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\">考生答案</td>\r\n");
      out.write("    <td align=\"left\" valign=\"middle\" bgcolor=\"#F9FCFF\"><textarea name=\"answer\" cols=\"60\" rows=\"10\" id=\"answer\">");
      out.print(an.getAnswer());
      out.write("</textarea></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"25\" align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\">本题分数</td>\r\n");
      out.write("    <td align=\"left\" valign=\"middle\" bgcolor=\"#F9FCFF\"><input name=\"fs\" type=\"text\" id=\"fs\" size=\"15\" value=\"");
      out.print(an.getFs());
      out.write("\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"25\" align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\">评分</td>\r\n");
      out.write("    <td align=\"left\" valign=\"middle\" bgcolor=\"#F9FCFF\"><input name=\"df\" type=\"text\" id=\"df\" size=\"15\"  /></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"750\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\">\r\n");
      out.write("  <!--DWLayoutTable-->\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"750\" height=\"30\" align=\"center\" valign=\"middle\"><input type=\"submit\" name=\"Submit\" value=\"保存\" />&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write(" <input name=\"id\"    type=\"hidden\"   id=\"id\" size=\"15\" value=\"");
      out.print(id);
      out.write("\"/>\r\n");
      out.write("  <input name=\"sid\"    type=\"hidden\"   id=\"sid\" size=\"15\" value=\"");
      out.print(sid);
      out.write("\"/>\r\n");
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
