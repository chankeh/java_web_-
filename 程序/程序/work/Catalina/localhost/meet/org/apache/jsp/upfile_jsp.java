package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class upfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<title>文件上传</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".STYLE3 {font-size: 12px}\r\n");
      out.write(".STYLE4 {font-size: 14px}\r\n");
      out.write(".style5 {margin-left:2px;}\r\n");
      out.write(".STYLE6 {margin-left: 2px; font-size: 12px; }\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("\tfunction checkForm(){\r\n");
      out.write("\t\tif(document.upform.file.value==\"\"){\r\n");
      out.write("\t\t\talert(\"请选择上传文件！\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body topmargin=\"2\">\r\n");
      out.write("<form name=\"upform\" action=\"executeup.jsp\" method=\"post\" enctype=\"multipart/form-data\" onsubmit=\"javascript:return checkForm();\" target=\"test\">\r\n");
      out.write("<table width=\"630\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"1\" bgcolor=\"#9EC3F2\">\r\n");
      out.write("      <!--DWLayoutTable-->\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("  <tr bgcolor=\"#C8E4F3\">\r\n");
      out.write("    <td height=\"23\" colspan=\"2\" align=\"left\" valign=\"bottom\" background=\"img/bg_titlebarr.gif\" bgcolor=\"#C8E4F3\" class=\"STYLE4\">&nbsp;<strong>文件上传<span class=\"STYLE3\"></span></strong></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"98\" height=\"30\" align=\"center\" valign=\"middle\" bgcolor=\"#FFFFFF\"><span class=\"STYLE3\">选择上传文件</span></td>\r\n");
      out.write("          <td width=\"529\" align=\"left\" valign=\"middle\" bgcolor=\"#FFFFFF\"><input name=\"file\" type=\"file\" class=\"style5\" style=\"width:500px\"/></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"50\" colspan=\"2\" align=\"center\" valign=\"middle\" bgcolor=\"#FFFFFF\"><input type=\"submit\" name=\"Submit\" value=\"确定上传\" style=\"width:80px; height:25px;\" />\r\n");
      out.write("          &nbsp;\r\n");
      out.write("          <input type=\"button\" name=\"Submit2\" value=\"取消\" style=\"width:80px; height:25px;\" onclick=\"javascript:window.returnValue='';window.opener=null;window.close();\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("<iframe name=\"test\" style=\"display:none\"></iframe>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
