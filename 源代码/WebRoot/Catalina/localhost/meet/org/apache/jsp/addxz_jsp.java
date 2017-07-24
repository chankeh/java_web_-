package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mypackage.*;
import java.util.*;

public final class addxz_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>增加人员</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".STYLE1 {\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("body {\r\n");
      out.write("\tmargin-left: 0px;\r\n");
      out.write("}\r\n");
      out.write(".STYLE2 {\r\n");
      out.write("\tcolor: #0000CC;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write(" \tfunction check(){\r\n");
      out.write("\t\tvar myReg=new RegExp(\"^[0-9]+(\\.[0-9]{1,4})?$\");\r\n");
      out.write("\t\tvar identityCard = /^(\\d{15}|\\d{18})$/;\r\n");
      out.write("\t\tvar agetest=/^(\\d{1,3})$/;\r\n");
      out.write("\t\tif(document.opform.gname.value==\"\"){\r\n");
      out.write("\t\t\talert(\"请输入名称！\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t \r\n");
      out.write("\t \t\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("function upfile(){\r\n");
      out.write("\tvar ret=window.showModalDialog(\"upfile.jsp\",window,\"dialogHeight:140px;dialogWidth:640px;status:off;center:yes;resizable:no;scroll:no;edge:raised;help:no\");\t\r\n");
      out.write("\tif(ret==null){\r\n");
      out.write("\t\tdocument.opform.dz.value=\"\";\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\tdocument.opform.dz.value=ret;\r\n");
      out.write("\t}\t\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<form name=\"opform\" method=\"post\" action=\"xzop.jsp\" onsubmit=\"javascript:return check();\">\r\n");
      out.write("  <table width=\"675\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"1\" bordercolor=\"1\" bgcolor=\"#9EC3F2\" style=\"font-size:12px\">\r\n");
      out.write("  <!--DWLayoutTable-->\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"25\" colspan=\"2\" align=\"left\" valign=\"middle\" background=\"img/bg_titlebarr.gif\"><span class=\"STYLE1\">会议资料上传&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"77\" height=\"25\" align=\"left\" valign=\"middle\" bgcolor=\"#F9FCFF\"><div align=\"left\">会议主题</div></td>\r\n");
      out.write("    <td width=\"595\" align=\"left\" valign=\"middle\" bgcolor=\"#F9FCFF\"><input name=\"hy\" type=\"text\" id=\"hy\" size=\"30\" maxlength=\"30\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"25\" align=\"left\" valign=\"middle\" bgcolor=\"#F9FCFF\"><div align=\"left\">会议时间</div></td>\r\n");
      out.write("    <td align=\"left\" valign=\"middle\" bgcolor=\"#F9FCFF\"><input name=\"sj\" type=\"text\" id=\"sj\" size=\"30\" maxlength=\"30\" /></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"25\" align=\"left\" valign=\"middle\" bgcolor=\"#F9FCFF\"><div align=\"left\">内容</div></td>\r\n");
      out.write("    <td align=\"left\" valign=\"middle\" bgcolor=\"#F9FCFF\"><textarea name=\"nr\" cols=\"50\" rows=\"5\" id=\"nr\"></textarea></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"25\" align=\"left\" valign=\"middle\" bgcolor=\"#F9FCFF\">文件类型</td>\r\n");
      out.write("    <td align=\"left\" valign=\"middle\" bgcolor=\"#F9FCFF\"><select name=\"lx\" id=\"lx\">\r\n");
      out.write("          <option value=\"会议PPT\" selected=\"selected\">会议PPT</option>\r\n");
      out.write("          <option value=\"会议视频\">会议视频</option>\r\n");
      out.write("          <option value=\"会议录音\">会议录音</option>\r\n");
      out.write("          <option value=\"会议报告\">会议报告</option>\r\n");
      out.write("          <option value=\"会议照片\">会议照片</option>\r\n");
      out.write("        </select>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"25\" align=\"left\" valign=\"middle\" bgcolor=\"#F9FCFF\"><div align=\"left\">稿件上传</div></td>\r\n");
      out.write("    <td align=\"left\" valign=\"middle\" bgcolor=\"#F9FCFF\"><input name=\"dz\" type=\"text\" id=\"dz\" size=\"50\" /><input type=\"button\" name=\"Submit\" value=\"上传文件\" onClick=\"javascript:upfile();\" /></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("</table>\r\n");
      out.write("  <table width=\"750\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\">\r\n");
      out.write("  <!--DWLayoutTable-->\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"750\" height=\"30\" align=\"center\" valign=\"middle\">\r\n");
      out.write("      <input type=\"submit\" name=\"Submit\" value=\"保存\" />      &nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write(" \r\n");
      out.write("<input type=\"hidden\" name=\"op\" value=\"add\"/>\r\n");
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
