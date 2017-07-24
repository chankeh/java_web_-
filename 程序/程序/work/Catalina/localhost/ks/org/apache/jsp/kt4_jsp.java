package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mypackage.*;
import java.util.*;

public final class kt4_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title></title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".STYLE1 {\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write(".STYLE5 {color: #FF0000}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write(" \r\n");
      out.write("</head>\r\n");


      	String sid="";
		int  ktmin=0;
		int  ktmax=0;
		int  sl=0;
		String lx="4";
		int    rowid=0;
		String strPage="";
		String answer="";
		int  oldrowid=0;
		String oldstrpage="";
		sid=(String)session.getAttribute("s_username");
		
		answerop aop=new answerop();
		ktmin=aop.getmin(sid,lx);
		ktmax=aop.getmax(sid,lx);
		sl=ktmax-ktmin + 1;
		
		strPage = request.getParameter("page");
if(strPage==null){ 
rowid = ktmin;
}
else{//将字符串转换成整型
answer=DateFormate.toGb((String)request.getParameter("answer"));
oldstrpage = request.getParameter("oldrowid");
oldrowid=java.lang.Integer.parseInt(oldstrpage);
rowid = java.lang.Integer.parseInt(strPage);
aop.exeks(sid,oldrowid,answer);
}
 
 	answerop aop2=new answerop();
 	answer   an=new answer();
 	an=(answer)aop2.getanswerbyid(sid,rowid);
		
  //ktxxop ktop=new ktxxop();
  //ktxx kt=new ktxx();
  //kt=(ktxx)ktop.getKtxxbyid(id);
  
  
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<form name=\"opform\" method=\"post\" action=\"kt4.jsp?op=next\" onsubmit=\"javascript:return check();\">\r\n");
      out.write("<table width=\"750\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"1\" bordercolor=\"1\" bgcolor=\"#9EC3F2\" style=\"font-size:12px\">\r\n");
      out.write("  <!--DWLayoutTable-->\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"25\" colspan=\"2\" align=\"left\" valign=\"middle\" background=\"img/bg_titlebarr.gif\"><span class=\"STYLE1\">&nbsp;选择题（<span class=\"STYLE5\">请选择您认为正常的选项 如A，B，C，D </span>） 此题分值：");
      out.print(an.getFs());
      out.write(" </span></td>\r\n");
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
      out.write("    <td height=\"25\" align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\">答案</td>\r\n");
      out.write("    <td align=\"left\" valign=\"middle\" bgcolor=\"#F9FCFF\"><textarea name=\"answer\" cols=\"60\" rows=\"10\" id=\"answer\">");
      out.print(an.getAnswer());
      out.write("</textarea></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"750\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\">\r\n");
      out.write("  <!--DWLayoutTable-->\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"750\" height=\"30\" align=\"center\" valign=\"middle\"><input type=\"submit\" name=\"Submit\" value=\"完成（下一题）\" />\r\n");
      out.write("    &nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");

oldrowid=rowid;

if(rowid==ktmax)
{
rowid=ktmin;
}
else
{
rowid=rowid+1;
}

      out.write("\r\n");
      out.write(" <input name=\"page\"    type=\"hidden\"   id=\"page\" size=\"15\" value=\"");
      out.print(rowid);
      out.write("\"  />\r\n");
      out.write(" <input name=\"oldrowid\"    type=\"hidden\"   id=\"oldrowid\" size=\"15\" value=\"");
      out.print(oldrowid);
      out.write("\"  />\r\n");
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
