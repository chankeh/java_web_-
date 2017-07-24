package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import com.util.*;

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
      			"", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      com.util.CheckCode yzm = null;
      synchronized (_jspx_page_context) {
        yzm = (com.util.CheckCode) _jspx_page_context.getAttribute("yzm", PageContext.PAGE_SCOPE);
        if (yzm == null){
          yzm = new com.util.CheckCode();
          _jspx_page_context.setAttribute("yzm", yzm, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      com.bean.SystemBean sdir = null;
      synchronized (_jspx_page_context) {
        sdir = (com.bean.SystemBean) _jspx_page_context.getAttribute("sdir", PageContext.PAGE_SCOPE);
        if (sdir == null){
          sdir = new com.bean.SystemBean();
          _jspx_page_context.setAttribute("sdir", sdir, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');

List list = sdir.getSiteInfo();
String str = list.get(0).toString();
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<title>网站后台管理登录---");
      out.print(str );
      out.write("</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".font1 {  font-family: \"宋体\"; font-size: 12px; line-height: 130%}\r\n");
      out.write("a {  font-family: \"宋体\"; font-size: 12px}\r\n");
      out.write("a:link {  font-family: \"宋体\"; font-size: 12px; color: #CFD1E8; text-decoration: underline}\r\n");
      out.write("a:hover {  font-family: \"宋体\"; font-size: 12px; color: #FFCC00; text-decoration: none}\r\n");
      out.write("a:visited {  font-family: \"宋体\"; font-size: 12px; color: #CFD1E8; text-decoration: underline}\r\n");
      out.write(".input {  font-family: \"宋体\"; font-size: 12px; color: #FFFFFF; border: #4047A4; border-style: solid; border-top-width: 1px; border-right-width: 1px; border-bottom-width: 1px; border-left-width: 1px; background-color: #000077}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");

String message = (String)request.getAttribute("message");
	if(message == null){
			message = "";
	}
	if (!message.trim().equals("")){
		out.println("<script language='javascript'>");
		out.println("alert('"+message+"');");
		out.println("</script>");
	}
	request.removeAttribute("message");
 	String code=yzm.getCheckCode();
 	String dir=sdir.getDir();

      out.write("\r\n");
      out.write("<body bgcolor=\"#000077\" text=\"#000000\" leftmargin=\"0\" topmargin=\"0\" marginwidth=\"0\" marginheight=\"0\">\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" height=\"100%\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td background=\"");
      out.print(basePath );
      out.print(dir );
      out.write("/images/bg.jpg\" valign=\"middle\" align=\"center\"> \r\n");
      out.write("      <table width=\"360\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td align=\"center\"><object classid=\"clsid:D27CDB6E-AE6D-11cf-96B8-444553540000\"  codebase=\"http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=5,0,0,0\" width=\"330\" height=\"190\" id=ShockwaveFlash1>\r\n");
      out.write("              <param name=movie value=\"");
      out.print(basePath );
      out.print(dir );
      out.write("/images/admin_m.swf\">\r\n");
      out.write("              <param name=quality value=high>\r\n");
      out.write("\t\t\t   <param name=\"wmode\" value=\"transparent\">\r\n");
      out.write("              <embed src=\"");
      out.print(basePath );
      out.print(dir );
      out.write("/images/admin_m.swf\" quality=high pluginspage=\"http://www.macromedia.com/shockwave/download/index.cgi?P1_Prod_Version=ShockwaveFlash\" type=\"application/x-shockwave-flash\" width=\"330\" height=\"190\">\r\n");
      out.write("              </embed> \r\n");
      out.write("            </object></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("      <table width=\"280\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">\r\n");
      out.write("        <tr> \r\n");
      out.write("          <td height=\"30\">&nbsp;</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td bgcolor=\"#4047A4\" height=\"1\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("      <table width=\"280\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td bgcolor=\"#4047A4\" width=\"1\"></td>\r\n");
      out.write("          <td> \r\n");
      out.write("            <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td height=\"36\">&nbsp;</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("            <table width=\"160\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">\r\n");
      out.write("\t\t      <form action=\"");
      out.print(basePath );
      out.write("Admin.shtml\" name=form1 method=post onSubmit=\"return checkform(form1)\" autocomplete=\"off\">\r\n");
      out.write("              <tr> \r\n");
      out.write("                <td colspan=\"3\" class=\"news\" height=\"5\"><input type=hidden name=method value=\"one\" /></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("\t\t\t \r\n");
      out.write("              <tr> \r\n");
      out.write("                <td width=\"5\" class=\"nwes\" height=\"36\"></td>\r\n");
      out.write("                <td width=\"56\" class=\"font1\" height=\"36\"><font color=\"#CFD1E8\">用户名</font></td>\r\n");
      out.write("                <td> \r\n");
      out.write("\t\t            <input type=\"text\" name=\"username\"  size=\"15\" class=input  onbeforepaste=\"clipboardData.setData('text',clipboardData.getData('text').replace(/[^\\d]/g,''))\" \r\n");
      out.write("                              onkeyup=\"value=value.replace(/[\\W]/g,'')\"/>\r\n");
      out.write("                </td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr> \r\n");
      out.write("                <td class=\"nwes\" height=\"36\">&nbsp; </td>\r\n");
      out.write("                <td class=\"font1\" height=\"36\"><font color=\"#CFD1E8\">口　令</font></td>\r\n");
      out.write("                <td> \r\n");
      out.write("\t\t            <input type=\"password\" name=\"password\" value=\"\" size=\"15\" class=input onbeforepaste=\"clipboardData.setData('text',clipboardData.getData('text').replace(/[^\\d]/g,''))\" \r\n");
      out.write("                              onkeyup=\"value=value.replace(/[\\W]/g,'')\">\r\n");
      out.write("                </td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr> \r\n");
      out.write("                <td class=\"nwes\" height=\"36\">&nbsp; </td>\r\n");
      out.write("                <td class=\"font1\" height=\"36\"><font color=\"#CFD1E8\">验证码</font></td>\r\n");
      out.write("                <td> \r\n");
      out.write("\t\t            <input type=\"text\" name=\"yzm\" value=\"\" size=\"9\" maxlength=\"4\" class=input onbeforepaste=\"clipboardData.setData('text',clipboardData.getData('text').replace(/[^\\d]/g,''))\" \r\n");
      out.write("                              onkeyup=\"value=value.replace(/[\\W]/g,'')\">");
      out.print(code );
      out.write("\r\n");
      out.write("                </td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr> \r\n");
      out.write("                <td height=\"5\" colspan=\"3\"></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr> \r\n");
      out.write("                <td>&nbsp; </td>\r\n");
      out.write("                <td align=\"center\">&nbsp; </td>\r\n");
      out.write("                <td> \r\n");
      out.write("                  <input type=\"image\" border=\"0\" name=\"imageField\" src=\"");
      out.print(basePath );
      out.print(dir );
      out.write("/images/bt_login.gif\" width=\"70\" height=\"16\">\r\n");
      out.write("                </td>\r\n");
      out.write("              </tr>\r\n");
      out.write("\t\t\t  </form>\t\r\n");
      out.write("            </table>\r\n");
      out.write("            <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("              <tr> \r\n");
      out.write("                <td height=\"36\">&nbsp;</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("          </td>\r\n");
      out.write("          <td bgcolor=\"#4047A4\" width=\"1\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("      <table width=\"280\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td bgcolor=\"#4047A4\" height=\"1\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td>&nbsp;</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("<script language=Javascript>\r\n");
      out.write("\t\r\n");
      out.write("\tform1.username.focus()\t\r\n");
      out.write("\r\n");
      out.write("\tfunction checkform(form)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar flag=true;\r\n");
      out.write("\t\tif(form(\"username\").value==\"\"){alert(\"请输入用户名!\");form(\"username\").focus();return false};\r\n");
      out.write("\t\tif(form(\"password\").value==\"\"){alert(\"请输入口令!\");form(\"password\").focus();return false};\r\n");
      out.write("\t\tif(form(\"yzm\").value==\"\"){alert(\"请输入验证码!\");form(\"yzm\").focus();return false};\r\n");
      out.write("\t\tif(isNaN(form(\"yzm\").value)){alert(\"请正确输入验证码!\");form(\"yzm\").focus();return false};\r\n");
      out.write("\t\tif(form(\"yzm\").value!=");
      out.print(code);
      out.write("){alert(\"验证码错误!\");form(\"yzm\").focus();return false};\r\n");
      out.write("\t\treturn flag;\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
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
